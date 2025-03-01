package com.mentalfrostbyte.jello.module.impl.world.disabler;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.world.Disabler;
import com.mentalfrostbyte.jello.module.settings.impl.BooleanSetting;
import com.mentalfrostbyte.jello.module.settings.impl.NumberSetting;
import net.minecraft.network.IPacket;
import net.minecraft.network.NetworkManager;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.network.play.server.*;

import java.util.ArrayList;

public class PingSpoofDisabler extends Module {
    private final ArrayList<Class8772> field23461 = new ArrayList<Class8772>();
    private int field23462;
    private int field23463;

    public PingSpoofDisabler() {
        super(ModuleCategory.EXPLOIT, "PingSpoof", "Makes you lagggy.");
        this.registerSetting(
                new NumberSetting<Float>("Lag", "Your ping (ms)", 1000.0F, Float.class, 50.0F, 2000.0F, 10.0F));
        this.registerSetting(new BooleanSetting("Inv Bypass", "Avoid inventory glitchs on some servers", false));
    }

    @EventTarget
    public void method16100(WorldLoadEvent var1) {
        if (!this.isEnabled()) {
            ModuleWithModuleSettings var4 = (ModuleWithModuleSettings) Client.getInstance().moduleManager
                    .getModuleByClass(Disabler.class);
            if (!var4.isEnabled() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("TP")
                    || !var4.method16726().getBooleanValueFromSettingName("Ping spoof")) {
                return;
            }
        }

        this.field23461.clear();
    }

    @EventTarget
    public void method16101(TickEvent var1) {
        if (!this.isEnabled()) {
            ModuleWithModuleSettings var4 = (ModuleWithModuleSettings) Client.getInstance().moduleManager.getModuleByClass(Disabler.class);
            if (!var4.isEnabled() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("TP") || !var4.method16726().getBooleanValueFromSettingName("Ping spoof")) {
                return;
            }
        }

        this.field23462++;
        if (mc.player != null && mc.getCurrentServerData() != null) {
            if (mc.player.ticksExisted <= 1) {
                this.field23461.clear();
            }

            if (!this.field23461.isEmpty()) {
                int var7 = this.field23461.size();

                for (int var5 = 0; var5 < var7; var5++) {
                    Class8772 var6 = this.field23461.get(var5);
                    if (var6.method31641()) {
                        mc.getConnection().getNetworkManager();
                        NetworkManager.processPacket(var6.method31642(), mc.getConnection().getNetworkManager().packetListener);
                        this.field23461.remove(var5);
                        var7--;
                        var5--;
                    }
                }
            }
        }
    }

    @EventTarget
    public void method16102(SendPacketEvent var1) {
        IPacket var4 = var1.getPacket();
        if (var4 instanceof CClickWindowPacket) {
            CClickWindowPacket var5 = (CClickWindowPacket) var4;
            this.field23463 = var5.getActionNumber();
        }
    }

    @EventTarget
    public void method16103(ReceivePacketEvent var1) {
        if (!this.isEnabled()) {
            ModuleWithModuleSettings var4 = (ModuleWithModuleSettings) Client.getInstance().moduleManager
                    .getModuleByClass(Disabler.class);
            if (!var4.isEnabled() || !var4.getStringSettingValueByName("Type").equalsIgnoreCase("TP")
                    || !var4.method16726().getBooleanValueFromSettingName("Ping spoof")) {
                return;
            }
        }

        if (mc.getCurrentServerData() != null) {
            IPacket var7 = var1.getPacket();
            if (!(var7 instanceof SKeepAlivePacket)) {
                if (!(var7 instanceof SConfirmTransactionPacket)) {
                    if (var7 instanceof SPlayerPositionLookPacket && this.field23462 > 0) {
                        SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var7;
                    } else if (!(var7 instanceof SWorldSpawnChangedPacket)) {
                        if (!(var7 instanceof SPlayerAbilitiesPacket) && !(var7 instanceof SSetSlotPacket)
                                && !(var7 instanceof SOpenWindowPacket) && !(var7 instanceof SWindowItemsPacket)) {
                        }
                    } else {
                        this.field23462 = 0;
                    }
                } else {
                    SConfirmTransactionPacket var8 = (SConfirmTransactionPacket) var7;
                    int var6 = var8.getActionNumber() - this.field23463;
                    if (var6 > 0 || var6 < -20 || !this.getBooleanValueFromSettingName("Inv Bypass")) {
                        this.field23461.add(new Class8772(var8, this, (long) this.getNumberValueBySettingName("Lag")));
                        var1.setCancelled(true);
                    }
                }
            } else {
                SKeepAlivePacket var9 = (SKeepAlivePacket) var7;
                this.field23461.add(new Class8772(var9, this, (long) this.getNumberValueBySettingName("Lag")));
                var1.setCancelled(true);
            }
        }
    }

    public class Class8772 {
        public final PingSpoofDisabler field39475;
        private final long field39473;
        private final IPacket<?> field39474;

        public Class8772(IPacket<?> var1, PingSpoofDisabler var2, long param4) {
            this.field39474 = var1;
            this.field39475 = var2;
            this.field39473 = System.currentTimeMillis() + param4;
        }

        public boolean method31641() {
            return this.field39473 - System.currentTimeMillis() < 0L;
        }

        public IPacket<?> method31642() {
            return this.field39474;
        }
    }
}
