// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Objects;
import java.util.Collection;
import javax.annotation.Nullable;
import java.util.List;

public abstract class Class604<E extends Class592<E>> extends Class598 implements Class563
{
    public static final int field3539 = -2;
    public final Class869 field3540;
    public final int field3541;
    private final List<E> field3542;
    public int field3543;
    public int field3544;
    public int field3545;
    public int field3546;
    public int field3547;
    public int field3548;
    public boolean field3549;
    public int field3550;
    private double field3551;
    public boolean field3552;
    public boolean field3553;
    public int field3554;
    private boolean field3555;
    private E field3556;
    
    public Class604(final Class869 field3540, final int n, final int field3541, final int field3542, final int field3543, final int field3544) {
        this.field3542 = (List<E>)new Class2266(this, null);
        this.field3549 = true;
        this.field3550 = -2;
        this.field3552 = true;
        this.field3540 = field3540;
        this.field3543 = n;
        this.field3544 = field3541;
        this.field3545 = field3542;
        this.field3546 = field3543;
        this.field3541 = field3544;
        this.field3548 = 0;
        this.field3547 = n;
    }
    
    public void method3527(final boolean field3552) {
        this.field3552 = field3552;
    }
    
    public void method3528(final boolean field3553, final int field3554) {
        this.field3553 = field3553;
        this.field3554 = field3554;
        if (!field3553) {
            this.field3554 = 0;
        }
    }
    
    public int method3529() {
        return 220;
    }
    
    @Nullable
    public E method3530() {
        return this.field3556;
    }
    
    public void method3531(final E field3556) {
        this.field3556 = field3556;
    }
    
    @Nullable
    public E method3532() {
        return (E)super.method3471();
    }
    
    @Override
    public final List<E> method3040() {
        return this.field3542;
    }
    
    public final void method3533() {
        this.field3542.clear();
    }
    
    public void method3534(final Collection<E> collection) {
        this.field3542.clear();
        this.field3542.addAll((Collection<? extends E>)collection);
    }
    
    public E method3535(final int n) {
        return this.method3040().get(n);
    }
    
    public int method3536(final E e) {
        this.field3542.add(e);
        return this.field3542.size() - 1;
    }
    
    public int method3537() {
        return this.method3040().size();
    }
    
    public boolean method3538(final int n) {
        return Objects.equals(this.method3530(), this.method3040().get(n));
    }
    
    @Nullable
    public final E method3539(final double n, final double n2) {
        final int n3 = this.method3529() / 2;
        final int n4 = this.field3548 + this.field3543 / 2;
        final int n5 = n4 - n3;
        final int n6 = n4 + n3;
        final int n7 = MathHelper.floor(n2 - this.field3545) - this.field3554 + (int)this.method3550() - 4;
        final int n8 = n7 / this.field3541;
        if (n < this.method3555()) {
            if (n >= n5) {
                if (n <= n6) {
                    if (n8 >= 0) {
                        if (n7 >= 0) {
                            if (n8 < this.method3537()) {
                                final Class592<E> class592 = this.method3040().get(n8);
                                return (E)class592;
                            }
                        }
                    }
                }
            }
        }
        final Class592<E> class592 = null;
        return (E)class592;
    }
    
    public void method3540(final int n, final int field3544, final int field3545, final int field3546) {
        this.field3543 = n;
        this.field3544 = field3544;
        this.field3545 = field3545;
        this.field3546 = field3546;
        this.field3548 = 0;
        this.field3547 = n;
    }
    
    public void method3541(final int field3548) {
        this.field3548 = field3548;
        this.field3547 = field3548 + this.field3543;
    }
    
    public int method3542() {
        return this.method3537() * this.field3541 + this.field3554;
    }
    
    public void method3543(final int n, final int n2) {
    }
    
    public void method3544(final int n, final int n2, final Class7392 class7392) {
    }
    
    public void method3545() {
    }
    
