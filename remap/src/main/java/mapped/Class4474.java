// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Random;

public class Class4474 extends Class4473
{
    private static String[] field19856;
    
    public Class4474(final BlockPos class354) {
        super(Class9520.field40996, 0);
        this.field19849 = new Class6997(class354.getX(), class354.getY(), class354.getZ(), class354.getX(), class354.getY(), class354.getZ());
    }
    
    public Class4474(final Class1795 class1795, final Class51 class1796) {
        super(Class9520.field40996, class1796);
    }
    
    @Override
    public void method13415(final Class51 class51) {
    }
    
    @Override
    public boolean method13421(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        final Class385 class1855 = new Class385(this.field19849.field27293, class1851.method6699(Class2020.field11523, this.field19849.field27293, this.field19849.field27295), this.field19849.field27295);
        while (class1855.getY() > 0) {
            final Class7096 method6701 = class1851.method6701(class1855);
            final Class7096 method6702 = class1851.method6701(class1855.method1139());
            if (method6702 != Class7521.field29217.method11878()) {
                if (method6702 != Class7521.field29148.method11878()) {
                    if (method6702 != Class7521.field29153.method11878()) {
                        if (method6702 != Class7521.field29149.method11878()) {
                            if (method6702 != Class7521.field29151.method11878()) {
                                class1855.method1292(0, -1, 0);
                                continue;
                            }
                        }
                    }
                }
            }
            final Class7096 class1856 = (!method6701.method21706() && !this.method13459(method6701)) ? method6701 : Class7521.field29175.method11878();
            for (final Direction class1857 : Direction.values()) {
                final BlockPos method6703 = class1855.method1149(class1857);
                final Class7096 method6704 = class1851.method6701(method6703);
                Label_0375: {
                    if (method6704.method21706() || this.method13459(method6704)) {
                        final Class7096 method6705 = class1851.method6701(method6703.method1139());
                        if (method6705.method21706() || this.method13459(method6705)) {
                            if (class1857 != Direction.UP) {
                                class1851.method6688(method6703, method6702, 3);
                                break Label_0375;
                            }
                        }
                        class1851.method6688(method6703, class1856, 3);
                    }
                }
            }
            this.field19849 = new Class6997(class1855.getX(), class1855.getY(), class1855.getZ(), class1855.getX(), class1855.getY(), class1855.getZ());
            return this.method13452(class1851, class1853, random, class1855, Class9020.field38095, null);
        }
        return false;
    }
    
    private boolean method13459(final Class7096 class7096) {
        return class7096 == Class7521.field29173.method11878() || class7096 == Class7521.field29174.method11878();
    }
}
