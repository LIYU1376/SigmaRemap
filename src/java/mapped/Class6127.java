// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.function.BiConsumer;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class6127 implements Class6113
{
    private static String[] field24870;
    private final Map<Class354, Class8340> field24871;
    
    public Class6127() {
        this.field24871 = Maps.newHashMap();
    }
    
    public void method18351(final Class354 class354, final int n, final String s, final int n2) {
        this.field24871.put(class354, new Class8340(n, s, Class8349.method27837() + n2));
    }
    
    @Override
    public void method18270() {
        this.field24871.clear();
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        this.field24871.entrySet().removeIf(entry -> {
            Class8349.method27837();
            return n4 > entry.getValue().field34245;
        });
        this.field24871.forEach(this::method18352);
    }
    
    private void method18352(final Class354 class354, final Class8340 class355) {
        Class8726.method30059();
        Class8726.method30011();
        Class8726.method30015(Class2050.field11693, Class2135.field12460, Class2050.field11686, Class2135.field12464);
        Class8726.method30068(0.0f, 1.0f, 0.0f, 0.75f);
        Class8726.method30041();
        Class7282.method22335(class354, 0.02f, class355.method27792(), class355.method27793(), class355.method27794(), class355.method27795());
        if (!class355.field34244.isEmpty()) {
            Class7282.method22341(class355.field34244, class354.method1074() + 0.5, class354.method1075() + 1.2, class354.method1076() + 0.5, -1, 0.01f, true, 0.0f, true);
        }
        Class8726.method30040();
        Class8726.method30012();
        Class8726.method30060();
    }
}
