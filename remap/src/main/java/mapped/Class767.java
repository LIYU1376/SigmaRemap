// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableList;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

import java.util.function.Predicate;
import java.util.List;

public class Class767 extends Class763 implements Class766, Class768
{
    private static final Class8810<Integer> field4143;
    private static final Class8810<Integer> field4144;
    private static final Class8810<Integer> field4145;
    private static final List<Class8810<Integer>> field4146;
    private static final Class8810<Integer> field4147;
    private final float[] field4148;
    private final float[] field4149;
    private final float[] field4150;
    private final float[] field4151;
    private final int[] field4152;
    private final int[] field4153;
    private int field4154;
    private final Class6879 field4155;
    private static final Predicate<Class511> field4156;
    private static final Class7843 field4157;
    
    public Class767(final Class7499<? extends Class767> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4148 = new float[2];
        this.field4149 = new float[2];
        this.field4150 = new float[2];
        this.field4151 = new float[2];
        this.field4152 = new int[2];
        this.field4153 = new int[2];
        this.field4155 = (Class6879)new Class6879(this.method1871(), Class2200.field13395, Class342.field2105).method21067(true);
        this.method2665(this.method2701());
        this.method4150().method24741(true);
        this.field4108 = 50;
    }
    
    @Override
    public void method4142() {
        this.field4114.method22062(0, new Class3597(this));
        this.field4114.method22062(2, new Class3507(this, 1.0, 40, 20.0f));
        this.field4114.method22062(5, new Class3517(this, 1.0));
        this.field4114.method22062(6, new Class3628(this, Class512.class, 8.0f));
        this.field4114.method22062(7, new Class3503(this));
        this.field4115.method22062(1, new Class3547(this, (Class<?>[])new Class[0]));
        this.field4115.method22062(2, new Class3555<Object>(this, Class759.class, 0, false, false, Class767.field4156));
    }
    
    @Override
    public void method1649() {
        super.method1649();
        this.field2432.method33565(Class767.field4143, 0);
        this.field2432.method33565(Class767.field4144, 0);
        this.field2432.method33565(Class767.field4145, 0);
        this.field2432.method33565(Class767.field4147, 0);
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("Invul", this.method4255());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        this.method4256(class51.method319("Invul"));
        if (this.method1874()) {
            this.field4155.method21070(this.method1871());
        }
    }
    
    @Override
    public void method1872(final Class2250 class2250) {
        super.method1872(class2250);
        this.field4155.method21070(this.method1871());
    }
    
    @Override
    public Class7795 method4160() {
        return Class8520.field35719;
    }
    
    @Override
    public Class7795 method2683(final Class7929 class7929) {
        return Class8520.field35722;
    }
    
    @Override
    public Class7795 method2684() {
        return Class8520.field35721;
    }
    
