// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class3849 extends Class3846
{
    private static String[] field17455;
    
    public Class3849(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public void method11852(final Class1847 class1847, final Class512 class1848, final Class354 class1849, final Class7096 class1850, final Class436 class1851, final Class8321 class1852) {
        super.method11852(class1847, class1848, class1849, class1850, class1851, class1852);
        if (Class8742.method30195(Class7882.field32366, class1852) == 0) {
            if (class1847.field10063.method20502()) {
                class1847.method6690(class1849, false);
                return;
            }
            final Class8059 method21697 = class1847.method6701(class1849.method1139()).method21697();
            if (method21697.method26440() || method21697.method26438()) {
                class1847.method6692(class1849, Class7521.field29173.method11878());
            }
        }
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, final Class354 class7098, final Random random) {
        if (class7097.method6992(Class237.field912, class7098) > 11 - class7096.method21700(class7097, class7098)) {
            this.method11910(class7096, class7097, class7098);
        }
    }
    
    public void method11910(final Class7096 class7096, final Class1847 class7097, final Class354 class7098) {
        if (!class7097.field10063.method20502()) {
            class7097.method6692(class7098, Class7521.field29173.method11878());
            class7097.method6698(class7098, Class7521.field29173, class7098);
        }
        else {
            class7097.method6690(class7098, false);
        }
    }
    
    @Override
    public Class2117 method11858(final Class7096 class7096) {
        return Class2117.field12340;
    }
    
    @Override
    public boolean method11779(final Class7096 class7096, final Class1855 class7097, final Class354 class7098, final Class7499<?> class7099) {
        return class7099 == Class7499.field29015;
    }
}
