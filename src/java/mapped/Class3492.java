// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.EnumSet;
import java.util.function.Predicate;

public class Class3492 extends Class3446
{
    private static String[] field16432;
    private static final Predicate<Class7096> field16433;
    private final Class759 field16434;
    private final Class1847 field16435;
    private int field16436;
    
    public Class3492(final Class759 field16434) {
        this.field16434 = field16434;
        this.field16435 = field16434.field2391;
        this.method11019(EnumSet.of(Class2139.field12580, Class2139.field12581, Class2139.field12582));
    }
    
    @Override
    public boolean method11013() {
        if (this.field16434.method2633().nextInt(this.field16434.method2625() ? 50 : 1000) == 0) {
            final Class354 class354 = new Class354(this.field16434);
            return Class3492.field16433.test(this.field16435.method6701(class354)) || this.field16435.method6701(class354.method1139()).method21696() == Class7521.field29155;
        }
        return false;
    }
    
    @Override
    public void method11015() {
        this.field16436 = 40;
        this.field16435.method6761(this.field16434, (byte)10);
        this.field16434.method4150().method24733();
    }
    
    @Override
    public void method11018() {
        this.field16436 = 0;
    }
    
    @Override
    public boolean method11017() {
        return this.field16436 > 0;
    }
    
    public int method11056() {
        return this.field16436;
    }
    
    @Override
    public void method11016() {
        this.field16436 = Math.max(0, this.field16436 - 1);
        if (this.field16436 == 4) {
            final Class354 class354 = new Class354(this.field16434);
            if (!Class3492.field16433.test(this.field16435.method6701(class354))) {
                final Class354 method1139 = class354.method1139();
                if (this.field16435.method6701(method1139).method21696() == Class7521.field29155) {
                    if (this.field16435.method6765().method31216(Class8878.field37316)) {
                        this.field16435.method6955(2001, method1139, Class3833.method11774(Class7521.field29155.method11878()));
                        this.field16435.method6688(method1139, Class7521.field29156.method11878(), 2);
                    }
                    this.field16434.method4154();
                }
            }
            else {
                if (this.field16435.method6765().method31216(Class8878.field37316)) {
                    this.field16435.method7149(class354, false);
                }
                this.field16434.method4154();
            }
        }
    }
    
    static {
        field16433 = Class169.method766(Class7521.field29241);
    }
}
