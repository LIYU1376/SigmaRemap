// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class3948 extends Class3841
{
    public static final Class7115 field17846;
    public static final Class7113 field17847;
    
    public Class3948(final Class9288 class9288) {
        super(class9288);
        this.method11877(((Class7097<O, Class7096>)((Class7097<O, Class7096>)this.field17406.method32903()).method21773((Class7111<Comparable>)Class3948.field17846, Class179.field513)).method21773((Class7111<Comparable>)Class3948.field17847, false));
    }
    
    @Override
    public int method11781(final Class7096 class7096) {
        return class7096.method21772((Class7111<Boolean>)Class3948.field17847) ? super.method11781(class7096) : 0;
    }
    
    @Override
    public Class2201 method11844(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class512 class7099, final Class316 class7100, final Class7005 class7101) {
        if (!class7097.field10067) {
            this.method12066(class7097, class7098, class7099);
            return Class2201.field13400;
        }
        return Class2201.field13400;
    }
    
    public abstract void method12066(final Class1847 p0, final Class354 p1, final Class512 p2);
    
    @Override
    public Class7096 method11846(final Class7074 class7074) {
        return ((Class7097<O, Class7096>)this.method11878()).method21773((Class7111<Comparable>)Class3948.field17846, class7074.method21644().method782());
    }
    
    @Override
    public void method11853(final Class1847 class1847, final Class354 class1848, final Class7096 class1849, final Class511 class1850, final Class8321 class1851) {
        if (class1851.method27667()) {
            final Class436 method6727 = class1847.method6727(class1848);
            if (method6727 instanceof Class466) {
                ((Class466)method6727).method2335(class1851.method27664());
            }
        }
    }
    
    @Override
    public void method11829(final Class7096 class7096, final Class1847 class7097, final Class354 class7098, final Class7096 class7099, final boolean b) {
        if (class7096.method21696() != class7099.method21696()) {
            final Class436 method6727 = class7097.method6727(class7098);
            if (method6727 instanceof Class466) {
                Class9193.method33638(class7097, class7098, (Class446)method6727);
                class7097.method6783(class7098, this);
            }
            super.method11829(class7096, class7097, class7098, class7099, b);
        }
    }
    
    @Override
    public boolean method11873(final Class7096 class7096) {
        return true;
    }
    
    @Override
    public int method11874(final Class7096 class7096, final Class1847 class7097, final Class354 class7098) {
        return Class3418.method10897(class7097.method6727(class7098));
    }
    
    @Override
    public Class2115 method11797(final Class7096 class7096) {
        return Class2115.field12307;
    }
    
    @Override
    public Class7096 method11790(final Class7096 class7096, final Class2052 class7097) {
        return ((Class7097<O, Class7096>)class7096).method21773((Class7111<Comparable>)Class3948.field17846, class7097.method8142(class7096.method21772((Class7111<Class179>)Class3948.field17846)));
    }
    
    @Override
    public Class7096 method11791(final Class7096 class7096, final Class2181 class7097) {
        return class7096.method21708(class7097.method8344(class7096.method21772((Class7111<Class179>)Class3948.field17846)));
    }
    
    @Override
    public void method11875(final Class9500<Class3833, Class7096> class9500) {
        class9500.method35378(Class3948.field17846, Class3948.field17847);
    }
    
    static {
        field17846 = Class3892.field17564;
        field17847 = Class4024.field18113;
    }
}
