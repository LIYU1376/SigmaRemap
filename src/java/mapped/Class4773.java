// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4773 extends Class4712<Class835, Class5845<Class835>>
{
    private static String[] field20401;
    private final Class5849<Class835> field20402;
    private final Class5848<Class835> field20403;
    
    public Class4773(final Class8551 class8551) {
        super(class8551, new Class5849(0.0f), 0.15f);
        this.field20402 = new Class5849<Class835>(0.0f);
        this.field20403 = new Class5848<Class835>(0.0f);
        this.method13978(new Class1816(this));
    }
    
    public Class1932 method14126(final Class835 class835) {
        return class835.method4987();
    }
    
    public void method14127(final Class835 class835, final float n, final float n2, final Class7351 class836, final Class7807 class837, final int n3) {
        final Class5901 field20301 = (class835.method4984() != 0) ? this.field20403 : this.field20402;
        this.field20301 = (M)field20301;
        final float[] method4980 = class835.method4980();
        ((Class5847)field20301).method17572(method4980[0], method4980[1], method4980[2]);
        super.method14006(class835, n, n2, class836, class837, n3);
        ((Class5847)field20301).method17572(1.0f, 1.0f, 1.0f);
    }
    
    public void method14128(final Class835 class835, final Class7351 class836, final float n, final float n2, final float n3) {
        super.method13985(class835, class836, n, n2, n3);
        class836.method22566(Class9138.field38718.method33328(4.3f * Class9546.method35638(0.6f * n)));
        if (!class835.method1706()) {
            class836.method22564(0.20000000298023224, 0.10000000149011612, 0.0);
            class836.method22566(Class9138.field38720.method33328(90.0f));
        }
    }
}
