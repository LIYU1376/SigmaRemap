// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import java.util.List;
import java.util.function.Function;
import java.util.Iterator;
import java.util.LinkedHashMap;
import com.google.common.collect.Maps;
import java.util.Map;

public abstract class Class466 extends Class460 implements Class441, Class469, Class472, Class439
{
    private static final int[] field2752;
    private static final int[] field2753;
    private static final int[] field2754;
    public Class2265<Class8321> field2755;
    private int field2756;
    private int field2757;
    private int field2758;
    private int field2759;
    public final Class7604 field2760;
    private final Map<Class1932, Integer> field2761;
    public final Class8976<? extends Class3680> field2762;
    
    public Class466(final Class5412<?> class5412, final Class8976<? extends Class3680> field2762) {
        super(class5412);
        this.field2755 = Class2265.method8507(3, Class8321.field34174);
        this.field2760 = new Class7605(this);
        this.field2761 = Maps.newHashMap();
        this.field2762 = field2762;
    }
    
    public static Map<Class3820, Integer> method2392() {
        final LinkedHashMap linkedHashMap = Maps.newLinkedHashMap();
        method2394(linkedHashMap, Class7739.field31351, 20000);
        method2394(linkedHashMap, Class7521.field29547, 16000);
        method2394(linkedHashMap, Class7739.field31437, 2400);
        method2394(linkedHashMap, Class7739.field31281, 1600);
        method2394(linkedHashMap, Class7739.field31282, 1600);
        method2393(linkedHashMap, Class7855.field32250, 300);
        method2393(linkedHashMap, Class7855.field32237, 300);
        method2393(linkedHashMap, Class7855.field32243, 300);
        method2393(linkedHashMap, Class7855.field32244, 150);
        method2393(linkedHashMap, Class7855.field32247, 300);
        method2393(linkedHashMap, Class7855.field32246, 300);
        method2394(linkedHashMap, Class7521.field29336, 300);
        method2394(linkedHashMap, Class7521.field29620, 300);
        method2394(linkedHashMap, Class7521.field29619, 300);
        method2394(linkedHashMap, Class7521.field29621, 300);
        method2394(linkedHashMap, Class7521.field29623, 300);
        method2394(linkedHashMap, Class7521.field29622, 300);
        method2394(linkedHashMap, Class7521.field29389, 300);
        method2394(linkedHashMap, Class7521.field29615, 300);
        method2394(linkedHashMap, Class7521.field29614, 300);
        method2394(linkedHashMap, Class7521.field29616, 300);
        method2394(linkedHashMap, Class7521.field29618, 300);
        method2394(linkedHashMap, Class7521.field29617, 300);
        method2394(linkedHashMap, Class7521.field29220, 300);
        method2394(linkedHashMap, Class7521.field29284, 300);
        method2394(linkedHashMap, Class7521.field29813, 300);
        method2394(linkedHashMap, Class7521.field29335, 300);
        method2394(linkedHashMap, Class7521.field29292, 300);
        method2394(linkedHashMap, Class7521.field29468, 300);
        method2394(linkedHashMap, Class7521.field29296, 300);
        method2394(linkedHashMap, Class7521.field29472, 300);
        method2393(linkedHashMap, Class7855.field32257, 300);
        method2394(linkedHashMap, Class7739.field31279, 300);
        method2394(linkedHashMap, Class7739.field31376, 300);
        method2394(linkedHashMap, Class7521.field29307, 300);
        method2393(linkedHashMap, Class7855.field32273, 200);
        method2394(linkedHashMap, Class7739.field31288, 200);
        method2394(linkedHashMap, Class7739.field31287, 200);
        method2394(linkedHashMap, Class7739.field31309, 200);
        method2394(linkedHashMap, Class7739.field31290, 200);
        method2394(linkedHashMap, Class7739.field31289, 200);
        method2393(linkedHashMap, Class7855.field32242, 200);
        method2393(linkedHashMap, Class7855.field32271, 1200);
        method2393(linkedHashMap, Class7855.field32236, 100);
        method2393(linkedHashMap, Class7855.field32239, 100);
        method2394(linkedHashMap, Class7739.field31299, 100);
        method2393(linkedHashMap, Class7855.field32249, 100);
        method2394(linkedHashMap, Class7739.field31300, 100);
        method2393(linkedHashMap, Class7855.field32241, 67);
        method2394(linkedHashMap, Class7521.field29715, 4001);
        method2394(linkedHashMap, Class7739.field31611, 300);
        method2394(linkedHashMap, Class7521.field29761, 50);
        method2394(linkedHashMap, Class7521.field29243, 100);
        method2394(linkedHashMap, Class7521.field29805, 400);
        method2394(linkedHashMap, Class7521.field29806, 300);
        method2394(linkedHashMap, Class7521.field29807, 300);
        method2394(linkedHashMap, Class7521.field29810, 300);
        method2394(linkedHashMap, Class7521.field29811, 300);
        method2394(linkedHashMap, Class7521.field29814, 300);
        method2394(linkedHashMap, Class7521.field29822, 300);
        return linkedHashMap;
    }
    
