// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.function.ToIntFunction;
import java.util.Comparator;

public class Class6793
{
    private static String[] field26707;
    
    public static void method20784(final Class511 class511, final Class511 class512) {
        method20787(class511, class512);
        method20789(class511, class512);
    }
    
    public static boolean method20785(final Class365<?> class365, final Class511 class366) {
        return class365.method1198(Class8233.field33805).filter(list -> list.contains(class367)).isPresent();
    }
    
    public static boolean method20786(final Class365<?> class365, final Class8233<? extends Class511> class366, final Class7499<?> class367) {
        return class365.method1198((Class8233<Object>)class366).filter(class369 -> class369.method1642() == class368).filter(Class511::method1768).filter(class371 -> method20785(class370, class371)).isPresent();
    }
    
    public static void method20787(final Class511 class511, final Class511 class512) {
        method20788(class511, class512);
        method20788(class512, class511);
    }
    
    public static void method20788(final Class511 class511, final Class511 class512) {
        class511.method2618().method1196((Class8233<Class6440>)Class8233.field33810, new Class6440(class512));
    }
    
    public static void method20789(final Class511 class511, final Class511 class512) {
        method20790(class511, class512, 2);
        method20790(class512, class511, 2);
    }
    
    public static void method20790(final Class511 class511, final Class511 class512, final int n) {
        final float n2 = (float)class511.method2710(Class8107.field33408).method23950();
        final Class6440 class513 = new Class6440(class512);
        final Class6949 class514 = new Class6949(class513, n2, n);
        class511.method2618().method1196(Class8233.field33810, class513);
        class511.method2618().method1196(Class8233.field33809, class514);
    }
    
    public static void method20791(final Class511 class511, final Class8321 class512, final Class511 class513) {
        final Class427 class514 = new Class427(class511.field2391, class511.method1938(), class511.method1944() - 0.30000001192092896, class511.method1945(), class512);
        class514.method1936(new Class5487(new Class354(class513).method1136(new Class354(class511))).method16738().method16748(0.30000001192092896));
        class514.method2114();
        class511.field2391.method6886(class514);
    }
    
    public static Class353 method20792(final Class1849 class1850, final Class353 class1852, final int n) {
        return Class353.method1119(class1852, n).filter(class1853 -> {
            class1850.method6925(class1852);
            return class1851.method6925(class1853) < n2;
        }).min(Comparator.comparingInt((ToIntFunction<? super Class353>)class1850::method6925)).orElse(class1852);
    }
}
