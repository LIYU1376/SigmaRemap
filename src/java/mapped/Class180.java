// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public enum Class180 implements Class103
{
    field530("single", 0), 
    field531("left", 2), 
    field532("right", 1);
    
    public static final Class180[] field533;
    private final String field534;
    private final int field535;
    
    private Class180(final String field534, final int field535) {
        this.field534 = field534;
        this.field535 = field535;
    }
    
    @Override
    public String method596() {
        return this.field534;
    }
    
    public Class180 method812() {
        return Class180.field533[this.field535];
    }
    
    static {
        field533 = values();
    }
}
