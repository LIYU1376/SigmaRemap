// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4911 extends Class4825
{
    public Class4855 field21011;
    
    public Class4911(final Class4855 field21011, final int n, final String str) {
        super(field21011, "bezierButton-" + str, 0, 0, n, n, true);
        this.method14385(true);
        this.field20602 = true;
        this.field21011 = field21011;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        final int n3 = this.field21011.method14276() - this.field21011.field20803;
        final int n4 = this.field21011.method14278() - this.method14278();
        final int field20803 = this.field21011.field20803;
        if (this.method14272() > n3) {
            this.method14273(n3);
        }
        if (this.method14274() > n4) {
            this.method14275(n4);
        }
        if (this.method14272() < field20803) {
            this.method14273(field20803);
        }
    }
    
    public void method14752(final float n, final float n2) {
        this.field20478 = (int)n;
        this.field20479 = (int)n2;
    }
    
    @Override
    public void method14205(final float n) {
        Class8154.method26888((float)(this.field20478 + 5), (float)(this.field20479 + 5), 10.0f, Class6430.method19118(this.method14386() ? Class265.field1274.field1292 : Class265.field1275.field1292, n));
        super.method14205(n);
    }
}
