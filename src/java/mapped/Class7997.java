// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7997
{
    private static String[] field32937;
    private final Class120 field32938;
    private final int field32939;
    private final int field32940;
    public final /* synthetic */ Class7877 field32941;
    
    public Class7997(final Class7877 field32941, final Class120 field32942, final int field32943, final int field32944) {
        this.field32941 = field32941;
        this.field32938 = field32942;
        this.field32939 = field32943;
        this.field32940 = field32944;
    }
    
    public int method26162() {
        return this.field32939;
    }
    
    public int method26163() {
        return this.field32940;
    }
    
    public Class8321 method26164() {
        final Class8321[] method611 = this.field32938.method611();
        return method611[Class9546.method35642(Class7877.method25527(this.field32941) / 30.0f) % method611.length];
    }
}
