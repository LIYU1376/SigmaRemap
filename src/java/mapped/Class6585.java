// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Comparator;
import java.util.Optional;
import com.mojang.datafixers.util.Pair;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

public class Class6585
{
    private final List<List<Class9038>> field26124;
    private final List<Class7682> field26125;
    private Class354 field26126;
    private String field26127;
    
    public Class6585() {
        this.field26124 = Lists.newArrayList();
        this.field26125 = Lists.newArrayList();
        this.field26126 = Class354.field2173;
        this.field26127 = "?";
    }
    
    public Class354 method19945() {
        return this.field26126;
    }
    
    public void method19946(final String field26127) {
        this.field26127 = field26127;
    }
    
    public String method19947() {
        return this.field26127;
    }
    
    public void method19948(final Class1847 class1847, final Class354 class1848, final Class354 field26126, final boolean b, final Class3833 class1849) {
        if (field26126.method1074() >= 1) {
            if (field26126.method1075() >= 1) {
                if (field26126.method1076() >= 1) {
                    final Class354 method1134 = class1848.method1135(field26126).method1134(-1, -1, -1);
                    final ArrayList arrayList = Lists.newArrayList();
                    final ArrayList arrayList2 = Lists.newArrayList();
                    final ArrayList arrayList3 = Lists.newArrayList();
                    final Class354 class1850 = new Class354(Math.min(class1848.method1074(), method1134.method1074()), Math.min(class1848.method1075(), method1134.method1075()), Math.min(class1848.method1076(), method1134.method1076()));
                    final Class354 class1851 = new Class354(Math.max(class1848.method1074(), method1134.method1074()), Math.max(class1848.method1075(), method1134.method1075()), Math.max(class1848.method1076(), method1134.method1076()));
                    this.field26126 = field26126;
                    for (final Class354 class1852 : Class354.method1154(class1850, class1851)) {
                        final Class354 method1135 = class1852.method1136(class1850);
                        final Class7096 method1136 = class1847.method6701(class1852);
                        if (class1849 != null && class1849 == method1136.method21696()) {
                            continue;
                        }
                        final Class436 method1137 = class1847.method6727(class1852);
                        if (method1137 == null) {
                            if (!method1136.method21722(class1847, class1852) && !method1136.method21762(class1847, class1852)) {
                                arrayList3.add(new Class9038(method1135, method1136, null));
                            }
                            else {
                                arrayList.add(new Class9038(method1135, method1136, null));
                            }
                        }
                        else {
                            final Class51 method1138 = method1137.method2180(new Class51());
                            method1138.method330("x");
                            method1138.method330("y");
                            method1138.method330("z");
                            arrayList2.add(new Class9038(method1135, method1136, method1138));
                        }
                    }
                    final ArrayList arrayList4 = Lists.newArrayList();
                    arrayList4.addAll(arrayList);
                    arrayList4.addAll(arrayList2);
                    arrayList4.addAll(arrayList3);
                    this.field26124.clear();
                    this.field26124.add(arrayList4);
                    if (!b) {
                        this.field26125.clear();
                    }
                    else {
                        this.method19949(class1847, class1850, class1851.method1134(1, 1, 1));
                    }
                }
            }
        }
    }
    
    private void method19949(final Class1847 class1847, final Class354 class1848, final Class354 class1849) {
        final List<Class399> method6739 = class1847.method6739((Class<? extends Class399>)Class399.class, new Class6221(class1848, class1849), class1853 -> !(class1853 instanceof Class512));
        this.field26125.clear();
        for (final Class399 class1850 : method6739) {
            final Class5487 class1851 = new Class5487(class1850.method1938() - class1848.method1074(), class1850.method1941() - class1848.method1075(), class1850.method1945() - class1848.method1076());
            final Class51 class1852 = new Class51();
            class1850.method1755(class1852);
            Class354 method6740;
            if (!(class1850 instanceof Class861)) {
                method6740 = new Class354(class1851);
            }
            else {
                method6740 = ((Class861)class1850).method5194().method1136(class1848);
            }
            this.field26125.add(new Class7682(class1851, method6740, class1852));
        }
    }
    
