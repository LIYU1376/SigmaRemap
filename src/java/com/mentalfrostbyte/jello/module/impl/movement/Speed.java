package com.mentalfrostbyte.jello.module.impl.movement;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.ModuleWithModuleSettings;
import com.mentalfrostbyte.jello.module.impl.movement.speed.*;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class Speed extends ModuleWithModuleSettings {
    public static int field23893;

    public Speed() {
        super(
                ModuleCategory.MOVEMENT,
                "Speed",
                "Vroom vroom",
                new VanillaSpeed(),
                new HypixelSpeed(),
                new AACSpeed(),
                new OldAACSpeed(),
                new ViperMCSpeed(),
                new SlowHopSpeed(),
                new NCPSpeed(),
                new LegitSpeed(),
                new CubecraftSpeed(),
                new YPortSpeed(),
                new MinemenSpeed(),
                new InvadedSpeed(),
                new MineplexSpeed(),
                new GommeSpeed(),
                new TestSpeed()
        );
        this.registerSetting(new BooleanSetting("Lag back checker", "Disable speed when you get lag back", true));
        field23893 = 0;
    }

    @EventTarget    
    public void method16762(TickEvent var1) {
        field23893++;
    }

    @EventTarget
    public void method16763(ReceivePacketEvent var1) {
        if (var1.getPacket() instanceof SPlayerPositionLookPacket && mc.player != null) {
            field23893 = 0;
            if (this.getBooleanValueFromSettingName("Lag back checker") && this.isEnabled() && mc.player.ticksExisted > 2) {
                Client.getInstance().getNotificationManager().send(new Notification("Speed", "Disabled speed due to lagback."));
                this.toggle();
            }
        }
    }

    public void method16764() {
        if (this.parentModule instanceof HypixelSpeed) {
            HypixelSpeed var3 = (HypixelSpeed) this.parentModule;
            var3.method16044();
        }
    }
}
