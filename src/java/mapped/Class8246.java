// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8246 extends Class8245
{
    private static String[] field33874;
    private boolean field33875;
    private Class354 field33876;
    private Class399 field33877;
    
    public Class8246(final Class869 class869, final Class5799 class870) {
        super(class869, class870);
        this.field33875 = false;
        this.field33876 = null;
        this.field33877 = null;
    }
    
    @Override
    public boolean method27312(final Class354 field33876, final Class179 class179) {
        this.field33875 = true;
        this.field33876 = field33876;
        final boolean method27312 = super.method27312(field33876, class179);
        this.field33875 = false;
        return method27312;
    }
    
    @Override
    public boolean method27314(final Class354 field33876, final Class179 class179) {
        this.field33875 = true;
        this.field33876 = field33876;
        final boolean method27314 = super.method27314(field33876, class179);
        this.field33875 = false;
        return method27314;
    }
    
    @Override
    public Class2201 method27320(final Class512 class512, final Class1847 class513, final Class316 class514) {
        this.field33875 = true;
        final Class2201 method27320 = super.method27320(class512, class513, class514);
        this.field33875 = false;
        return method27320;
    }
    
    @Override
    public Class2201 method27319(final Class756 class756, final Class1848 class757, final Class316 class758, final Class7005 class759) {
        this.field33875 = true;
        this.field33876 = class759.method21447();
        final Class2201 method27319 = super.method27319(class756, class757, class758, class759);
        this.field33875 = false;
        return method27319;
    }
    
    @Override
    public Class2201 method27322(final Class512 class512, final Class399 field33877, final Class316 class513) {
        this.field33877 = field33877;
        return super.method27322(class512, field33877, class513);
    }
    
    @Override
    public Class2201 method27323(final Class512 class512, final Class399 field33877, final Class7007 class513, final Class316 class514) {
        this.field33877 = field33877;
        return super.method27323(class512, field33877, class513, class514);
    }
    
    public boolean method27341() {
        return this.field33875;
    }
    
    public Class354 method27342() {
        return this.field33876;
    }
    
    public Class399 method27343() {
        return this.field33877;
    }
}
