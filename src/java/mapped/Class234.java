// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

public enum Class234
{
    field877(Class7739.field31279, 0.0f, 3.0f, 0.0f), 
    field878(Class7739.field31355, 0.0f, 1.875f, 0.0f), 
    field879(Class7739.field31436, 0.0f, 1.875f, 0.0f), 
    field880(Class7739.field31374, 0.0f, 1.875f, 0.0f), 
    field881(Class7739.field31579, 0.0f, 0.5f, 0.0f), 
    field882(Class7739.field31510, 0.0f, 0.6f, 0.0f), 
    field883(Class7739.field31607, 0.0f, 2.5f, 0.0f);
    
    private Class3820 field884;
    private float field885;
    private float field886;
    private float field887;
    public double field888;
    public double field889;
    public double field890;
    public float field891;
    public float field892;
    public float field893;
    public Class7006 field894;
    public Class399 field895;
    
    private Class234(final Class3820 field884, final float field885, final float field886, final float field887) {
        this.field884 = field884;
        this.field885 = field885;
        this.field886 = field886;
        this.field887 = field887;
    }
    
    public float method868() {
        if (!this.field884.equals(Class7739.field31279)) {
            return this.field886;
        }
        return (this.field886 * Class4087.method12318(Class3213.method10110().field4684.method2767()) <= 0.0f) ? Class4087.method12318(20) : Class4087.method12318(Class3213.method10111().field4684.method2767());
    }
    
    public float method869() {
        return this.field885;
    }
    
    public float method870() {
        return this.field887;
    }
    
    public Class3820 method871() {
        return this.field884;
    }
    
    public static Class234 method872(final Class3820 obj) {
        for (final Class234 class234 : values()) {
            if (class234.method871().equals(obj)) {
                return class234;
            }
        }
        return null;
    }
    
    public List<Class8797> method873() {
        final ArrayList list = new ArrayList();
        final float n = (float)Math.toRadians(Class3213.method10112().field4684.field2399);
        final float n2 = (float)Math.toRadians(Class3213.method10113().field4684.field2400);
        final double field888 = Class3213.method10114().field4684.field2417 + (Class3213.method10115().field4684.field2395 - Class3213.method10116().field4684.field2417) * Class3213.method10117().field4633.field26528;
        final double n3 = Class3213.method10118().field4684.field2418 + (Class3213.method10119().field4684.field2396 - Class3213.method10120().field4684.field2418) * Class3213.method10121().field4633.field26528;
        final double field889 = Class3213.method10122().field4684.field2419 + (Class3213.method10123().field4684.field2397 - Class3213.method10124().field4684.field2419) * Class3213.method10125().field4633.field26528;
        this.field888 = field888;
        this.field889 = n3 + Class3213.method10126().field4684.method1892() - 0.10000000149011612;
        this.field890 = field889;
        final float n4 = Math.min(20.0f, 72000 - Class3213.method10127().field4684.method2767() + Class3213.method10128().method5314()) / 20.0f;
        this.field891 = -Class9546.method35638(n) * Class9546.method35639(n2) * this.field886 * n4;
        this.field892 = -Class9546.method35638(n2) * this.field886 * n4;
        this.field893 = Class9546.method35639(n) * Class9546.method35639(n2) * this.field886 * n4;
        this.field894 = null;
        this.field895 = null;
        list.add(new Class8797(this.field888, this.field889, this.field890));
        while (this.field894 == null) {
            if (this.field895 != null) {
                break;
            }
            if (this.field889 <= 0.0) {
                break;
            }
            final Class5487 class5487 = new Class5487(this.field888, this.field889, this.field890);
            final Class5487 class5488 = new Class5487(this.field888 + this.field891, this.field889 + this.field892, this.field890 + this.field893);
            final float n5 = (float)((this.field884 instanceof Class4087) ? 0.3 : 0.25);
            final List<Class399> method6737 = Class3213.method10130().field4683.method6737(Class3213.method10129().field4684, new Class6221(this.field888 - n5, this.field889 - n5, this.field890 - n5, this.field888 + n5, this.field889 + n5, this.field890 + n5).method18499(this.field891, this.field892, this.field893).method18495(1.0, 1.0, 1.0), Class9170.field38850.and((Predicate<? super Class399>)new Class166(this, n5, class5487, class5488)));
            if (method6737.size() > 0) {
                final Iterator<Class399> iterator = method6737.iterator();
                while (iterator.hasNext()) {
                    this.field895 = iterator.next();
                }
                break;
            }
            final Class7005 method6738 = Class3213.method10132().field4683.method6987(new Class8478(class5487, class5488, Class2040.field11632, Class2191.field13325, Class3213.method10131().field4684));
            if (method6738 != null && method6738.method21449() != Class2165.field12880) {
                this.field894 = method6738;
                this.field888 = this.field894.method21451().field22770;
                this.field889 = this.field894.method21451().field22771;
                this.field890 = this.field894.method21451().field22772;
                list.add(new Class8797(this.field888, this.field889, this.field890));
                break;
            }
            final float n6 = 0.99f;
            final float n7 = 0.05f;
            this.field888 += this.field891;
            this.field889 += this.field892;
            this.field890 += this.field893;
            list.add(new Class8797(this.field888, this.field889, this.field890));
            this.field891 *= n6;
            this.field892 *= n6;
            this.field893 *= n6;
            this.field892 -= n7;
        }
        return list;
    }
}