    public List<Class9038> method19950(final Class354 class354, final Class9092 class355, final Class3833 class356) {
        return this.method19951(class354, class355, class356, true);
    }
    
    public List<Class9038> method19951(final Class354 class354, final Class9092 class355, final Class3833 class356, final boolean b) {
        final ArrayList arrayList = Lists.newArrayList();
        final Class6997 method32860 = class355.method32860();
        for (final Class9038 class357 : class355.method32865(this.field26124, class354)) {
            final Class354 class358 = b ? method19953(class355, class357.field38248).method1135(class354) : class357.field38248;
            if (method32860 != null && !method32860.method21415(class358)) {
                continue;
            }
            final Class7096 field38249 = class357.field38249;
            if (field38249.method21696() != class356) {
                continue;
            }
            arrayList.add(new Class9038(class358, field38249.method21708(class355.method32856()), class357.field38250));
        }
        return arrayList;
    }
    
    public Class354 method19952(final Class9092 class9092, final Class354 class9093, final Class9092 class9094, final Class354 class9095) {
        return method19953(class9092, class9093).method1136(method19953(class9094, class9095));
    }
    
    public static Class354 method19953(final Class9092 class9092, final Class354 class9093) {
        return method19962(class9093, class9092.method32855(), class9092.method32856(), class9092.method32857());
    }
    
    public void method19954(final Class1851 class1851, final Class354 class1852, final Class9092 class1853) {
        class1853.method32863();
        this.method19955(class1851, class1852, class1853);
    }
    
    public void method19955(final Class1851 class1851, final Class354 class1852, final Class9092 class1853) {
        this.method19956(class1851, class1852, class1853, 2);
    }
    
