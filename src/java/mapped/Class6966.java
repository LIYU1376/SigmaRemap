// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.gson.JsonArray;
import java.util.Collection;
import java.util.function.Function;

public class Class6966<T> implements Class6967<T>
{
    private final Class1932 field27246;
    private Class7909<T> field27247;
    
    public Class6966(final Class1932 field27246) {
        this.field27246 = field27246;
    }
    
    public Class6966(final Class7909<T> field27247) {
        this.field27246 = field27247.method25621();
        this.field27247 = field27247;
    }
    
    @Override
    public boolean method21378(final Function<Class1932, Class7909<T>> function) {
        if (this.field27247 == null) {
            this.field27247 = function.apply(this.field27246);
        }
        return this.field27247 != null;
    }
    
    @Override
    public void method21379(final Collection<T> collection) {
        if (this.field27247 != null) {
            collection.addAll((Collection<? extends T>)this.field27247.method25616());
            return;
        }
        throw Class8349.method27859(new IllegalStateException("Cannot build unresolved tag entry"));
    }
    
    public Class1932 method21380() {
        if (this.field27247 != null) {
            return this.field27247.method25621();
        }
        if (this.field27246 == null) {
            throw new IllegalStateException("Cannot serialize an anonymous tag to json!");
        }
        return this.field27246;
    }
    
    @Override
    public void method21381(final JsonArray jsonArray, final Function<T, Class1932> function) {
        jsonArray.add("#" + this.method21380());
    }
}
