// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;

public class Class4021 extends Class3833
{
    private static String[] field18104;
    public static final Class7112 field18105;
    public static final Class7702 field18106;
    
    public Class4021(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class4021.field18105, 0));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7097 == Class179.field512) {
            if (!class7096.method21752(class7099, class7100)) {
                class7099.method6833().method21345(class7100, this, 1);
            }
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        final Class7096 method6701 = class7097.method6701(class7098.method1137());
        if (method6701.method21697().method26439()) {
            if (!(method6701.method21696() instanceof Class3898)) {
                if (!(method6701.method21696() instanceof Class3960)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return this.method11878().method21752(class7074.method21654(), class7074.method21639()) ? super.method11846(class7074) : Class7521.field29156.method11878();
    }
    
    @Override
    public boolean method11820(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class4021.field18106;
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final Class354 class7098, final Random random) {
        if (class7096.method21752(class7097, class7098)) {
            final int intValue = class7096.method21772((Class7111<Integer>)Class4021.field18105);
            if (!method12214(class7097, class7098) && !class7097.method6772(class7098.method1137())) {
                if (intValue <= 0) {
                    if (!method12213(class7097, class7098)) {
                        method12212(class7096, class7097, class7098);
                    }
                }
                else {
                    class7097.method6688(class7098, (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class4021.field18105, intValue - 1), 2);
                }
            }
            else if (intValue < 7) {
                class7097.method6688(class7098, ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class4021.field18105, 7), 2);
            }
        }
        else {
            method12212(class7096, class7097, class7098);
        }
    }
    
    @Override
    public void method11860(final Class1847 class1847, final Class354 class1848, final Class399 class1849, final float n) {
        if (!class1847.field10067) {
            if (class1847.field10062.nextFloat() < n - 0.5f) {
                if (class1849 instanceof Class511) {
                    if (class1849 instanceof Class512 || class1847.method6765().method31216(Class8878.field37316)) {
                        if (class1849.method1930() * class1849.method1930() * class1849.method1931() > 0.512f) {
                            method12212(class1847.method6701(class1848), class1847, class1848);
                        }
                    }
                }
            }
        }
        super.method11860(class1847, class1848, class1849, n);
    }
    
    public static void method12212(final Class7096 class7096, final Class1847 class7097, final Class354 class7098) {
        class7097.method6692(class7098, Class3833.method11777(class7096, Class7521.field29156.method11878(), class7097, class7098));
    }
    
    private static boolean method12213(final Class1855 class1855, final Class354 class1856) {
        final Class3833 method21696 = class1855.method6701(class1856.method1137()).method21696();
        if (!(method21696 instanceof Class3878)) {
            if (!(method21696 instanceof Class3873)) {
                if (!(method21696 instanceof Class3875)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private static boolean method12214(final Class1852 class1852, final Class354 class1853) {
        final Iterator<Class354> iterator = Class354.method1154(class1853.method1134(-4, 0, -4), class1853.method1134(4, 1, 4)).iterator();
        while (iterator.hasNext()) {
            if (!class1852.method6702(iterator.next()).method21793(Class7324.field28319)) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class4021.field18105);
    }
    
    @Override
    public boolean method11796(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class2084 class7099) {
        return false;
    }
    
    @Override
    public boolean method11795(final Class7096 class7096, final Class1855 class7097, final Class354 class7098) {
        return true;
    }
    
    static {
        field18105 = Class8970.field37787;
        field18106 = Class3833.method11778(0.0, 0.0, 0.0, 16.0, 15.0, 16.0);
    }
}
