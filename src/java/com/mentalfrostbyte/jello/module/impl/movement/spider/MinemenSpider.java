package com.mentalfrostbyte.jello.module.impl.movement.spider;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventBlockCollision;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import com.mentalfrostbyte.jello.settings.BooleanSetting;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import mapped.*;
import net.minecraft.network.play.client.CPlayerPacket;
import net.minecraft.util.math.vector.Vector3d;

public class MinemenSpider extends Module {
    private boolean field23813 = false;

    public MinemenSpider() {
        super(ModuleCategory.MOVEMENT, "Minemen", "Minemen spider");
        this.registerSetting(new BooleanSetting("AutoClimb", "Automatically climbs for you", true));
        this.registerSetting(new BooleanSetting("Ceiling", "Allows you to fly under ceiling", true));
        this.registerSetting(new BooleanSetting("SneakVClip", "Allows you to phase through ground", true));
    }

    @Override
    public void onEnable() {
        this.field23813 = false;
    }

    @EventTarget
    private void method16636(EventMove var1) {
        double var4 = 1.0E-5;
        boolean var6 = mc.world
                .getCollisionShapes(mc.player, mc.player.boundingBox.contract(var4, 0.0, var4).contract(-var4, 0.0, -var4))
                .count()
                > 0L;
        if (var6) {
            if (!mc.player.collidedHorizontally) {
                if (!mc.player.onGround) {
                    var1.setY(!mc.gameSettings.keyBindSneak.isKeyDown() ? 0.0 : var1.getY());
                }
            } else if (!this.getBooleanValueFromSetttingName("AutoClimb") && !mc.gameSettings.keyBindJump.isKeyDown()) {
                var1.setY(!mc.gameSettings.keyBindSneak.isKeyDown() ? 0.0 : var1.getY());
            } else {
                var1.setY(0.6);
            }

            MovementUtils.setSpeed(var1, 0.689 + (double) MovementUtils.method37078() * 0.06);
        }

        if (MultiUtilities.isAboveBounds(mc.player, 0.001F) && this.getBooleanValueFromSetttingName("SneakVClip")) {
            if (mc.gameSettings.keyBindSneak.isKeyDown()
                    && !this.field23813
                    && mc.world.getCollisionShapes(mc.player, mc.player.boundingBox.offset(0.0, -2.8, 0.0)).count() == 0L) {
                mc.getConnection()
                        .sendPacket(
                                new CPlayerPacket.PositionPacket(
                                        mc.player.getPositionVec().x,
                                        mc.player.getPositionVec().y - 1.0E-14,
                                        mc.player.getPositionVec().z,
                                        false
                                )
                        );
                mc.player
                        .setPosition(
                                mc.player.getPositionVec().x,
                                mc.player.getPositionVec().y - 2.8,
                                mc.player.getPositionVec().z
                        );
                mc.gameSettings.keyBindSneak.pressed = false;
                mc.player.onGround = false;
                mc.timer.timerSpeed = 0.08F;
                var1.setCancelled(true);
                this.field23813 = true;
                var1.setY(1.0E-14);
            }
        } else {
            if (this.getBooleanValueFromSetttingName("Ceiling")
                    && !mc.gameSettings.keyBindSneak.isKeyDown()
                    && mc.world.getCollisionShapes(mc.player, mc.player.boundingBox.offset(0.0, 0.01, 0.0)).count() > 0L) {
                var1.setY(1.0E-14);
                MovementUtils.setSpeed(var1, 0.689 + (double) MovementUtils.method37078() * 0.06);
            }

            if (this.field23813) {
                mc.timer.timerSpeed = 1.0F;
                this.field23813 = false;
                var1.setY(1.0E-14);
                MovementUtils.setSpeed(var1, 0.28);
            }
        }

        MultiUtilities.setPlayerYMotion(var1.getY());
    }

    @EventTarget
    private void method16637(EventUpdate var1) {
        if (this.isEnabled() && var1.isPre()) {
            Class9629 var4 = MultiUtilities.method17760(1.0E-4);
            if (this.getBooleanValueFromSetttingName("Ceiling")
                    && !mc.player.onGround
                    && mc.world.getCollisionShapes(mc.player, mc.player.boundingBox.offset(0.0, 1.0E-6, 0.0)).count() > 0L) {
                var1.setY(var1.getY() + 4.9E-7);
            }

            double var5 = 1.0E-5;
            if (var4 != null
                    && mc.world
                    .getCollisionShapes(mc.player, mc.player.boundingBox.contract(var5, 0.0, var5).contract(-var5, 0.0, -var5))
                    .count()
                    > 0L) {
                if (!MultiUtilities.isAboveBounds(mc.player, 1.0E-4F)) {
                    var1.setGround(true);
                }

                double var7 = 4.88E-7;
                if (((net.minecraft.util.Direction) var4.method37538()).getAxis() != Direction.X) {
                    var1.setZ(
                            (double) Math.round((((Vector3d) var4.method37539()).z + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((net.minecraft.util.Direction) var4.method37538()).method541() * var7
                    );
                } else {
                    var1.setX(
                            (double) Math.round((((Vector3d) var4.method37539()).x + 1.1921022E-8) * 10000.0) / 10000.0
                                    + (double) ((net.minecraft.util.Direction) var4.method37538()).method539() * var7
                    );
                }
            }
        }
    }

    @EventTarget
    private void method16638(EventBlockCollision var1) {
        if (this.isEnabled() && mc.player != null) {
            if (var1.getVoxelShape() != null
                    && !var1.getVoxelShape().isEmpty()
                    && var1.getVoxelShape().getBoundingBox().minY > mc.player.boundingBox.minY + 1.0) {
                var1.setCancelled(true);
            }
        }
    }
}
