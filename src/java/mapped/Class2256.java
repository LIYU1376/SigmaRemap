// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.StringReader;

public class Class2256 extends Class2255
{
    private final String field13804;
    private final Class9043 field13805;
    
    public Class2256(final String s, final boolean b, final String field13804) {
        super(s, b);
        this.field13804 = field13804;
        this.field13805 = method8487(field13804);
    }
    
    @Nullable
    private static Class9043 method8487(final String s) {
        try {
            return new Class7793(new StringReader(s)).method25070();
        }
        catch (final CommandSyntaxException ex) {
            return null;
        }
    }
    
    private Class2256(final String s, final Class8570 class8570, final boolean b, final String field13804, final Class9043 field13805) {
        super(s, class8570, b);
        this.field13804 = field13804;
        this.field13805 = field13805;
    }
    
    public String method8488() {
        return this.field13804;
    }
    
    @Override
    public Class2250 method8465() {
        return new Class2256(this.field13802, this.field13803, this.field13801, this.field13804, this.field13805);
    }
    
    @Override
    public Stream<Class51> method8481(final Class7492 class7492) throws CommandSyntaxException {
        if (this.field13805 == null) {
            return Stream.empty();
        }
        return this.field13805.method32511(class7492).stream().map((Function<? super Object, ? extends Class51>)Class7103::method21808);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Class2256) {
            final Class2256 class2256 = (Class2256)o;
            if (Objects.equals(this.field13804, class2256.field13804)) {
                if (Objects.equals(this.field13802, class2256.field13802)) {
                    if (super.equals(o)) {
                        return true;
                    }
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "EntityNbtComponent{selector='" + this.field13804 + '\'' + "path='" + this.field13802 + '\'' + ", siblings=" + this.field13791 + ", style=" + this.method8456() + '}';
    }
}
