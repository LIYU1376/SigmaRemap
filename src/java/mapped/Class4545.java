// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;
import com.mojang.datafixers.Dynamic;
import java.util.function.Function;

public class Class4545 extends Class4535<Class5141>
{
    public Class4545(final Function<Dynamic<?>, ? extends Class5141> function) {
        super(function);
    }
    
    public boolean method13542(final Class1851 class1851, final Class6346<? extends Class7065> class1852, final Random random, Class354 class1853, final Class5141 class1854) {
        class1853 = new Class354(class1853.method1074(), class1851.method6743(), class1853.method1076());
        final boolean b = random.nextDouble() > 0.7;
        final Class7096 field22127 = class1854.field22127;
        final double n = random.nextDouble() * 2.0 * 3.141592653589793;
        final int n2 = 11 - random.nextInt(5);
        final int n3 = 3 + random.nextInt(3);
        final boolean b2 = random.nextDouble() > 0.7;
        int n4 = b2 ? (random.nextInt(6) + 6) : (random.nextInt(15) + 3);
        if (!b2) {
            if (random.nextDouble() > 0.9) {
                n4 += random.nextInt(19) + 7;
            }
        }
        final int min = Math.min(n4 + random.nextInt(11), 18);
        final int min2 = Math.min(n4 + random.nextInt(7) - random.nextInt(5), 11);
        final int n5 = b2 ? n2 : 11;
        for (int i = -n5; i < n5; ++i) {
            for (int j = -n5; j < n5; ++j) {
                for (int k = 0; k < n4; ++k) {
                    final int n6 = b2 ? this.method13552(k, n4, min2) : this.method13551(random, k, n4, min2);
                    if (b2 || i < n6) {
                        this.method13546(class1851, random, class1853, n4, i, k, j, n6, n5, b2, n3, n, b, field22127);
                    }
                }
            }
        }
        this.method13556(class1851, class1853, min2, n4, b2, n2);
        for (int l = -n5; l < n5; ++l) {
            for (int n7 = -n5; n7 < n5; ++n7) {
                for (int n8 = -1; n8 > -min; --n8) {
                    final int n9 = b2 ? Class9546.method35649(n5 * (1.0f - (float)Math.pow(n8, 2.0) / (min * 8.0f))) : n5;
                    final int method13553 = this.method13553(random, -n8, min, min2);
                    if (l < method13553) {
                        this.method13546(class1851, random, class1853, min, l, n8, n7, method13553, n9, b2, n3, n, b, field22127);
                    }
                }
            }
        }
        if (b2 ? (random.nextDouble() > 0.1) : (random.nextDouble() > 0.7)) {
            this.method13543(random, class1851, min2, n4, class1853, b2, n2, n, n3);
        }
        return true;
    }
    
    private void method13543(final Random random, final Class1851 class1851, final int n, final int n2, final Class354 class1852, final boolean b, final int n3, final double n4, final int n5) {
        final int n6 = random.nextBoolean() ? -1 : 1;
        final int n7 = random.nextBoolean() ? -1 : 1;
        int n8 = random.nextInt(Math.max(n / 2 - 2, 1));
        if (random.nextBoolean()) {
            n8 = n / 2 + 1 - random.nextInt(Math.max(n - n / 2 - 1, 1));
        }
        int nextInt = random.nextInt(Math.max(n / 2 - 2, 1));
        if (random.nextBoolean()) {
            nextInt = n / 2 + 1 - random.nextInt(Math.max(n - n / 2 - 1, 1));
        }
        if (b) {
            nextInt = (n8 = random.nextInt(Math.max(n3 - 5, 1)));
        }
        final Class354 class1853 = new Class354(n6 * n8, 0, n7 * nextInt);
        final double n9 = b ? (n4 + 1.5707963267948966) : (random.nextDouble() * 2.0 * 3.141592653589793);
        for (int i = 0; i < n2 - 3; ++i) {
            this.method13544(this.method13551(random, i, n2, n), i, class1852, class1851, false, n9, class1853, n3, n5);
        }
        for (int j = -1; j > -n2 + random.nextInt(5); --j) {
            this.method13544(this.method13553(random, -j, n2, n), j, class1852, class1851, true, n9, class1853, n3, n5);
        }
    }
    
    private void method13544(final int n, final int n2, final Class354 class354, final Class1851 class355, final boolean b, final double n3, final Class354 class356, final int n4, final int n5) {
        final int n6 = n + 1 + n4 / 3;
        final int n7 = Math.min(n - 3, 3) + n5 / 2 - 1;
        for (int i = -n6; i < n6; ++i) {
            for (int j = -n6; j < n6; ++j) {
                if (this.method13550(i, j, class356, n6, n7, n3) < 0.0) {
                    final Class354 method1134 = class354.method1134(i, n2, j);
                    final Class3833 method1135 = class355.method6701(method1134).method21696();
                    if (this.method13554(method1135) || method1135 == Class7521.field29331) {
                        if (!b) {
                            this.method13529(class355, method1134, Class7521.field29147.method11878());
                            this.method13545(class355, method1134);
                        }
                        else {
                            this.method13529(class355, method1134, Class7521.field29173.method11878());
                        }
                    }
                }
            }
        }
    }
    
    private void method13545(final Class1851 class1851, final Class354 class1852) {
        if (class1851.method6701(class1852.method1137()).method21696() == Class7521.field29329) {
            this.method13529(class1851, class1852.method1137(), Class7521.field29147.method11878());
        }
    }
    