    private static void method2393(final Map<Class3820, Integer> map, final Class7909<Class3820> class7909, final int i) {
        final Iterator<Class3820> iterator = class7909.method25616().iterator();
        while (iterator.hasNext()) {
            map.put(iterator.next(), i);
        }
    }
    
    private static void method2394(final Map<Class3820, Integer> map, final Class3832 class3832, final int i) {
        map.put(class3832.method11704(), i);
    }
    
    private boolean method2395() {
        return this.field2756 > 0;
    }
    
    @Override
    public void method2179(final Class51 class51) {
        super.method2179(class51);
        Class8508.method28426(class51, this.field2755 = Class2265.method8507(this.method2239(), Class8321.field34174));
        this.field2756 = class51.method318("BurnTime");
        this.field2758 = class51.method318("CookTime");
        this.field2759 = class51.method318("CookTimeTotal");
        this.field2757 = this.method2398(this.field2755.get(1));
        for (short method318 = class51.method318("RecipesUsedSize"), n = 0; n < method318; ++n) {
            this.field2761.put(new Class1932(class51.method323("RecipeLocation" + n)), class51.method319("RecipeAmount" + n));
        }
    }
    
    @Override
    public Class51 method2180(final Class51 class51) {
        super.method2180(class51);
        class51.method297("BurnTime", (short)this.field2756);
        class51.method297("CookTime", (short)this.field2758);
        class51.method297("CookTimeTotal", (short)this.field2759);
        Class8508.method28424(class51, this.field2755);
        class51.method297("RecipesUsedSize", (short)this.field2761.size());
        int n = 0;
        for (final Map.Entry<Class1932, V> entry : this.field2761.entrySet()) {
            class51.method306("RecipeLocation" + n, entry.getKey().toString());
            class51.method298("RecipeAmount" + n, (int)entry.getValue());
            ++n;
        }
        return class51;
    }
    
