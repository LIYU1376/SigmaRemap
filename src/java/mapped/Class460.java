// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public abstract class Class460 extends Class436 implements Class446, Class434, Class462
{
    private Class9115 field2716;
    private Class2250 field2717;
    
    public Class460(final Class5412<?> class5412) {
        super(class5412);
        this.field2716 = Class9115.field38616;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        this.field2716 = Class9115.method32978(class51);
        if (class51.method316("CustomName", 8)) {
            this.field2717 = Class5953.method17871(class51.method323("CustomName"));
        }
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        this.field2716.method32977(class51);
        if (this.field2717 != null) {
            class51.method306("CustomName", Class5953.method17869(this.field2717));
        }
        return class51;
    }
    
    public void method2335(final Class2250 field2717) {
        this.field2717 = field2717;
    }
    
    @Override
    public Class2250 method1841() {
        return (this.field2717 == null) ? this.method2243() : this.field2717;
    }
    
    @Override
    public Class2250 method1871() {
        return this.method1841();
    }
    
    @Nullable
    @Override
    public Class2250 method1873() {
        return this.field2717;
    }
    
    public abstract Class2250 method2243();
    
    public boolean method2328(final Class512 class512) {
        return method2336(class512, this.field2716, this.method1871());
    }
    
    public static boolean method2336(final Class512 class512, final Class9115 class513, final Class2250 class514) {
        if (!class512.method1639() && !class513.method32976(class512.method2713())) {
            class512.method2853(new Class2259("container.isLocked", new Object[] { class514 }), true);
            class512.method2812(Class8520.field35066, Class286.field1582, 1.0f, 1.0f);
            return false;
        }
        return true;
    }
    
    @Nullable
    @Override
    public Class3418 method2166(final int n, final Class464 class464, final Class512 class465) {
        return this.method2328(class465) ? this.method2253(n, class464) : null;
    }
    
    public abstract Class3418 method2253(final int p0, final Class464 p1);
}
