// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class7569
{
    private static Map field30017;
    private static boolean field30018;
    private static long field30019;
    
    public static void method23789(final Class5853 class5853, final Class754 class5854, final MatrixStack class5855, final IRenderTypeBuffer class5856, final int n, final int n2) {
        final Class6554 method23790 = method23790(class5854);
        if (method23790 != null) {
            method23790.method19859(class5853, class5854, class5855, class5856, n, n2);
        }
    }
    
    public static synchronized Class6554 method23790(final Class754 class754) {
        if (Class7569.field30018) {
            if (System.currentTimeMillis() > Class7569.field30019 + 5000L) {
                final Class756 field4684 = Minecraft.method5277().player;
                if (field4684 != null) {
                    method23791(field4684.method4105(), null);
                    Class7569.field30019 = System.currentTimeMillis();
                }
            }
        }
        final String method4105 = class754.method4105();
        if (method4105 != null) {
            Class6554 class755 = method23792().get(method4105);
            if (class755 == null) {
                class755 = new Class6554();
                method23792().put(method4105, class755);
                new Class923(Class8337.method27789() + "/users/" + method4105 + ".cfg", new Class6975(method4105)).start();
            }
            return class755;
        }
        return null;
    }
    
    public static synchronized void method23791(final String s, final Class6554 class6554) {
        method23792().put(s, class6554);
    }
    
    private static Map method23792() {
        if (Class7569.field30017 == null) {
            Class7569.field30017 = new HashMap();
        }
        return Class7569.field30017;
    }
    
    static {
        Class7569.field30017 = null;
        Class7569.field30018 = Boolean.getBoolean("player.models.reload");
        Class7569.field30019 = System.currentTimeMillis();
    }
}
