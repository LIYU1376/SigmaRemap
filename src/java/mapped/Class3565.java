// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.function.Predicate;

public class Class3565 extends Class3555<Class512>
{
    private static String[] field16633;
    public final /* synthetic */ Class790 field16656;
    
    public Class3565(final Class790 field16656) {
        this.field16656 = field16656;
        super(field16656, Class512.class, 20, true, true, null);
    }
    
    @Override
    public boolean method11013() {
        if (!this.field16656.method2625()) {
            if (super.method11013()) {
                final Iterator<Class399> iterator = (Iterator<Class399>)this.field16656.field2391.method7128((Class<? extends Class790>)Class790.class, this.field16656.method1886().method18495(8.0, 4.0, 8.0)).iterator();
                while (iterator.hasNext()) {
                    if (!iterator.next().method2625()) {
                        continue;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public double method11096() {
        return super.method11096() * 0.5;
    }
}
