// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class7753 extends Class7752
{
    private static String[] field31686;
    
    public Class7753(final Class793 class793, final Class1847 class794) {
        super(class793, class794);
    }
    
    @Override
    public boolean method24735() {
        return true;
    }
    
    @Override
    public Class7914 method24715(final int n) {
        this.field31672 = new Class4653();
        return new Class7914(this.field31672, n);
    }
    
    @Override
    public boolean method24739(final Class354 class354) {
        if (this.field31657 instanceof Class793 && Class793.method4474((Class793)this.field31657)) {
            return this.field31658.method6701(class354).method21696() == Class7521.field29173;
        }
        return !this.field31658.method6701(class354.method1139()).method21706();
    }
}
