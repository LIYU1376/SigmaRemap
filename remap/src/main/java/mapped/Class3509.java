// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.EnumSet;

public class Class3509 extends Class3446
{
    private static String[] field16500;
    private final Class787 field16501;
    
    public Class3509(final Class787 field16501) {
        this.field16501 = field16501;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581));
    }
    
    @Override
    public boolean method11013() {
        return this.field16501.method1832() < 140;
    }
    
    @Override
    public boolean method11017() {
        return this.method11013();
    }
    
    @Override
    public boolean method11014() {
        return false;
    }
    
    @Override
    public void method11015() {
        this.method11068();
    }
    
    private void method11068() {
        final Iterable<BlockPos> method1158 = BlockPos.method1158(MathHelper.floor(this.field16501.method1938() - 1.0), MathHelper.floor(this.field16501.method1941()), MathHelper.floor(this.field16501.method1945() - 1.0), MathHelper.floor(this.field16501.method1938() + 1.0), MathHelper.floor(this.field16501.method1941() + 8.0), MathHelper.floor(this.field16501.method1945() + 1.0));
        BlockPos class354 = null;
        for (final BlockPos class355 : method1158) {
            if (!this.method11069(this.field16501.field2391, class355)) {
                continue;
            }
            class354 = class355;
            break;
        }
        if (class354 == null) {
            class354 = new BlockPos(this.field16501.method1938(), this.field16501.method1941() + 8.0, this.field16501.method1945());
        }
        this.field16501.method4150().method24724(class354.getX(), class354.getY() + 1, class354.getZ(), 1.0);
    }
    
    @Override
    public void method11016() {
        this.method11068();
        this.field16501.method1724(0.02f, new Class5487(this.field16501.field2968, this.field16501.field2969, this.field16501.field2970));
        this.field16501.method1671(Class2160.field12826, this.field16501.method1935());
    }
    
    private boolean method11069(final Class1852 class1852, final BlockPos class1853) {
        final Class7096 method6701 = class1852.method6701(class1853);
        if (class1852.method6702(class1853).method21781() || method6701.method21696() == Class7521.field29765) {
            if (method6701.method21749(class1852, class1853, Class2084.field12051)) {
                return true;
            }
        }
        return false;
    }
}
