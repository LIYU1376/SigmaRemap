// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3669 extends Class3666
{
    private static String[] field16954;
    
    public Class3669(final Class1932 class1932) {
        super(class1932);
    }
    
    public boolean method11301(final Class473 class473, final Class1847 class474) {
        int n = 0;
        Class8321 field34174 = Class8321.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.method27622() != Class7739.field31425) {
                    if (method2157.method27622() != Class7739.field31521) {
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
        return !field34174.method27620() && n > 0;
    }
    
    public Class8321 method11303(final Class473 class473) {
        int n = 0;
        Class8321 field34174 = Class8321.field34174;
        for (int i = 0; i < class473.method2239(); ++i) {
            final Class8321 method2157 = class473.method2157(i);
            if (!method2157.method27620()) {
                if (method2157.method27622() != Class7739.field31425) {
                    if (method2157.method27622() != Class7739.field31521) {
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
        if (!field34174.method27620() && n >= 1) {
            final Class8321 method2158 = field34174.method27641();
            method2158.method27691(n + 1);
            return method2158;
        }
        return Class8321.field34174;
    }
    
    @Override
    public boolean method11291(final int n, final int n2) {
        return n >= 3 && n2 >= 3;
    }
    
    @Override
    public Class6096<?> method11299() {
        return Class6096.field24737;
    }
}
