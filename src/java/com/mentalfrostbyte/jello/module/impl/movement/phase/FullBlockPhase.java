package com.mentalfrostbyte.jello.module.impl.movement.phase;

import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.EventUpdate;
import com.mentalfrostbyte.jello.event.impl.EventPushBlock;
import com.mentalfrostbyte.jello.event.impl.EventMove;
import com.mentalfrostbyte.jello.module.Module;
import com.mentalfrostbyte.jello.module.ModuleCategory;
import mapped.ColorUtils;
import mapped.MovementUtils;

public class FullBlockPhase extends Module {
    public FullBlockPhase() {
        super(ModuleCategory.MOVEMENT, "FullBlock", "Basic phase");
    }

    @EventTarget
    private void method16491(EventUpdate var1) {
        if (this.isEnabled() && ColorUtils.method17761()) {
            var1.method13908(true);
        }
    }

    @EventTarget
    private void method16492(EventMove var1) {
        if (this.isEnabled()) {
            if (!ColorUtils.method17761()) {
                if (mc.player.collidedHorizontally) {
                    MovementUtils.method37088(var1, 0.0);
                    MovementUtils.method37095(1.1920931E-8);
                }
            } else {
                MovementUtils.method37095(0.617);
            }
        }
    }

    @EventTarget
    private void method16493(EventPushBlock var1) {
        if (this.isEnabled()) {
            var1.setCancelled(true);
        }
    }
}
