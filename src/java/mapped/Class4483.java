// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import java.util.List;

public class Class4483 extends Class4479
{
    private final Class179 field19876;
    private final boolean field19877;
    
    public Class4483(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40944, class1796);
        this.field19877 = class1796.method329("tf");
        this.field19876 = Class179.method793(class1796.method319("D"));
    }
    
    @Override
    public void method13415(final Class51 class51) {
        super.method13415(class51);
        class51.method312("tf", this.field19877);
        class51.method298("D", this.field19876.method780());
    }
    
    public Class4483(final int n, final Class6997 field19849, final Class179 field19850, final Class1964 class1964) {
        super(Class9520.field40944, n, class1964);
        this.field19876 = field19850;
        this.field19849 = field19849;
        this.field19877 = (field19849.method21418() > 3);
    }
    
    public static Class6997 method13469(final List<Class4473> list, final Random random, final int n, final int n2, final int n3, final Class179 class179) {
        final Class6997 class180 = new Class6997(n, n2, n3, n, n2 + 3 - 1, n3);
        if (random.nextInt(4) == 0) {
            final Class6997 class181 = class180;
            class181.field27297 += 4;
        }
        switch (Class8427.field34587[class179.ordinal()]) {
            default: {
                class180.field27293 = n - 1;
                class180.field27296 = n + 3;
                class180.field27295 = n3 - 4;
                break;
            }
            case 2: {
                class180.field27293 = n - 1;
                class180.field27296 = n + 3;
                class180.field27298 = n3 + 3 + 1;
                break;
            }
            case 3: {
                class180.field27293 = n - 4;
                class180.field27295 = n3 - 1;
                class180.field27298 = n3 + 3;
                break;
            }
            case 4: {
                class180.field27296 = n + 3 + 1;
                class180.field27295 = n3 - 1;
                class180.field27298 = n3 + 3;
                break;
            }
        }
        return (Class4473.method13435(list, class180) != null) ? null : class180;
    }
    
    @Override
    public void method13431(final Class4473 class4473, final List<Class4473> list, final Random random) {
        final int method13433 = this.method13433();
        switch (Class8427.field34587[this.field19876.ordinal()]) {
            default: {
                Class9191.method33629(class4473, list, random, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27295 - 1, Class179.field513, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294, this.field19849.field27295 + 1, Class179.field515, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294, this.field19849.field27295 + 1, Class179.field516, method13433);
                break;
            }
            case 2: {
                Class9191.method33629(class4473, list, random, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27298 + 1, Class179.field514, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294, this.field19849.field27295 + 1, Class179.field515, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294, this.field19849.field27295 + 1, Class179.field516, method13433);
                break;
            }
            case 3: {
                Class9191.method33629(class4473, list, random, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27295 - 1, Class179.field513, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27298 + 1, Class179.field514, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294, this.field19849.field27295 + 1, Class179.field515, method13433);
                break;
            }
            case 4: {
                Class9191.method33629(class4473, list, random, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27295 - 1, Class179.field513, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27298 + 1, Class179.field514, method13433);
                Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294, this.field19849.field27295 + 1, Class179.field516, method13433);
                break;
            }
        }
        if (this.field19877) {
            if (random.nextBoolean()) {
                Class9191.method33629(class4473, list, random, this.field19849.field27293 + 1, this.field19849.field27294 + 3 + 1, this.field19849.field27295 - 1, Class179.field513, method13433);
            }
            if (random.nextBoolean()) {
                Class9191.method33629(class4473, list, random, this.field19849.field27293 - 1, this.field19849.field27294 + 3 + 1, this.field19849.field27295 + 1, Class179.field515, method13433);
            }
            if (random.nextBoolean()) {
                Class9191.method33629(class4473, list, random, this.field19849.field27296 + 1, this.field19849.field27294 + 3 + 1, this.field19849.field27295 + 1, Class179.field516, method13433);
            }
            if (random.nextBoolean()) {
                Class9191.method33629(class4473, list, random, this.field19849.field27293 + 1, this.field19849.field27294 + 3 + 1, this.field19849.field27298 + 1, Class179.field514, method13433);
            }
        }
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        if (!this.method13436(class1851, class1853)) {
            final Class7096 method13462 = this.method13462();
            if (!this.field19877) {
                this.method13444(class1851, class1853, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27295, this.field19849.field27296 - 1, this.field19849.field27297, this.field19849.field27298, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.field27293, this.field19849.field27294, this.field19849.field27295 + 1, this.field19849.field27296, this.field19849.field27297, this.field19849.field27298 - 1, Class4483.field19848, Class4483.field19848, false);
            }
            else {
                this.method13444(class1851, class1853, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27295, this.field19849.field27296 - 1, this.field19849.field27294 + 3 - 1, this.field19849.field27298, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.field27293, this.field19849.field27294, this.field19849.field27295 + 1, this.field19849.field27296, this.field19849.field27294 + 3 - 1, this.field19849.field27298 - 1, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.field27293 + 1, this.field19849.field27297 - 2, this.field19849.field27295, this.field19849.field27296 - 1, this.field19849.field27297, this.field19849.field27298, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.field27293, this.field19849.field27297 - 2, this.field19849.field27295 + 1, this.field19849.field27296, this.field19849.field27297, this.field19849.field27298 - 1, Class4483.field19848, Class4483.field19848, false);
                this.method13444(class1851, class1853, this.field19849.field27293 + 1, this.field19849.field27294 + 3, this.field19849.field27295 + 1, this.field19849.field27296 - 1, this.field19849.field27294 + 3, this.field19849.field27298 - 1, Class4483.field19848, Class4483.field19848, false);
            }
            this.method13470(class1851, class1853, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27295 + 1, this.field19849.field27297);
            this.method13470(class1851, class1853, this.field19849.field27293 + 1, this.field19849.field27294, this.field19849.field27298 - 1, this.field19849.field27297);
            this.method13470(class1851, class1853, this.field19849.field27296 - 1, this.field19849.field27294, this.field19849.field27295 + 1, this.field19849.field27297);
            this.method13470(class1851, class1853, this.field19849.field27296 - 1, this.field19849.field27294, this.field19849.field27298 - 1, this.field19849.field27297);
            for (int i = this.field19849.field27293; i <= this.field19849.field27296; ++i) {
                for (int j = this.field19849.field27295; j <= this.field19849.field27298; ++j) {
                    if (this.method13441(class1851, i, this.field19849.field27294 - 1, j, class1853).method21706()) {
                        if (this.method13442(class1851, i, this.field19849.field27294 - 1, j, class1853)) {
                            this.method13440(class1851, method13462, i, this.field19849.field27294 - 1, j, class1853);
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
    
    private void method13470(final Class1851 class1851, final Class6997 class1852, final int n, final int n2, final int n3, final int n4) {
        if (!this.method13441(class1851, n, n4 + 1, n3, class1852).method21706()) {
            this.method13444(class1851, class1852, n, n2, n3, n, n4, n3, this.method13462(), Class4483.field19848, false);
        }
    }
}
