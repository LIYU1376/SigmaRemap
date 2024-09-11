package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import com.mentalfrostbyte.jello.util.ColorUtils;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;
import net.minecraft.network.play.server.SEntityVelocityPacket;

public class CubecraftFly extends Module {
    private int field23845;
    private boolean field23846;
    private boolean field23847;
    private boolean field23848;
    private double field23849;

    public CubecraftFly() {
        super(ModuleCategory.MOVEMENT, "Cubecraft", "Fly for Cubecraft");
        this.registerSetting(new BooleanSetting("Damage", "Allows you to go infinitly up", false));
    }

    @Override
    public void onEnable() {
        this.field23845 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
                this.field23846 = false;
            }
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23846 = true;
        }

        if (mc.player.onGround) {
            this.field23847 = this.field23848 = false;
        }

        if (!this.getBooleanValueFromSetttingName("Damage")) {
            this.field23848 = true;
        }
    }

    @Override
    public void onDisable() {
        ColorUtils.method17725(-0.078);
        MovementUtils.method37090(0.2);
        mc.timer.timerSpeed = 1.0F;
        if (this.field23846) {
            mc.gameSettings.keyBindSneak.pressed = true;
        }
    }

    @EventTarget
    private void method16686(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.setCancelled(true);
                this.field23846 = true;
            }
        }
    }

    @EventTarget
    private void method16687(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.setCancelled(true);
                this.field23846 = false;
            }
        }
    }

    @EventTarget
    @Class5631
    public void method16688(EventMove var1) {
        if (!this.isEnabled()) {
            if (mc.player.onGround) {
                this.field23847 = this.field23848 = false;
            }
        } else if (ColorUtils.method17718()) {
            if (this.field23845 > 0) {
                var1.setY(0.0);
                MovementUtils.method37088(var1, 0.0);
                this.field23845++;
            } else {
                if (this.field23845 != 0) {
                    if (this.field23847) {
                        var1.setY(0.0);
                        MovementUtils.method37088(var1, MovementUtils.method37075());
                        if (this.field23845 != -4) {
                            if (this.field23845 != -1) {
                                if (JelloPortal.getFakeInvStatus() > ViaVerList._1_8_x.getVersionNumber()) {
                                    if (mc.gameSettings.keyBindJump.isKeyDown() && !this.field23846) {
                                        var1.setY(0.0625);
                                        MovementUtils.method37088(var1, 0.0);
                                        this.field23845 = 1;
                                    } else if (this.field23846 && !mc.gameSettings.keyBindJump.isKeyDown()) {
                                        var1.setY(-0.225);
                                        MovementUtils.method37088(var1, 0.0);
                                        this.field23845 = 1;
                                    }
                                }
                            } else {
                                if (!this.field23848) {
                                    ColorUtils.method17749(false);
                                    this.field23848 = true;
                                }

                                this.field23845--;
                            }
                        } else if (mc.gameSettings.keyBindJump.isKeyDown() && !this.field23846) {
                            var1.setY(0.0625);
                        }
                    }
                } else if (JelloPortal.getFakeInvStatus() != ViaVerList._1_8_x.getVersionNumber()) {
                    if (!ColorUtils.method17730(mc.player, 0.001F)) {
                        var1.setY(0.0);
                        MovementUtils.method37088(var1, 0.0);
                        if (mc.player.fallDistance > 4.0F) {
                            mc.getConnection().sendPacket(new CPlayerPacket(true));
                            this.field23848 = true;
                        }
                    } else {
                        var1.setY(MovementUtils.method37080());
                        MovementUtils.method37088(var1, 0.615);
                    }

                    this.field23845 = 1;
                } else if (!ColorUtils.method17730(mc.player, 0.001F)) {
                    var1.setY(0.0);
                    this.field23845 = -2;
                    Client.getInstance().getNotificationManager().post(new Notification("Cubecraft Fly", "Please start on the ground."));
                } else {
                    MovementUtils.method37088(var1, 0.0);
                    var1.setY(0.0);
                    long var14 = ColorUtils.method17762() % 90L;
                    double var15 = 0.016 + (double) var14 / 10000.0;
                    double var16 = mc.player.getPosX();
                    double var10 = mc.player.getPosY() + 0.022;
                    double var12 = mc.player.getPosZ();
                    mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var16, var10, var12, false));
                    mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var16, var10, var12 + 0.07, false));
                    mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var16, var10, var12, false));
                    mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var16, var10 + 3.0, var12, false));
                }

                ColorUtils.method17725(var1.getY());
            }
        } else {
            MovementUtils.method37088(var1, MovementUtils.method37075());
            var1.setY(0.0);
            if (mc.player.ticksExisted % 2 == 0) {
                double var4 = mc.player.getPosX();
                double var6 = mc.player.getPosY();
                double var8 = mc.player.getPosZ();
                mc.player.setPosition(var4, var6 + 1.0E-10, var8);
            }
        }
    }

    @EventTarget
    public void method16689(EventUpdate var1) {
        if (var1.isPre() && ColorUtils.method17718()) {
            var1.method13908(true);
            if (JelloPortal.getFakeInvStatus() == ViaVerList._1_8_x.getVersionNumber() && this.field23845 == 0 && ColorUtils.method17730(mc.player, 0.001F)) {
                var1.setCancelled(true);
            }

            if (this.field23845 >= 2) {
                var1.setY(275.0);
            }
        }
    }

    @EventTarget
    public void method16690(RecievePacketEvent var1) {
        if (mc.world != null && mc.getConnection() != null && ColorUtils.method17718()) {
            Packet var4 = var1.getPacket();
            if (!(var4 instanceof SPlayerPositionLookPacket)) {
                if (var4 instanceof SEntityVelocityPacket) {
                    SEntityVelocityPacket var5 = (SEntityVelocityPacket) var4;
                    if (var5.getEntityID() == mc.player.getEntityId()) {
                        this.field23845 = -4;
                    }
                }
            } else {
                SPlayerPositionLookPacket var20 = (SPlayerPositionLookPacket) var4;
                if (JelloPortal.getFakeInvStatus() != ViaVerList._1_8_x.getVersionNumber()) {
                    float[] var6 = MovementUtils.lenientStrafe();
                    float var7 = var6[1];
                    float var8 = var6[2];
                    float var9 = var6[0];
                    double var10 = Math.cos(Math.toRadians(var9));
                    double var12 = Math.sin(Math.toRadians(var9));
                    double var14 = MovementUtils.method37075();
                    double var16 = ((double) var7 * var10 + (double) var8 * var12) * var14;
                    double var18 = ((double) var7 * var12 - (double) var8 * var10) * var14;
                    this.field23849 = var20.y;
                    var20.x += var16;
                    var20.z += var18;
                }

                this.field23847 = true;
                this.field23845 = -1;
            }
        }
    }
}
