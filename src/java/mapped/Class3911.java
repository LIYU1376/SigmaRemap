// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3911 extends Class3833
{
    private static String[] field17716;
    public static final Class7113 field17717;
    
    public Class3911(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3911.field17717, false));
    }
    
    @Override
    public Class7096 method11789(final Class7096 class7096, final Class179 class7097, final Class7096 class7098, final Class1851 class7099, final Class354 class7100, final Class354 class7101) {
        if (class7097 == Class179.field512) {
            final Class3833 method21696 = class7098.method21696();
            return (Class7096)((Class7097<Object, Object>)class7096).method21773((Class7111<Comparable>)Class3911.field17717, method21696 == Class7521.field29331 || method21696 == Class7521.field29329);
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        final Class3833 method21696 = class7074.method21654().method6701(class7074.method21639().method1137()).method21696();
        return (Class7096)((Class7097<Object, Object>)this.method11878()).method21773((Class7111<Comparable>)Class3911.field17717, method21696 == Class7521.field29331 || method21696 == Class7521.field29329);
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3911.field17717);
    }
    
    static {
        field17717 = Class8970.field37744;
    }
}