    @Override
    public void method2736() {
        Vec3d class5487 = this.method1935().method16751(1.0, 0.6, 1.0);
        if (!this.field2391.field10067) {
            if (this.method4257(0) > 0) {
                final Entity method6741 = this.field2391.method6741(this.method4257(0));
                if (method6741 != null) {
                    double field22771 = class5487.field22771;
                    Label_0138: {
                        if (this.method1941() >= method6741.method1941()) {
                            if (this.method4233()) {
                                break Label_0138;
                            }
                            if (this.method1941() >= method6741.method1941() + 5.0) {
                                break Label_0138;
                            }
                        }
                        final double max = Math.max(0.0, field22771);
                        field22771 = max + (0.3 - max * 0.6000000238418579);
                    }
                    class5487 = new Vec3d(class5487.field22770, field22771, class5487.field22772);
                    final Vec3d class5488 = new Vec3d(method6741.method1938() - this.method1938(), 0.0, method6741.method1945() - this.method1945());
                    if (Entity.method1680(class5488) > 9.0) {
                        final Vec3d method6742 = class5488.method16738();
                        class5487 = class5487.method16744(method6742.field22770 * 0.3 - class5487.field22770 * 0.6, 0.0, method6742.field22772 * 0.3 - class5487.field22772 * 0.6);
                    }
                }
            }
        }
        this.method1936(class5487);
        if (Entity.method1680(class5487) > 0.05) {
            this.field2399 = (float) MathHelper.method35693(class5487.field22772, class5487.field22770) * 57.295776f - 90.0f;
        }
        super.method2736();
        for (int i = 0; i < 2; ++i) {
            this.field4151[i] = this.field4149[i];
            this.field4150[i] = this.field4148[i];
        }
        for (int j = 0; j < 2; ++j) {
            final int method6743 = this.method4257(j + 1);
            Entity method6744 = null;
            if (method6743 > 0) {
                method6744 = this.field2391.method6741(method6743);
            }
            if (method6744 == null) {
                this.field4149[j] = this.method4249(this.field4149[j], this.field2951, 10.0f);
            }
            else {
                final double method6745 = this.method4246(j + 1);
                final double method6746 = this.method4247(j + 1);
                final double method6747 = this.method4248(j + 1);
                final double n = method6744.method1938() - method6745;
                final double n2 = method6744.method1944() - method6746;
                final double n3 = method6744.method1945() - method6747;
                final double n4 = MathHelper.method35641(n * n + n3 * n3);
                final float n5 = (float)(MathHelper.method35693(n3, n) * 57.2957763671875) - 90.0f;
                this.field4148[j] = this.method4249(this.field4148[j], (float)(-(MathHelper.method35693(n2, n4) * 57.2957763671875)), 40.0f);
                this.field4149[j] = this.method4249(this.field4149[j], n5, 10.0f);
            }
        }
        final boolean method6748 = this.method4233();
        for (int k = 0; k < 3; ++k) {
            final double method6749 = this.method4246(k);
            final double method6750 = this.method4247(k);
            final double method6751 = this.method4248(k);
            this.field2391.method6709(Class8432.field34639, method6749 + this.field2423.nextGaussian() * 0.30000001192092896, method6750 + this.field2423.nextGaussian() * 0.30000001192092896, method6751 + this.field2423.nextGaussian() * 0.30000001192092896, 0.0, 0.0, 0.0);
            if (method6748) {
                if (this.field2391.field10062.nextInt(4) == 0) {
                    this.field2391.method6709(Class8432.field34617, method6749 + this.field2423.nextGaussian() * 0.30000001192092896, method6750 + this.field2423.nextGaussian() * 0.30000001192092896, method6751 + this.field2423.nextGaussian() * 0.30000001192092896, 0.699999988079071, 0.699999988079071, 0.5);
                }
            }
        }
        if (this.method4255() > 0) {
            for (int l = 0; l < 3; ++l) {
                this.field2391.method6709(Class8432.field34617, this.method1938() + this.field2423.nextGaussian(), this.method1941() + this.field2423.nextFloat() * 3.3f, this.method1945() + this.field2423.nextGaussian(), 0.699999988079071, 0.699999988079071, 0.8999999761581421);
            }
        }
    }
    
