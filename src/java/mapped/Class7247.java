// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.AbstractIterator;

public class Class7247 extends AbstractIterator
{
    private static String[] field28094;
    private Class384 field28095;
    public final /* synthetic */ Class97 field28096;
    
    public Class7247(final Class97 field28096) {
        this.field28096 = field28096;
        this.field28095 = null;
    }
    
    public Class384 method22144() {
        if (this.field28095 == null) {
            return this.field28095 = new Class384(this.field28096.field266.method1074(), this.field28096.field266.method1075(), this.field28096.field266.method1076(), 3);
        }
        if (!this.field28095.equals(this.field28096.field267)) {
            int n = this.field28095.method1074();
            int n2 = this.field28095.method1075();
            int method1076 = this.field28095.method1076();
            if (n >= this.field28096.field267.method1074()) {
                if (n2 >= this.field28096.field267.method1075()) {
                    if (method1076 < this.field28096.field267.method1076()) {
                        n = this.field28096.field266.method1074();
                        n2 = this.field28096.field266.method1075();
                        ++method1076;
                    }
                }
                else {
                    n = this.field28096.field266.method1074();
                    ++n2;
                }
            }
            else {
                ++n;
            }
            this.field28095.method1279(n, n2, method1076);
            return this.field28095;
        }
        return (Class384)this.endOfData();
    }
    
    public Object computeNext() {
        return this.method22144();
    }
}
