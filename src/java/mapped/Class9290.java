// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class9290
{
    private static String[] field39845;
    private final Class6516 field39846;
    private final String field39847;
    private final Class9456 field39848;
    private Class2250 field39849;
    private Class263 field39850;
    
    public Class9290(final Class6516 field39846, final String field39847, final Class9456 field39848, final Class2250 field39849, final Class263 field39850) {
        this.field39846 = field39846;
        this.field39847 = field39847;
        this.field39848 = field39848;
        this.field39849 = field39849;
        this.field39850 = field39850;
    }
    
    public Class6516 method34311() {
        return this.field39846;
    }
    
    public String method34312() {
        return this.field39847;
    }
    
    public Class9456 method34313() {
        return this.field39848;
    }
    
    public Class2250 method34314() {
        return this.field39849;
    }
    
    public Class2250 method34315() {
        return Class9479.method35299(this.field39849.method8466().method8467(class8768 -> {
            new Class9390(Class1961.field10697, new Class2260(this.method34312()));
            final Class9390 class8769;
            class8768.method30420(class8769);
        }));
    }
    
    public void method34316(final Class2250 field39849) {
        this.field39849 = field39849;
        this.field39846.method19618(this);
    }
    
    public Class263 method34317() {
        return this.field39850;
    }
    
    public void method34318(final Class263 field39850) {
        this.field39850 = field39850;
        this.field39846.method19618(this);
    }
}
