// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4706 extends Class4703<Class406>
{
    private static String[] field20293;
    private final Class1796 field20294;
    
    public Class4706(final Class8551 class8551, final Class1796 field20294) {
        super(class8551);
        this.field20294 = field20294;
    }
    
    public void method13969(final Class406 class406, final float n, final float n2, final Class7351 class407, final Class7807 class408, final int n3) {
        class407.method22567();
        class407.method22566(this.field20283.method28717());
        class407.method22566(Vector3f.field38718.rotationDegrees(180.0f));
        if (class406.method2004()) {
            class407.method22566(Vector3f.ZP.rotationDegrees(180.0f));
            class407.method22566(Vector3f.field38718.rotationDegrees(180.0f));
            class407.method22566(Vector3f.XP.rotationDegrees(90.0f));
        }
        this.field20294.method6536(class406.method2005(), Class2016.field11493, n3, Class1904.field10335, class407, class408);
        class407.method22568();
        super.method13951(class406, n, n2, class407, class408, n3);
    }
    
    public Class1932 method13970(final Class406 class406) {
        return Class1774.field9853;
    }
}
