// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4745 extends Class4712<Class839, Class5895<Class839>>
{
    private static final Class1932 field20367;
    
    public Class4745(final Class8551 class8551) {
        super(class8551, new Class5895(), 0.7f);
    }
    
    public Class1932 method14077(final Class839 class839) {
        return Class4745.field20367;
    }
    
    public void method14078(final Class839 class839, final Class7351 class840, final float n, final float n2, final float n3) {
        final float method35700 = Class9546.method35700(n3, class839.field4461, class839.field4460);
        final float method35701 = Class9546.method35700(n3, class839.field4463, class839.field4462);
        class840.method22564(0.0, 0.5, 0.0);
        class840.method22566(Class9138.field38718.method33328(180.0f - n2));
        class840.method22566(Class9138.field38716.method33328(method35700));
        class840.method22566(Class9138.field38718.method33328(method35701));
        class840.method22564(0.0, -1.2000000476837158, 0.0);
    }
    
    public float method14079(final Class839 class839, final float n) {
        return Class9546.method35700(n, class839.field4467, class839.field4466);
    }
    
    static {
        field20367 = new Class1932("textures/entity/squid.png");
    }
}
