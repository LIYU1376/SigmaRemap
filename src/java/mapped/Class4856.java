// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4856 extends Class4841
{
    private static String[] field20591;
    public float field20805;
    public String field20806;
    
    public Class4856(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final String s2, final String field20806) {
        super(class4803, s, n, n2, n3, n4, Class6523.field25964, s2, false);
        this.field20806 = field20806;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
        this.field20805 += (this.method14308() ? 0.14f : -0.14f);
        this.field20805 = Math.min(Math.max(0.0f, this.field20805), 1.0f);
    }
    
    @Override
    public void method14205(final float n) {
        if (this.method14314() != null) {
            this.method14228();
            this.field20497.method19729();
            final int n2 = this.method14272() + ((this.field20497.method19735() != Class2056.field11738) ? 0 : ((this.field20497.method19735() != Class2056.field11736) ? (this.method14276() / 2) : this.method14276()));
            final int n3 = this.method14274() + ((this.field20497.method19737() != Class2056.field11738) ? 0 : ((this.field20497.method19737() != Class2056.field11737) ? (this.method14278() / 2) : this.method14278()));
            this.method14316().method23505(this.method14314());
            final float n4 = this.field20805 * this.field20805 * this.field20805;
            boolean b = false;
            if (this.method14306()) {
                b = true;
            }
            if (b) {
                Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(-11890462, 1.0f));
            }
            final int n5 = 16;
            final int n6 = 8;
            int n7 = Class265.field1273.field1292;
            if (b) {
                n7 = Class265.field1278.field1292;
            }
            Class8154.method26889(Class9400.field40311, (float)(this.field20478 + n5 + 50), (float)(this.field20479 + n6 + 5), this.field20495, Class6430.method19118(n7, n));
            Class8154.method26889(Class9400.field40310, (float)(this.field20478 + n5 + 50), (float)(this.field20479 + n6 + 19), this.field20806, Class6430.method19118(n7, n * 0.5f));
            super.method14205(n);
        }
    }
}
