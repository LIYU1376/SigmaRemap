// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Random;

public class Class3888 extends Class3874 implements Class3872
{
    private static String[] field17519;
    public static final Class7702 field17550;
    
    public Class3888(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class7702 method11808(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098, final Class7543 class7099) {
        return Class3888.field17550;
    }
    
    @Override
    public void method11822(final Class7096 class7096, final Class1849 class7097, BlockPos class7098, final Random random) {
        if (random.nextInt(25) == 0) {
            int n = 5;
            final Iterator<BlockPos> iterator = BlockPos.method1154(class7098.method1134(-4, -1, -4), class7098.method1134(4, 1, 4)).iterator();
            while (iterator.hasNext()) {
                if (class7097.method6701(iterator.next()).method21696() == this && --n <= 0) {
                    return;
                }
            }
            BlockPos class7099 = class7098.method1134(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            for (int i = 0; i < 4; ++i) {
                if (class7097.method6961(class7099)) {
                    if (class7096.method21752(class7097, class7099)) {
                        class7098 = class7099;
                    }
                }
                class7099 = class7098.method1134(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }
            if (class7097.method6961(class7099)) {
                if (class7096.method21752(class7097, class7099)) {
                    class7097.method6688(class7099, class7096, 2);
                }
            }
        }
    }
    
    @Override
    public boolean method11943(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return class7096.method21722(class7097, class7098);
    }
    
    @Override
    public boolean method11843(final Class7096 class7096, final Class1852 class7097, final BlockPos class7098) {
        final BlockPos method1139 = class7098.method1139();
        final Class7096 method1140 = class7097.method6701(method1139);
        final Class3833 method1141 = method1140.method21696();
        return method1141 == Class7521.field29392 || method1141 == Class7521.field29158 || (class7097.method6993(class7098, 0) < 13 && this.method11943(method1140, class7097, method1139));
    }
    
    public boolean method11963(final Class1849 class1849, final BlockPos class1850, final Class7096 class1851, final Random random) {
        class1849.method6690(class1850, false);
        Class8530<Class5137, ?> class1852;
        if (this != Class7521.field29278) {
            if (this != Class7521.field29279) {
                class1849.method6688(class1850, class1851, 3);
                return false;
            }
            class1852 = Class4535.field19990.method13527(Class9218.field39551);
        }
        else {
            class1852 = Class4535.field19991.method13527(Class9218.field39552);
        }
        if (!class1852.method28613(class1849, (Class6346)class1849.method6904().method7438(), random, class1850)) {
            class1849.method6688(class1850, class1851, 3);
            return false;
        }
        return true;
    }
    
    @Override
    public boolean method11945(final Class1855 class1855, final BlockPos class1856, final Class7096 class1857, final boolean b) {
        return true;
    }
    
    @Override
    public boolean method11946(final Class1847 class1847, final Random random, final BlockPos class1848, final Class7096 class1849) {
        return random.nextFloat() < 0.4;
    }
    
    @Override
    public void method11947(final Class1849 class1849, final Random random, final BlockPos class1850, final Class7096 class1851) {
        this.method11963(class1849, class1850, class1851, random);
    }
    
    @Override
    public boolean method11803(final Class7096 class7096, final Class1855 class7097, final BlockPos class7098) {
        return true;
    }
    
    static {
        field17550 = Class3833.method11778(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);
    }
}
