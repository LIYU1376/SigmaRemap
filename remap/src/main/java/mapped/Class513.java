// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.apache.logging.log4j.LogManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.OptionalInt;
import com.mojang.datafixers.util.Either;
import javax.annotation.Nullable;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Iterator;
import java.util.Random;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class Class513 extends Class512 implements Class514
{
    private static final Logger field3037;
    private String field3038;
    public Class5814 field3039;
    public final Class394 field3040;
    public final Class8071 field3041;
    private final List<Integer> field3042;
    private final Class7012 field3043;
    private final Class7473 field3044;
    private float field3045;
    private int field3046;
    private int field3047;
    private int field3048;
    private int field3049;
    private int field3050;
    private float field3051;
    private int field3052;
    private boolean field3053;
    private int field3054;
    private int field3055;
    private Class2047 field3056;
    private boolean field3057;
    private long field3058;
    private Entity field3059;
    private boolean field3060;
    private boolean field3061;
    private final Class6522 field3062;
    private Vec3d field3063;
    private int field3064;
    private boolean field3065;
    private Vec3d field3066;
    private Class353 field3067;
    private int field3068;
    public boolean field3069;
    public int field3070;
    public boolean field3071;
    
    public Class513(final Class394 field3040, final Class1849 class1849, final GameProfile gameProfile, final Class8071 field3041) {
        super(class1849, gameProfile);
        this.field3038 = "en_US";
        this.field3042 = Lists.newLinkedList();
        this.field3045 = Float.MIN_VALUE;
        this.field3046 = Integer.MIN_VALUE;
        this.field3047 = Integer.MIN_VALUE;
        this.field3048 = Integer.MIN_VALUE;
        this.field3049 = Integer.MIN_VALUE;
        this.field3050 = Integer.MIN_VALUE;
        this.field3051 = -1.0E8f;
        this.field3052 = -99999999;
        this.field3053 = true;
        this.field3054 = -99999999;
        this.field3055 = 60;
        this.field3057 = true;
        this.field3058 = Class8349.method27837();
        this.field3067 = Class353.method1088(0, 0, 0);
        field3041.field33248 = this;
        this.field3041 = field3041;
        this.field3040 = field3040;
        this.field3062 = new Class6522(field3040.method1577());
        this.field3044 = field3040.method1537().method20620(this);
        this.field3043 = field3040.method1537().method20621(this);
        this.field2420 = 1.0f;
        this.method2915(class1849);
    }
    
    private void method2915(final Class1849 class1849) {
        final BlockPos method6758 = class1849.method6758();
        if (class1849.field10063.method20503() && class1849.method6764().method29564() != Class101.field300) {
            int max = Math.max(0, this.field3040.method1565(class1849));
            final int method6759 = MathHelper.floor(class1849.method6787().method34784(method6758.getX(), method6758.getZ()));
            if (method6759 < max) {
                max = method6759;
            }
            if (method6759 <= 1) {
                max = 1;
            }
            final long n = max * 2 + 1;
            final long n2 = n * n;
            final int bound = (n2 <= 2147483647L) ? ((int)n2) : Integer.MAX_VALUE;
            final int method6760 = this.method2916(bound);
            final int nextInt = new Random().nextInt(bound);
            for (int i = 0; i < bound; ++i) {
                final int n3 = (nextInt + method6760 * i) % bound;
                final BlockPos method6761 = class1849.method6789().method20490(method6758.getX() + n3 % (max * 2 + 1) - max, method6758.getZ() + n3 / (max * 2 + 1) - max, false);
                if (method6761 != null) {
                    this.method1729(method6761, 0.0f, 0.0f);
                    if (class1849.method6977(this)) {
                        break;
                    }
                }
            }
        }
        else {
            this.method1729(method6758, 0.0f, 0.0f);
            while (!class1849.method6977(this)) {
                if (this.method1941() >= 255.0) {
                    break;
                }
                this.method1656(this.method1938(), this.method1941() + 1.0, this.method1945());
            }
        }
    }
    
    private int method2916(final int n) {
        return (n > 16) ? 17 : (n - 1);
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        if (class51.method316("playerGameType", 99)) {
            if (!this.method1897().method1551()) {
                this.field3041.method26481(Class101.method592(class51.method319("playerGameType")));
            }
            else {
                this.field3041.method26481(this.method1897().method1445());
            }
        }
        if (class51.method316("enteredNetherPosition", 10)) {
            final Class51 method327 = class51.method327("enteredNetherPosition");
            this.field3066 = new Vec3d(method327.method322("x"), method327.method322("y"), method327.method322("z"));
        }
        this.field3061 = class51.method329("seenCredits");
        if (class51.method316("recipeBook", 10)) {
            this.field3062.method19724(class51.method327("recipeBook"));
        }
        if (this.method2783()) {
            this.method2787();
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        class51.method298("playerGameType", this.field3041.method26482().method585());
        class51.method312("seenCredits", this.field3061);
        if (this.field3066 != null) {
            final Class51 class52 = new Class51();
            class52.method305("x", this.field3066.field22770);
            class52.method305("y", this.field3066.field22771);
            class52.method305("z", this.field3066.field22772);
            class51.method295("enteredNetherPosition", class52);
        }
        final Entity method1915 = this.method1915();
        final Entity method1916 = this.method1920();
        if (method1916 != null) {
            if (method1915 != this) {
                if (method1915.method1913()) {
                    final Class51 class53 = new Class51();
                    final Class51 class54 = new Class51();
                    method1915.method1755(class54);
                    class53.method300("Attach", method1916.method1865());
                    class53.method295("Entity", class54);
                    class51.method295("RootVehicle", class53);
                }
            }
        }
        class51.method295("recipeBook", this.field3062.method19723());
    }
    
    public void method2917(final int n) {
        final float n2 = (float)this.method2875();
        this.field3028 = MathHelper.method35653(n / n2, 0.0f, (n2 - 1.0f) / n2);
        this.field3054 = -1;
    }
    
    public void method2918(final int field3026) {
        this.field3026 = field3026;
        this.field3054 = -1;
    }
    
    @Override
    public void method2874(final int n) {
        super.method2874(n);
        this.field3054 = -1;
    }
    
    @Override
    public void method2873(final Class8321 class8321, final int n) {
        super.method2873(class8321, n);
        this.field3054 = -1;
    }
    
    public void method2919() {
        this.field3009.method10873(this);
    }
    
    @Override
    public void method2752() {
        super.method2752();
        this.field3039.method17469(new Class4260(this.method2699(), Class344.field2120));
    }
    
    @Override
    public void method2753() {
        super.method2753();
        this.field3039.method17469(new Class4260(this.method2699(), Class344.field2121));
    }
    
    @Override
    public void method1690(final Class7096 class7096) {
        Class7770.field31778.method13813(this, class7096);
    }
    
    @Override
    public Class7948 method2809() {
        return new Class7949(this);
    }
    
    @Override
    public void method1659() {
        this.field3041.method26476();
        --this.field3055;
        if (this.field2430 > 0) {
            --this.field2430;
        }
        this.field3009.method10876();
        if (!this.field2391.field10067) {
            if (!this.field3009.method10854(this)) {
                this.method2814();
                this.field3009 = this.field3008;
            }
        }
        while (!this.field3042.isEmpty()) {
            final int min = Math.min(this.field3042.size(), Integer.MAX_VALUE);
            final int[] array = new int[min];
            final Iterator<Integer> iterator = this.field3042.iterator();
            int n = 0;
            while (iterator.hasNext() && n < min) {
                array[n++] = iterator.next();
                iterator.remove();
            }
            this.field3039.method17469(new Class4325(array));
        }
        final Entity method2951 = this.method2951();
        if (method2951 != this) {
            if (!method2951.method1768()) {
                this.method2952(this);
            }
            else {
                this.method1728(method2951.method1938(), method2951.method1941(), method2951.method1945(), method2951.field2399, method2951.field2400);
                this.method2940().method6904().method7443(this);
                if (this.method2805()) {
                    this.method2952(this);
                }
            }
        }
        Class7770.field31797.method13755(this);
        if (this.field3063 != null) {
            Class7770.field31795.method13823(this, this.field3063, this.field2424 - this.field3064);
        }
        this.field3043.method21468(this);
    }
    
    public void method2920() {
        try {
            if (!this.method1639() || this.field2391.method6971(new BlockPos(this))) {
                super.method1659();
            }
            for (int i = 0; i < this.field3006.method2239(); ++i) {
                final Class8321 method2157 = this.field3006.method2157(i);
                if (method2157.method27622().method11724()) {
                    final Class4252<?> method2158 = ((Class4093)method2157.method27622()).method12325(method2157, this.field2391, this);
                    if (method2158 != null) {
                        this.field3039.method17469(method2158);
                    }
                }
            }
            if (this.method2664() != this.field3051 || this.field3052 != this.field3010.method33491() || this.field3010.method33494() == 0.0f != this.field3053) {
                this.field3039.method17469(new Class4292(this.method2664(), this.field3010.method33491(), this.field3010.method33494()));
                this.field3051 = this.method2664();
                this.field3052 = this.field3010.method33491();
                this.field3053 = (this.field3010.method33494() == 0.0f);
            }
            if (this.method2664() + this.method2750() != this.field3045) {
                this.field3045 = this.method2664() + this.method2750();
                this.method2921(Class9456.field40645, MathHelper.method35649(this.field3045));
            }
            if (this.field3010.method33491() != this.field3046) {
                this.field3046 = this.field3010.method33491();
                this.method2921(Class9456.field40646, MathHelper.method35649((float)this.field3046));
            }
            if (this.method1832() != this.field3047) {
                this.field3047 = this.method1832();
                this.method2921(Class9456.field40647, MathHelper.method35649((float)this.field3047));
            }
            if (this.method2693() != this.field3048) {
                this.field3048 = this.method2693();
                this.method2921(Class9456.field40648, MathHelper.method35649((float)this.field3048));
            }
            if (this.field3027 != this.field3050) {
                this.field3050 = this.field3027;
                this.method2921(Class9456.field40649, MathHelper.method35649((float)this.field3050));
            }
            if (this.field3026 != this.field3049) {
                this.field3049 = this.field3026;
                this.method2921(Class9456.field40650, MathHelper.method35649((float)this.field3049));
            }
            if (this.field3027 != this.field3054) {
                this.field3054 = this.field3027;
                this.field3039.method17469(new Class4313(this.field3028, this.field3027, this.field3026));
            }
            if (this.field2424 % 20 == 0) {
                Class7770.field31790.method13827(this);
            }
        }
        catch (final Throwable t) {
            final Class7689 method2159 = Class7689.method24421(t, "Ticking player");
            this.method1862(method2159.method24418("Player being ticked"));
            throw new Class2365(method2159);
        }
    }
    
    private void method2921(final Class9456 class9456, final int n) {
        this.method2890().method19634(class9456, this.method1867(), class9457 -> class9457.method23971(n2));
    }
    
    @Override
    public void method2673(final Class7929 class7929) {
        if (!this.field2391.method6765().method31216(Class8878.field37326)) {
            this.field3039.method17469(new Class4260(this.method2699(), Class344.field2122));
        }
        else {
            final Class2250 method35595 = this.method2699().method35595();
            this.field3039.method17470(new Class4260(this.method2699(), Class344.field2122, method35595), (GenericFutureListener<? extends Future<? super Void>>)(future -> {
                if (!future.isSuccess()) {
                    final Class2259 class2251 = new Class2259("death.attack.message_too_long", new Object[] { new Class2260(method35595.method8460(256)).method8469(Class2116.field12323) });
                    this.field3039.method17469(new Class4260(this.method2699(), Class344.field2122, new Class2259("death.attack.even_more_magic", new Object[] { this.method1871() }).method8467(class2253 -> class2253.method30420(new Class9390(Class1961.field10697, class2252)))));
                }
            }));
            final Class6750 method35596 = this.method1825();
            if (method35596 != null && method35596.method20555() != Class2097.field12147) {
                if (method35596.method20555() != Class2097.field12149) {
                    if (method35596.method20555() == Class2097.field12150) {
                        this.field3040.method1537().method20589(this, method35595);
                    }
                }
                else {
                    this.field3040.method1537().method20588(this, method35595);
                }
            }
            else {
                this.field3040.method1537().method20619(method35595);
            }
        }
        this.method2887();
        if (!this.method1639()) {
            this.method2675(class7929);
        }
        this.method2890().method19634(Class9456.field40642, this.method1867(), Class7628::method23968);
        final Class511 method35597 = this.method2700();
        if (method35597 != null) {
            this.method2859(Class8276.field33986.method8449(method35597.method1642()));
            method35597.method1751(this, this.field2965, class7929);
            this.method2674(method35597);
        }
        this.field2391.method6761(this, (byte)3);
        this.method2857(Class8276.field34016);
        this.method2861(Class8276.field33987.method8449(Class8276.field33990));
        this.method2861(Class8276.field33987.method8449(Class8276.field33991));
        this.method1667();
        this.method1830(0, false);
        this.method2699().method35601();
    }
    
    @Override
    public void method1751(final Entity class399, final int n, final Class7929 class400) {
        if (class399 != this) {
            super.method1751(class399, n, class400);
            this.method2819(n);
            final String method1867 = this.method1867();
            final String method1868 = class399.method1867();
            this.method2890().method19634(Class9456.field40644, method1867, Class7628::method23968);
            if (!(class399 instanceof Class512)) {
                this.method2857(Class8276.field34017);
            }
            else {
                this.method2857(Class8276.field34019);
                this.method2890().method19634(Class9456.field40643, method1867, Class7628::method23968);
            }
            this.method2922(method1867, method1868, Class9456.field40651);
            this.method2922(method1868, method1867, Class9456.field40652);
            Class7770.field31776.method13738(this, class399, class400);
        }
    }
    
    private void method2922(final String s, final String s2, final Class9456[] array) {
        final Class6749 method19651 = this.method2890().method19651(s2);
        if (method19651 != null) {
            final int method19652 = method19651.method20563().method8253();
            if (method19652 >= 0) {
                if (method19652 < array.length) {
                    this.method2890().method19634(array[method19652], s, Class7628::method23968);
                }
            }
        }
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (!this.method1849(class7929)) {
            boolean b = false;
            Label_0055: {
                if (this.field3040.method1517()) {
                    if (this.method2923()) {
                        if ("fall".equals(class7929.field32593)) {
                            b = true;
                            break Label_0055;
                        }
                    }
                }
                b = false;
            }
            if (!b) {
                if (this.field3055 > 0) {
                    if (class7929 != Class7929.field32574) {
                        return false;
                    }
                }
            }
            if (class7929 instanceof Class7930) {
                final Entity method25714 = class7929.method25714();
                if (method25714 instanceof Class512 && !this.method2826((Class512)method25714)) {
                    return false;
                }
                if (method25714 instanceof Class402) {
                    final Entity method25715 = ((Class402)method25714).method1973();
                    if (method25715 instanceof Class512) {
                        if (!this.method2826((Class512)method25715)) {
                            return false;
                        }
                    }
                }
            }
            return super.method1740(class7929, n);
        }
        return false;
    }
    
    @Override
    public boolean method2826(final Class512 class512) {
        return this.method2923() && super.method2826(class512);
    }
    
    private boolean method2923() {
        return this.field3040.method1527();
    }
    
    @Nullable
    @Override
    public Entity method1854(final Class383 field2452) {
        this.field3060 = true;
        final Class383 field2453 = this.field2452;
        if (field2453 == Class383.field2225 && field2452 == Class383.field2223) {
            this.method1640();
            this.method2940().method6902(this);
            if (!this.field3071) {
                this.field3071 = true;
                this.field3039.method17469(new Class4306(4, this.field3061 ? 0.0f : 1.0f));
                this.field3061 = true;
            }
            return this;
        }
        final Class1849 method1481 = this.field3040.method1481(field2453);
        this.field2452 = field2452;
        final Class1849 method1482 = this.field3040.method1481(field2452);
        final Class8660 method1483 = method1482.method6764();
        this.field3039.method17469(new Class4359(field2452, Class8660.method29535(method1483.method29534()), method1483.method29570(), this.field3041.method26482()));
        this.field3039.method17469(new Class4315(method1483.method29597(), method1483.method29599()));
        final Class6765 method1484 = this.field3040.method1537();
        method1484.method20584(this);
        method1481.method6902(this);
        this.field2410 = false;
        double method1485 = this.method1938();
        double method1486 = this.method1941();
        double method1487 = this.method1945();
        float field2454 = this.field2400;
        final float field2455;
        float n = field2455 = this.field2399;
        method1481.method6796().method15297("moving");
        if (field2453 == Class383.field2223 && field2452 == Class383.field2224) {
            this.field3066 = this.method1934();
            method1485 /= 8.0;
            method1487 /= 8.0;
        }
        else if (field2453 == Class383.field2224 && field2452 == Class383.field2223) {
            method1485 *= 8.0;
            method1487 *= 8.0;
        }
        else if (field2453 == Class383.field2223) {
            if (field2452 == Class383.field2225) {
                final BlockPos method1488 = method1482.method6878();
                method1485 = method1488.getX();
                method1486 = method1488.getY();
                method1487 = method1488.getZ();
                n = 90.0f;
                field2454 = 0.0f;
            }
        }
        this.method1730(method1485, method1486, method1487, n, field2454);
        method1481.method6796().method15299();
        method1481.method6796().method15297("placing");
        this.method1730(MathHelper.method35654(method1485, Math.min(-2.9999872E7, method1482.method6787().method34786() + 16.0), Math.min(2.9999872E7, method1482.method6787().method34788() - 16.0)), method1486, MathHelper.method35654(method1487, Math.min(-2.9999872E7, method1482.method6787().method34787() + 16.0), Math.min(2.9999872E7, method1482.method6787().method34789() - 16.0)), n, field2454);
        if (field2452 != Class383.field2225) {
            if (!method1482.method6909().method31767(this, field2455)) {
                method1482.method6909().method31769(this);
                method1482.method6909().method31767(this, field2455);
            }
        }
        else {
            final int method1489 = MathHelper.floor(this.method1938());
            final int n2 = MathHelper.floor(this.method1941()) - 1;
            final int method1490 = MathHelper.floor(this.method1945());
            for (int i = -2; i <= 2; ++i) {
                for (int j = -2; j <= 2; ++j) {
                    for (int k = -1; k < 3; ++k) {
                        method1482.method6692(new BlockPos(method1489 + j * 1 + i * 0, n2 + k, method1490 + j * 0 - i * 1), (k < 0) ? Class7521.field29286.method11878() : Class7521.field29147.method11878());
                    }
                }
            }
            this.method1730(method1489, n2, method1490, n, 0.0f);
            this.method1936(Vec3d.field22769);
        }
        method1481.method6796().method15299();
        this.method1727(method1482);
        method1482.method6890(this);
        this.method2924(method1481);
        this.field3039.method17467(this.method1938(), this.method1941(), this.method1945(), n, field2454);
        this.field3041.method26489(method1482);
        this.field3039.method17469(new Class4300(this.field3025));
        method1484.method20606(this, method1482);
        method1484.method20607(this);
        final Iterator<Class1948> iterator = this.method2651().iterator();
        while (iterator.hasNext()) {
            this.field3039.method17469(new Class4384(this.method1643(), iterator.next()));
        }
        this.field3039.method17469(new Class4395(1032, BlockPos.ZERO, 0, false));
        this.field3054 = -1;
        this.field3051 = -1.0f;
        this.field3052 = -1;
        return this;
    }
    
    private void method2924(final Class1849 class1849) {
        final Class383 method20487 = class1849.field10063.method20487();
        final Class383 method20488 = this.field2391.field10063.method20487();
        Class7770.field31796.method13796(this, method20487, method20488);
        if (method20487 == Class383.field2224) {
            if (method20488 == Class383.field2223) {
                if (this.field3066 != null) {
                    Class7770.field31803.method13800(this, this.field3066);
                }
            }
        }
        if (method20488 != Class383.field2224) {
            this.field3066 = null;
        }
    }
    
    @Override
    public boolean method1885(final Class513 class513) {
        if (!class513.method1639()) {
            return !this.method1639() && super.method1885(class513);
        }
        return this.method2951() == this;
    }
    
    private void method2925(final Class436 class436) {
        if (class436 != null) {
            final Class4357 method2195 = class436.method2195();
            if (method2195 != null) {
                this.field3039.method17469(method2195);
            }
        }
    }
    
    @Override
    public void method2746(final Entity class399, final int n) {
        super.method2746(class399, n);
        this.field3009.method10876();
    }
    
    @Override
    public Either<Class2048, Class315> method2845(final BlockPos class354) {
        return (Either<Class2048, Class315>)super.method2845(class354).ifRight(p0 -> {
            this.method2857(Class8276.field34044);
            Class7770.field31791.method13827(this);
        });
    }
    
    @Override
    public void method2849(final boolean b, final boolean b2) {
        if (this.method2783()) {
            this.method2940().method6904().method7446(this, new Class4289(this, 2));
        }
        super.method2849(b, b2);
        if (this.field3039 != null) {
            this.field3039.method17467(this.method1938(), this.method1941(), this.method1945(), this.field2399, this.field2400);
        }
    }
    
    @Override
    public boolean method1780(final Entity class399, final boolean b) {
        final Entity method1920 = this.method1920();
        if (super.method1780(class399, b)) {
            if (this.method1920() != method1920) {
                if (this.field3039 != null) {
                    this.field3039.method17467(this.method1938(), this.method1941(), this.method1945(), this.field2399, this.field2400);
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public void method1784() {
        final Entity method1920 = this.method1920();
        super.method1784();
        if (this.method1920() != method1920) {
            if (this.field3039 != null) {
                this.field3039.method17467(this.method1938(), this.method1941(), this.method1945(), this.field2399, this.field2400);
            }
        }
    }
    
    @Override
    public boolean method1849(final Class7929 class7929) {
        if (!super.method1849(class7929)) {
            if (!this.method2955()) {
                if (!this.field3025.field27301 || class7929 != Class7929.field32577) {
                    return false;
                }
            }
        }
        return true;
    }
    
    @Override
    public void method1701(final double n, final boolean b, final Class7096 class7096, final BlockPos class7097) {
    }
    
    @Override
    public void method2624(final BlockPos class354) {
        if (!this.method1639()) {
            super.method2624(class354);
        }
    }
    
    public void method2926(final double n, final boolean b) {
        final BlockPos method1672 = this.method1672();
        if (this.field2391.method6971(method1672)) {
            super.method1701(n, b, this.field2391.method6701(method1672), method1672);
        }
    }
    
    @Override
    public void method2827(final Class497 class497) {
        class497.method2525(this);
        this.field3039.method17469(new Class4350(class497.method2193()));
    }
    
    private void method2927() {
        this.field3068 = this.field3068 % 100 + 1;
    }
    
    @Override
    public OptionalInt method2833(final Class434 class434) {
        if (class434 == null) {
            return OptionalInt.empty();
        }
        if (this.field3009 != this.field3008) {
            this.method2814();
        }
        this.method2927();
        final Class3418 method2166 = class434.method2166(this.field3068, this.field3006, this);
        if (method2166 != null) {
            this.field3039.method17469(new Class4308(method2166.field16154, method2166.method10867(), class434.method1871()));
            method2166.method10873(this);
            this.field3009 = method2166;
            return OptionalInt.of(this.field3068);
        }
        if (this.method1639()) {
            this.method2853(new Class2259("container.spectatorCantOpen", new Object[0]).method8469(Class2116.field12321), true);
        }
        return OptionalInt.empty();
    }
    
    @Override
    public void method2834(final int n, final Class57 class57, final int n2, final int n3, final boolean b, final boolean b2) {
        this.field3039.method17469(new Class4346(n, class57, n2, n3, b, b2));
    }
    
    @Override
    public void method2832(final Class806 class806, final Class446 class807) {
        if (this.field3009 != this.field3008) {
            this.method2814();
        }
        this.method2927();
        this.field3039.method17469(new Class4259(this.field3068, class807.method2239(), class806.method1643()));
        (this.field3009 = new Class3425(this.field3068, this.field3006, class807, class806)).method10873(this);
    }
    
    @Override
    public void method2835(final Class8321 class8321, final Class316 class8322) {
        if (class8321.method27622() == Class7739.field31513) {
            if (Class4096.method12342(class8321, this.method1924(), this)) {
                this.field3009.method10876();
            }
            this.field3039.method17469(new Class4316(class8322));
        }
    }
    
    @Override
    public void method2829(final Class500 class500) {
        class500.method2549(true);
        this.method2925(class500);
    }
    
    @Override
    public void method2928(final Class3418 class3418, final int n, final Class8321 class3419) {
        if (!(class3418.method10878(n) instanceof Class6623)) {
            if (class3418 == this.field3008) {
                Class7770.field31779.method13866(this, this.field3006);
            }
            if (!this.field3069) {
                this.field3039.method17469(new Class4272(class3418.field16154, n, class3419));
            }
        }
    }
    
    public void method2929(final Class3418 class3418) {
        this.method2930(class3418, class3418.method10875());
    }
    
    @Override
    public void method2930(final Class3418 class3418, final Class2265<Class8321> class3419) {
        this.field3039.method17469(new Class4365(class3418.field16154, class3419));
        this.field3039.method17469(new Class4272(-1, -1, this.field3006.method2375()));
    }
    
    @Override
    public void method2931(final Class3418 class3418, final int n, final int n2) {
        this.field3039.method17469(new Class4311(class3418.field16154, n, n2));
    }
    
    @Override
    public void method2814() {
        this.field3039.method17469(new Class4284(this.field3009.field16154));
        this.method2933();
    }
    
    public void method2932() {
        if (!this.field3069) {
            this.field3039.method17469(new Class4272(-1, -1, this.field3006.method2375()));
        }
    }
    
    public void method2933() {
        this.field3009.method10859(this);
        this.field3009 = this.field3008;
    }
    
    public void method2934(final float field2968, final float field2969, final boolean field2970, final boolean b) {
        if (this.method1805()) {
            if (field2968 >= -1.0f) {
                if (field2968 <= 1.0f) {
                    this.field2968 = field2968;
                }
            }
            if (field2969 >= -1.0f) {
                if (field2969 <= 1.0f) {
                    this.field2970 = field2969;
                }
            }
            this.field2967 = field2970;
            this.method1808(b);
        }
    }
    
    @Override
    public void method2860(final Class9455<?> class9455, final int n) {
        this.field3044.method23089(this, class9455, n);
        this.method2890().method19634(class9455, this.method1867(), class9456 -> class9456.method23967(n2));
    }
    
    @Override
    public void method2861(final Class9455<?> class9455) {
        this.field3044.method23075(this, class9455, 0);
        this.method2890().method19634(class9455, this.method1867(), Class7628::method23970);
    }
    
    @Override
    public int method2862(final Collection<Class3662<?>> collection) {
        return this.field3062.method19720(collection, this);
    }
    
    @Override
    public void method2863(final Class1932[] array) {
        final ArrayList arrayList = Lists.newArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            this.field3040.method1577().method6382(array[i]).ifPresent(arrayList::add);
        }
        this.method2862(arrayList);
    }
    
    @Override
    public int method2864(final Collection<Class3662<?>> collection) {
        return this.field3062.method19721(collection, this);
    }
    
    @Override
    public void method2871(final int n) {
        super.method2871(n);
        this.field3054 = -1;
    }
    
    public void method2935() {
        this.field3065 = true;
        this.method1783();
        if (this.method2783()) {
            this.method2849(true, false);
        }
    }
    
    public boolean method2936() {
        return this.field3065;
    }
    
    public void method2937() {
        this.field3051 = -1.0E8f;
    }
    
    @Override
    public void method2853(final Class2250 class2250, final boolean b) {
        this.field3039.method17469(new Class4378(class2250, b ? Class285.field1574 : Class285.field1572));
    }
    
    @Override
    public void method2765() {
        if (!this.field2987.method27620()) {
            if (this.method2756()) {
                this.field3039.method17469(new Class4264(this, (byte)9));
                super.method2765();
            }
        }
    }
    
    @Override
    public void method1927(final Class2042 class2042, final Vec3d class2043) {
        super.method1927(class2042, class2043);
        this.field3039.method17469(new Class4280(class2042, class2043.field22770, class2043.field22771, class2043.field22772));
    }
    
    public void method2938(final Class2042 class2042, final Entity class2043, final Class2042 class2044) {
        super.method1927(class2042, class2044.method8122(class2043));
        this.field3039.method17469(new Class4280(class2042, class2043, class2044));
    }
    
    public void method2939(final Class513 class513, final boolean b) {
        if (!b) {
            if (this.field2391.method6765().method31216(Class8878.field37317) || class513.method1639()) {
                this.field3006.method2378(class513.field3006);
                this.field3026 = class513.field3026;
                this.field3027 = class513.field3027;
                this.field3028 = class513.field3028;
                this.method2818(class513.method2817());
            }
        }
        else {
            this.field3006.method2378(class513.field3006);
            this.method2665(class513.method2664());
            this.field3010 = class513.field3010;
            this.field3026 = class513.field3026;
            this.field3027 = class513.field3027;
            this.field3028 = class513.field3028;
            this.method2818(class513.method2817());
            this.field2453 = class513.field2453;
            this.field2454 = class513.field2454;
            this.field2455 = class513.field2455;
        }
        this.field3029 = class513.field3029;
        this.field3007 = class513.field3007;
        this.method1650().method33569(Class513.field3001, (Byte)class513.method1650().method33568((Class8810<T>)Class513.field3001));
        this.field3054 = -1;
        this.field3051 = -1.0f;
        this.field3052 = -1;
        this.field3062.method19692(class513.field3062);
        this.field3042.addAll(class513.field3042);
        this.field3061 = class513.field3061;
        this.field3066 = class513.field3066;
        this.method2900(class513.method2899());
        this.method2902(class513.method2901());
    }
    
    @Override
    public void method2660(final Class1948 class1948) {
        super.method2660(class1948);
        this.field3039.method17469(new Class4384(this.method1643(), class1948));
        if (class1948.method7906() == Class9439.field40498) {
            this.field3064 = this.field2424;
            this.field3063 = this.method1934();
        }
        Class7770.field31801.method13777(this);
    }
    
    @Override
    public void method2661(final Class1948 class1948, final boolean b) {
        super.method2661(class1948, b);
        this.field3039.method17469(new Class4384(this.method1643(), class1948));
        Class7770.field31801.method13777(this);
    }
    
    @Override
    public void method2662(final Class1948 class1948) {
        super.method2662(class1948);
        this.field3039.method17469(new Class4295(this.method1643(), class1948.method7906()));
        if (class1948.method7906() == Class9439.field40498) {
            this.field3063 = null;
        }
        Class7770.field31801.method13777(this);
    }
    
    @Override
    public void method1878(final double n, final double n2, final double n3) {
        this.field3039.method17467(n, n2, n3, this.field2399, this.field2400);
    }
    
    @Override
    public void method1950(final double n, final double n2, final double n3) {
        this.field3039.method17467(n, n2, n3, this.field2399, this.field2400);
        this.field3039.method17461();
    }
    
    @Override
    public void method2839(final Entity class399) {
        this.method2940().method6904().method7446(this, new Class4289(class399, 4));
    }
    
    @Override
    public void method2840(final Entity class399) {
        this.method2940().method6904().method7446(this, new Class4289(class399, 5));
    }
    
    @Override
    public void method2882() {
        if (this.field3039 != null) {
            this.field3039.method17469(new Class4300(this.field3025));
            this.method2644();
        }
    }
    
    public Class1849 method2940() {
        return (Class1849)this.field2391;
    }
    
    @Override
    public void method2883(final Class101 class101) {
        this.field3041.method26481(class101);
        this.field3039.method17469(new Class4306(3, (float)class101.method585()));
        if (class101 != Class101.field301) {
            this.method2952(this);
        }
        else {
            this.method2887();
            this.method1784();
        }
        this.method2882();
        this.method2754();
    }
    
    @Override
    public boolean method1639() {
        return this.field3041.method26482() == Class101.field301;
    }
    
    @Override
    public boolean method2889() {
        return this.field3041.method26482() == Class101.field299;
    }
    
    @Override
    public void method1494(final Class2250 class2250) {
        this.method2941(class2250, Class285.field1573);
    }
    
    public void method2941(final Class2250 class2250, final Class285 class2251) {
        this.field3039.method17470(new Class4378(class2250, class2251), (GenericFutureListener<? extends Future<? super Void>>)(future -> {
            if (!future.isSuccess()) {
                if (class2251 == Class285.field1574 || class2251 == Class285.field1573) {
                    this.field3039.method17469(new Class4378(new Class2259("multiplayer.message_not_delivered", new Object[] { new Class2260(class2250.method8460(256)).method8469(Class2116.field12323) }).method8469(Class2116.field12321), Class285.field1573));
                }
            }
        }));
    }
    
    public String method2942() {
        final String string = this.field3039.field23855.method11180().toString();
        final String substring = string.substring(string.indexOf("/") + 1);
        return substring.substring(0, substring.indexOf(":"));
    }
    
    public void method2943(final Class4386 class4386) {
        this.field3038 = class4386.method13197();
        this.field3056 = class4386.method13198();
        this.field3057 = class4386.method13199();
        this.method1650().method33569(Class513.field3001, (byte)class4386.method13200());
        this.method1650().method33569(Class513.field3002, (byte)((class4386.method13201() != Class2226.field13697) ? 1 : 0));
    }
    
    public Class2047 method2944() {
        return this.field3056;
    }
    
    public void method2945(final String s, final String s2) {
        this.field3039.method17469(new Class4283(s, s2));
    }
    
    @Override
    public int method1925() {
        return this.field3040.method1588(this.method2844());
    }
    
    public void method2946() {
        this.field3058 = Class8349.method27837();
    }
    
    public Class7473 method2947() {
        return this.field3044;
    }
    
    public Class6522 method2948() {
        return this.field3062;
    }
    
    public void method2949(final Entity class399) {
        if (!(class399 instanceof Class512)) {
            this.field3042.add(class399.method1643());
        }
        else {
            this.field3039.method17469(new Class4325(new int[] { class399.method1643() }));
        }
    }
    
    public void method2950(final Entity class399) {
        this.field3042.remove((Object)class399.method1643());
    }
    
    @Override
    public void method2644() {
        if (!this.method1639()) {
            super.method2644();
        }
        else {
            this.method2649();
            this.method1828(true);
        }
    }
    
    public Entity method2951() {
        return (this.field3059 != null) ? this.field3059 : this;
    }
    
    public void method2952(final Entity class399) {
        final Entity method2951 = this.method2951();
        this.field3059 = ((class399 != null) ? class399 : this);
        if (method2951 != this.field3059) {
            this.field3039.method17469(new Class4343(this.field3059));
            this.method1878(this.field3059.method1938(), this.field3059.method1941(), this.field3059.method1945());
        }
    }
    
    @Override
    public void method1661() {
        if (this.field2449 > 0) {
            if (!this.field3060) {
                --this.field2449;
            }
        }
    }
    
    @Override
    public void method2837(final Entity class399) {
        if (this.field3041.method26482() != Class101.field301) {
            super.method2837(class399);
        }
        else {
            this.method2952(class399);
        }
    }
    
    public long method2953() {
        return this.field3058;
    }
    
    @Nullable
    public Class2250 method2954() {
        return null;
    }
    
    @Override
    public void method2707(final Class316 class316) {
        super.method2707(class316);
        this.method2905();
    }
    
    public boolean method2955() {
        return this.field3060;
    }
    
    public void method2956() {
        this.field3060 = false;
    }
    
    public Class7012 method2957() {
        return this.field3043;
    }
    
    public void method2958(final Class1849 class1849, final double n, final double n2, final double n3, final float n4, final float n5) {
        this.method2952(this);
        this.method1784();
        if (class1849 != this.field2391) {
            final Class1849 method2940 = this.method2940();
            this.field2452 = class1849.field10063.method20487();
            final Class8660 method2941 = class1849.method6764();
            this.field3039.method17469(new Class4359(this.field2452, Class8660.method29535(method2941.method29534()), method2941.method29570(), this.field3041.method26482()));
            this.field3039.method17469(new Class4315(method2941.method29597(), method2941.method29599()));
            this.field3040.method1537().method20584(this);
            method2940.method6902(this);
            this.field2410 = false;
            this.method1730(n, n2, n3, n4, n5);
            this.method1727(class1849);
            class1849.method6889(this);
            this.method2924(method2940);
            this.field3039.method17467(n, n2, n3, n4, n5);
            this.field3041.method26489(class1849);
            this.field3040.method1537().method20606(this, class1849);
            this.field3040.method1537().method20607(this);
        }
        else {
            this.field3039.method17467(n, n2, n3, n4, n5);
        }
    }
    
    public void method2959(final Class7859 class7859, final Class4252<?> class7860, final Class4252<?> class7861) {
        this.field3039.method17469(class7861);
        this.field3039.method17469(class7860);
    }
    
    public void method2960(final Class7859 class7859) {
        if (this.method1768()) {
            this.field3039.method17469(new Class4288(class7859.field32290, class7859.field32291));
        }
    }
    
    public Class353 method2961() {
        return this.field3067;
    }
    
    public void method2962(final Class353 field3067) {
        this.field3067 = field3067;
    }
    
    @Override
    public void method2812(final Class7795 class7795, final Class286 class7796, final float n, final float n2) {
        this.field3039.method17469(new Class4282(class7795, class7796, this.method1938(), this.method1941(), this.method1945(), n, n2));
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4361(this);
    }
    
    @Override
    public Class427 method2823(final Class8321 class8321, final boolean b, final boolean b2) {
        final Class427 method2823 = super.method2823(class8321, b, b2);
        if (method2823 != null) {
            this.field2391.method6886(method2823);
            final Class8321 method2824 = method2823.method2107();
            if (b2) {
                if (!method2824.method27620()) {
                    this.method2860(Class8276.field33984.method8449(method2824.method27622()), class8321.method27690());
                }
                this.method2857(Class8276.field34008);
            }
            return method2823;
        }
        return null;
    }
    
    static {
        field3037 = LogManager.getLogger();
    }
}
