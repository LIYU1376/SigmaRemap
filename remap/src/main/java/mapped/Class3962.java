// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.Random;

public class Class3962 extends Block
{
    private static String[] field17903;
    private final Block field17904;
    
    public Class3962(final Block field17904, final Properties class9288) {
        super(class9288);
        this.field17904 = field17904;
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (!this.method12091(class7097, class7098)) {
            class7097.setBlockState(class7098, this.field17904.getDefaultState(), 2);
        }
    }
    
    @Override
    public BlockState method11789(final BlockState class7096, final Direction class7097, final BlockState class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
        if (!this.method12091(class7099, class7100)) {
            class7099.method6833().method21345(class7100, this, 60 + class7099.method6790().nextInt(40));
        }
        return super.method11789(class7096, class7097, class7098, class7099, class7100, class7101);
    }
    
    public boolean method12091(final IBlockReader class1855, final BlockPos class1856) {
        final Direction[] values = Direction.values();
        for (int length = values.length, i = 0; i < length; ++i) {
            if (class1855.getFluidState(class1856.method1149(values[i])).isTagged(Class7324.field28319)) {
                return true;
            }
        }
        return false;
    }
    
    @Nullable
    @Override
    public BlockState method11846(final Class7074 class7074) {
        if (!this.method12091(class7074.method21654(), class7074.method21639())) {
            class7074.method21654().method6833().method21345(class7074.method21639(), this, 60 + class7074.method21654().method6790().nextInt(40));
        }
        return this.getDefaultState();
    }
}
