// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;

public class Class3973 extends Block
{
    private static String[] field17947;
    
    public Class3973(final Properties class9288) {
        super(class9288);
    }
    
    @Override
    public boolean propagatesSkylightDown(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return true;
    }
    
    @Override
    public Class2115 method11797(final BlockState class7096) {
        return Class2115.field12305;
    }
    
    @Override
    public float method11859(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098) {
        return 1.0f;
    }
    
    @Override
    public boolean canEntitySpawn(final BlockState class7096, final IBlockReader class7097, final BlockPos class7098, final EntityType<?> class7099) {
        return false;
    }
}
