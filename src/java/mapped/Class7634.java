// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.UUID;

public class Class7634
{
    private static final Class1932 field30224;
    private static final Class1932 field30225;
    
    public static Class1932 method24003() {
        return Class7634.field30224;
    }
    
    public static Class1932 method24004(final UUID uuid) {
        return method24006(uuid) ? Class7634.field30225 : Class7634.field30224;
    }
    
    public static String method24005(final UUID uuid) {
        return method24006(uuid) ? "slim" : "default";
    }
    
    private static boolean method24006(final UUID uuid) {
        return (uuid.hashCode() & 0x1) == 0x1;
    }
    
    static {
        field30224 = new Class1932("textures/entity/steve.png");
        field30225 = new Class1932("textures/entity/alex.png");
    }
}
