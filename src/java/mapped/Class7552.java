// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.HashMap;
import java.util.Map;

public class Class7552
{
    private static String[] field29954;
    private static final Map<String, Class6257> field29955;
    
    public static Class6257 method23716(final String s) {
        Class6257 class6257 = Class7552.field29955.get(s);
        if (class6257 == null) {
            final Class1932 class6258 = new Class1932(s);
            if (Class90.field209.method510(class6258)) {
                class6257 = Class90.field209.method505(class6258);
            }
            Class7552.field29955.put(s, class6257);
        }
        return class6257;
    }
    
    public static Class6257 method23717(final Class1932 class1932) {
        return Class90.field209.method510(class1932) ? Class90.field209.method505(class1932) : null;
    }
    
    static {
        field29955 = new HashMap<String, Class6257>();
    }
}
