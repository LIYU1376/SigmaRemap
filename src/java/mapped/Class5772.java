// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class5772 implements Class5770
{
    private static String[] field23608;
    private final float field23609;
    private final float field23610;
    
    public Class5772(final float field23609, final float field23610) {
        this.field23609 = field23609;
        this.field23610 = field23610;
    }
    
    public Class5772(final float n) {
        this.field23609 = n;
        this.field23610 = n;
    }
    
    public static Class5772 method17166(final float n, final float n2) {
        return new Class5772(n, n2);
    }
    
    public float method17167() {
        return this.field23609;
    }
    
    public float method17168() {
        return this.field23610;
    }
    
    @Override
    public int method17159(final Random random) {
        return Class9546.method35658(random, Class9546.method35642(this.field23609), Class9546.method35642(this.field23610));
    }
    
    public float method17169(final Random random) {
        return Class9546.method35659(random, this.field23609, this.field23610);
    }
    
    public boolean method17170(final int n) {
        return n <= this.field23610 && n >= this.field23609;
    }
    
    @Override
    public Class1932 method17161() {
        return Class5772.field23604;
    }
}