    @Override
    public void method2229() {
        final boolean method2395 = this.method2395();
        int n = 0;
        if (this.method2395()) {
            --this.field2756;
        }
        if (!this.field2656.field10067) {
            final Class8321 class8321 = this.field2755.get(1);
            if (!this.method2395() && (class8321.method27620() || this.field2755.get(0).method27620())) {
                if (!this.method2395()) {
                    if (this.field2758 > 0) {
                        this.field2758 = Class9546.method35651(this.field2758 - 2, 0, this.field2759);
                    }
                }
            }
            else {
                final Class3662 class8322 = (Class3662)this.field2656.method6792().method6378(this.field2762, this, this.field2656).orElse(null);
                if (!this.method2395()) {
                    if (this.method2396(class8322)) {
                        this.field2756 = this.method2398(class8321);
                        this.field2757 = this.field2756;
                        if (this.method2395()) {
                            n = 1;
                            if (!class8321.method27620()) {
                                final Class3820 method2396 = class8321.method27622();
                                class8321.method27693(1);
                                if (class8321.method27620()) {
                                    final Class3820 method2397 = method2396.method11720();
                                    this.field2755.set(1, (method2397 != null) ? new Class8321(method2397) : Class8321.field34174);
                                }
                            }
                        }
                    }
                }
                if (this.method2395() && this.method2396(class8322)) {
                    ++this.field2758;
                    if (this.field2758 == this.field2759) {
                        this.field2758 = 0;
                        this.field2759 = this.method2399();
                        this.method2397(class8322);
                        n = 1;
                    }
                }
                else {
                    this.field2758 = 0;
                }
            }
            if (method2395 != this.method2395()) {
                n = 1;
                this.field2656.method6688(this.field2657, ((Class7097<O, Class7096>)this.field2656.method6701(this.field2657)).method21773((Class7111<Comparable>)Class3948.field17847, this.method2395()), 3);
            }
        }
        if (n != 0) {
            this.method2161();
        }
    }
    
    public boolean method2396(final Class3662<?> class3662) {
        if (this.field2755.get(0).method27620() || class3662 == null) {
            return false;
        }
        final Class8321 method11292 = class3662.method11292();
        if (!method11292.method27620()) {
            final Class8321 class3663 = this.field2755.get(2);
            return class3663.method27620() || (class3663.method27647(method11292) && ((class3663.method27690() < this.method2254() && class3663.method27690() < class3663.method27628()) || class3663.method27690() < method11292.method27628()));
        }
        return false;
    }
    
    private void method2397(final Class3662<?> class3662) {
        if (class3662 != null) {
            if (this.method2396(class3662)) {
                final Class8321 class3663 = this.field2755.get(0);
                final Class8321 method11292 = class3662.method11292();
                final Class8321 class3664 = this.field2755.get(2);
                if (!class3664.method27620()) {
                    if (class3664.method27622() == method11292.method27622()) {
                        class3664.method27692(1);
                    }
                }
                else {
                    this.field2755.set(2, method11292.method27641());
                }
                if (!this.field2656.field10067) {
                    this.method2401(class3662);
                }
                if (class3663.method27622() == Class7521.field29212.method11704()) {
                    if (!this.field2755.get(1).method27620()) {
                        if (this.field2755.get(1).method27622() == Class7739.field31349) {
                            this.field2755.set(1, new Class8321(Class7739.field31350));
                        }
                    }
                }
                class3663.method27693(1);
            }
        }
    }
    
    public int method2398(final Class8321 class8321) {
        if (!class8321.method27620()) {
            return method2392().getOrDefault(class8321.method27622(), 0);
        }
        return 0;
    }
    
    public int method2399() {
        return this.field2656.method6792().method6378(this.field2762, this, this.field2656).map((Function<? super Class3680, ? extends Integer>)Class3680::method11329).orElse(200);
    }
    
    public static boolean method2400(final Class8321 class8321) {
        return method2392().containsKey(class8321.method27622());
    }
    
    @Override
    public int[] method2248(final Class179 class179) {
        if (class179 != Class179.field511) {
            return (class179 != Class179.field512) ? Class466.field2754 : Class466.field2752;
        }
        return Class466.field2753;
    }
    
    @Override
    public boolean method2249(final int n, final Class8321 class8321, final Class179 class8322) {
        return this.method2264(n, class8321);
    }
    
