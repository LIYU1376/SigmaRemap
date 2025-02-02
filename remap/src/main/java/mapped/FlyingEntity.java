// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public abstract class FlyingEntity extends Class759
{
    public FlyingEntity(final EntityType<? extends FlyingEntity> class7499, final World class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public void method1701(final double n, final boolean b, final BlockState class7096, final BlockPos class7097) {
    }
    
    @Override
    public void method2729(final Vec3d class5487) {
        if (!this.method1706()) {
            if (!this.method1723()) {
                float n = 0.91f;
                if (this.onGround) {
                    n = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).method21696().method11865() * 0.91f;
                }
                final float n2 = 0.16277137f / (n * n * n);
                float n3 = 0.91f;
                if (this.onGround) {
                    n3 = this.world.getBlockState(new BlockPos(this.getPosX(), this.getPosY() - 1.0, this.getPosZ())).method21696().method11865() * 0.91f;
                }
                this.method1724(this.onGround ? (0.1f * n2) : 0.02f, class5487);
                this.method1671(Class2160.field12826, this.getMotion());
                this.method1936(this.getMotion().scale(n3));
            }
            else {
                this.method1724(0.02f, class5487);
                this.method1671(Class2160.field12826, this.getMotion());
                this.method1936(this.getMotion().scale(0.5));
            }
        }
        else {
            this.method1724(0.02f, class5487);
            this.method1671(Class2160.field12826, this.getMotion());
            this.method1936(this.getMotion().scale(0.800000011920929));
        }
        this.field2945 = this.field2946;
        final double n4 = this.getPosX() - this.prevPosX;
        final double n5 = this.getPosZ() - this.prevPosZ;
        float n6 = MathHelper.sqrt(n4 * n4 + n5 * n5) * 4.0f;
        if (n6 > 1.0f) {
            n6 = 1.0f;
        }
        this.field2946 += (n6 - this.field2946) * 0.4f;
        this.field2947 += this.field2946;
    }
    
    @Override
    public boolean method2688() {
        return false;
    }
}
