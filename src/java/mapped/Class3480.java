// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3480 extends Class3479
{
    private static String[] field16400;
    private final Class793 field16401;
    
    public Class3480(final Class793 field16401, final double n) {
        super(field16401, n, 16);
        this.field16401 = field16401;
    }
    
    @Override
    public boolean method11013() {
        return this.field16401.method4456() && Class793.method4466(this.field16401).method1082(this.field16401.method1934(), 9.0) && super.method11013();
    }
    
    @Override
    public boolean method11017() {
        if (super.method11017()) {
            if (this.field16401.method4456()) {
                if (Class793.method4466(this.field16401).method1082(this.field16401.method1934(), 9.0)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public void method11016() {
        super.method11016();
        final Class354 class354 = new Class354(this.field16401);
        if (!this.field16401.method1706()) {
            if (this.method11048()) {
                if (Class793.method4469(this.field16401) >= 1) {
                    if (Class793.method4469(this.field16401) > 200) {
                        final Class1847 field2391 = this.field16401.field2391;
                        field2391.method6705(null, class354, Class8520.field35658, Class286.field1582, 0.3f, 0.9f + field2391.field10062.nextFloat() * 0.2f);
                        field2391.method6688(this.field16395.method1137(), ((Class7097<O, Class7096>)Class7521.field29716.method11878()).method21773((Class7111<Comparable>)Class4005.field18053, Class793.method4471(this.field16401).nextInt(4) + 1), 3);
                        Class793.method4472(this.field16401, false);
                        Class793.method4470(this.field16401, false);
                        this.field16401.method4361(600);
                    }
                }
                else {
                    Class793.method4470(this.field16401, true);
                }
                if (this.field16401.method4458()) {
                    Class793.method4473(this.field16401);
                }
            }
        }
    }
    
    @Override
    public boolean method11050(final Class1852 class1852, final Class354 class1853) {
        return class1852.method6961(class1853.method1137()) && class1852.method6701(class1853).method21696() == Class7521.field29175;
    }
}
