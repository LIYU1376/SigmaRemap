// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;

public class Class748 extends Class516<Class3436>
{
    private static final Class1932 field4042;
    private Class651 field4043;
    private boolean field4044;
    private Class5328 field4045;
    private Class5328 field4046;
    
    public Class748(final Class3436 class3436, final Class464 class3437, final ITextComponent class3438) {
        super(class3436, class3437, class3438);
        this.field3075 = 230;
        this.field3076 = 219;
        class3436.method10873(new Class751(this, class3436));
    }
    
    @Override
    public void method2969() {
        super.method2969();
        this.field4043 = this.method3029(new Class651(this, this.field3079 + 164, this.field3080 + 107));
        this.method3029(new Class652(this, this.field3079 + 190, this.field3080 + 107));
        this.field4044 = true;
        this.field4043.field3431 = false;
    }
    
    @Override
    public void method2992() {
        super.method2992();
        final int method10959 = ((Class3436)this.field3077).method10959();
        if (this.field4044) {
            if (method10959 >= 0) {
                this.field4044 = false;
                for (int i = 0; i <= 2; ++i) {
                    final int length = Class490.field2807[i].length;
                    final int n = length * 22 + (length - 1) * 2;
                    for (int j = 0; j < length; ++j) {
                        final Class5328 class5328 = Class490.field2807[i][j];
                        final Class653 class5329 = new Class653(this, this.field3079 + 76 + j * 24 - n / 2, this.field3080 + 22 + i * 25, class5328, true);
                        this.method3029(class5329);
                        if (i < method10959) {
                            if (class5328 == this.field4045) {
                                class5329.method3708(true);
                            }
                        }
                        else {
                            class5329.field3431 = false;
                        }
                    }
                }
                final int n2 = Class490.field2807[3].length + 1;
                final int n3 = n2 * 22 + (n2 - 1) * 2;
                for (int k = 0; k < n2 - 1; ++k) {
                    final Class5328 class5330 = Class490.field2807[3][k];
                    final Class653 class5331 = new Class653(this, this.field3079 + 167 + k * 24 - n3 / 2, this.field3080 + 47, class5330, false);
                    this.method3029(class5331);
                    if (3 < method10959) {
                        if (class5330 == this.field4046) {
                            class5331.method3708(true);
                        }
                    }
                    else {
                        class5331.field3431 = false;
                    }
                }
                if (this.field4045 != null) {
                    final Class653 class5332 = new Class653(this, this.field3079 + 167 + (n2 - 1) * 24 - n3 / 2, this.field3080 + 47, this.field4045, false);
                    this.method3029(class5332);
                    if (3 < method10959) {
                        if (this.field4045 == this.field4046) {
                            class5332.method3708(true);
                        }
                    }
                    else {
                        class5332.field3431 = false;
                    }
                }
            }
        }
        this.field4043.field3431 = (((Class3436)this.field3077).method10963() && this.field4045 != null);
    }
    
    @Override
    public void method2973(final int n, final int n2) {
        this.method3295(this.field3156, Class8822.method30773("block.minecraft.beacon.primary", new Object[0]), 62, 10, 14737632);
        this.method3295(this.field3156, Class8822.method30773("block.minecraft.beacon.secondary", new Object[0]), 169, 10, 14737632);
        for (final Class573 class573 : this.field3154) {
            if (!class573.method3360()) {
                continue;
            }
            class573.method3362(n - this.field3079, n2 - this.field3080);
            break;
        }
    }
    
    @Override
    public void method2976(final float n, final int n2, final int n3) {
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        this.field3150.method5290().method5849(Class748.field4042);
        final int n4 = (this.field3152 - this.field3075) / 2;
        final int n5 = (this.field3153 - this.field3076) / 2;
        this.method3186(n4, n5, 0, 0, this.field3075, this.field3076);
        this.field3151.field9952 = 100.0f;
        this.field3151.method6540(new ItemStack(Items.field31514), n4 + 42, n5 + 109);
        this.field3151.method6540(new ItemStack(Items.field31283), n4 + 42 + 22, n5 + 109);
        this.field3151.method6540(new ItemStack(Items.field31285), n4 + 42 + 44, n5 + 109);
        this.field3151.method6540(new ItemStack(Items.field31284), n4 + 42 + 66, n5 + 109);
        this.field3151.field9952 = 0.0f;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3041();
        super.method2975(n, n2, n3);
        this.method2977(n, n2);
    }
    
    static {
        field4042 = new Class1932("textures/gui/container/beacon.png");
    }
}
