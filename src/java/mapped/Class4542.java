// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4542 extends Class4535<Class5122>
{
    public Class4542(final Function<Dynamic<?>, ? extends Class5122> function) {
        super(function);
    }
    
    public boolean method13535(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, Class354 class1853, final Class5122 class1854) {
        while (class1851.method6961(class1853) && class1853.method1075() > 2) {
            class1853 = class1853.method1139();
        }
        if (class1851.method6701(class1853).method21696() == Class7521.field29331) {
            class1853 = class1853.method1138(random.nextInt(4));
            final int n = random.nextInt(4) + 7;
            final int n2 = n / 4 + random.nextInt(2);
            if (n2 > 1) {
                if (random.nextInt(60) == 0) {
                    class1853 = class1853.method1138(10 + random.nextInt(30));
                }
            }
            for (int i = 0; i < n; ++i) {
                final float n3 = (1.0f - i / (float)n) * n2;
                for (int method35649 = Class9546.method35649(n3), j = -method35649; j <= method35649; ++j) {
                    final float n4 = Class9546.method35648(j) - 0.25f;
                    for (int k = -method35649; k <= method35649; ++k) {
                        final float n5 = Class9546.method35648(k) - 0.25f;
                        if ((j == 0 && k == 0) || n4 * n4 + n5 * n5 <= n3 * n3) {
                            Label_0347: {
                                if (j != -method35649) {
                                    if (j != method35649) {
                                        if (k != -method35649) {
                                            if (k != method35649) {
                                                break Label_0347;
                                            }
                                        }
                                    }
                                }
                                if (random.nextFloat() > 0.75f) {
                                    continue;
                                }
                            }
                            final Class7096 method35650 = class1851.method6701(class1853.method1134(j, i, k));
                            final Class3833 method35651 = method35650.method21696();
                            Label_0447: {
                                if (!method35650.method21706()) {
                                    if (!Class4535.method13533(method35651)) {
                                        if (method35651 != Class7521.field29331) {
                                            if (method35651 != Class7521.field29330) {
                                                break Label_0447;
                                            }
                                        }
                                    }
                                }
                                this.method13529(class1851, class1853.method1134(j, i, k), Class7521.field29548.method11878());
                            }
                            if (i != 0) {
                                if (method35649 > 1) {
                                    final Class7096 method35652 = class1851.method6701(class1853.method1134(j, -i, k));
                                    final Class3833 method35653 = method35652.method21696();
                                    if (!method35652.method21706()) {
                                        if (!Class4535.method13533(method35653)) {
                                            if (method35653 != Class7521.field29331) {
                                                if (method35653 != Class7521.field29330) {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    this.method13529(class1851, class1853.method1134(j, -i, k), Class7521.field29548.method11878());
                                }
                            }
                        }
                    }
                }
            }
            int n6 = n2 - 1;
            if (n6 >= 0) {
                if (n6 > 1) {
                    n6 = 1;
                }
            }
            else {
                n6 = 0;
            }
            for (int l = -n6; l <= n6; ++l) {
                for (int a = -n6; a <= n6; ++a) {
                    Class354 class1855 = class1853.method1134(l, -1, a);
                    int n7 = 50;
                    if (Math.abs(l) == 1) {
                        if (Math.abs(a) == 1) {
                            n7 = random.nextInt(5);
                        }
                    }
                    while (class1855.method1075() > 50) {
                        final Class7096 method35654 = class1851.method6701(class1855);
                        final Class3833 method35655 = method35654.method21696();
                        if (!method35654.method21706()) {
                            if (!Class4535.method13533(method35655)) {
                                if (method35655 != Class7521.field29331) {
                                    if (method35655 != Class7521.field29330) {
                                        if (method35655 != Class7521.field29548) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        this.method13529(class1851, class1855, Class7521.field29548.method11878());
                        class1855 = class1855.method1139();
                        if (--n7 > 0) {
                            continue;
                        }
                        class1855 = class1855.method1140(random.nextInt(5) + 1);
                        n7 = random.nextInt(5);
                    }
                }
            }
            return true;
        }
        return false;
    }
}
