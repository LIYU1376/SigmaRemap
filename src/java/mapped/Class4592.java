// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Comparator;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public abstract class Class4592<T extends Class5127> extends Class4535<T>
{
    public Class4592(final Function<Dynamic<?>, ? extends T> function) {
        super(function);
    }
    
    public static boolean method13608(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, class1879 -> {
            class1879.method21696();
            final boolean b;
            if (!class1879.method21706()) {
                if (!class1879.method21755(Class7188.field27907)) {
                    final Class3833 class1880;
                    if (!Class4535.method13533(class1880)) {
                        if (!class1880.method11785(Class7188.field27893)) {
                            if (!class1880.method11785(Class7188.field27892)) {
                                if (class1880 != Class7521.field29388) {
                                    return b;
                                }
                            }
                        }
                    }
                }
            }
            return b;
        });
    }
    
    public static boolean method13609(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, Class7096::method21706);
    }
    
    public static boolean method13610(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, class1879 -> {
            class1879.method21696();
            final Class3833 class1880;
            final boolean b;
            if (!(!Class4535.method13533(class1880))) {
                if (class1880 != Class7521.field29155) {
                    if (class1880 != Class7521.field29392) {
                        return b;
                    }
                }
            }
            return b;
        });
    }
    
    public static boolean method13611(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, class1879 -> class1879.method21696() == Class7521.field29388);
    }
    
    public static boolean method13612(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, class1879 -> class1879.method21696() == Class7521.field29173);
    }
    
    public static boolean method13613(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, class1879 -> class1879.method21706() || class1879.method21755(Class7188.field27907));
    }
    
    public static boolean method13614(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, class1879 -> Class4535.method13533(class1879.method21696()));
    }
    
    public static boolean method13615(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, class1879 -> {
            class1879.method21696();
            final Class3833 class1880;
            return Class4535.method13533(class1880) || class1880 == Class7521.field29298;
        });
    }
    
    public static boolean method13616(final Class1877 class1877, final Class354 class1878) {
        return class1877.method6791(class1878, class1879 -> class1879.method21697() == Class8059.field33159);
    }
    
    public void method13617(final Class1875 class1875, final Class354 class1876) {
        if (!method13610(class1875, class1876)) {
            this.method13529(class1875, class1876, Class7521.field29156.method11878());
        }
    }
    
    public boolean method13618(final Class1875 class1875, final Random random, final Class354 class1876, final Set<Class354> set, final Class6997 class1877, final Class5127 class1878) {
        if (!method13613(class1875, class1876)) {
            if (!method13616(class1875, class1876)) {
                if (!method13612(class1875, class1876)) {
                    return false;
                }
            }
        }
        this.method13620(class1875, class1876, class1878.field22079.method1164(random, class1876), class1877);
        set.add(class1876.method1153());
        return true;
    }
    
    public boolean method13619(final Class1875 class1875, final Random random, final Class354 class1876, final Set<Class354> set, final Class6997 class1877, final Class5127 class1878) {
        if (!method13613(class1875, class1876)) {
            if (!method13616(class1875, class1876)) {
                if (!method13612(class1875, class1876)) {
                    return false;
                }
            }
        }
        this.method13620(class1875, class1876, class1878.field22080.method1164(random, class1876), class1877);
        set.add(class1876.method1153());
        return true;
    }
    
    @Override
    public void method13529(final Class1876 class1876, final Class354 class1877, final Class7096 class1878) {
        this.method13621(class1876, class1877, class1878);
    }
    
    public final void method13620(final Class1876 class1876, final Class354 class1877, final Class7096 class1878, final Class6997 class1879) {
        this.method13621(class1876, class1877, class1878);
        class1879.method21412(new Class6997(class1877, class1877));
    }
    
    private void method13621(final Class1876 class1876, final Class354 class1877, final Class7096 class1878) {
        class1876.method6688(class1877, class1878, 19);
    }
    
    public final boolean method13622(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, final Class354 class1853, final T t) {
        final HashSet hashSet = Sets.newHashSet();
        final HashSet hashSet2 = Sets.newHashSet();
        final HashSet hashSet3 = Sets.newHashSet();
        final Class6997 method21407 = Class6997.method21407();
        final boolean method21408 = this.method13624(class1851, random, class1853, hashSet, hashSet2, method21407, t);
        if (method21407.field27293 <= method21407.field27296) {
            if (method21408) {
                if (!hashSet.isEmpty()) {
                    if (!t.field22081.isEmpty()) {
                        final ArrayList arrayList = Lists.newArrayList((Iterable)hashSet);
                        final ArrayList arrayList2 = Lists.newArrayList((Iterable)hashSet2);
                        arrayList.sort(Comparator.comparingInt(Class352::method1075));
                        arrayList2.sort(Comparator.comparingInt(Class352::method1075));
                        t.field22081.forEach(class1856 -> class1856.method1241(class1854, random2, list, list2, set, class1855));
                    }
                    Class6585.method19957(class1851, 3, this.method13623(class1851, method21407, hashSet, hashSet3), method21407.field27293, method21407.field27294, method21407.field27295);
                    return true;
                }
            }
        }
        return false;
    }
    
    private Class8260 method13623(final Class1851 class1851, final Class6997 class1852, final Set<Class354> set, final Set<Class354> set2) {
        final ArrayList arrayList = Lists.newArrayList();
        final Class8259 class1853 = new Class8259(class1852.method21417(), class1852.method21418(), class1852.method21419());
        for (int i = 0; i < 6; ++i) {
            arrayList.add(Sets.newHashSet());
        }
        try (final Class386 method1296 = Class386.method1296()) {
            for (final Class354 class1854 : Lists.newArrayList((Iterable)set2)) {
                if (class1852.method21415(class1854)) {
                    class1853.method27415(class1854.method1074() - class1852.field27293, class1854.method1075() - class1852.field27294, class1854.method1076() - class1852.field27295, true, true);
                }
            }
            for (final Class354 class1855 : Lists.newArrayList((Iterable)set)) {
                if (class1852.method21415(class1855)) {
                    class1853.method27415(class1855.method1074() - class1852.field27293, class1855.method1075() - class1852.field27294, class1855.method1076() - class1852.field27295, true, true);
                }
                final Class179[] values = Class179.values();
                for (int length = values.length, j = 0; j < length; ++j) {
                    method1296.method1303(class1855).method1304(values[j]);
                    if (!set.contains(method1296)) {
                        final Class7096 method1297 = class1851.method6701(method1296);
                        if (((Class7097<Object, Object>)method1297).method21771((Class7111<Comparable>)Class8970.field37778)) {
                            ((Set)arrayList.get(0)).add(method1296.method1153());
                            this.method13621(class1851, method1296, ((Class7097<Object, Class7096>)method1297).method21773((Class7111<Comparable>)Class8970.field37778, 1));
                            if (class1852.method21415(method1296)) {
                                class1853.method27415(method1296.method1074() - class1852.field27293, method1296.method1075() - class1852.field27294, method1296.method1076() - class1852.field27295, true, true);
                            }
                        }
                    }
                }
            }
            for (int k = 1; k < 6; ++k) {
                final Set set3 = (Set)arrayList.get(k - 1);
                final Set set4 = (Set)arrayList.get(k);
                for (final Class354 class1856 : set3) {
                    if (class1852.method21415(class1856)) {
                        class1853.method27415(class1856.method1074() - class1852.field27293, class1856.method1075() - class1852.field27294, class1856.method1076() - class1852.field27295, true, true);
                    }
                    final Class179[] values2 = Class179.values();
                    for (int length2 = values2.length, l = 0; l < length2; ++l) {
                        method1296.method1303(class1856).method1304(values2[l]);
                        if (!set3.contains(method1296) && !set4.contains(method1296)) {
                            final Class7096 method1298 = class1851.method6701(method1296);
                            if (((Class7097<Object, Object>)method1298).method21771((Class7111<Comparable>)Class8970.field37778) && ((Class7097<Object, Class7096>)method1298).method21772((Class7111<Integer>)Class8970.field37778) > k + 1) {
                                this.method13621(class1851, method1296, ((Class7097<Object, Class7096>)method1298).method21773((Class7111<Comparable>)Class8970.field37778, k + 1));
                                if (class1852.method21415(method1296)) {
                                    class1853.method27415(method1296.method1074() - class1852.field27293, method1296.method1075() - class1852.field27294, method1296.method1076() - class1852.field27295, true, true);
                                }
                                set4.add(method1296.method1153());
                            }
                        }
                    }
                }
            }
        }
        return class1853;
    }
    
    public abstract boolean method13624(final Class1875 p0, final Random p1, final Class354 p2, final Set<Class354> p3, final Set<Class354> p4, final Class6997 p5, final T p6);
}