    @Override
    public void method4172() {
        if (this.method4255() <= 0) {
            super.method4172();
            for (int i = 1; i < 3; ++i) {
                if (this.field2424 >= this.field4152[i - 1]) {
                    this.field4152[i - 1] = this.field2424 + 10 + this.field2423.nextInt(10);
                    if (this.field2391.method6954() == Class2113.field12292 || this.field2391.method6954() == Class2113.field12293) {
                        final int n = i - 1;
                        final int n2 = this.field4153[i - 1];
                        this.field4153[n] = this.field4153[i - 1] + 1;
                        if (n2 > 15) {
                            this.method4251(i + 1, MathHelper.method35660(this.field2423, this.method1938() - 10.0, this.method1938() + 10.0), MathHelper.method35660(this.field2423, this.method1941() - 5.0, this.method1941() + 5.0), MathHelper.method35660(this.field2423, this.method1945() - 10.0, this.method1945() + 10.0), true);
                            this.field4153[i - 1] = 0;
                        }
                    }
                    final int method4257 = this.method4257(i);
                    if (method4257 <= 0) {
                        final List<Class511> method4258 = this.field2391.method7142((Class<? extends Class511>)Class511.class, Class767.field4157, (Class511)this, this.method1886().method18495(20.0, 8.0, 20.0));
                        for (int j = 0; j < 10; ++j) {
                            if (method4258.isEmpty()) {
                                break;
                            }
                            final Class511 class511 = method4258.get(this.field2423.nextInt(method4258.size()));
                            if (class511 != this) {
                                if (class511.method1768()) {
                                    if (this.method2747(class511)) {
                                        if (!(class511 instanceof Class512)) {
                                            this.method4258(i, class511.method1643());
                                            break;
                                        }
                                        if (((Class512)class511).field3025.field27301) {
                                            break;
                                        }
                                        this.method4258(i, class511.method1643());
                                        break;
                                    }
                                }
                            }
                            method4258.remove(class511);
                        }
                    }
                    else {
                        final Entity method4259 = this.field2391.method6741(method4257);
                        Label_0591: {
                            if (method4259 != null) {
                                if (method4259.method1768()) {
                                    if (this.method1734(method4259) <= 900.0) {
                                        if (this.method2747(method4259)) {
                                            if (method4259 instanceof Class512 && ((Class512)method4259).field3025.field27301) {
                                                this.method4258(i, 0);
                                                break Label_0591;
                                            }
                                            this.method4250(i + 1, (Class511)method4259);
                                            this.field4152[i - 1] = this.field2424 + 40 + this.field2423.nextInt(20);
                                            this.field4153[i - 1] = 0;
                                            break Label_0591;
                                        }
                                    }
                                }
                            }
                            this.method4258(i, 0);
                        }
                    }
                }
            }
            if (this.method4152() == null) {
                this.method4258(0, 0);
            }
            else {
                this.method4258(0, this.method4152().method1643());
            }
            if (this.field4154 > 0) {
                --this.field4154;
                if (this.field4154 == 0) {
                    if (this.field2391.method6765().method31216(Class8878.field37316)) {
                        final int method4260 = MathHelper.floor(this.method1941());
                        final int method4261 = MathHelper.floor(this.method1938());
                        final int method4262 = MathHelper.floor(this.method1945());
                        boolean b = false;
                        for (int k = -1; k <= 1; ++k) {
                            for (int l = -1; l <= 1; ++l) {
                                for (int n3 = 0; n3 <= 3; ++n3) {
                                    final BlockPos class512 = new BlockPos(method4261 + k, method4260 + n3, method4262 + l);
                                    if (method4244(this.field2391.method6701(class512))) {
                                        b = (this.field2391.method6691(class512, true, this) || b);
                                    }
                                }
                            }
                        }
                        if (b) {
                            this.field2391.method6839(null, 1022, new BlockPos(this), 0);
                        }
                    }
                }
            }
            if (this.field2424 % 20 == 0) {
                this.method2663(1.0f);
            }
            this.field4155.method21064(this.method2664() / this.method2701());
        }
        else {
            final int n4 = this.method4255() - 1;
            if (n4 <= 0) {
                this.field2391.method6723(this, this.method1938(), this.method1944(), this.method1945(), 7.0f, false, this.field2391.method6765().method31216(Class8878.field37316) ? Class2196.field13367 : Class2196.field13365);
                this.field2391.method6777(1023, new BlockPos(this), 0);
            }
            this.method4256(n4);
            if (this.field2424 % 10 == 0) {
                this.method2663(10.0f);
            }
        }
    }
    
    public static boolean method4244(final Class7096 class7096) {
        return !class7096.method21706() && !Class7188.field27930.method25618(class7096.method21696());
    }
    
    public void method4245() {
        this.method4256(220);
        this.method2665(this.method2701() / 3.0f);
    }
    
    @Override
    public void method1839(final Class7096 class7096, final Vec3d class7097) {
    }
    
    @Override
    public void method1901(final Class513 class513) {
        super.method1901(class513);
        this.field4155.method21049(class513);
    }
    
    @Override
    public void method1902(final Class513 class513) {
        super.method1902(class513);
        this.field4155.method21051(class513);
    }
    
    private double method4246(final int n) {
        if (n > 0) {
            return this.method1938() + MathHelper.cos((this.field2951 + 180 * (n - 1)) * 0.017453292f) * 1.3;
        }
        return this.method1938();
    }
    
    private double method4247(final int n) {
        return (n > 0) ? (this.method1941() + 2.2) : (this.method1941() + 3.0);
    }
    
    private double method4248(final int n) {
        if (n > 0) {
            return this.method1945() + MathHelper.sin((this.field2951 + 180 * (n - 1)) * 0.017453292f) * 1.3;
        }
        return this.method1945();
    }
    
    private float method4249(final float n, final float n2, final float n3) {
        float method35668 = MathHelper.method35668(n2 - n);
        if (method35668 > n3) {
            method35668 = n3;
        }
        if (method35668 < -n3) {
            method35668 = -n3;
        }
        return n + method35668;
    }
    
