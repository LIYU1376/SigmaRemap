// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4714 extends Class4712<Class841, Class5876<Class841>>
{
    public static final Class1932 field20315;
    public static final Class1932[] field20316;
    
    public Class4714(final Class8551 class8551) {
        super(class8551, new Class5876(), 0.0f);
        this.method13978(new Class1800(this));
    }
    
    public Class5487 method14012(final Class841 class841, final float n) {
        final int method5024 = class841.method5024();
        if (method5024 > 0 && class841.method5026()) {
            final Class354 method5025 = class841.method5019();
            final Class354 method5026 = class841.method5025();
            final double n2 = (method5024 - n) / 6.0;
            final double n3 = n2 * n2;
            return new Class5487(-((method5025.method1074() - method5026.method1074()) * n3), -((method5025.method1075() - method5026.method1075()) * n3), -((method5025.method1076() - method5026.method1076()) * n3));
        }
        return super.method13955((T)class841, n);
    }
    
    public boolean method14013(final Class841 class841, final Class6664 class842, final double n, final double n2, final double n3) {
        if (!super.method14005(class841, class842, n, n2, n3)) {
            if (class841.method5024() > 0) {
                if (class841.method5026()) {
                    final Class5487 class843 = new Class5487(class841.method5019());
                    final Class5487 class844 = new Class5487(class841.method5025());
                    if (class842.method20261(new Class6221(class844.field22770, class844.field22771, class844.field22772, class843.field22770, class843.field22771, class843.field22772))) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }
    
    public Class1932 method14014(final Class841 class841) {
        return (class841.method5027() != null) ? Class4714.field20316[class841.method5027().method813()] : Class4714.field20315;
    }
    
    public void method14015(final Class841 class841, final Class7351 class842, final float n, final float n2, final float n3) {
        super.method13985(class841, class842, n, n2, n3);
        class842.method22564(0.0, 0.5, 0.0);
        class842.method22566(class841.method5018().method782().method778());
        class842.method22564(0.0, -0.5, 0.0);
    }
    
    public void method14016(final Class841 class841, final Class7351 class842, final float n) {
        class842.method22565(0.999f, 0.999f, 0.999f);
    }
    
    static {
        field20315 = new Class1932(Class4714.\u7b4d\u5718\ub5d9\u345d\u708b\u63ae[0] + Class8752.field36750.method11331().method7797() + Class4714.\u7b4d\u5718\ub5d9\u345d\u708b\u63ae[1]);
        field20316 = Class8752.field36751.stream().map(class3687 -> {
            new Class1932("textures/" + class3687.method11331().method7797() + ".png");
            return;
        }).toArray(Class1932[]::new);
    }
}
