// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Date;

public class Class8845
{
    private static String[] field37173;
    private static final Class869 field37174;
    public static float field37175;
    public static float field37176;
    public static long field37177;
    
    public static float method30910(final float n, final float n2, final float n3) {
        float method35668 = Class9546.method35668(n2 - n);
        if (method35668 > n3) {
            method35668 = n3;
        }
        if (method35668 < -n3) {
            method35668 = -n3;
        }
        return n + method35668;
    }
    
    public static float[] method30911(final Class511 class511, final double n, final double n2, final double n3) {
        final double[] method33307 = Class9134.method33307(class511);
        final double x = method33307[0] - n;
        final double y = class511.field2396 - Class8845.field37174.field4684.method1892() - 0.019999999552965164 + class511.method1892() - n2;
        final double y2 = method33307[2] - n3;
        return new float[] { method30910(Class8845.field37174.field4684.field2399, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f), method30910(Class8845.field37174.field4684.field2400, (float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)), 360.0f) };
    }
    
    public static float[] method30912(final Class399 class399) {
        return method30913(class399, Class8845.field37174.field4684.field2395 + (Class8845.field37174.field4684.field2395 - Class8845.field37174.field4684.field2417) * Class8845.field37174.method5314(), Class8845.field37174.field4684.field2396 + (Class8845.field37174.field4684.field2396 - Class8845.field37174.field4684.field2418) * Class8845.field37174.method5314(), Class8845.field37174.field4684.field2397 + (Class8845.field37174.field4684.field2397 - Class8845.field37174.field4684.field2419) * Class8845.field37174.method5314());
    }
    
    public static float[] method30913(final Class399 class399, final double n, final double n2, final double n3) {
        final double n4 = class399.field2395 + (class399.field2395 - class399.field2417) * Class8845.field37174.method5314();
        final double n5 = class399.field2397 + (class399.field2397 - class399.field2419) * Class8845.field37174.method5314();
        final double n6 = class399.field2396 + (class399.field2396 - class399.field2418) * Class8845.field37174.method5314();
        final double x = n4 - n;
        final double y = n6 - Class8845.field37174.field4684.method1892() - 0.019999999552965164 + class399.method1892() - n2;
        final double y2 = n5 - n3;
        return new float[] { method30910(Class8845.field37174.field4684.field2399, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f), method30910(Class8845.field37174.field4684.field2400, (float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)), 360.0f) };
    }
    
    public static float[] method30914(final Class511 class511, final double n, final double n2, final double n3) {
        final double x = class511.field2395 - n + 0.25 - Math.random() * 0.5;
        final double y = class511.field2396 - Class8845.field37174.field4684.method1892() - 0.019999999552965164 + class511.method1892() - n2 - Math.random();
        final double y2 = class511.field2397 - n3 + 0.25 - Math.random() * 0.5;
        return new float[] { method30910(Class8845.field37174.field4684.field2399, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f), method30910(Class8845.field37174.field4684.field2400, (float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)), 360.0f) };
    }
    
    public static float[] method30915(final Class511 class511, final double n, final double n2, final double n3) {
        final double n4 = Math.sin((System.currentTimeMillis() - 500L) / 521.0) * 0.2;
        final double n5 = Math.sin(System.currentTimeMillis() / 300.0) * 0.65;
        final double n6 = Math.cos((System.currentTimeMillis() - 150.0) / 705.0) * 0.2;
        final double x = class511.field2395 - n + n4;
        final double y = class511.field2396 - n2 - Class8845.field37174.field4684.method1892() + class511.method1892() - 0.019999999552965164 - 0.6000000238418579 - n5;
        final double y2 = class511.field2397 - n3 + n6;
        return new float[] { method30910(Class8845.field37174.field4684.field2399, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f), method30910(Class8845.field37174.field4684.field2400, (float)(-(Math.atan2(y, Class9546.method35641(x * x + y2 * y2)) * 180.0 / 3.141592653589793)), 360.0f) };
    }
    
    public static float[] method30916(final Class511 class511, final double n, final double n2, final double n3, final float n4) {
        if (Class6430.method19141(Class8845.field37175, Class8845.field37176, n4, 0.0) != null) {
            Class8845.field37177 = new Date().getTime();
            return new float[] { Class8845.field37175, Class8845.field37176 };
        }
        if (Class8845.field37177 <= new Date().getTime() - 500L) {
            final double n5 = Math.sin((System.currentTimeMillis() - 500L) / 521.0) * 0.2;
            final double n6 = Math.sin(System.currentTimeMillis() / 421.0) * 0.65;
            final double n7 = Math.cos((System.currentTimeMillis() - 150.0) / 7051.0) * 0.2;
            final double x = class511.field2395 - n + n5;
            final double y = class511.field2396 - n2 - Class8845.field37174.field4684.method1892() + class511.method1892() - 0.019999999552965164 - 0.6000000238418579 - n6;
            final double y2 = class511.field2397 - n3 + n7;
            final double x2 = Class9546.method35641(x * x + y2 * y2);
            Class8845.field37175 = method30910(Class8845.field37174.field4684.field2399, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f);
            Class8845.field37176 = method30910(Class8845.field37174.field4684.field2400, (float)(-(Math.atan2(y, x2) * 180.0 / 3.141592653589793)), 360.0f);
            return new float[] { Class8845.field37175, Class8845.field37176 };
        }
        return new float[] { Class8845.field37175, Class8845.field37176 };
    }
    
    public static float method30917(final float n, final float n2) {
        final float n3 = Math.abs(n - n2) % 360.0f;
        return ((n3 <= 180.0f) ? n3 : (360.0f - n3)) * (((n - n2 < 0.0f || n - n2 > 180.0f) && (n - n2 > -180.0f || n - n2 < -360.0f)) ? 1 : -1);
    }
    
    public static float method30918(final float n, final float n2) {
        float n3 = Math.abs(n - n2) % 360.0f;
        if (n3 > 180.0f) {
            n3 = 360.0f - n3;
        }
        return n3;
    }
    
    public static float[] method30919(final double n, final double n2, final double n3) {
        final double x = n - Class8845.field37174.field4684.field2395;
        final double y = n2 - Class8845.field37174.field4684.field2397;
        return new float[] { (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f, (float)(-(Math.atan2(n3 - Class8845.field37174.field4684.field2396 - 1.2, Class9546.method35641(x * x + y * y)) * 180.0 / 3.141592653589793)) };
    }
    
    public static float[] method30920(final Class5487 class5487, final Class5487 class5488) {
        final double x = class5488.field22770 - class5487.field22770;
        final double y = class5488.field22772 - class5487.field22772;
        return new float[] { method30910(0.0f, (float)(Math.atan2(y, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f), method30910(Class8845.field37174.field4684.field2400, (float)(-(Math.atan2(class5488.field22771 - class5487.field22771, Class9546.method35641(x * x + y * y)) * 180.0 / 3.141592653589793)), 360.0f) };
    }
    
    public static float[] method30921(final Class511 class511) {
        final double n = Class8845.field37174.field4684.field2395 + (Class8845.field37174.field4684.field2395 - Class8845.field37174.field4684.field2417) * Class8845.field37174.method5314();
        final double n2 = Class8845.field37174.field4684.field2397 + (Class8845.field37174.field4684.field2397 - Class8845.field37174.field4684.field2419) * Class8845.field37174.method5314();
        final double n3 = Class8845.field37174.field4684.field2396 + (Class8845.field37174.field4684.field2396 - Class8845.field37174.field4684.field2418) * Class8845.field37174.method5314();
        final double n4 = class511.field2395 + (class511.field2395 - class511.field2417) * Class8845.field37174.method5314();
        final double n5 = class511.field2397 + (class511.field2397 - class511.field2419) * Class8845.field37174.method5314();
        final double n6 = class511.field2396 + (class511.field2396 - class511.field2418) * Class8845.field37174.method5314();
        final double n7 = (n4 - class511.field2417) * 0.4;
        final double n8 = (n5 - class511.field2419) * 0.4;
        final double n9 = Class8845.field37174.field4684.method1732(class511);
        final double n10 = n9 - n9 % 0.8;
        final boolean method1815 = class511.method1815();
        final double n11 = n10 / 0.8 * n7 * (method1815 ? 1.25 : 1.0);
        final double n12 = n10 / 0.8 * n8 * (method1815 ? 1.25 : 1.0);
        final double x = n4 + n11 - n;
        final double y = n5 + n12 - n2;
        return new float[] { (float)Math.toDegrees(Math.atan2(y, x)) - 90.0f, -((float)(-(Math.atan2(n3 + Class8845.field37174.field4684.method1892() - (n6 + class511.method1931()), Class9546.method35641(x * x + y * y)) * 180.0 / 3.141592653589793)) + Class8845.field37174.field4684.method1732(class511) * 0.14f) };
    }
    
    public static Class7988 method30922(final Class399 class399) {
        final float[] method30913 = method30913(class399, Class8845.field37174.field4684.field2395, Class8845.field37174.field4684.field2396, Class8845.field37174.field4684.field2397);
        return new Class7988(method30913[0], method30913[1]);
    }
    
    public static boolean method30923(final Class5487 class5487) {
        final Class7005 method6987 = Class8845.field37174.field4683.method6987(new Class8478(new Class5487(Class8845.field37174.field4684.field2395, Class8845.field37174.field4684.field2396 + Class8845.field37174.field4684.method1892(), Class8845.field37174.field4684.field2397), class5487, Class2040.field11633, Class2191.field13325, Class8845.field37174.field4684));
        final boolean b = method6987.method21449() == Class2165.field12880 || method6987.method21449() == Class2165.field12882;
        Class8845.field37174.field4683.method6701(method6987.method21447()).method21696();
        return b;
    }
    
    public static Class7988 method30924(final Class399 class399) {
        for (int i = -1; i < 2; ++i) {
            final double n = i;
            double n2;
            if (i != -1) {
                n2 = n * class399.field2403.method18509();
            }
            else {
                n2 = class399.method1892() - 0.02f;
            }
            final double field2395 = class399.field2395;
            final double field2396 = class399.field2397;
            final double n3 = class399.field2396 + n2 + 0.05;
            final double x = field2395 - Class8845.field37174.field4684.field2395;
            final double y = n3 - Class8845.field37174.field4684.method1892() - 0.019999999552965164 - Class8845.field37174.field4684.field2396;
            final double y2 = field2396 - Class8845.field37174.field4684.field2397;
            final double x2 = Class9546.method35641(x * x + y2 * y2);
            final float method30910 = method30910(Class8845.field37174.field4684.field2399, (float)(Math.atan2(y2, x) * 180.0 / 3.141592653589793) - 90.0f, 360.0f);
            final float method30911 = method30910(Class8845.field37174.field4684.field2400, (float)(-(Math.atan2(y, x2) * 180.0 / 3.141592653589793)), 360.0f);
            if (method30923(new Class5487(field2395, n3, field2396))) {
                return new Class7988(method30910, method30911);
            }
            for (int j = -1; j < 2; j += 2) {
                double n4 = class399.field2395 + (class399.field2395 - class399.field2417) * Class8845.field37174.method5314();
                double n5 = class399.field2397 + (class399.field2397 - class399.field2419) * Class8845.field37174.method5314();
                final double n6 = class399.field2396 + 0.05 + (class399.field2396 - class399.field2418) * Class8845.field37174.method5314() + n2;
                final double n7 = class399.field2403.method18508() / 2.1 * j;
                final double n8 = class399.field2403.method18510() / 2.1 * j;
                if (Class8845.field37174.field4684.field2395 >= n4 + n7) {
                    if (Class8845.field37174.field4684.field2395 > n4 + n7) {
                        if (Class8845.field37174.field4684.field2397 >= n5 - n8) {
                            n4 += n7;
                        }
                        else {
                            n4 -= n7;
                        }
                        if (Class8845.field37174.field4684.field2395 <= n4 + n7) {
                            n5 += n8;
                        }
                        else {
                            n5 -= n8;
                        }
                    }
                }
                else {
                    if (Class8845.field37174.field4684.field2397 <= n5 + n8) {
                        n4 -= n7;
                    }
                    else {
                        n4 += n7;
                    }
                    if (Class8845.field37174.field4684.field2395 >= n4 - n7) {
                        n5 -= n8;
                    }
                    else {
                        n5 += n8;
                    }
                }
                final double x3 = n4 - Class8845.field37174.field4684.field2395;
                final double y3 = n6 - Class8845.field37174.field4684.method1892() - 0.02 - Class8845.field37174.field4684.field2396;
                final double y4 = n5 - Class8845.field37174.field4684.field2397;
                final double x4 = Class9546.method35641(x3 * x3 + y4 * y4);
                final float method30912 = method30910(Class8845.field37174.field4684.field2399, (float)(Math.atan2(y4, x3) * 180.0 / 3.141592653589793) - 90.0f, 360.0f);
                final float method30913 = method30910(Class8845.field37174.field4684.field2400, (float)(-(Math.atan2(y3, x4) * 180.0 / 3.141592653589793)), 360.0f);
                if (method30923(new Class5487(n4, n6, n5))) {
                    return new Class7988(method30912, method30913);
                }
            }
        }
        return null;
    }
    
    public static float method30925(final float n, final double n2, final double n3) {
        final double n4 = n2 - Class8845.field37174.field4684.field2395;
        final double n5 = n3 - Class8845.field37174.field4684.field2397;
        double degrees = 0.0;
        if (n5 < 0.0 && n4 < 0.0) {
            if (n4 != 0.0) {
                degrees = 90.0 + Math.toDegrees(Math.atan(n5 / n4));
            }
        }
        else if (n5 < 0.0 && n4 > 0.0) {
            if (n4 != 0.0) {
                degrees = -90.0 + Math.toDegrees(Math.atan(n5 / n4));
            }
        }
        else if (n5 != 0.0) {
            degrees = Math.toDegrees(-Math.atan(n4 / n5));
        }
        return Class9546.method35668(-(n - (float)degrees));
    }
    
    private double method30926(final double n, final double n2) {
        return n + Math.random() * (n2 - n);
    }
    
    public static float method30927(final float n, final Class399 class399, final double n2) {
        final double n3 = class399.field2395 - Class8845.field37174.field4684.field2395;
        final double n4 = class399.field2397 - Class8845.field37174.field4684.field2397;
        return -Class9546.method35668(n - (float)(-Math.toDegrees(Math.atan((n2 - 2.2 + class399.method1892() - Class8845.field37174.field4684.field2396) / Class9546.method35641(n3 * n3 + n4 * n4))))) - 2.5f;
    }
    
    static {
        field37174 = Class869.method5277();
    }
}
