// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3931 extends Class3841
{
    private static String[] field17810;
    public static final Class7113 field17811;
    
    public Class3931(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3931.field17811, false));
    }
    
    @Override
    public Class2201 method11844(Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7096.method21772((Class7111<Boolean>)Class3931.field17811)) {
            return Class2201.field13402;
        }
        this.method12049(class7097, class7098);
        class7096 = ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3931.field17811, false);
        class7097.method6688(class7098, class7096, 2);
        return Class2201.field13400;
    }
    
    public void method12048(final Class1851 class1851, final Class354 class1852, final Class7096 class1853, final Class8321 class1854) {
        final Class436 method6727 = class1851.method6727(class1852);
        if (method6727 instanceof Class449) {
            ((Class449)method6727).method2278(class1854.method27641());
            class1851.method6688(class1852, ((Class7097<O, Class7096>)class1853).method21773((Class7111<Comparable>)Class3931.field17811, true), 2);
        }
    }
    
    private void method12049(final Class1847 class1847, final Class354 class1848) {
        if (!class1847.field10067) {
            final Class436 method6727 = class1847.method6727(class1848);
            if (method6727 instanceof Class449) {
                final Class449 class1849 = (Class449)method6727;
                final Class8321 method6728 = class1849.method2277();
                if (!method6728.method27620()) {
                    class1847.method6955(1010, class1848, 0);
                    class1849.method2164();
                    final Class427 class1850 = new Class427(class1847, class1848.method1074() + (class1847.field10062.nextFloat() * 0.7f + 0.15000000596046448), class1848.method1075() + (class1847.field10062.nextFloat() * 0.7f + 0.06000000238418579 + 0.6), class1848.method1076() + (class1847.field10062.nextFloat() * 0.7f + 0.15000000596046448), method6728.method27641());
                    class1850.method2114();
                    class1847.method6886(class1850);
                }
            }
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            this.method12049(class7097, class7098);
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public Class436 method11898(final Class1855 class1855) {
        return new Class449();
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final Class1847 class7097, final Class354 class7098) {
        final Class436 method6727 = class7097.method6727(class7098);
        if (method6727 instanceof Class449) {
            final Class3820 method6728 = ((Class449)method6727).method2277().method27622();
            if (method6728 instanceof Class3828) {
                return ((Class3828)method6728).method11763();
            }
        }
        return 0;
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3931.field17811);
    }
    
    static {
        field17811 = Class8970.field37732;
    }
}
