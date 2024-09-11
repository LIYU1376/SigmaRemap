package com.mentalfrostbyte.jello.module.impl.movement.fly;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.*;
import com.mentalfrostbyte.jello.event.priority.LowerPriority;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.module.PremiumModule;
import com.mentalfrostbyte.jello.notification.Notification;
import com.mentalfrostbyte.jello.unmapped.JelloPortal;
import com.mentalfrostbyte.jello.util.timer.TimerUtil;
import mapped.*;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.network.play.server.SPlayerPositionLookPacket;

public class Cubecraft2Fly extends PremiumModule {
    private int field23696;
    private final TimerUtil field23697 = new TimerUtil();
    private final TimerUtil field23698 = new TimerUtil();
    private boolean field23699;

    public Cubecraft2Fly() {
        super("Cubecraft2", "A fly for 1.9+ cubecraft", ModuleCategory.MOVEMENT);
    }

    @Override
    public void onEnable() {
        this.field23696 = 0;
        if (!mc.gameSettings.keyBindSneak.isKeyDown()) {
            this.field23699 = false;
        } else {
            mc.gameSettings.keyBindSneak.pressed = false;
            this.field23699 = true;
        }

        if (ColorUtils.method17718() && JelloPortal.getFakeInvStatus() == ViaVerList._1_8_x.getVersionNumber()) {
            Client.getInstance().getNotificationManager().post(new Notification("Cubecraft2 fly", "This fly was made for 1.9+ only"));
        }

        this.field23698.stop();
        this.field23698.method27120();
    }

    @Override
    public void onDisable() {
        MovementUtils.method37090(0.2);
        ColorUtils.method17725(-0.0789);
        if (ColorUtils.method17730(mc.player, 0.001F)) {
            MovementUtils.method37090(0.0);
            ColorUtils.method17725(-0.0789);
        } else {
            double var3 = mc.player.getPosX();
            double var5 = mc.player.getPosY();
            double var7 = mc.player.getPosZ();
            mc.getConnection().sendPacket(new CPlayerPacket.PositionPacket(var3, -150.0, var7, false));
            MovementUtils.method37090(0.0);
            ColorUtils.method17725(0.0);
            this.field23696 = -3;
            this.field23697.method27120();
            this.field23697.start();
        }
    }

    @EventTarget
    private void method16483(EventKeyPress var1) {
        if (this.isEnabled()) {
            if (var1.getKey() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.setCancelled(true);
                this.field23699 = true;
            }
        }
    }

    @EventTarget
    private void method16484(MouseHoverEvent var1) {
        if (this.isEnabled()) {
            if (var1.getMouseButton() == mc.gameSettings.keyBindSneak.keycode.keyCode) {
                var1.setCancelled(true);
                this.field23699 = false;
            }
        }
    }

    @EventTarget
    @LowerPriority
    public void method16485(EventMove var1) {
        if (this.isEnabled()) {
            this.field23696++;
            if (this.field23696 != 1) {
                if (this.field23696 != 2) {
                    var1.setY(0.0);
                    MovementUtils.method37088(var1, 0.0);
                } else {
                    var1.setY(-9.999999999E-5);
                    MovementUtils.method37088(var1, 0.28);
                }
            } else {
                var1.setY(!mc.gameSettings.keyBindJump.isKeyDown() ? (!this.field23699 ? 1.0E-4 : -0.99) : (!this.field23699 ? 0.99 : 1.0E-4));
                MovementUtils.method37088(var1, !mc.gameSettings.keyBindJump.isKeyDown() ? (!this.field23699 ? 3.7 : 2.8) : (!this.field23699 ? 2.8 : 3.7));
            }

            ColorUtils.method17725(var1.getY());
        } else {
            if (this.field23696 < 0) {
                if (this.field23696 != -3) {
                    if (this.field23696 != -2) {
                        if (this.field23696 == -1) {
                            this.field23696++;
                            var1.setY(-0.4);
                            MovementUtils.method37088(var1, 0.0);
                        }
                    } else {
                        var1.setY(0.4);
                        this.field23696++;
                        MovementUtils.method37088(var1, 0.0);
                    }
                } else {
                    if (this.field23697.method27121() > 1000L) {
                        this.field23696++;
                        this.field23697.method27120();
                        this.field23697.stop();
                    }

                    var1.setY(0.0);
                    MovementUtils.method37088(var1, 0.0);
                }
            }
        }
    }

    @EventTarget
    public void method16486(EventUpdate var1) {
        if (this.field23696 == -3) {
            var1.setCancelled(true);
        }

        if (this.isEnabled() && var1.isPre()) {
            var1.method13908(true);
            var1.setGround(true);
            if (this.field23696 != 3) {
                if (this.field23696 > 3) {
                    if (this.field23698.isEnabled() && this.field23698.method27121() > 2000L) {
                        var1.setY(-150.0);
                        this.field23698.method27120();
                    } else {
                        var1.setCancelled(true);
                    }
                }
            } else {
                var1.setY(-150.0);
                this.field23698.start();
            }
        }
    }

    @EventTarget
    public void method16487(RecievePacketEvent var1) {
        if (this.isEnabled() || this.field23696 < 0) {
            Packet var4 = var1.getPacket();
            if (var4 instanceof SPlayerPositionLookPacket) {
                SPlayerPositionLookPacket var5 = (SPlayerPositionLookPacket) var4;
                var5.yaw = mc.player.rotationYaw;
                var5.pitch = mc.player.rotationPitch;
                this.field23698.method27120();
                this.field23698.stop();
                if (this.field23696 != -3) {
                    this.field23696 = 0;
                } else {
                    this.field23696++;
                }
            }
        }
    }
}
