// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import javax.annotation.Nullable;
import java.util.function.Predicate;

public abstract class Class776 extends Class777
{
    public static final Class8810<Boolean> field4170;
    private static final Predicate<Class427> field4171;
    public Class8792 field4172;
    private int field4173;
    private boolean field4174;
    private int field4175;
    
    public Class776(final Class7499<? extends Class776> class7499, final Class1847 class7500) {
        super(class7499, class7500);
    }
    
    @Override
    public void method4142() {
        super.method4142();
        this.field4114.method22062(1, new Class3460<Object>(this));
        this.field4114.method22062(3, new Class3640<Object>(this));
        this.field4114.method22062(4, new Class3601(this, 1.0499999523162842, 1));
        this.field4114.method22062(5, new Class3637(this, this));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class776.field4170, false);
    }
    
    public abstract void method4263(final int p0, final boolean p1);
    
    public boolean method4288() {
        return this.field4174;
    }
    
    public void method4289(final boolean field4174) {
        this.field4174 = field4174;
    }
    
    @Override
    public void method2736() {
        if (this.field2391 instanceof Class1849) {
            if (this.method1768()) {
                final Class8792 method4292 = this.method4292();
                if (this.method4288()) {
                    if (method4292 != null) {
                        final Class511 method4293 = this.method4152();
                        if (method4293 != null) {
                            if (method4293.method1642() == Class7499.field29058 || method4293.method1642() == Class7499.field29043) {
                                this.field2959 = 0;
                            }
                        }
                    }
                    else if (this.field2391.method6754() % 20L == 0L) {
                        final Class8792 method4294 = ((Class1849)this.field2391).method6927(new Class354(this));
                        if (method4294 != null) {
                            if (Class6357.method18927(this, method4294)) {
                                method4294.method30644(method4294.method30626(), this, null, true);
                            }
                        }
                    }
                }
            }
        }
        super.method2736();
    }
    
    @Override
    public void method4227() {
        this.field2959 += 2;
    }
    
    @Override
    public void method2673(final Class7929 class7929) {
        if (this.field2391 instanceof Class1849) {
            final Class399 method25714 = class7929.method25714();
            final Class8792 method25715 = this.method4292();
            if (method25715 != null) {
                if (this.method4314()) {
                    method25715.method30657(this.method4295());
                }
                if (method25714 != null) {
                    if (method25714.method1642() == Class7499.field29058) {
                        method25715.method30667(method25714);
                    }
                }
                method25715.method30649(this, false);
            }
            if (this.method4314()) {
                if (method25715 == null) {
                    if (((Class1849)this.field2391).method6927(new Class354(this)) == null) {
                        final Class8321 method25716 = this.method2718(Class2215.field13605);
                        Class511 class7930 = null;
                        if (!(method25714 instanceof Class512)) {
                            if (method25714 instanceof Class799) {
                                final Class799 class7931 = (Class799)method25714;
                                final Class511 method25717 = class7931.method4488();
                                if (class7931.method4480()) {
                                    if (method25717 instanceof Class512) {
                                        class7930 = method25717;
                                    }
                                }
                            }
                        }
                        else {
                            class7930 = (Class512)method25714;
                        }
                        if (!method25716.method27620()) {
                            if (Class8321.method27643(method25716, Class8792.method30651())) {
                                if (class7930 != null) {
                                    final Class1948 method25718 = class7930.method2654(Class9439.field40504);
                                    int n = 1;
                                    if (method25718 == null) {
                                        --n;
                                    }
                                    else {
                                        n += method25718.method7908();
                                        class7930.method2658(Class9439.field40504);
                                    }
                                    final Class1948 class7932 = new Class1948(Class9439.field40504, 120000, Class9546.method35651(n, 0, 5), false, false, true);
                                    if (!this.field2391.method6765().method31216(Class8878.field37338)) {
                                        class7930.method2655(class7932);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        super.method2673(class7929);
    }
    
    @Override
    public boolean method4290() {
        return !this.method4293();
    }
    
    public void method4291(final Class8792 field4172) {
        this.field4172 = field4172;
    }
    
    @Nullable
    public Class8792 method4292() {
        return this.field4172;
    }
    
    public boolean method4293() {
        return this.method4292() != null && this.method4292().method30663();
    }
    
    public void method4294(final int field4173) {
        this.field4173 = field4173;
    }
    
    public int method4295() {
        return this.field4173;
    }
    
    public boolean method4296() {
        return this.field2432.method33568(Class776.field4170);
    }
    
    public void method4297(final boolean b) {
        this.field2432.method33569(Class776.field4170, b);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("Wave", this.field4173);
        class51.method312("CanJoinRaid", this.field4174);
        if (this.field4172 != null) {
            class51.method298("RaidId", this.field4172.method30660());
        }
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.field4173 = class51.method319("Wave");
        this.field4174 = class51.method329("CanJoinRaid");
        if (class51.method316("RaidId", 3)) {
            if (this.field2391 instanceof Class1849) {
                this.field4172 = ((Class1849)this.field2391).method6926().method18925(class51.method319("RaidId"));
            }
            if (this.field4172 != null) {
                this.field4172.method30655(this.field4173, this, false);
                if (this.method4314()) {
                    this.field4172.method30656(this.field4173, this);
                }
            }
        }
    }
    
    @Override
    public void method4165(final Class427 class427) {
        final Class8321 method2107 = class427.method2107();
        final boolean b = this.method4293() && this.method4292().method30652(this.method4295()) != null;
        if (this.method4293()) {
            if (!b) {
                if (Class8321.method27643(method2107, Class8792.method30651())) {
                    final Class2215 field13605 = Class2215.field13605;
                    final Class8321 method2108 = this.method2718(field13605);
                    final double n = this.method4183(field13605);
                    if (!method2108.method27620()) {
                        if (Math.max(this.field2423.nextFloat() - 0.1f, 0.0f) < n) {
                            this.method1766(method2108);
                        }
                    }
                    this.method1803(field13605, method2107);
                    this.method2746(class427, method2107.method27690());
                    class427.method1652();
                    this.method4292().method30656(this.method4295(), this);
                    this.method4313(true);
                    return;
                }
            }
        }
        super.method4165(class427);
    }
    
    @Override
    public boolean method4168(final double n) {
        return this.method4292() == null && super.method4168(n);
    }
    
    @Override
    public boolean method4169() {
        return this.method4292() != null;
    }
    
    public int method4298() {
        return this.field4175;
    }
    
    public void method4299(final int field4175) {
        this.field4175 = field4175;
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (this.method4293()) {
            this.method4292().method30645();
        }
        return super.method1740(class7929, n);
    }
    
    @Nullable
    @Override
    public Class5496 method4188(final Class1851 class1851, final Class9592 class1852, final Class2101 class1853, final Class5496 class1854, final Class51 class1855) {
        this.method4289(this.method1642() != Class7499.field29047 || class1853 != Class2101.field12174);
        return super.method4188(class1851, class1852, class1853, class1854, class1855);
    }
    
    public abstract Class7795 method4260();
    
    static {
        field4170 = Class9184.method33564(Class776.class, Class7709.field30661);
        field4171 = (class427 -> {
            final boolean b;
            if (!class427.method2118()) {
                if (!(!class427.method1768())) {
                    if (!(!Class8321.method27643(class427.method2107(), Class8792.method30651()))) {
                        return b;
                    }
                }
            }
            return b;
        });
    }
}
