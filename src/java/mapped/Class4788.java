// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4788 extends Class4703<Class510>
{
    private static String[] field20421;
    
    public Class4788(final Class8551 class8551) {
        super(class8551);
        this.field20284 = 0.5f;
    }
    
    public void method14156(final Class510 class510, final float n, final float n2, final Class7351 class511, final Class7807 class512, final int n3) {
        class511.method22567();
        class511.method22564(0.0, 0.5, 0.0);
        if (class510.method2617() - n2 + 1.0f < 10.0f) {
            final float method35653 = Class9546.method35653(1.0f - (class510.method2617() - n2 + 1.0f) / 10.0f, 0.0f, 1.0f);
            final float n4 = method35653 * method35653;
            final float n5 = 1.0f + n4 * n4 * 0.3f;
            class511.method22565(n5, n5, n5);
        }
        class511.method22566(Class9138.field38718.method33328(-90.0f));
        class511.method22564(-0.5, -0.5, 0.5);
        class511.method22566(Class9138.field38718.method33328(90.0f));
        Class4709.method13977(Class7521.field29283.method11878(), class511, class512, n3, class510.method2617() / 5 % 2 == 0);
        class511.method22568();
        super.method13951(class510, n, n2, class511, class512, n3);
    }
    
    public Class1932 method14157(final Class510 class510) {
        return Class1774.field9853;
    }
}
