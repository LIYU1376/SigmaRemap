// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;
import java.util.Random;

public class Class4030 extends Class3833
{
    private static String[] field18123;
    public static final Class7112 field18124;
    public static final Class7702[] field18125;
    
    public Class4030(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class4030.field18124, 1));
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        switch (Class6795.field26729[class7099.ordinal()]) {
            case 1: {
                return class7096.method21772((Class7111<Integer>)Class4030.field18124) < 5;
            }
            case 2: {
                return false;
            }
            case 3: {
                return false;
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class4030.field18125[class7096.method21772((Class7111<Integer>)Class4030.field18124)];
    }
    
    @Override
    public Class7702 method11809(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class4030.field18125[class7096.method21772((Class7111<Integer>)Class4030.field18124) - 1];
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        final Class7096 method6701 = class7097.method6701(class7098.method1139());
        final Class3833 method6702 = method6701.method21696();
        if (method6702 != Class7521.field29330) {
            if (method6702 != Class7521.field29548) {
                if (method6702 != Class7521.field29517) {
                    return method6702 == Class7521.field29825 || method6702 == Class7521.field29339 || Class3833.method11815(method6701.method21727(class7097, class7098.method1139()), Class179.field512) || (method6702 == this && method6701.method21772((Class7111<Integer>)Class4030.field18124) == 8);
                }
            }
        }
        return false;
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        return class7096.method21752(class7099, class7100) ? super.method11789(class7096, class7097, class7098, class7099, class7100, class7101) : Class7521.field29147.method11878();
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final Class354 class7098, final Random random) {
        if (class7097.method6992(Class237.field912, class7098) > 11) {
            Class3833.method11836(class7096, class7097, class7098);
            class7097.method6690(class7098, false);
        }
    }
    
    @Override
    public boolean method11798(final Class7096 class7096, final Class7074 class7097) {
        final int intValue = class7096.method21772((Class7111<Integer>)Class4030.field18124);
        if (class7097.method21651().method27622() == this.method11704() && intValue < 8) {
            return !class7097.method21641() || class7097.method21648() == Class179.field512;
        }
        return intValue == 1;
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class7096 method6701 = class7074.method21654().method6701(class7074.method21639());
        if (method6701.method21696() != this) {
            return super.method11846(class7074);
        }
        return ((Class7097<Object, Class7096>)method6701).method21773((Class7111<Comparable>)Class4030.field18124, Math.min(8, ((Class7097<Object, Class7096>)method6701).method21772((Class7111<Integer>)Class4030.field18124) + 1));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class4030.field18124);
    }
    
    static {
        field18124 = Class8970.field37781;
        field18125 = new Class7702[] { Class7698.method24486(), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 10.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 12.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 14.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 16.0, 16.0) };
    }
}
