// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public abstract class Class788 extends Class787
{
    private static final Class8810<Boolean> field4198;
    public int field4199;
    public int field4200;
    public int field4201;
    
    public Class788(final Class7499<? extends Class788> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, Class5496 class1854, final Class51 class1855) {
        if (class1854 == null) {
            class1854 = new Class5497();
        }
        final Class5497 class1856 = (Class5497)class1854;
        if (class1856.method16800()) {
            if (class1856.method16798() > 0) {
                if (this.field2423.nextFloat() <= class1856.method16802()) {
                    this.method4354(-24000);
                }
            }
        }
        class1856.method16799();
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    @Nullable
    public abstract Class788 method4349(final Class788 p0);
    
    public void method4350(final Class512 class512, final Class788 class513) {
    }
    
    @Override
    public boolean method4195(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        final Class3820 method2716 = method2715.method27622();
        if (method2716 instanceof Class3831 && ((Class3831)method2716).method11769(method2715.method27657(), this.method1642())) {
            if (!this.field2391.field10067) {
                final Class788 method2717 = this.method4349(this);
                if (method2717 != null) {
                    method2717.method4354(-24000);
                    method2717.method1730(this.method1938(), this.method1941(), this.method1945(), 0.0f, 0.0f);
                    this.field2391.method6886(method2717);
                    if (method2715.method27667()) {
                        method2717.method1872(method2715.method27664());
                    }
                    this.method4350(class512, method2717);
                    if (!class512.field3025.field27304) {
                        method2715.method27693(1);
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class788.field4198, false);
    }
    
    public int method4351() {
        if (!this.field2391.field10067) {
            return this.field4199;
        }
        return this.field2432.method33568(Class788.field4198) ? -1 : 1;
    }
    
    public void method4352(final int n, final boolean b) {
        int n2 = this.method4351() + n * 20;
        if (n2 > 0) {
            n2 = 0;
        }
        final int n3 = n2 - n2;
        this.method4354(n2);
        if (b) {
            this.field4200 += n3;
            if (this.field4201 == 0) {
                this.field4201 = 40;
            }
        }
        if (this.method4351() == 0) {
            this.method4354(this.field4200);
        }
    }
    
    public void method4353(final int n) {
        this.method4352(n, false);
    }
    
    public void method4354(final int field4199) {
        final int field4200 = this.field4199;
        this.field4199 = field4199;
        Label_0027: {
            if (field4200 < 0 && field4199 >= 0) {
                break Label_0027;
            }
            if (field4200 >= 0) {
                if (field4199 < 0) {
                    break Label_0027;
                }
            }
            return;
        }
        this.field2432.method33569(Class788.field4198, field4199 < 0);
        this.method4355();
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("Age", this.method4351());
        class51.method298("ForcedAge", this.field4200);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4354(class51.method319("Age"));
        this.field4200 = class51.method319("ForcedAge");
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (Class788.field4198.equals(class8810)) {
            this.method1881();
        }
        super.method1880(class8810);
    }
    
    @Override
    public void method2736() {
        super.method2736();
        if (!this.field2391.field10067) {
            if (this.method1768()) {
                int method4351 = this.method4351();
                if (method4351 >= 0) {
                    if (method4351 > 0) {
                        --method4351;
                        this.method4354(method4351);
                    }
                }
                else {
                    ++method4351;
                    this.method4354(method4351);
                }
            }
        }
        else if (this.field4201 > 0) {
            if (this.field4201 % 4 == 0) {
                this.field2391.method6709(Class8432.field34625, this.method1940(1.0), this.method1943() + 0.5, this.method1947(1.0), 0.0, 0.0, 0.0);
            }
            --this.field4201;
        }
    }
    
    public void method4355() {
    }
    
    @Override
    public boolean method2625() {
        return this.method4351() < 0;
    }
    
    static {
        field4198 = Class9184.method33564(Class788.class, Class7709.field30661);
    }
}
