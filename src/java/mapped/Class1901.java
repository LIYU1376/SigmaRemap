// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.commons.lang3.mutable.MutableInt;

public final class Class1901 extends Class1890<Class7502, Class1899>
{
    private static String[] field10324;
    private static final Class179[] field10325;
    private final Class385 field10326;
    
    public Class1901(final Class1908 class1908) {
        super(class1908, Class237.field912, new Class1899(class1908));
        this.field10326 = new Class385();
    }
    
    private int method7375(final long n) {
        final int method1126 = Class354.method1126(n);
        final int method1127 = Class354.method1127(n);
        final int method1128 = Class354.method1128(n);
        final Class1855 method1129 = this.field10275.method7400(method1126 >> 4, method1128 >> 4);
        return (method1129 == null) ? 0 : method1129.method6984(this.field10326.method1284(method1126, method1127, method1128));
    }
    
    @Override
    public int method7305(final long n, final long n2, final int n3) {
        if (n2 == Long.MAX_VALUE) {
            return 15;
        }
        if (n == Long.MAX_VALUE) {
            return n3 + 15 - this.method7375(n2);
        }
        if (n3 >= 15) {
            return n3;
        }
        final Class179 method794 = Class179.method794(Integer.signum(Class354.method1126(n2) - Class354.method1126(n)), Integer.signum(Class354.method1127(n2) - Class354.method1127(n)), Integer.signum(Class354.method1128(n2) - Class354.method1128(n)));
        if (method794 == null) {
            return 15;
        }
        final MutableInt mutableInt = new MutableInt();
        final Class7096 method795 = this.method7297(n2, mutableInt);
        if (mutableInt.getValue() < 15) {
            return Class7698.method24505(this.method7298(this.method7297(n, null), n, method794), this.method7298(method795, n2, method794.method782())) ? 15 : (n3 + Math.max(1, mutableInt.getValue()));
        }
        return 15;
    }
    
    @Override
    public void method7326(final long n, final int n2, final boolean b) {
        final long method1111 = Class353.method1111(n);
        final Class179[] field10325 = Class1901.field10325;
        for (int length = field10325.length, i = 0; i < length; ++i) {
            final long method1112 = Class354.method1124(n, field10325[i]);
            final long method1113 = Class353.method1111(method1112);
            if (method1111 == method1113 || ((Class1899)this.field10277).method7347(method1113)) {
                this.method7322(n, method1112, n2, b);
            }
        }
    }
    
    @Override
    public int method7301(final long n, final long n2, final int n3) {
        int n4 = n3;
        if (Long.MAX_VALUE != n2) {
            final int method7305 = this.method7305(Long.MAX_VALUE, n, 0);
            if (n3 > method7305) {
                n4 = method7305;
            }
            if (n4 == 0) {
                return n4;
            }
        }
        final long method7306 = Class353.method1111(n);
        final Class7281 method7307 = ((Class1899)this.field10277).method7348(method7306, true);
        final Class179[] field10325 = Class1901.field10325;
        for (int length = field10325.length, i = 0; i < length; ++i) {
            final long method7308 = Class354.method1124(n, field10325[i]);
            if (method7308 != n2) {
                final long method7309 = Class353.method1111(method7308);
                Class7281 method7310;
                if (method7306 != method7309) {
                    method7310 = ((Class1899)this.field10277).method7348(method7309, true);
                }
                else {
                    method7310 = method7307;
                }
                if (method7310 != null) {
                    final int method7311 = this.method7305(method7308, n, this.method7303(method7310, method7308));
                    if (n4 > method7311) {
                        n4 = method7311;
                    }
                    if (n4 == 0) {
                        return n4;
                    }
                }
            }
        }
        return n4;
    }
    
    @Override
    public void method7311(final Class354 class354, final int n) {
        ((Class1899)this.field10277).method7364();
        this.method7320(Long.MAX_VALUE, class354.method1132(), 15 - n, true);
    }
    
    static {
        field10325 = Class179.values();
    }
}
