// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Comparator;

public class Class4448 implements Comparator<Class8131>
{
    private static String[] field19787;
    public final /* synthetic */ Class8866 field19788;
    
    public Class4448(final Class8866 field19788) {
        this.field19788 = field19788;
    }
    
    @Override
    public int compare(final Class8131 class8131, final Class8131 class8132) {
        final Class399 method26798 = class8131.method26798();
        final Class399 method26799 = class8132.method26798();
        final boolean method26800 = Class9463.method35173().method35190().method29880(method26798);
        final boolean method26801 = Class9463.method35173().method35190().method29880(method26799);
        if (method26800 && !method26801) {
            return -1;
        }
        if (method26800 && method26801) {
            return 0;
        }
        return 1;
    }
}
