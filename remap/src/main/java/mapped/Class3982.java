// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;

public class Class3982 extends Class3833
{
    private static String[] field17980;
    private static final VoxelShape field17981;
    
    public Class3982(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12305;
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3982.field17981;
    }
    
    @Override
    public float method11859(final BlockState class7096, final Class1855 class7097, final BlockPos class7098) {
        return 1.0f;
    }
    
    @Override
    public Class2117 method11858(final BlockState class7096) {
        return Class2117.field12341;
    }
    
    static {
        field17981 = Class3833.method11778(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);
    }
}
