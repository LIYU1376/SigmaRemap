// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import com.google.common.collect.ImmutableMap;
import javax.annotation.Nullable;
import java.util.Map;

public class Class3926 extends Class3924
{
    private static String[] field17790;
    public static final Class7115 field17791;
    private static final Map<Class179, Class7702> field17792;
    
    public Class3926(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3926.field17791, Class179.field513)).method21773((Class7111<Comparable>)Class3926.field17782, true));
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3926.field17792.get(class7096.method21772((Class7111<Object>)Class3926.field17791));
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3926.field17791, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3926.field17791)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3926.field17791)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3926.field17791, Class3926.field17782);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7096.method21772((Class7111<Boolean>)Class3926.field17782)) {
            class7099.method6834().method21345(class7100, Class7558.field29976, Class7558.field29976.method22156(class7099));
        }
        return (class7097.method782() == class7096.method21772((Class7111<Class179>)Class3926.field17791) && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.method11878() : class7096;
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final Class354 class7098) {
        final Class179 class7099 = class7096.method21772((Class7111<Class179>)Class3926.field17791);
        final Class354 method1149 = class7098.method1149(class7099.method782());
        return class7097.method6701(method1149).method21761(class7097, method1149, class7099);
    }
    
    @Nullable
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        Class7096 method11846 = super.method11846(class7074);
        final Class1847 method11847 = class7074.method21654();
        final Class354 method11848 = class7074.method21639();
        for (final Class179 class7075 : class7074.method21643()) {
            if (class7075.method790().method601()) {
                method11846 = ((Class7097<Object, Class7096>)method11846).method21773((Class7111<Comparable>)Class3926.field17791, class7075.method782());
                if (method11846.method21752(method11847, method11848)) {
                    return method11846;
                }
            }
        }
        return null;
    }
    
    static {
        field17791 = Class3892.field17564;
        field17792 = Maps.newEnumMap((Map)ImmutableMap.of((Object)Class179.field513, (Object)Class3833.method11778(0.0, 4.0, 5.0, 16.0, 12.0, 16.0), (Object)Class179.field514, (Object)Class3833.method11778(0.0, 4.0, 0.0, 16.0, 12.0, 11.0), (Object)Class179.field515, (Object)Class3833.method11778(5.0, 4.0, 0.0, 16.0, 12.0, 16.0), (Object)Class179.field516, (Object)Class3833.method11778(0.0, 4.0, 0.0, 11.0, 12.0, 16.0)));
    }
}