    public boolean method19956(final Class1851 class1851, final Class354 class1852, final Class9092 class1853, final int n) {
        if (!this.field26124.isEmpty()) {
            final List<Class9038> method32865 = class1853.method32865(this.field26124, class1852);
            if (method32865.isEmpty()) {
                if (class1853.method32859()) {
                    return false;
                }
                if (this.field26125.isEmpty()) {
                    return false;
                }
            }
            if (this.field26126.method1074() >= 1) {
                if (this.field26126.method1075() >= 1) {
                    if (this.field26126.method1076() >= 1) {
                        final Class6997 method32866 = class1853.method32860();
                        final ArrayList arrayListWithCapacity = Lists.newArrayListWithCapacity(class1853.method32864() ? method32865.size() : 0);
                        final ArrayList arrayListWithCapacity2 = Lists.newArrayListWithCapacity(method32865.size());
                        int min = Integer.MAX_VALUE;
                        int min2 = Integer.MAX_VALUE;
                        int min3 = Integer.MAX_VALUE;
                        int max = Integer.MIN_VALUE;
                        int max2 = Integer.MIN_VALUE;
                        int max3 = Integer.MIN_VALUE;
                        for (final Class9038 class1854 : method19958(class1851, class1852, class1853, method32865)) {
                            final Class354 field38248 = class1854.field38248;
                            if (method32866 != null && !method32866.method21415(field38248)) {
                                continue;
                            }
                            final Class7099 class1855 = class1853.method32864() ? class1851.method6702(field38248) : null;
                            final Class7096 method32867 = class1854.field38249.method21709(class1853.method32855()).method21708(class1853.method32856());
                            if (class1854.field38250 != null) {
                                Class447.method2267(class1851.method6727(field38248));
                                class1851.method6688(field38248, Class7521.field29517.method11878(), 20);
                            }
                            if (!class1851.method6688(field38248, method32867, n)) {
                                continue;
                            }
                            min = Math.min(min, field38248.method1074());
                            min2 = Math.min(min2, field38248.method1075());
                            min3 = Math.min(min3, field38248.method1076());
                            max = Math.max(max, field38248.method1074());
                            max2 = Math.max(max2, field38248.method1075());
                            max3 = Math.max(max3, field38248.method1076());
                            arrayListWithCapacity2.add(Pair.of((Object)field38248, (Object)class1854.field38250));
                            if (class1854.field38250 != null) {
                                final Class436 method32868 = class1851.method6727(field38248);
                                if (method32868 != null) {
                                    class1854.field38250.method298("x", field38248.method1074());
                                    class1854.field38250.method298("y", field38248.method1075());
                                    class1854.field38250.method298("z", field38248.method1076());
                                    method32868.method2179(class1854.field38250);
                                    method32868.method2205(class1853.method32855());
                                    method32868.method2204(class1853.method32856());
                                }
                            }
                            if (class1855 == null) {
                                continue;
                            }
                            if (!(method32867.method21696() instanceof Class3867)) {
                                continue;
                            }
                            ((Class3867)method32867.method21696()).method11921(class1851, field38248, method32867, class1855);
                            if (class1855.method21780()) {
                                continue;
                            }
                            arrayListWithCapacity.add(field38248);
                        }
                        int n2 = 1;
                        final Class179[] array = { Class179.field512, Class179.field513, Class179.field516, Class179.field514, Class179.field515 };
                        while (n2 != 0 && !arrayListWithCapacity.isEmpty()) {
                            n2 = 0;
                            final Iterator iterator2 = arrayListWithCapacity.iterator();
                            while (iterator2.hasNext()) {
                                Class354 class1857;
                                final Class354 class1856 = class1857 = (Class354)iterator2.next();
                                Class7099 method32869 = class1851.method6702(class1856);
                                for (int n3 = 0; n3 < array.length && !method32869.method21780(); ++n3) {
                                    final Class354 method32870 = class1857.method1149(array[n3]);
                                    final Class7099 method32871 = class1851.method6702(method32870);
                                    if (method32871.method21782(class1851, method32870) <= method32869.method21782(class1851, class1857)) {
                                        if (!method32871.method21780()) {
                                            continue;
                                        }
                                        if (method32869.method21780()) {
                                            continue;
                                        }
                                    }
                                    method32869 = method32871;
                                    class1857 = method32870;
                                }
                                if (!method32869.method21780()) {
                                    continue;
                                }
                                final Class7096 method32872 = class1851.method6701(class1856);
                                final Class3833 method32873 = method32872.method21696();
                                if (!(method32873 instanceof Class3867)) {
                                    continue;
                                }
                                ((Class3867)method32873).method11921(class1851, class1856, method32872, method32869);
                                n2 = 1;
                                iterator2.remove();
                            }
                        }
                        if (min <= max) {
                            if (!class1853.method32861()) {
                                final Class8259 class1858 = new Class8259(max - min + 1, max2 - min2 + 1, max3 - min3 + 1);
                                final int n4 = min;
                                final int n5 = min2;
                                final int n6 = min3;
                                final Iterator iterator3 = arrayListWithCapacity2.iterator();
                                while (iterator3.hasNext()) {
                                    final Class354 class1859 = (Class354)((Pair)iterator3.next()).getFirst();
                                    class1858.method27415(class1859.method1074() - n4, class1859.method1075() - n5, class1859.method1076() - n6, true, true);
                                }
                                method19957(class1851, n, class1858, n4, n5, n6);
                            }
                            for (final Pair pair : arrayListWithCapacity2) {
                                final Class354 class1860 = (Class354)pair.getFirst();
                                if (!class1853.method32861()) {
                                    final Class7096 method32874 = class1851.method6701(class1860);
                                    final Class7096 method32875 = Class3833.method11786(method32874, class1851, class1860);
                                    if (method32874 != method32875) {
                                        class1851.method6688(class1860, method32875, (n & 0xFFFFFFFE) | 0x10);
                                    }
                                    class1851.method6694(class1860, method32875.method21696());
                                }
                                if (pair.getSecond() == null) {
                                    continue;
                                }
                                final Class436 method32876 = class1851.method6727(class1860);
                                if (method32876 == null) {
                                    continue;
                                }
                                method32876.method2161();
                            }
                        }
                        if (!class1853.method32859()) {
                            this.method19959(class1851, class1852, class1853.method32855(), class1853.method32856(), class1853.method32857(), method32866);
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    public static void method19957(final Class1851 class1851, final int n, final Class8260 class1852, final int n2, final int n3, final int n4) {
        class1852.method27438((class1852, n5, n6, n7) -> {
            final Class354 class1853 = new Class354(n2 + n5, n3 + n6, n4 + n7);
            final Class354 method1149 = class1853.method1149(class1852);
            final Class7096 method1150 = class1851.method6701(class1853);
            final Class7096 method1151 = class1851.method6701(method1149);
            final Class7096 method1152 = method1150.method21748(class1852, method1151, class1851, class1853, method1149);
            if (method1150 != method1152) {
                class1851.method6688(class1853, method1152, (n & 0xFFFFFFFE) | 0x10);
            }
            final Class7096 method1153 = method1151.method21748(class1852.method782(), method1152, class1851, method1149, class1853);
            if (method1151 != method1153) {
                class1851.method6688(method1149, method1153, (n & 0xFFFFFFFE) | 0x10);
            }
        });
    }
    
    public static List<Class9038> method19958(final Class1851 class1851, final Class354 class1852, final Class9092 class1853, final List<Class9038> list) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class9038 class1854 : list) {
            Class9038 method12350 = new Class9038(method19953(class1853, class1854.field38248).method1135(class1852), class1854.field38249, class1854.field38250);
            for (Iterator<Class4107> iterator2 = class1853.method32862().iterator(); method12350 != null && iterator2.hasNext(); method12350 = iterator2.next().method12350(class1851, class1852, class1854, method12350, class1853)) {}
            if (method12350 == null) {
                continue;
            }
            arrayList.add(method12350);
        }
        return arrayList;
    }
    
    private void method19959(final Class1851 class1851, final Class354 class1852, final Class2181 class1853, final Class2052 class1854, final Class354 class1855, final Class6997 class1856) {
        for (final Class7682 class1857 : this.field26125) {
            final Class354 method1135 = method19962(class1857.field30511, class1853, class1854, class1855).method1135(class1852);
            if (class1856 != null && !class1856.method21415(method1135)) {
                continue;
            }
            final Class51 field30512 = class1857.field30512;
            final Class5487 method1136 = method19963(class1857.field30510, class1853, class1854, class1855).method16744(class1852.method1074(), class1852.method1075(), class1852.method1076());
            final Class52 class1858 = new Class52();
            ((AbstractList<Class44>)class1858).add(Class44.method277(method1136.field22770));
            ((AbstractList<Class44>)class1858).add(Class44.method277(method1136.field22771));
            ((AbstractList<Class44>)class1858).add(Class44.method277(method1136.field22772));
            field30512.method295("Pos", class1858);
            field30512.method330("UUIDMost");
            field30512.method330("UUIDLeast");
            method19960(class1851, field30512).ifPresent(class1863 -> {
                class1863.method1730(class1861.field22770, class1861.field22771, class1861.field22772, class1863.method1904(class1859) + (class1863.field2399 - class1863.method1903(class1860)), class1863.field2400);
                class1862.method6886(class1863);
            });
        }
    }
    
    private static Optional<Class399> method19960(final Class1851 class1851, final Class51 class1852) {
        try {
            return Class7499.method23373(class1852, class1851.method6744());
        }
        catch (final Exception ex) {
            return Optional.empty();
        }
    }
    
    public Class354 method19961(final Class2052 class2052) {
        switch (Class9249.field39662[class2052.ordinal()]) {
            case 1:
            case 2: {
                return new Class354(this.field26126.method1076(), this.field26126.method1075(), this.field26126.method1074());
            }
            default: {
                return this.field26126;
            }
        }
    }
    
    public static Class354 method19962(final Class354 class354, final Class2181 class355, final Class2052 class356, final Class354 class357) {
        int method1074 = class354.method1074();
        final int method1075 = class354.method1075();
        int method1076 = class354.method1076();
        boolean b = true;
        switch (Class9249.field39663[class355.ordinal()]) {
            case 1: {
                method1076 = -method1076;
                break;
            }
            case 2: {
                method1074 = -method1074;
                break;
            }
            default: {
                b = false;
                break;
            }
        }
        final int method1077 = class357.method1074();
        final int method1078 = class357.method1076();
        switch (Class9249.field39662[class356.ordinal()]) {
            case 1: {
                return new Class354(method1077 - method1078 + method1076, method1075, method1077 + method1078 - method1074);
            }
            case 2: {
                return new Class354(method1077 + method1078 - method1076, method1075, method1078 - method1077 + method1074);
            }
            case 3: {
                return new Class354(method1077 + method1077 - method1074, method1075, method1078 + method1078 - method1076);
            }
            default: {
                return b ? new Class354(method1074, method1075, method1076) : class354;
            }
        }
    }
    
    private static Class5487 method19963(final Class5487 class5487, final Class2181 class5488, final Class2052 class5489, final Class354 class5490) {
        double field22770 = class5487.field22770;
        final double field22771 = class5487.field22771;
        double field22772 = class5487.field22772;
        boolean b = true;
        switch (Class9249.field39663[class5488.ordinal()]) {
            case 1: {
                field22772 = 1.0 - field22772;
                break;
            }
            case 2: {
                field22770 = 1.0 - field22770;
                break;
            }
            default: {
                b = false;
                break;
            }
        }
        final int method1074 = class5490.method1074();
        final int method1075 = class5490.method1076();
        switch (Class9249.field39662[class5489.ordinal()]) {
            case 1: {
                return new Class5487(method1074 - method1075 + field22772, field22771, method1074 + method1075 + 1 - field22770);
            }
            case 2: {
                return new Class5487(method1074 + method1075 + 1 - field22772, field22771, method1075 - method1074 + field22770);
            }
            case 3: {
                return new Class5487(method1074 + method1074 + 1 - field22770, field22771, method1075 + method1075 + 1 - field22772);
            }
            default: {
                return b ? new Class5487(field22770, field22771, field22772) : class5487;
            }
        }
    }
    
    public Class354 method19964(final Class354 class354, final Class2181 class355, final Class2052 class356) {
        return method19965(class354, class355, class356, this.method19945().method1074(), this.method19945().method1076());
    }
    
    public static Class354 method19965(final Class354 class354, final Class2181 class355, final Class2052 class356, int n, int n2) {
        --n;
        --n2;
        final int n3 = (class355 == Class2181.field12919) ? n : 0;
        final int n4 = (class355 == Class2181.field12918) ? n2 : 0;
        Class354 class357 = class354;
        switch (Class9249.field39662[class356.ordinal()]) {
            case 1: {
                class357 = class354.method1134(n4, 0, n - n3);
                break;
            }
            case 2: {
                class357 = class354.method1134(n2 - n4, 0, n3);
                break;
            }
            case 3: {
                class357 = class354.method1134(n - n3, 0, n2 - n4);
                break;
            }
            case 4: {
                class357 = class354.method1134(n3, 0, n4);
                break;
            }
        }
        return class357;
    }
    
    public Class6997 method19966(final Class9092 class9092, final Class354 class9093) {
        final Class2052 method32856 = class9092.method32856();
        final Class354 method32857 = class9092.method32857();
        final Class354 method32858 = this.method19961(method32856);
        final Class2181 method32859 = class9092.method32855();
        final int method32860 = method32857.method1074();
        final int method32861 = method32857.method1076();
        final int n = method32858.method1074() - 1;
        final int n2 = method32858.method1075() - 1;
        final int n3 = method32858.method1076() - 1;
        Class6997 class9094 = new Class6997(0, 0, 0, 0, 0, 0);
        switch (Class9249.field39662[method32856.ordinal()]) {
            case 1: {
                class9094 = new Class6997(method32860 - method32861, 0, method32860 + method32861 - n3, method32860 - method32861 + n, n2, method32860 + method32861);
                break;
            }
            case 2: {
                class9094 = new Class6997(method32860 + method32861 - n, 0, method32861 - method32860, method32860 + method32861, n2, method32861 - method32860 + n3);
                break;
            }
            case 3: {
                class9094 = new Class6997(method32860 + method32860 - n, 0, method32861 + method32861 - n3, method32860 + method32860, n2, method32861 + method32861);
                break;
            }
            case 4: {
                class9094 = new Class6997(0, 0, 0, n, n2, n3);
                break;
            }
        }
        switch (Class9249.field39663[method32859.ordinal()]) {
            case 1: {
                this.method19967(method32856, n3, n, class9094, Class179.field513, Class179.field514);
                break;
            }
            case 2: {
                this.method19967(method32856, n, n3, class9094, Class179.field515, Class179.field516);
                break;
            }
        }
        class9094.method21413(class9093.method1074(), class9093.method1075(), class9093.method1076());
        return class9094;
    }
    
    private void method19967(final Class2052 class2052, final int n, final int n2, final Class6997 class2053, final Class179 class2054, final Class179 class2055) {
        final Class354 field2173 = Class354.field2173;
        Class354 class2056;
        if (class2052 != Class2052.field11708 && class2052 != Class2052.field11710) {
            if (class2052 != Class2052.field11709) {
                class2056 = field2173.method1150(class2054, n);
            }
            else {
                class2056 = field2173.method1150(class2055, n);
            }
        }
        else {
            class2056 = field2173.method1150(class2052.method8142(class2054), n2);
        }
        class2053.method21413(class2056.method1074(), 0, class2056.method1076());
    }
    
    public Class51 method19968(final Class51 class51) {
        if (!this.field26124.isEmpty()) {
            final ArrayList arrayList = Lists.newArrayList();
            final Class2249 class52 = new Class2249(null);
            arrayList.add(class52);
            for (int i = 1; i < this.field26124.size(); ++i) {
                arrayList.add(new Class2249(null));
            }
            final Class52 class53 = new Class52();
            final List list = this.field26124.get(0);
            for (int j = 0; j < list.size(); ++j) {
                final Class9038 class54 = (Class9038)list.get(j);
                final Class51 e = new Class51();
                e.method295("pos", this.method19971(class54.field38248.method1074(), class54.field38248.method1075(), class54.field38248.method1076()));
                final int method8452 = class52.method8452(class54.field38249);
                e.method298("state", method8452);
                if (class54.field38250 != null) {
                    e.method295("nbt", class54.field38250);
                }
                ((AbstractList<Class51>)class53).add(e);
                for (int k = 1; k < this.field26124.size(); ++k) {
                    ((Class2249)arrayList.get(k)).method8454(this.field26124.get(k).get(j).field38249, method8452);
                }
            }
            class51.method295("blocks", class53);
            if (arrayList.size() != 1) {
                final Class52 class55 = new Class52();
                for (final Class2249 class56 : arrayList) {
                    final Class52 e2 = new Class52();
                    final Iterator<Class7096> iterator2 = class56.iterator();
                    while (iterator2.hasNext()) {
                        ((AbstractList<Class51>)e2).add(Class9346.method34649(iterator2.next()));
                    }
                    ((AbstractList<Class52>)class55).add(e2);
                }
                class51.method295("palettes", class55);
            }
            else {
                final Class52 class57 = new Class52();
                final Iterator<Class7096> iterator3 = class52.iterator();
                while (iterator3.hasNext()) {
                    ((AbstractList<Class51>)class57).add(Class9346.method34649(iterator3.next()));
                }
                class51.method295("palette", class57);
            }
        }
        else {
            class51.method295("blocks", new Class52());
            class51.method295("palette", new Class52());
        }
        final Class52 class58 = new Class52();
        for (final Class7682 class59 : this.field26125) {
            final Class51 e3 = new Class51();
            e3.method295("pos", this.method19972(class59.field30510.field22770, class59.field30510.field22771, class59.field30510.field22772));
            e3.method295("blockPos", this.method19971(class59.field30511.method1074(), class59.field30511.method1075(), class59.field30511.method1076()));
            if (class59.field30512 != null) {
                e3.method295("nbt", class59.field30512);
            }
            ((AbstractList<Class51>)class58).add(e3);
        }
        class51.method295("entities", class58);
        class51.method295("size", this.method19971(this.field26126.method1074(), this.field26126.method1075(), this.field26126.method1076()));
        class51.method298("DataVersion", Class9528.method35579().getWorldVersion());
        return class51;
    }
    
    public void method19969(final Class51 class51) {
        this.field26124.clear();
        this.field26125.clear();
        final Class52 method328 = class51.method328("size", 3);
        this.field26126 = new Class354(method328.method349(0), method328.method349(1), method328.method349(2));
        final Class52 method329 = class51.method328("blocks", 10);
        if (!class51.method316("palettes", 9)) {
            this.method19970(class51.method328("palette", 10), method329);
        }
        else {
            final Class52 method330 = class51.method328("palettes", 9);
            for (int i = 0; i < method330.size(); ++i) {
                this.method19970(method330.method347(i), method329);
            }
        }
        final Class52 method331 = class51.method328("entities", 10);
        for (int j = 0; j < method331.size(); ++j) {
            final Class51 method332 = method331.method346(j);
            final Class52 method333 = method332.method328("pos", 6);
            final Class5487 class52 = new Class5487(method333.method351(0), method333.method351(1), method333.method351(2));
            final Class52 method334 = method332.method328("blockPos", 3);
            final Class354 class53 = new Class354(method334.method349(0), method334.method349(1), method334.method349(2));
            if (method332.method315("nbt")) {
                this.field26125.add(new Class7682(class52, class53, method332.method327("nbt")));
            }
        }
    }
    
    private void method19970(final Class52 class52, final Class52 class53) {
        final Class2249 class54 = new Class2249(null);
        final ArrayList arrayList = Lists.newArrayList();
        for (int i = 0; i < class52.size(); ++i) {
            class54.method8454(Class9346.method34647(class52.method346(i)), i);
        }
        for (int j = 0; j < class53.size(); ++j) {
            final Class51 method346 = class53.method346(j);
            final Class52 method347 = method346.method328("pos", 3);
            final Class354 class55 = new Class354(method347.method349(0), method347.method349(1), method347.method349(2));
            final Class7096 method348 = class54.method8453(method346.method319("state"));
            Class51 method349;
            if (!method346.method315("nbt")) {
                method349 = null;
            }
            else {
                method349 = method346.method327("nbt");
            }
            arrayList.add(new Class9038(class55, method348, method349));
        }
        arrayList.sort(Comparator.comparingInt(class56 -> class56.field38248.method1075()));
        this.field26124.add(arrayList);
    }
    
    private Class52 method19971(final int... array) {
        final Class52 class52 = new Class52();
        for (int length = array.length, i = 0; i < length; ++i) {
            ((AbstractList<Class45>)class52).add(Class45.method279(array[i]));
        }
        return class52;
    }
    
    private Class52 method19972(final double... array) {
        final Class52 class52 = new Class52();
        for (int length = array.length, i = 0; i < length; ++i) {
            ((AbstractList<Class44>)class52).add(Class44.method277(array[i]));
        }
        return class52;
    }
}
