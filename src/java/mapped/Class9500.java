// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Collection;
import com.google.common.collect.Maps;
import java.util.Map;

public class Class9500<O, S extends Class7098<S>>
{
    private final O field40876;
    private final Map<String, Class7111<?>> field40877;
    
    public Class9500(final O field40876) {
        this.field40877 = Maps.newHashMap();
        this.field40876 = field40876;
    }
    
    public Class9500<O, S> method35378(final Class7111<?>... array) {
        for (final Class7111<?> class7111 : array) {
            this.method35379(class7111);
            this.field40877.put(class7111.method21826(), class7111);
        }
        return this;
    }
    
    private <T extends Comparable<T>> void method35379(final Class7111<T> class7111) {
        final String method21826 = class7111.method21826();
        if (!Class9104.method32910().matcher(method21826).matches()) {
            throw new IllegalArgumentException(this.field40876 + " has invalidly named property: " + method21826);
        }
        final Collection method21827 = class7111.method21829();
        if (method21827.size() <= 1) {
            throw new IllegalArgumentException(this.field40876 + " attempted use property " + method21826 + " with <= 1 possible values");
        }
        final Iterator iterator = method21827.iterator();
        while (iterator.hasNext()) {
            final String method21828 = class7111.method21831((T)iterator.next());
            if (Class9104.method32910().matcher(method21828).matches()) {
                continue;
            }
            throw new IllegalArgumentException(this.field40876 + " has property: " + method21826 + " with invalidly named value: " + method21828);
        }
        if (!this.field40877.containsKey(method21826)) {
            return;
        }
        throw new IllegalArgumentException(this.field40876 + " has duplicate property: " + method21826);
    }
    
    public <A extends Class7097<O, S>> Class9104<O, S> method35380(final Class6846<O, S, A> class6846) {
        return new Class9104<O, S>(this.field40876, (Class6846<O, S, A>)class6846, this.field40877);
    }
}
