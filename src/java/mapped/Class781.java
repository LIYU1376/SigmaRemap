// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class781 extends Class780
{
    private static String[] field4191;
    
    public Class781(final Class7499<? extends Class781> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.method4145(Class257.field1210, 8.0f);
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35724;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35726;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35725;
    }
    
    @Override
    public Class7795 method4328() {
        return Class8520.field35727;
    }
    
    @Override
    public void method2678(final Class7929 class7929, final int n, final boolean b) {
        super.method2678(class7929, n, b);
        final Class399 method25714 = class7929.method25714();
        if (method25714 instanceof Class765) {
            final Class765 class7930 = (Class765)method25714;
            if (class7930.method4241()) {
                class7930.method4242();
                this.method1764(Class7739.field31524);
            }
        }
    }
    
    @Override
    public void method4184(final Class9592 class9592) {
        this.method1803(Class2215.field13600, new Class8321(Class7739.field31291));
    }
    
    @Override
    public void method4187(final Class9592 class9592) {
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        final Class5496 method4188 = super.method4188(class1851, class1852, class1853, class1854, class1855);
        this.method2710(Class8107.field33410).method23941(4.0);
        this.method4329();
        return method4188;
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return 2.1f;
    }
    
    @Override
    public boolean method2734(final Class399 class399) {
        if (super.method2734(class399)) {
            if (class399 instanceof Class511) {
                ((Class511)class399).method2655(new Class1948(Class9439.field40493, 200));
            }
            return true;
        }
        return false;
    }
    
    @Override
    public Class402 method4330(final Class8321 class8321, final float n) {
        final Class402 method4330 = super.method4330(class8321, n);
        method4330.method1664(100);
        return method4330;
    }
    
    @Override
    public boolean method2656(final Class1948 class1948) {
        return class1948.method7906() != Class9439.field40493 && super.method2656(class1948);
    }
}
