// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;
import java.util.ArrayList;
import com.google.common.collect.Lists;
import javax.annotation.Nullable;
import java.util.Iterator;
import java.util.function.Function;
import java.util.Objects;
import java.util.stream.Stream;
import java.util.Set;
import java.util.List;
import java.util.function.Predicate;

public interface Class1874
{
    List<Class399> method6737(final Class399 p0, final Class6221 p1, final Predicate<? super Class399> p2);
    
     <T extends Class399> List<T> method6739(final Class<? extends T> p0, final Class6221 p1, final Predicate<? super T> p2);
    
    default <T extends Class399> List<T> method6740(final Class<? extends T> clazz, final Class6221 class6221, final Predicate<? super T> predicate) {
        return (List<T>)this.method6739((Class<? extends Class399>)clazz, class6221, (Predicate<? super Class399>)predicate);
    }
    
    List<? extends Class512> method6840();
    
    default List<Class399> method7127(final Class399 class399, final Class6221 class400) {
        return this.method6737(class399, class400, Class9170.field38850);
    }
    
    default boolean method6957(final Class399 class399, final Class7702 class400) {
        return class400.method24540() || this.method7127(class399, class400.method24537()).stream().filter(class402 -> {
            final boolean b;
            if (!class402.field2410) {
                if (!(!class402.field2386)) {
                    if (class401 == null || !class402.method1916(class401)) {
                        return b;
                    }
                }
            }
            return b;
        }).noneMatch(class404 -> Class7698.method24496(class403, Class7698.method24489(class404.method1886()), Class9306.field39924));
    }
    
    default <T extends Class399> List<T> method7128(final Class<? extends T> clazz, final Class6221 class6221) {
        return this.method6739(clazz, class6221, (Predicate<? super T>)Class9170.field38850);
    }
    
    default <T extends Class399> List<T> method7129(final Class<? extends T> clazz, final Class6221 class6221) {
        return this.method6740(clazz, class6221, (Predicate<? super T>)Class9170.field38850);
    }
    
    default Stream<Class7702> method6956(final Class399 class399, final Class6221 class400, final Set<Class399> set) {
        if (class400.method18507() >= 1.0E-7) {
            final Class6221 method18496 = class400.method18496(1.0E-7);
            return (Stream<Class7702>)this.method7127(class399, method18496).stream().filter(class401 -> !set2.contains(class401)).filter(class403 -> class402 == null || !class402.method1916(class403)).flatMap(class405 -> Stream.of(new Class6221[] { class405.method1702(), (class404 != null) ? class404.method1771(class405) : null })).filter(Objects::nonNull).filter((Predicate<? super Object>)method18496::method18502).map((Function<? super Object, ?>)Class7698::method24489);
        }
        return Stream.empty();
    }
    
    @Nullable
    default Class512 method7130(final double n, final double n2, final double n3, final double n4, final Predicate<Class399> predicate) {
        double n5 = -1.0;
        Class512 class512 = null;
        for (final Class512 class513 : this.method6840()) {
            if (predicate != null && !predicate.test(class513)) {
                continue;
            }
            final double method1733 = class513.method1733(n, n2, n3);
            if (n4 >= 0.0 && method1733 >= n4 * n4) {
                continue;
            }
            if (n5 != -1.0 && method1733 >= n5) {
                continue;
            }
            n5 = method1733;
            class512 = class513;
        }
        return class512;
    }
    
    @Nullable
    default Class512 method7131(final Class399 class399, final double n) {
        return this.method7132(class399.method1938(), class399.method1941(), class399.method1945(), n, false);
    }
    
    @Nullable
    default Class512 method7132(final double n, final double n2, final double n3, final double n4, final boolean b) {
        return this.method7130(n, n2, n3, n4, b ? Class9170.field38849 : Class9170.field38850);
    }
    
