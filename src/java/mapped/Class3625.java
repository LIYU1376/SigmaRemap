// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;

public class Class3625 extends Class3446
{
    private static String[] field16839;
    private final Class806 field16840;
    private final double field16841;
    private double field16842;
    private double field16843;
    private double field16844;
    
    public Class3625(final Class806 field16840, final double field16841) {
        this.field16840 = field16840;
        this.field16841 = field16841;
        this.method11019(EnumSet.of(Class2139.field12580));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16840.method4715() || !this.field16840.method1806()) {
            return false;
        }
        final Class5487 method24900 = Class7775.method24900(this.field16840, 5, 4);
        if (method24900 != null) {
            this.field16842 = method24900.field22770;
            this.field16843 = method24900.field22771;
            this.field16844 = method24900.field22772;
            return true;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16840.method4150().method24724(this.field16842, this.field16843, this.field16844, this.field16841);
    }
    
    @Override
    public boolean method11017() {
        if (!this.field16840.method4715()) {
            if (!this.field16840.method4150().method24731()) {
                if (this.field16840.method1806()) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11016() {
        if (!this.field16840.method4715()) {
            if (this.field16840.method2633().nextInt(50) == 0) {
                final Class399 class399 = this.field16840.method1908().get(0);
                if (class399 == null) {
                    return;
                }
                if (class399 instanceof Class512) {
                    final int method4726 = this.field16840.method4726();
                    final int method4727 = this.field16840.method4739();
                    if (method4727 > 0 && this.field16840.method2633().nextInt(method4727) < method4726) {
                        this.field16840.method4751((Class512)class399);
                        return;
                    }
                    this.field16840.method4728(5);
                }
                this.field16840.method1783();
                this.field16840.method4750();
                this.field16840.field2391.method6761(this.field16840, (byte)6);
            }
        }
    }
}
