// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.doubles.DoubleList;

public class Class7703 extends Class7702
{
    private static String[] field30617;
    private final Class7702 field30618;
    private final Class111 field30619;
    private static final DoubleList field30620;
    
    public Class7703(final Class7702 field30618, final Class111 field30619, final int n) {
        super(method24560(field30618.field30615, field30619, n));
        this.field30618 = field30618;
        this.field30619 = field30619;
    }
    
    private static Class8260 method24560(final Class8260 class8260, final Class111 class8261, final int n) {
        return new Class8261(class8260, class8261.method604(n, 0, 0), class8261.method604(0, n, 0), class8261.method604(0, 0, n), class8261.method604(n + 1, class8260.field33919, class8260.field33919), class8261.method604(class8260.field33920, n + 1, class8260.field33920), class8261.method604(class8260.field33921, class8260.field33921, n + 1));
    }
    
    @Override
    public DoubleList method24539(final Class111 class111) {
        return (class111 != this.field30619) ? this.field30618.method24539(class111) : Class7703.field30620;
    }
    
    static {
        field30620 = (DoubleList)new Class81(1);
    }
}
