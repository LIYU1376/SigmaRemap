// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

public final class Class6403 extends Class6397
{
    private static String[] field25522;
    
    @Override
    public Class8321 method19087(final Class5491 class5491, final Class8321 class5492) {
        final Class1847 method16763 = class5491.method16763();
        this.field25515 = true;
        final BlockPos method16764 = class5491.method16764().method1149(class5491.method16765().method21772((Class7111<Direction>)Class3955.field17859));
        final Class7096 method16765 = method16763.method6701(method16764);
        if (!Class3827.method11760(method16765, method16763, method16764)) {
            if (!Class3827.method11759(method16765)) {
                if (!(method16765.method21696() instanceof Class3976)) {
                    this.field25515 = false;
                }
                else {
                    Class3976.method12118(method16763, method16764);
                    method16763.method6690(method16764, false);
                }
            }
            else {
                method16763.method6692(method16764, ((Class7097<Object, Class7096>)method16765).method21773((Class7111<Comparable>)Class8970.field37736, true));
            }
        }
        else {
            method16763.method6692(method16764, Class7521.field29289.method11878());
        }
        if (this.field25515) {
            if (class5492.method27635(1, method16763.field10062, null)) {
                class5492.method27691(0);
            }
        }
        return class5492;
    }
}
