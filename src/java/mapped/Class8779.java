// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import javax.annotation.Nullable;

public class Class8779
{
    private static String[] field36914;
    private final Class7929 field36915;
    private final int field36916;
    private final float field36917;
    private final float field36918;
    private final String field36919;
    private final float field36920;
    
    public Class8779(final Class7929 field36915, final int field36916, final float field36917, final float field36918, final String field36919, final float field36920) {
        this.field36915 = field36915;
        this.field36916 = field36916;
        this.field36917 = field36918;
        this.field36918 = field36917;
        this.field36919 = field36919;
        this.field36920 = field36920;
    }
    
    public Class7929 method30537() {
        return this.field36915;
    }
    
    public float method30538() {
        return this.field36917;
    }
    
    public boolean method30539() {
        return this.field36915.method25714() instanceof Class511;
    }
    
    @Nullable
    public String method30540() {
        return this.field36919;
    }
    
    @Nullable
    public Class2250 method30541() {
        return (this.method30537().method25714() != null) ? this.method30537().method25714().method1871() : null;
    }
    
    public float method30542() {
        return (this.field36915 != Class7929.field32574) ? this.field36920 : Float.MAX_VALUE;
    }
}
