// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.datafixers.types.DynamicOps;
import javax.annotation.Nullable;
import java.io.File;
import com.mojang.datafixers.Dynamic;
import java.util.function.BiFunction;

public class Class383 implements Class356
{
    public static final Class383 field2223;
    public static final Class383 field2224;
    public static final Class383 field2225;
    private final int field2226;
    private final String field2227;
    private final String field2228;
    private final BiFunction<Class1847, Class383, ? extends Class6737> field2229;
    private final boolean field2230;
    private final Class2178 field2231;
    
    private static Class383 method1267(final String s, final Class383 class383) {
        return Class90.method513(Class90.field226, class383.field2226, s, class383);
    }
    
    public Class383(final int field2226, final String field2227, final String field2228, final BiFunction<Class1847, Class383, ? extends Class6737> field2229, final boolean field2230, final Class2178 field2231) {
        this.field2226 = field2226;
        this.field2227 = field2227;
        this.field2228 = field2228;
        this.field2229 = field2229;
        this.field2230 = field2230;
        this.field2231 = field2231;
    }
    
    public static Class383 method1268(final Dynamic<?> dynamic) {
        return Class90.field226.method505(new Class1932(dynamic.asString("")));
    }
    
    public static Iterable<Class383> method1269() {
        return Class90.field226;
    }
    
    public int method1270() {
        return this.field2226 - 1;
    }
    
    public String method1271() {
        return this.field2227;
    }
    
    public File method1272(final File parent) {
        return this.field2228.isEmpty() ? parent : new File(parent, this.field2228);
    }
    
    public Class6737 method1273(final Class1847 class1847) {
        return (Class6737)this.field2229.apply(class1847, this);
    }
    
    @Override
    public String toString() {
        return method1276(this).toString();
    }
    
    @Nullable
    public static Class383 method1274(final int n) {
        return Class90.field226.method499(n + 1);
    }
    
    @Nullable
    public static Class383 method1275(final Class1932 class1932) {
        return Class90.field226.method505(class1932);
    }
    
    @Nullable
    public static Class1932 method1276(final Class383 class383) {
        return Class90.field226.method503(class383);
    }
    
    public boolean method1277() {
        return this.field2230;
    }
    
    public Class2178 method1278() {
        return this.field2231;
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)dynamicOps.createString(Class90.field226.method503(this).toString());
    }
    
    static {
        field2223 = method1267("overworld", new Class383(1, Class383.\ua0dd\u8365\u7b4d\ub23a\u94c8\ucb49[0], Class383.\ua0dd\u8365\u7b4d\ub23a\u94c8\ucb49[0], Class6736::new, true, Class2179.field12911));
        field2224 = method1267("the_nether", new Class383(0, "_nether", "DIM-1", Class6739::new, false, Class2177.field12908));
        field2225 = method1267("the_end", new Class383(2, "_end", "DIM1", Class6738::new, false, Class2177.field12908));
    }
}
