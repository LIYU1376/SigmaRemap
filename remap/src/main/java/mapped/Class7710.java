// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7710
{
    private static String[] field30672;
    public static final Tessellator field30673;
    public static final Class7710 field30674;
    
    public void method24609() {
        Class7710.field30673.draw();
    }
    
    public Class7710 method24610(final double n, final double n2, final double n3) {
        Class7710.field30673.getBuffer().pos(n, n2, n3);
        return this;
    }
    
    public void method24611(final int n, final Class8964 class8964) {
        Class7710.field30673.getBuffer().begin(n, class8964.method31802());
    }
    
    public void method24612() {
        Class7710.field30673.getBuffer().endVertex();
    }
    
    public Class7710 method24613(final int n, final int n2, final int n3, final int n4) {
        Class7710.field30673.getBuffer().method12399(n, n2, n3, n4);
        return this;
    }
    
    public Class7710 method24614(final float n, final float n2) {
        Class7710.field30673.getBuffer().tex(n, n2);
        return this;
    }
    
    static {
        field30673 = Tessellator.getInstance();
        field30674 = new Class7710();
    }
}
