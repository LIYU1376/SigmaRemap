// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.Direction;

import java.util.Random;

public class Class3977 extends Class3833
{
    private static String[] field17966;
    public static final Class7112 field17967;
    public static final Class7702 field17968;
    public static final Class7702 field17969;
    
    public Class3977(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3977.field17967, 0));
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            final BlockPos method1137 = class7098.method1137();
            if (class7097.method6961(method1137)) {
                int n;
                for (n = 1; class7097.method6701(class7098.method1140(n)).method21696() == this; ++n) {}
                if (n < 3) {
                    final int intValue = class7096.method21772((Class7111<Integer>)Class3977.field17967);
                    if (intValue != 15) {
                        class7097.method6688(class7098, (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3977.field17967, intValue + 1), 4);
                    }
                    else {
                        class7097.method6692(method1137, this.method11878());
                        final Class7096 class7099 = ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3977.field17967, 0);
                        class7097.method6688(class7098, class7099, 4);
                        class7099.method21734(class7097, method1137, this, class7098, false);
                    }
                }
            }
        }
        else {
            class7097.method7149(class7098, true);
        }
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3977.field17968;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3977.field17969;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (!class7096.method21752(class7099, class7100)) {
            class7099.method6833().method21345(class7100, this, 1);
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        for (final Direction class7099 : Plane.HORIZONTAL) {
            if (!class7097.method6701(class7098.method1149(class7099)).method21697().method26439() && !class7097.method6702(class7098.method1149(class7099)).method21793(Class7324.field28320)) {
                continue;
            }
            return false;
        }
        final Class3833 method21696 = class7097.method6701(class7098.method1139()).method21696();
        if (method21696 != Class7521.field29332) {
            if (method21696 != Class7521.field29175) {
                if (method21696 != Class7521.field29176) {
                    return false;
                }
            }
        }
        if (!class7097.method6701(class7098.method1137()).method21697().method26438()) {
            return true;
        }
        return false;
    }
    
    @Override
    public void method11850(final Class7096 class7096, final Class1847 class7097, final BlockPos class7098, final Entity class7099) {
        class7099.method1740(Class7929.field32571, 1.0f);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3977.field17967);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class2084 class7099) {
        return false;
    }
    
    static {
        field17967 = Class8970.field37774;
        field17968 = Class3833.method11778(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
        field17969 = Class3833.method11778(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);
    }
}