    private void method4250(final int n, final Class511 class511) {
        this.method4251(n, class511.method1938(), class511.method1941() + class511.method1892() * 0.5, class511.method1945(), n == 0 && this.field2423.nextFloat() < 0.001f);
    }
    
    private void method4251(final int n, final double n2, final double n3, final double n4, final boolean b) {
        this.field2391.method6839(null, 1024, new BlockPos(this), 0);
        final double method4246 = this.method4246(n);
        final double method4247 = this.method4247(n);
        final double method4248 = this.method4248(n);
        final Class421 class421 = new Class421(this.field2391, this, n2 - method4246, n3 - method4247, n4 - method4248);
        if (b) {
            class421.method2037(true);
        }
        class421.method1948(method4246, method4247, method4248);
        this.field2391.method6886(class421);
    }
    
    @Override
    public void method4252(final Class511 class511, final float n) {
        this.method4250(0, class511);
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (class7929 == Class7929.field32569 || class7929.method25714() instanceof Class767) {
            return false;
        }
        if (this.method4255() > 0 && class7929 != Class7929.field32574) {
            return false;
        }
        if (this.method4233() && class7929.method25713() instanceof Class402) {
            return false;
        }
        final Entity method25714 = class7929.method25714();
        if (method25714 != null) {
            if (!(method25714 instanceof Class512)) {
                if (method25714 instanceof Class511) {
                    if (((Class511)method25714).method2712() == this.method2712()) {
                        return false;
                    }
                }
            }
        }
        if (this.field4154 <= 0) {
            this.field4154 = 20;
        }
        for (int i = 0; i < this.field4153.length; ++i) {
            final int[] field4153 = this.field4153;
            final int n2 = i;
            field4153[n2] += 3;
        }
        return super.method1740(class7929, n);
    }
    
    @Override
    public void method2678(final Class7929 class7929, final int n, final boolean b) {
        super.method2678(class7929, n, b);
        final Class427 method1764 = this.method1764(Class7739.field31530);
        if (method1764 != null) {
            method1764.method2119();
        }
    }
    
    @Override
    public void method1949() {
        if (this.field2391.method6954() == Class2113.field12290 && this.method4170()) {
            this.method1652();
        }
        else {
            this.field2959 = 0;
        }
    }
    
    @Override
    public boolean method1705(final float n, final float n2) {
        return false;
    }
    
    @Override
    public boolean method2655(final Class1948 class1948) {
        return false;
    }
    
    @Override
    public void method2621() {
        super.method2621();
        this.method2710(Class8107.field33405).method23941(300.0);
        this.method2710(Class8107.field33408).method23941(0.6000000238418579);
        this.method2710(Class8107.field33406).method23941(40.0);
        this.method2710(Class8107.field33413).method23941(4.0);
    }
    
    public float method4253(final int n) {
        return this.field4149[n];
    }
    
    public float method4254(final int n) {
        return this.field4148[n];
    }
    
    public int method4255() {
        return this.field2432.method33568(Class767.field4147);
    }
    
    public void method4256(final int i) {
        this.field2432.method33569(Class767.field4147, i);
    }
    
    public int method4257(final int n) {
        return this.field2432.method33568(Class767.field4146.get(n));
    }
    
    public void method4258(final int n, final int i) {
        this.field2432.method33569(Class767.field4146.get(n), i);
    }
    
    @Override
    public boolean method4233() {
        return this.method2664() <= this.method2701() / 2.0f;
    }
    
    @Override
    public Class6363 method2712() {
        return Class6363.field25461;
    }
    
    @Override
    public boolean method1781(final Entity class399) {
        return false;
    }
    
    @Override
    public boolean method1855() {
        return false;
    }
    
    @Override
    public boolean method2656(final Class1948 class1948) {
        return class1948.method7906() != Class9439.field40493 && super.method2656(class1948);
    }
    
    static {
        field4143 = Class9184.method33564(Class767.class, Class7709.field30654);
        field4144 = Class9184.method33564(Class767.class, Class7709.field30654);
        field4145 = Class9184.method33564(Class767.class, Class7709.field30654);
        field4146 = (List)ImmutableList.of((Object)Class767.field4143, (Object)Class767.field4144, (Object)Class767.field4145);
        field4147 = Class9184.method33564(Class767.class, Class7709.field30654);
        field4156 = (class511 -> class511.method2712() != Class6363.field25461 && class511.method2777());
        field4157 = new Class7843().method25337(20.0).method25343(Class767.field4156);
    }
}