    private void method13546(final Class1851 class1851, final Random random, final Class354 class1852, final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final boolean b, final int n7, final double n8, final boolean b2, final Class7096 class1853) {
        final double n9 = b ? this.method13550(n2, n4, Class354.field2173, n6, this.method13548(n3, n, n7), n8) : this.method13549(n2, n4, Class354.field2173, n5, random);
        if (n9 < 0.0) {
            final Class354 method1134 = class1852.method1134(n2, n3, n4);
            if (n9 > (b ? -0.5 : (-6 - random.nextInt(3))) && random.nextDouble() > 0.9) {
                return;
            }
            this.method13547(method1134, class1851, random, n - n3, n, b, b2, class1853);
        }
    }
    
    private void method13547(final Class354 class354, final Class1851 class355, final Random random, final int n, final int n2, final boolean b, final boolean b2, final Class7096 class356) {
        final Class7096 method6701 = class355.method6701(class354);
        final Class3833 method6702 = method6701.method21696();
        if (method6701.method21697() != Class8059.field33153) {
            if (method6702 != Class7521.field29331) {
                if (method6702 != Class7521.field29330) {
                    if (method6702 != Class7521.field29173) {
                        return;
                    }
                }
            }
        }
        final boolean b3 = !b || random.nextDouble() > 0.05;
        final int n3 = b ? 3 : 2;
        if (b2) {
            if (method6702 != Class7521.field29173) {
                if (n <= random.nextInt(Math.max(1, n2 / n3)) + n2 * 0.6) {
                    if (b3) {
                        this.method13529(class355, class354, Class7521.field29331.method11878());
                        return;
                    }
                }
            }
        }
        this.method13529(class355, class354, class356);
    }
    
    private int method13548(final int n, final int n2, final int n3) {
        int n4 = n3;
        if (n > 0) {
            if (n2 - n <= 3) {
                n4 = n3 - (4 - (n2 - n));
            }
        }
        return n4;
    }
    
    private double method13549(final int n, final int n2, final Class354 class354, final int n3, final Random random) {
        return 10.0f * Class9546.method35653(random.nextFloat(), 0.2f, 0.8f) / n3 + Math.pow(n - class354.method1074(), 2.0) + Math.pow(n2 - class354.method1076(), 2.0) - Math.pow(n3, 2.0);
    }
    
    private double method13550(final int n, final int n2, final Class354 class354, final int n3, final int n4, final double n5) {
        return Math.pow(((n - class354.method1074()) * Math.cos(n5) - (n2 - class354.method1076()) * Math.sin(n5)) / n3, 2.0) + Math.pow(((n - class354.method1074()) * Math.sin(n5) + (n2 - class354.method1076()) * Math.cos(n5)) / n4, 2.0) - 1.0;
    }
    
    private int method13551(final Random random, final int n, final int n2, final int n3) {
        final float n4 = 3.5f - random.nextFloat();
        float n5 = (1.0f - (float)Math.pow(n, 2.0) / (n2 * n4)) * n3;
        if (n2 > 15 + random.nextInt(5)) {
            n5 = (1.0f - ((n >= 3 + random.nextInt(6)) ? n : (n / 2)) / (n2 * n4 * 0.4f)) * n3;
        }
        return Class9546.method35649(n5 / 2.0f);
    }
    
    private int method13552(final int n, final int n2, final int n3) {
        return Class9546.method35649((1.0f - (float)Math.pow(n, 2.0) / (n2 * 1.0f)) * n3 / 2.0f);
    }
    
    private int method13553(final Random random, final int n, final int n2, final int n3) {
        return Class9546.method35649((1.0f - n / (n2 * (1.0f + random.nextFloat() / 2.0f))) * n3 / 2.0f);
    }
    
    private boolean method13554(final Class3833 class3833) {
        if (class3833 != Class7521.field29548) {
            if (class3833 != Class7521.field29331) {
                if (class3833 != Class7521.field29758) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean method13555(final Class1855 class1855, final Class354 class1856) {
        return class1855.method6701(class1856.method1139()).method21697() == Class8059.field33153;
    }
    
    private void method13556(final Class1851 class1851, final Class354 class1852, final int n, final int n2, final boolean b, final int n3) {
        for (int n4 = b ? n3 : (n / 2), i = -n4; i <= n4; ++i) {
            for (int j = -n4; j <= n4; ++j) {
                for (int k = 0; k <= n2; ++k) {
                    final Class354 method1134 = class1852.method1134(i, k, j);
                    final Class3833 method1135 = class1851.method6701(method1134).method21696();
                    if (this.method13554(method1135) || method1135 == Class7521.field29329) {
                        if (!this.method13555(class1851, method1134)) {
                            if (this.method13554(method1135)) {
                                final Class3833[] array = { class1851.method6701(method1134.method1145()).method21696(), class1851.method6701(method1134.method1147()).method21696(), class1851.method6701(method1134.method1141()).method21696(), class1851.method6701(method1134.method1143()).method21696() };
                                int n5 = 0;
                                final Class3833[] array2 = array;
                                for (int length = array2.length, l = 0; l < length; ++l) {
                                    if (!this.method13554(array2[l])) {
                                        ++n5;
                                    }
                                }
                                if (n5 >= 3) {
                                    this.method13529(class1851, method1134, Class7521.field29147.method11878());
                                }
                            }
                        }
                        else {
                            this.method13529(class1851, method1134, Class7521.field29147.method11878());
                            this.method13529(class1851, method1134.method1137(), Class7521.field29147.method11878());
                        }
                    }
                }
            }
        }
    }
}
