// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.google.common.collect.ImmutableMap$Builder;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Set;

public class Class4075 extends Class4072
{
    private static String[] field18176;
    private static final Set<Class3833> field18177;
    public static final Map<Class3833, Class3833> field18178;
    
    public Class4075(final Class2038 class2038, final float n, final float n2, final Class8959 class2039) {
        super(n, n2, class2038, Class4075.field18177, class2039);
    }
    
    @Override
    public float method11706(final Class8321 class8321, final Class7096 class8322) {
        final Class8059 method21697 = class8322.method21697();
        if (method21697 != Class8059.field33176) {
            if (method21697 != Class8059.field33157) {
                if (method21697 != Class8059.field33159) {
                    if (method21697 != Class8059.field33178) {
                        return super.method11706(class8321, class8322);
                    }
                }
            }
        }
        return this.field18168;
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final Class1847 method21654 = class7075.method21654();
        final Class354 method21655 = class7075.method21639();
        final Class7096 method21656 = method21654.method6701(method21655);
        final Class3833 class7076 = Class4075.field18178.get(method21656.method21696());
        if (class7076 == null) {
            return Class2201.field13402;
        }
        final Class512 method21657 = class7075.method21652();
        method21654.method6705(method21657, method21655, Class8520.field34994, Class286.field1582, 1.0f, 1.0f);
        if (!method21654.field10067) {
            method21654.method6688(method21655, (Class7096)((Class7097<Object, Object>)class7076.method11878()).method21773(Class4027.field18120, (Comparable)method21656.method21772((Class7111<V>)Class4027.field18120)), 11);
            if (method21657 != null) {
                class7075.method21651().method27636(1, method21657, class7078 -> class7078.method2795(class7077.method21653()));
            }
        }
        return Class2201.field13400;
    }
    
    static {
        field18177 = Sets.newHashSet((Object[])new Class3833[] { Class7521.field29160, Class7521.field29161, Class7521.field29162, Class7521.field29163, Class7521.field29164, Class7521.field29165, Class7521.field29284, Class7521.field29193, Class7521.field29194, Class7521.field29195, Class7521.field29196, Class7521.field29197, Class7521.field29198, Class7521.field29181, Class7521.field29182, Class7521.field29183, Class7521.field29184, Class7521.field29185, Class7521.field29186, Class7521.field29292, Class7521.field29337, Class7521.field29342, Class7521.field29343, Class7521.field29383, Class7521.field29307, Class7521.field29805, Class7521.field29447, Class7521.field29448, Class7521.field29449, Class7521.field29450, Class7521.field29452, Class7521.field29451, Class7521.field29319, Class7521.field29320, Class7521.field29321, Class7521.field29322, Class7521.field29324, Class7521.field29323 });
        field18178 = (Map)new ImmutableMap$Builder().put((Object)Class7521.field29193, (Object)Class7521.field29199).put((Object)Class7521.field29181, (Object)Class7521.field29192).put((Object)Class7521.field29198, (Object)Class7521.field29204).put((Object)Class7521.field29186, (Object)Class7521.field29191).put((Object)Class7521.field29197, (Object)Class7521.field29203).put((Object)Class7521.field29185, (Object)Class7521.field29190).put((Object)Class7521.field29195, (Object)Class7521.field29201).put((Object)Class7521.field29183, (Object)Class7521.field29188).put((Object)Class7521.field29196, (Object)Class7521.field29202).put((Object)Class7521.field29184, (Object)Class7521.field29189).put((Object)Class7521.field29194, (Object)Class7521.field29200).put((Object)Class7521.field29182, (Object)Class7521.field29187).build();
    }
}
