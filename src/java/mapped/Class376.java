// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Map;
import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.types.DynamicOps;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class376 extends Class373
{
    private final int field2214;
    private final int field2215;
    
    public Class376(final int field2214, final int field2215) {
        super(Class8372.field34333);
        this.field2214 = field2214;
        this.field2215 = field2215;
    }
    
    public <T> Class376(final Dynamic<T> dynamic) {
        this(dynamic.get("min_size").asInt(1), dynamic.get("extra_size").asInt(2));
    }
    
    @Override
    public void method1254(final Class1851 class1851, final Class354 class1852, final Class7096 class1853, final Random random) {
        final Class385 class1854 = new Class385(class1852);
        for (int n = this.field2214 + random.nextInt(random.nextInt(this.field2215 + 1) + 1), i = 0; i < n; ++i) {
            class1851.method6688(class1854, class1853, 2);
            class1854.method1290(Class179.field512);
        }
    }
    
    @Override
    public <T> T method1123(final DynamicOps<T> dynamicOps) {
        return (T)new Dynamic((DynamicOps)dynamicOps, dynamicOps.createMap((Map)ImmutableMap.of(dynamicOps.createString("type"), dynamicOps.createString(Class90.field219.method503(this.field2213).toString()), dynamicOps.createString("min_size"), dynamicOps.createInt(this.field2214), dynamicOps.createString("extra_size"), dynamicOps.createInt(this.field2215)))).getValue();
    }
}
