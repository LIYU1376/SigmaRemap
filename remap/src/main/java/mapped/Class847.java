// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;

import javax.annotation.Nullable;

public class Class847 extends Class846
{
    private static String[] field4511;
    
    public Class847(final Class7499<? extends Class847> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(12.0);
    }
    
    @Override
    public boolean method2734(final Entity class399) {
        if (!super.method2734(class399)) {
            return false;
        }
        if (class399 instanceof Class511) {
            int n = 0;
            if (this.field2391.method6954() != Class2113.field12292) {
                if (this.field2391.method6954() == Class2113.field12293) {
                    n = 15;
                }
            }
            else {
                n = 7;
            }
            if (n > 0) {
                ((Class511)class399).method2655(new Class1948(Class9439.field40492, n * 20, 0));
            }
        }
        return true;
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        return class1854;
    }
    
    @Override
    public float method2789(final Class290 class290, final Class8295 class291) {
        return 0.45f;
    }
}
