// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3593 extends Class3592
{
    private static String[] field16737;
    public final /* synthetic */ Class803 field16738;
    
    public Class3593(final Class803 field16738) {
        this.field16738 = field16738;
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16738.method4667()) {
            return false;
        }
        final Class511 method4152 = this.field16738.method4152();
        if (method4152 == null || !method4152.method1768()) {
            return false;
        }
        if (method4152.method1883() == method4152.method1882()) {
            final boolean method4153 = Class803.method4677(this.field16738, method4152);
            if (!method4153) {
                this.field16738.method4150().method24722(method4152, 0);
                this.field16738.method4668(false);
                this.field16738.method4669(false);
            }
            return method4153;
        }
        return false;
    }
    
    @Override
    public boolean method11017() {
        final Class511 method4152 = this.field16738.method4152();
        if (method4152 != null && method4152.method1768()) {
            final double field22771 = this.field16738.method1935().field22771;
            if (field22771 * field22771 < 0.05000000074505806) {
                if (Math.abs(this.field16738.field2400) < 15.0f) {
                    if (this.field16738.field2404) {
                        return false;
                    }
                }
            }
            if (!this.field16738.method4656()) {
                return true;
            }
            return false;
        }
        return false;
    }
    
    @Override
    public boolean method11014() {
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16738.method2745(true);
        this.field16738.method4666(true);
        this.field16738.method4669(false);
        final Class511 method4152 = this.field16738.method4152();
        this.field16738.method4147().method24667(method4152, 60.0f, 30.0f);
        final Class5487 method4153 = new Class5487(method4152.method1938() - this.field16738.method1938(), method4152.method1941() - this.field16738.method1941(), method4152.method1945() - this.field16738.method1945()).method16738();
        this.field16738.method1936(this.field16738.method1935().method16744(method4153.field22770 * 0.8, 0.9, method4153.field22772 * 0.8));
        this.field16738.method4150().method24733();
    }
    
    @Override
    public void method11018() {
        this.field16738.method4668(false);
        Class803.method4696(this.field16738, 0.0f);
        Class803.method4697(this.field16738, 0.0f);
        this.field16738.method4669(false);
        this.field16738.method4666(false);
    }
    
    @Override
    public void method11016() {
        final Class511 method4152 = this.field16738.method4152();
        if (method4152 != null) {
            this.field16738.method4147().method24667(method4152, 60.0f, 30.0f);
        }
        if (!this.field16738.method4656()) {
            final Class5487 method4153 = this.field16738.method1935();
            if (method4153.field22771 * method4153.field22771 < 0.029999999329447746 && this.field16738.field2400 != 0.0f) {
                this.field16738.field2400 = Class9546.method35707(this.field16738.field2400, 0.0f, 0.2f);
            }
            else {
                this.field16738.field2400 = (float)(Math.signum(-method4153.field22771) * Math.acos(Math.sqrt(Class399.method1680(method4153)) / method4153.method16752()) * 57.2957763671875);
            }
        }
        if (method4152 != null && this.field16738.method1732(method4152) <= 2.0f) {
            this.field16738.method2734(method4152);
        }
        else if (this.field16738.field2400 > 0.0f) {
            if (this.field16738.field2404) {
                if ((float)this.field16738.method1935().field22771 != 0.0f) {
                    if (this.field16738.field2391.method6701(new Class354(this.field16738)).method21696() == Class7521.field29329) {
                        this.field16738.field2400 = 60.0f;
                        this.field16738.method4153(null);
                        Class803.method4694(this.field16738, true);
                    }
                }
            }
        }
    }
}
