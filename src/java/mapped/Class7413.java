// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Collector;
import java.util.stream.Collectors;
import com.google.common.collect.Streams;
import java.util.List;
import java.util.function.Predicate;

public class Class7413 implements Class7410
{
    private static String[] field28551;
    private final Iterable<? extends Class7410> field28552;
    
    public Class7413(final Iterable<? extends Class7410> field28552) {
        this.field28552 = field28552;
    }
    
    @Override
    public Predicate<Class7096> method22768(final Class9104<Class3833, Class7096> class9104) {
        return p1 -> {
            final Object o = Streams.stream((Iterable)this.field28552).map(p1 -> {}).collect((Collector<? super Object, ?, List<Object>>)Collectors.toList());
            return list.stream().allMatch(predicate -> predicate.test(class9105));
        };
    }
}
