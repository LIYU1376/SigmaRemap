// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class4649 extends Class4648
{
    private static String[] field20132;
    public final /* synthetic */ Class431 field20133;
    
    public Class4649(final Class431 field20133) {
        this.field20133 = field20133;
    }
    
    @Override
    public void method13894(final int n) {
        this.field20133.world.method6761(this.field20133, (byte)n);
    }
    
    @Override
    public World method13895() {
        return this.field20133.world;
    }
    
    @Override
    public BlockPos method13896() {
        return new BlockPos(this.field20133);
    }
}
