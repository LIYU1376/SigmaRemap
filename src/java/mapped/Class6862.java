// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Random;

public class Class6862 extends Class6863
{
    private static String[] field26892;
    
    private Class6862() {
    }
    
    @Override
    public void method20976(final Random random, final int n, final int n2, final int n3, final boolean b) {
        if (!b) {
            this.field26893 = Class7521.field29764.method11878();
        }
        else {
            final float nextFloat = random.nextFloat();
            if (nextFloat >= 0.2f) {
                if (nextFloat >= 0.5f) {
                    if (nextFloat >= 0.55f) {
                        this.field26893 = Class7521.field29368.method11878();
                    }
                    else {
                        this.field26893 = Class7521.field29374.method11878();
                    }
                }
                else {
                    this.field26893 = Class7521.field29369.method11878();
                }
            }
            else {
                this.field26893 = Class7521.field29370.method11878();
            }
        }
    }
}
