// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.Maps;
import java.util.Map;

public class Class3974 extends Class3833
{
    private static String[] field17948;
    private static final Map<Class3833, Class3833> field17949;
    public static final Class7702 field17950;
    private final Class3833 field17951;
    
    public Class3974(final Class3833 field17951, final Class9288 class9288) {
        super(class9288);
        this.field17951 = field17951;
        Class3974.field17949.put(field17951, this);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7543 class7099) {
        return Class3974.field17950;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        final Class8321 method2715 = class7099.method2715(class7100);
        final Class3820 method2716 = method2715.method27622();
        final Class3833 class7102 = (method2716 instanceof Class4036) ? Class3974.field17949.getOrDefault(((Class4036)method2716).method12240(), Class7521.field29147) : Class7521.field29147;
        final boolean b = class7102 == Class7521.field29147;
        final boolean b2 = this.field17951 == Class7521.field29147;
        if (b == b2) {
            return Class2201.field13401;
        }
        if (!b2) {
            final Class8321 class7103 = new Class8321(this.field17951);
            if (!method2715.method27620()) {
                if (!class7099.method2885(class7103)) {
                    class7099.method2822(class7103, false);
                }
            }
            else {
                class7099.method2716(class7100, class7103);
            }
            class7097.method6688(class7098, Class7521.field29420.method11878(), 3);
        }
        else {
            class7097.method6688(class7098, class7102.method11878(), 3);
            class7099.method2857(Class8276.field34036);
            if (!class7099.field3025.field27304) {
                method2715.method27693(1);
            }
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class8321 method11862(final Class1855 class1855, final Class354 class1856, final Class7096 class1857) {
        return (this.field17951 != Class7521.field29147) ? new Class8321(this.field17951) : super.method11862(class1855, class1856, class1857);
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        return (class7097 == Class179.field511 && !class7096.method21752(class7099, class7100)) ? Class7521.field29147.method11878() : super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    public Class3833 method12114() {
        return this.field17951;
    }
    
    static {
        field17949 = Maps.newHashMap();
        field17950 = Class3833.method11778(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
    }
}
