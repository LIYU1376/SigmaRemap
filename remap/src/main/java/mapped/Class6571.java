// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;

public class Class6571 extends Class6564
{
    private static String[] field26089;
    private final GhastEntity field26090;
    private int field26091;
    
    public Class6571(final GhastEntity field26090) {
        super(field26090);
        this.field26090 = field26090;
    }
    
    @Override
    public void method19904() {
        if (this.field26073 == Class2198.field13376) {
            if (this.field26091-- <= 0) {
                this.field26091 += this.field26090.method2633().nextInt(5) + 2;
                final Vec3d class5487 = new Vec3d(this.field26067 - this.field26090.getPosX(), this.field26068 - this.field26090.getPosY(), this.field26069 - this.field26090.getPosZ());
                final double method16752 = class5487.length();
                final Vec3d method16753 = class5487.normalize();
                if (!this.method19915(method16753, MathHelper.ceil(method16752))) {
                    this.field26073 = Class2198.field13375;
                }
                else {
                    this.field26090.method1936(this.field26090.getMotion().add(method16753.scale(0.1)));
                }
            }
        }
    }
    
    private boolean method19915(final Vec3d class5487, final int n) {
        AxisAlignedBB class5488 = this.field26090.getBoundingBox();
        for (int i = 1; i < n; ++i) {
            class5488 = class5488.offset(class5487);
            if (!this.field26090.world.method6978(this.field26090, class5488)) {
                return false;
            }
        }
        return true;
    }
}
