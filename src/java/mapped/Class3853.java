// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3853 extends Class3854
{
    private static String[] field17463;
    
    public Class3853(final Class9288 class9288) {
        super(1.0f, 1.0f, 16.0f, 16.0f, 16.0f, class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3853.field17465, false)).method21773((Class7111<Comparable>)Class3853.field17466, false)).method21773((Class7111<Comparable>)Class3853.field17467, false)).method21773((Class7111<Comparable>)Class3853.field17468, false)).method21773((Class7111<Comparable>)Class3853.field17469, false));
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class1847 method21654 = class7074.method21654();
        final Class354 method21655 = class7074.method21639();
        final Class7099 method21656 = class7074.method21654().method6702(class7074.method21639());
        final Class354 method21657 = method21655.method1141();
        final Class354 method21658 = method21655.method1143();
        final Class354 method21659 = method21655.method1145();
        final Class354 method21660 = method21655.method1147();
        final Class7096 method21661 = method21654.method6701(method21657);
        final Class7096 method21662 = method21654.method6701(method21658);
        final Class7096 method21663 = method21654.method6701(method21659);
        final Class7096 method21664 = method21654.method6701(method21660);
        return (Class7096)((Class7097<Object, Object>)((Class7097<Object, Object>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3853.field17465, this.method11913(method21661, method21661.method21761(method21654, method21657, Class179.field514)))).method21773((Class7111<Comparable>)Class3853.field17467, this.method11913(method21662, method21662.method21761(method21654, method21658, Class179.field513)))).method21773((Class7111<Comparable>)Class3853.field17468, this.method11913(method21663, method21663.method21761(method21654, method21659, Class179.field516)))).method21773((Class7111<Comparable>)Class3853.field17466, this.method11913(method21664, method21664.method21761(method21654, method21660, Class179.field515)))).method21773((Class7111<Comparable>)Class3853.field17469, method21656.method21779() == Class7558.field29976);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3853.field17469)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return class7097.method790().method601() ? ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3853.field17470.get(class7097), this.method11913(class7098, class7098.method21761(class7099, class7101, class7097.method782()))) : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public boolean method11807(final Class7096 class7096, final Class7096 class7097, final Class179 class7098) {
        if (class7097.method21696() == this) {
            if (!class7098.method790().method601()) {
                return true;
            }
            if (class7096.method21772((Class7111<Boolean>)Class3853.field17470.get(class7098))) {
                if (class7097.method21772((Class7111<Boolean>)Class3853.field17470.get(class7098.method782()))) {
                    return true;
                }
            }
        }
        return super.method11807(class7096, class7097, class7098);
    }
    
    public final boolean method11913(final Class7096 class7096, final boolean b) {
        final Class3833 method21696 = class7096.method21696();
        return (!Class3833.method11792(method21696) && b) || method21696 instanceof Class3853;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3853.field17465, Class3853.field17466, Class3853.field17468, Class3853.field17467, Class3853.field17469);
    }
}
