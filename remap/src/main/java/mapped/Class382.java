// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Set;
import java.util.Random;
import com.mojang.datafixers.Dynamic;

public class Class382 extends Class378
{
    public Class382(final int n, final int n2) {
        super(n, n2, Class7944.field32620);
    }
    
    public <T> Class382(final Dynamic<T> dynamic) {
        this(dynamic.get("radius").asInt(0), dynamic.get("radius_random").asInt(0));
    }
    
    @Override
    public void method1261(final Class1875 class1875, final Random random, final Class5129 class1876, final int n, final int n2, final int b, final BlockPos class1877, final Set<BlockPos> set) {
        int nextInt = random.nextInt(2);
        int min = 1;
        int n3 = 0;
        for (int i = n; i >= n2; --i) {
            this.method1265(class1875, random, class1876, n, class1877, i, nextInt, set);
            if (nextInt < min) {
                ++nextInt;
            }
            else {
                nextInt = n3;
                n3 = 1;
                min = Math.min(min + 1, b);
            }
        }
    }
    
    @Override
    public int method1262(final Random random, final int n, final int n2, final Class5129 class5129) {
        return this.field2220 + random.nextInt(this.field2221 + 1);
    }
    
    @Override
    public boolean method1263(final Random random, final int n, final int a, final int n2, final int a2, final int n3) {
        if (Math.abs(a) == n3) {
            if (Math.abs(a2) == n3) {
                if (n3 > 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public int method1264(final int n, final int n2, final int n3, final int n4) {
        return (n4 > 1) ? 2 : 0;
    }
}