    public void method3546(final int n, final int n2) {
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.method3545();
        final int method3555 = this.method3555();
        final int n4 = method3555 + 6;
        final Class7392 method3556 = Class7392.method22694();
        final Class4148 method3557 = method3556.method22696();
        this.field3540.method5290().method5849(Class565.field3361);
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        method3557.method12390(7, Class9237.field39619);
        method3557.method12432(this.field3548, this.field3546, 0.0).method12391(this.field3548 / 32.0f, (this.field3546 + (int)this.method3550()) / 32.0f).method12399(32, 32, 32, 255).method12397();
        method3557.method12432(this.field3547, this.field3546, 0.0).method12391(this.field3547 / 32.0f, (this.field3546 + (int)this.method3550()) / 32.0f).method12399(32, 32, 32, 255).method12397();
        method3557.method12432(this.field3547, this.field3545, 0.0).method12391(this.field3547 / 32.0f, (this.field3545 + (int)this.method3550()) / 32.0f).method12399(32, 32, 32, 255).method12397();
        method3557.method12432(this.field3548, this.field3545, 0.0).method12391(this.field3548 / 32.0f, (this.field3545 + (int)this.method3550()) / 32.0f).method12399(32, 32, 32, 255).method12397();
        method3556.method22695();
        final int method3558 = this.method3558();
        final int n5 = this.field3545 + 4 - (int)this.method3550();
        if (this.field3553) {
            this.method3544(method3558, n5, method3556);
        }
        this.method3557(method3558, n5, n, n2, n3);
        Class8726.method30007();
        this.method3562(0, this.field3545, 255, 255);
        this.method3562(this.field3546, this.field3544, 255, 255);
        Class8726.method30011();
        Class8726.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11696, Class2135.field12455);
        Class8726.method29998();
        Class8726.method30045(7425);
        Class8726.method30041();
        method3557.method12390(7, Class9237.field39619);
        method3557.method12432(this.field3548, this.field3545 + 4, 0.0).method12391(0.0f, 1.0f).method12399(0, 0, 0, 0).method12397();
        method3557.method12432(this.field3547, this.field3545 + 4, 0.0).method12391(1.0f, 1.0f).method12399(0, 0, 0, 0).method12397();
        method3557.method12432(this.field3547, this.field3545, 0.0).method12391(1.0f, 0.0f).method12399(0, 0, 0, 255).method12397();
        method3557.method12432(this.field3548, this.field3545, 0.0).method12391(0.0f, 0.0f).method12399(0, 0, 0, 255).method12397();
        method3556.method22695();
        method3557.method12390(7, Class9237.field39619);
        method3557.method12432(this.field3548, this.field3546, 0.0).method12391(0.0f, 1.0f).method12399(0, 0, 0, 255).method12397();
        method3557.method12432(this.field3547, this.field3546, 0.0).method12391(1.0f, 1.0f).method12399(0, 0, 0, 255).method12397();
        method3557.method12432(this.field3547, this.field3546 - 4, 0.0).method12391(1.0f, 0.0f).method12399(0, 0, 0, 0).method12397();
        method3557.method12432(this.field3548, this.field3546 - 4, 0.0).method12391(0.0f, 0.0f).method12399(0, 0, 0, 0).method12397();
        method3556.method22695();
        final int method3559 = this.method3552();
        if (method3559 > 0) {
            final int method3560 = MathHelper.method35651((int)((this.field3546 - this.field3545) * (this.field3546 - this.field3545) / (float)this.method3542()), 32, this.field3546 - this.field3545 - 8);
            int field3545 = (int)this.method3550() * (this.field3546 - this.field3545 - method3560) / method3559 + this.field3545;
            if (field3545 < this.field3545) {
                field3545 = this.field3545;
            }
            method3557.method12390(7, Class9237.field39619);
            method3557.method12432(method3555, this.field3546, 0.0).method12391(0.0f, 1.0f).method12399(0, 0, 0, 255).method12397();
            method3557.method12432(n4, this.field3546, 0.0).method12391(1.0f, 1.0f).method12399(0, 0, 0, 255).method12397();
            method3557.method12432(n4, this.field3545, 0.0).method12391(1.0f, 0.0f).method12399(0, 0, 0, 255).method12397();
            method3557.method12432(method3555, this.field3545, 0.0).method12391(0.0f, 0.0f).method12399(0, 0, 0, 255).method12397();
            method3556.method22695();
            method3557.method12390(7, Class9237.field39619);
            method3557.method12432(method3555, field3545 + method3560, 0.0).method12391(0.0f, 1.0f).method12399(128, 128, 128, 255).method12397();
            method3557.method12432(n4, field3545 + method3560, 0.0).method12391(1.0f, 1.0f).method12399(128, 128, 128, 255).method12397();
            method3557.method12432(n4, field3545, 0.0).method12391(1.0f, 0.0f).method12399(128, 128, 128, 255).method12397();
            method3557.method12432(method3555, field3545, 0.0).method12391(0.0f, 0.0f).method12399(128, 128, 128, 255).method12397();
            method3556.method22695();
            method3557.method12390(7, Class9237.field39619);
            method3557.method12432(method3555, field3545 + method3560 - 1, 0.0).method12391(0.0f, 1.0f).method12399(192, 192, 192, 255).method12397();
            method3557.method12432(n4 - 1, field3545 + method3560 - 1, 0.0).method12391(1.0f, 1.0f).method12399(192, 192, 192, 255).method12397();
            method3557.method12432(n4 - 1, field3545, 0.0).method12391(1.0f, 0.0f).method12399(192, 192, 192, 255).method12397();
            method3557.method12432(method3555, field3545, 0.0).method12391(0.0f, 0.0f).method12399(192, 192, 192, 255).method12397();
            method3556.method22695();
        }
        this.method3546(n, n2);
        Class8726.method30040();
        Class8726.method30045(7424);
        Class8726.method29999();
        Class8726.method30012();
    }
    
    public void method3547(final E e) {
        this.method3551(this.method3040().indexOf(e) * this.field3541 + this.field3541 / 2 - (this.field3546 - this.field3545) / 2);
    }
    
    public void method3548(final E e) {
        final int method3559 = this.method3559(this.method3040().indexOf(e));
        final int n = method3559 - this.field3545 - 4 - this.field3541;
        if (n < 0) {
            this.method3549(n);
        }
        final int n2 = this.field3546 - method3559 - this.field3541 - this.field3541;
        if (n2 < 0) {
            this.method3549(-n2);
        }
    }
    
    private void method3549(final int n) {
        this.method3551(this.method3550() + n);
        this.field3550 = -2;
    }
    
    public double method3550() {
        return this.field3551;
    }
    
    public void method3551(final double n) {
        this.field3551 = MathHelper.method35654(n, 0.0, this.method3552());
    }
    
    private int method3552() {
        return Math.max(0, this.method3542() - (this.field3546 - this.field3545 - 4));
    }
    
    public int method3553() {
        return (int)this.method3550() - this.field3544 - this.field3554;
    }
    
    public void method3554(final double n, final double n2, final int n3) {
        boolean field3555 = false;
        Label_0043: {
            if (n3 == 0) {
                if (n >= this.method3555()) {
                    if (n < this.method3555() + 6) {
                        field3555 = true;
                        break Label_0043;
                    }
                }
            }
            field3555 = false;
        }
        this.field3555 = field3555;
    }
    
    public int method3555() {
        return this.field3543 / 2 + 124;
    }
    
    @Override
    public boolean method2982(final double n, final double n2, final int n3) {
        this.method3554(n, n2, n3);
        if (this.method3055(n, n2)) {
            final Class592<E> method3539 = (Class592<E>)this.method3539(n, n2);
            if (method3539 == null) {
                if (n3 == 0) {
                    this.method3543((int)(n - (this.field3548 + this.field3543 / 2 - this.method3529() / 2)), (int)(n2 - this.field3545) + (int)this.method3550() - 4);
                    return true;
                }
            }
            else if (method3539.method2982(n, n2, n3)) {
                this.method3470(method3539);
                this.method3469(true);
                return true;
            }
            return this.field3555;
        }
        return false;
    }
    
    @Override
    public boolean method2985(final double n, final double n2, final int n3) {
        if (this.method3532() != null) {
            this.method3532().method2985(n, n2, n3);
        }
        return false;
    }
    
    @Override
    public boolean method2984(final double n, final double n2, final int n3, final double n4, final double n5) {
        if (super.method2984(n, n2, n3, n4, n5)) {
            return true;
        }
        if (n3 == 0 && this.field3555) {
            if (n2 >= this.field3545) {
                if (n2 <= this.field3546) {
                    final double n6 = Math.max(1, this.method3552());
                    final int n7 = this.field3546 - this.field3545;
                    this.method3551(this.method3550() + n5 * Math.max(1.0, n6 / (n7 - MathHelper.method35651((int)(n7 * n7 / (float)this.method3542()), 32, n7 - 8))));
                }
                else {
                    this.method3551(this.method3552());
                }
            }
            else {
                this.method3551(0.0);
            }
            return true;
        }
        return false;
    }
    
    @Override
    public boolean method3012(final double n, final double n2, final double n3) {
        this.method3551(this.method3550() - n3 * this.field3541 / 2.0);
        return true;
    }
    
    @Override
    public boolean method2972(final int n, final int n2, final int n3) {
        if (super.method2972(n, n2, n3)) {
            return true;
        }
        if (n == 264) {
            this.method3556(1);
            return true;
        }
        if (n != 265) {
            return false;
        }
        this.method3556(-1);
        return true;
    }
    
    public void method3556(final int n) {
        if (!this.method3040().isEmpty()) {
            final Class592<E> class592 = this.method3040().get(MathHelper.method35651(this.method3040().indexOf(this.method3530()) + n, 0, this.method3537() - 1));
            this.method3531((E)class592);
            this.method3548((E)class592);
        }
    }
    
    @Override
    public boolean method3055(final double n, final double n2) {
        if (n2 >= this.field3545) {
            if (n2 <= this.field3546) {
                if (n >= this.field3548) {
                    if (n <= this.field3547) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public void method3557(final int n, final int n2, final int n3, final int n4, final float n5) {
        final int method3537 = this.method3537();
        final Class7392 method3538 = Class7392.method22694();
        final Class4148 method3539 = method3538.method22696();
        for (int i = 0; i < method3537; ++i) {
            final int method3540 = this.method3559(i);
            if (this.method3560(i) >= this.field3545) {
                if (method3540 <= this.field3546) {
                    final int n6 = n2 + i * this.field3541 + this.field3554;
                    final int n7 = this.field3541 - 4;
                    final Class592<E> method3541 = (Class592<E>)this.method3535(i);
                    final int method3542 = this.method3529();
                    if (this.field3552) {
                        if (this.method3538(i)) {
                            final int n8 = this.field3548 + this.field3543 / 2 - method3542 / 2;
                            final int n9 = this.field3548 + this.field3543 / 2 + method3542 / 2;
                            Class8726.method30041();
                            final float n10 = this.method3561() ? 1.0f : 0.5f;
                            Class8726.method30068(n10, n10, n10, 1.0f);
                            method3539.method12390(7, Class9237.field39614);
                            method3539.method12432(n8, n6 + n7 + 2, 0.0).method12397();
                            method3539.method12432(n9, n6 + n7 + 2, 0.0).method12397();
                            method3539.method12432(n9, n6 - 2, 0.0).method12397();
                            method3539.method12432(n8, n6 - 2, 0.0).method12397();
                            method3538.method22695();
                            Class8726.method30068(0.0f, 0.0f, 0.0f, 1.0f);
                            method3539.method12390(7, Class9237.field39614);
                            method3539.method12432(n8 + 1, n6 + n7 + 1, 0.0).method12397();
                            method3539.method12432(n9 - 1, n6 + n7 + 1, 0.0).method12397();
                            method3539.method12432(n9 - 1, n6 - 1, 0.0).method12397();
                            method3539.method12432(n8 + 1, n6 - 1, 0.0).method12397();
                            method3538.method22695();
                            Class8726.method30040();
                        }
                    }
                    method3541.method3467(i, method3540, this.method3558(), method3542, n7, n3, n4, this.method3055(n3, n4) && Objects.equals(this.method3539(n3, n4), method3541), n5);
                }
            }
        }
    }
    
    public int method3558() {
        return this.field3548 + this.field3543 / 2 - this.method3529() / 2 + 2;
    }
    
    public int method3559(final int n) {
        return this.field3545 + 4 - (int)this.method3550() + n * this.field3541 + this.field3554;
    }
    
    private int method3560(final int n) {
        return this.method3559(n) + this.field3541;
    }
    
    public boolean method3561() {
        return false;
    }
    
    public void method3562(final int n, final int n2, final int n3, final int n4) {
        final Class7392 method22694 = Class7392.method22694();
        final Class4148 method22695 = method22694.method22696();
        this.field3540.method5290().method5849(Class565.field3361);
        Class8726.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        method22695.method12390(7, Class9237.field39619);
        method22695.method12432(this.field3548, n2, 0.0).method12391(0.0f, n2 / 32.0f).method12399(64, 64, 64, n4).method12397();
        method22695.method12432(this.field3548 + this.field3543, n2, 0.0).method12391(this.field3543 / 32.0f, n2 / 32.0f).method12399(64, 64, 64, n4).method12397();
        method22695.method12432(this.field3548 + this.field3543, n, 0.0).method12391(this.field3543 / 32.0f, n / 32.0f).method12399(64, 64, 64, n3).method12397();
        method22695.method12432(this.field3548, n, 0.0).method12391(0.0f, n / 32.0f).method12399(64, 64, 64, n3).method12397();
        method22694.method22695();
    }
    
    public E method3563(final int n) {
        final Class592<E> class592 = this.field3542.get(n);
        return (E)(this.method3564(this.field3542.get(n)) ? class592 : null);
    }
    
    public boolean method3564(final E e) {
        final boolean remove = this.field3542.remove(e);
        if (remove) {
            if (e == this.method3530()) {
                this.method3531(null);
            }
        }
        return remove;
    }
}
