// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.ChunkPos;

public class Class6796 implements IChunkLoadingError
{
    public final /* synthetic */ ChunkPos field26730;
    public final /* synthetic */ Class388 field26731;
    
    public Class6796(final Class388 field26731, final ChunkPos field26732) {
        this.field26731 = field26731;
        this.field26730 = field26732;
    }
    
    @Override
    public String toString() {
        return "Unloaded " + this.field26730.toString();
    }
}
