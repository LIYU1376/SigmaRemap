// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3899 extends Class3892
{
    private static final Class2259 field17598;
    
    public Class3899(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067) {
            class7099.method2833(class7096.method21754(class7097, class7098));
            class7099.method2857(Class8276.field34052);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    @Override
    public Class434 method11827(final Class7096 class7096, final Class1847 class7097, final Class354 class7098) {
        return new Class504((n, class1849, class1850) -> new Class3439(n, class1849, Class7318.method22434(class7097, class7098)), Class3899.field17598);
    }
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3899.field17564, class7074.method21644().method782());
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3899.field17564);
    }
    
    static {
        field17598 = new Class2259("container.loom", new Object[0]);
    }
}
