// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public final class Class6400 extends Class6397
{
    private static String[] field25518;
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class1847 method16763 = class5491.method16763();
        final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859));
        final Class3901 class5493 = (Class3901)Class7521.field29342;
        if (method16763.method6961(method16764) && class5493.method11995(method16763, method16764)) {
            if (!method16763.field10067) {
                method16763.method6688(method16764, class5493.method11878(), 3);
            }
            class5492.method27693(1);
            this.field25515 = true;
        }
        else {
            this.field25515 = Class4055.method12256(class5491, class5492);
        }
        return class5492;
    }
}
