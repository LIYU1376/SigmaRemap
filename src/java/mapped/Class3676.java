// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3676 extends Class3666
{
    public Class3676(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        int n = 0;
        Class8321 field34174 = Class8321.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.method27622() != Class7739.field31513) {
                    if (method2157.method27622() != Class7739.field31512) {
                        return false;
                    }
                    ++n;
                }
                else {
                    if (!field34174.method27620()) {
                        return false;
                    }
                    field34174 = method2157;
                }
            }
        }
        if (!field34174.method27620()) {
            if (field34174.method27656()) {
                if (n > 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public Class8321 method11303(final Class473 class473) {
        int n = 0;
        Class8321 field34174 = Class8321.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.method27622() != Class7739.field31513) {
                    if (method2157.method27622() != Class7739.field31512) {
                        return Class8321.field34174;
                    }
                    ++n;
                }
                else {
                    if (!field34174.method27620()) {
                        return Class8321.field34174;
                    }
                    field34174 = method2157;
                }
            }
        }
        if (!field34174.method27620()) {
            if (field34174.method27656()) {
                if (n >= 1) {
                    if (Class4096.method12340(field34174) < 2) {
                        final Class8321 class474 = new Class8321(Class7739.field31513, n);
                        final Class51 method2158 = field34174.method27657().method333();
                        method2158.method298("generation", Class4096.method12340(field34174) + 1);
                        class474.method27663(method2158);
                        return class474;
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
            if (!method8508.method27622().method11721()) {
                if (method8508.method27622() instanceof Class4096) {
                    final Class8321 method8509 = method8508.method27641();
                    method8509.method27691(1);
                    method8507.set(i, method8509);
                    break;
                }
            }
            else {
                method8507.set(i, new Class8321(method8508.method27622().method11720()));
            }
        }
        return method8507;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24736;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n >= 3 && n2 >= 3;
    }
}