    @Override
    public boolean method2250(final int n, final Class8321 class8321, final Class179 class8322) {
        if (class8322 == Class179.field511) {
            if (n == 1) {
                final Class3820 method27622 = class8321.method27622();
                if (method27622 != Class7739.field31350) {
                    if (method27622 != Class7739.field31349) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    
    @Override
    public int method2239() {
        return this.field2755.size();
    }
    
    @Override
    public boolean method2156() {
        final Iterator<Object> iterator = this.field2755.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().method27620()) {
                continue;
            }
            return false;
        }
        return true;
    }
    
    @Override
    public Class8321 method2157(final int n) {
        return this.field2755.get(n);
    }
    
    @Override
    public Class8321 method2158(final int n, final int n2) {
        return Class8508.method28422(this.field2755, n, n2);
    }
    
    @Override
    public Class8321 method2159(final int n) {
        return Class8508.method28423(this.field2755, n);
    }
    
    @Override
    public void method2160(final int n, final Class8321 class8321) {
        final Class8321 class8322 = this.field2755.get(n);
        boolean b = false;
        Label_0052: {
            if (!class8321.method27620()) {
                if (class8321.method27647(class8322)) {
                    if (Class8321.method27642(class8321, class8322)) {
                        b = true;
                        break Label_0052;
                    }
                }
            }
            b = false;
        }
        final boolean b2 = b;
        this.field2755.set(n, class8321);
        if (class8321.method27690() > this.method2254()) {
            class8321.method27691(this.method2254());
        }
        if (n == 0) {
            if (!b2) {
                this.field2759 = this.method2399();
                this.field2758 = 0;
                this.method2161();
            }
        }
    }
    
    @Override
    public boolean method2162(final Class512 class512) {
        return this.field2656.method6727(this.field2657) == this && class512.method1733(this.field2657.method1074() + 0.5, this.field2657.method1075() + 0.5, this.field2657.method1076() + 0.5) <= 64.0;
    }
    
    @Override
    public boolean method2264(final int n, final Class8321 class8321) {
        if (n == 2) {
            return false;
        }
        if (n == 1) {
            final Class8321 class8322 = this.field2755.get(1);
            return method2400(class8321) || (class8321.method27622() == Class7739.field31349 && class8322.method27622() != Class7739.field31349);
        }
        return true;
    }
    
    @Override
    public void method2164() {
        this.field2755.clear();
    }
    
    @Override
    public void method2401(final Class3662<?> class3662) {
        if (class3662 != null) {
            this.field2761.compute(class3662.method11298(), (p0, n) -> 1 + ((n != null) ? n : 0));
        }
    }
    
    @Nullable
    @Override
    public Class3662<?> method2402() {
        return null;
    }
    
    @Override
    public void method2403(final Class512 class512) {
    }
    
    public void method2404(final Class512 class512) {
        final ArrayList arrayList = Lists.newArrayList();
        final Iterator<Map.Entry<Class1932, Integer>> iterator = this.field2761.entrySet().iterator();
        while (iterator.hasNext()) {
            class512.field2391.method6792().method6382(((Map.Entry<Class1932, V>)iterator.next()).getKey()).ifPresent(class514 -> {
                list.add(class514);
                method2405(class513, entry.getValue(), ((Class3680)class514).method11328());
                return;
            });
        }
        class512.method2862(arrayList);
        this.field2761.clear();
    }
    
    private static void method2405(final Class512 class512, int i, final float n) {
        if (n != 0.0f) {
            if (n < 1.0f) {
                int method35642 = Class9546.method35642(i * n);
                if (method35642 < Class9546.method35649(i * n)) {
                    if (Math.random() < i * n - method35642) {
                        ++method35642;
                    }
                }
                i = method35642;
            }
        }
        else {
            i = 0;
        }
        while (i > 0) {
            final int method35643 = Class508.method2609(i);
            i -= method35643;
            class512.field2391.method6886(new Class508(class512.field2391, class512.method1938(), class512.method1941() + 0.5, class512.method1945() + 0.5, method35643));
        }
    }
    
    @Override
    public void method2259(final Class5024 class5024) {
        final Iterator<Object> iterator = this.field2755.iterator();
        while (iterator.hasNext()) {
            class5024.method15243(iterator.next());
        }
    }
    
    static {
        field2752 = new int[] { 0 };
        field2753 = new int[] { 2, 1 };
        field2754 = new int[] { 1 };
    }
}
