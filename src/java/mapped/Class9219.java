// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.Map;

public class Class9219
{
    private static String[] field39553;
    public final Class9138 field39554;
    public final Class9138 field39555;
    public final Map<Class179, Class8111> field39556;
    public final Class8225 field39557;
    public final boolean field39558;
    
    public Class9219(final Class9138 field39554, final Class9138 field39555, final Map<Class179, Class8111> field39556, final Class8225 field39557, final boolean field39558) {
        this.field39554 = field39554;
        this.field39555 = field39555;
        this.field39556 = field39556;
        this.field39557 = field39557;
        this.field39558 = field39558;
        this.method34001();
    }
    
    private void method34001() {
        for (final Map.Entry entry : this.field39556.entrySet()) {
            ((Class8111)entry.getValue()).field33426.method28167(this.method34002((Class179)entry.getKey()));
        }
    }
    
    private float[] method34002(final Class179 class179) {
        switch (Class7789.field31877[class179.ordinal()]) {
            case 1: {
                return new float[] { this.field39554.method33311(), 16.0f - this.field39555.method33313(), this.field39555.method33311(), 16.0f - this.field39554.method33313() };
            }
            case 2: {
                return new float[] { this.field39554.method33311(), this.field39554.method33313(), this.field39555.method33311(), this.field39555.method33313() };
            }
            default: {
                return new float[] { 16.0f - this.field39555.method33311(), 16.0f - this.field39555.method33312(), 16.0f - this.field39554.method33311(), 16.0f - this.field39554.method33312() };
            }
            case 4: {
                return new float[] { this.field39554.method33311(), 16.0f - this.field39555.method33312(), this.field39555.method33311(), 16.0f - this.field39554.method33312() };
            }
            case 5: {
                return new float[] { this.field39554.method33313(), 16.0f - this.field39555.method33312(), this.field39555.method33313(), 16.0f - this.field39554.method33312() };
            }
            case 6: {
                return new float[] { 16.0f - this.field39555.method33313(), 16.0f - this.field39555.method33312(), 16.0f - this.field39554.method33313(), 16.0f - this.field39554.method33312() };
            }
        }
    }
}
