// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public final class Class4447 implements Comparator<Class399>
{
    private static String[] field19786;
    
    @Override
    public int compare(final Class399 class399, final Class399 class400) {
        final float method1732 = Class4609.method13716().field4684.method1732(class399);
        final float method1733 = Class4609.method13716().field4684.method1732(class400);
        if (method1732 - method1733 < 0.0f) {
            return -1;
        }
        if (method1732 - method1733 != 0.0f) {
            return 1;
        }
        return 0;
    }
}
