// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3672 extends Class3666
{
    private static String[] field16957;
    
    public Class3672(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        Class181 method12244 = null;
        Class8321 class475 = null;
        Class8321 class476 = null;
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method12245 = class473.method2157(i);
            final Class3820 method12246 = method12245.method27622();
            if (method12246 instanceof Class4044) {
                final Class4044 class477 = (Class4044)method12246;
                if (method12244 != null) {
                    if (method12244 != class477.method12244()) {
                        return false;
                    }
                }
                else {
                    method12244 = class477.method12244();
                }
                final int method12247 = Class465.method2385(method12245);
                if (method12247 > 6) {
                    return false;
                }
                if (method12247 <= 0) {
                    if (class476 != null) {
                        return false;
                    }
                    class476 = method12245;
                }
                else {
                    if (class475 != null) {
                        return false;
                    }
                    class475 = method12245;
                }
            }
        }
        return class475 != null && class476 != null;
    }
    
    public Class8321 method11303(final Class473 class473) {
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                final int method2158 = Class465.method2385(method2157);
                if (method2158 > 0) {
                    if (method2158 <= 6) {
                        final Class8321 method2159 = method2157.method27641();
                        method2159.method27691(1);
                        return method2159;
                    }
                }
            }
        }
        return Class8321.field34174;
    }
    
    public Class2265<Class8321> method11323(final Class473 class473) {
        final Class2265<Class8321> method8507 = Class2265.method8507(class473.method2239(), Class8321.field34174);
        for (int i = 0; i < method8507.size(); ++i) {
            final Class8321 method8508 = class473.method2157(i);
            if (!method8508.method27620()) {
                if (!method8508.method27622().method11721()) {
                    if (method8508.method27656()) {
                        if (Class465.method2385(method8508) > 0) {
                            final Class8321 method8509 = method8508.method27641();
                            method8509.method27691(1);
                            method8507.set(i, method8509);
                        }
                    }
                }
                else {
                    method8507.set(i, new Class8321(method8508.method27622().method11720()));
                }
            }
        }
        return method8507;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24743;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n * n2 >= 2;
    }
}
