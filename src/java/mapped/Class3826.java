// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.List;
import java.util.Iterator;

public class Class3826 extends Class3824
{
    public Class3826(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public Class8321 method11741() {
        return Class5333.method16476(super.method11741(), Class8644.field36279);
    }
    
    @Override
    public void method11735(final Class7207 class7207, final Class2265<Class8321> class7208) {
        if (this.method11736(class7207)) {
            for (final Class8061 class7209 : Class90.field212) {
                if (class7209.method26449().isEmpty()) {
                    continue;
                }
                class7208.add(Class5333.method16476(new Class8321(this), class7209));
            }
        }
    }
    
    @Override
    public void method11728(final Class8321 class8321, final Class1847 class8322, final List<Class2250> list, final Class1981 class8323) {
        Class5333.method16478(class8321, list, 0.125f);
    }
    
    @Override
    public String method11718(final Class8321 class8321) {
        return Class5333.method16474(class8321).method26448(this.method11717() + ".effect.");
    }
}