    @Nullable
    default Class512 method7133(final double n, final double n2, final double n3) {
        double n4 = -1.0;
        Class512 class512 = null;
        for (final Class512 class513 : this.method6840()) {
            if (!Class9170.field38850.test(class513)) {
                continue;
            }
            final double method1733 = class513.method1733(n, class513.method1941(), n2);
            if (n3 >= 0.0 && method1733 >= n3 * n3) {
                continue;
            }
            if (n4 != -1.0 && method1733 >= n4) {
                continue;
            }
            n4 = method1733;
            class512 = class513;
        }
        return class512;
    }
    
    default boolean method7134(final double n, final double n2, final double n3, final double n4) {
        for (final Class512 class512 : this.method6840()) {
            if (!Class9170.field38850.test(class512)) {
                continue;
            }
            if (!Class9170.field38846.test(class512)) {
                continue;
            }
            final double method1733 = class512.method1733(n, n2, n3);
            if (n4 >= 0.0 && method1733 >= n4 * n4) {
                continue;
            }
            return true;
        }
        return false;
    }
    
    @Nullable
    default Class512 method7135(final Class7843 class7843, final Class511 class7844) {
        return this.method7140(this.method6840(), class7843, class7844, class7844.method1938(), class7844.method1941(), class7844.method1945());
    }
    
    @Nullable
    default Class512 method7136(final Class7843 class7843, final Class511 class7844, final double n, final double n2, final double n3) {
        return this.method7140(this.method6840(), class7843, class7844, n, n2, n3);
    }
    
    @Nullable
    default Class512 method7137(final Class7843 class7843, final double n, final double n2, final double n3) {
        return this.method7140(this.method6840(), class7843, (Class511)null, n, n2, n3);
    }
    
    @Nullable
    default <T extends Class511> T method7138(final Class<? extends T> clazz, final Class7843 class7843, final Class511 class7844, final double n, final double n2, final double n3, final Class6221 class7845) {
        return this.method7140(this.method6739(clazz, class7845, (Predicate<? super T>)null), class7843, class7844, n, n2, n3);
    }
    
    @Nullable
    default <T extends Class511> T method7139(final Class<? extends T> clazz, final Class7843 class7843, final Class511 class7844, final double n, final double n2, final double n3, final Class6221 class7845) {
        return this.method7140(this.method6740(clazz, class7845, (Predicate<? super T>)null), class7843, class7844, n, n2, n3);
    }
    
    @Nullable
    default <T extends Class511> T method7140(final List<? extends T> list, final Class7843 class7843, final Class511 class7844, final double n, final double n2, final double n3) {
        double n4 = -1.0;
        Class511 class7845 = null;
        for (final Class511 class7846 : list) {
            if (!class7843.method25344(class7844, class7846)) {
                continue;
            }
            final double method1733 = class7846.method1733(n, n2, n3);
            if (n4 != -1.0 && method1733 >= n4) {
                continue;
            }
            n4 = method1733;
            class7845 = class7846;
        }
        return (T)class7845;
    }
    
    default List<Class512> method7141(final Class7843 class7843, final Class511 class7844, final Class6221 class7845) {
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class512 class7846 : this.method6840()) {
            if (!class7845.method18506(class7846.method1938(), class7846.method1941(), class7846.method1945())) {
                continue;
            }
            if (!class7843.method25344(class7844, class7846)) {
                continue;
            }
            arrayList.add(class7846);
        }
        return arrayList;
    }
    
    default <T extends Class511> List<T> method7142(final Class<? extends T> clazz, final Class7843 class7843, final Class511 class7844, final Class6221 class7845) {
        final List<Class399> method6739 = (List<Class399>)this.method6739((Class<? extends Class511>)clazz, class7845, (Predicate<? super Class511>)null);
        final ArrayList arrayList = Lists.newArrayList();
        for (final Class511 class7846 : method6739) {
            if (!class7843.method25344(class7844, class7846)) {
                continue;
            }
            arrayList.add(class7846);
        }
        return arrayList;
    }
    
    @Nullable
    default Class512 method7143(final UUID uuid) {
        for (int i = 0; i < this.method6840().size(); ++i) {
            final Class512 class512 = (Class512)this.method6840().get(i);
            if (uuid.equals(class512.method1865())) {
                return class512;
            }
        }
        return null;
    }
}
