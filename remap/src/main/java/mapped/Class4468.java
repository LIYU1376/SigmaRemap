// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.jello.mods.impl.world.CakeEater;
import net.minecraft.util.math.BlockPos;

import java.util.Comparator;

public class Class4468 implements Comparator<BlockPos>
{
    private static String[] field19827;
    public final /* synthetic */ CakeEater field19828;
    
    public Class4468(final CakeEater field19828) {
        this.field19828 = field19828;
    }
    
    @Override
    public int compare(final BlockPos class354, final BlockPos class355) {
        return (Math.sqrt(CakeEater.method10148().field4684.method1733(class354.getX() + 0.5, class354.getY() + 0.5, class354.getZ() + 0.5)) <= Math.sqrt(CakeEater.method10149().field4684.method1733(class355.getX() + 0.5, class355.getY() + 0.5, class355.getZ() + 0.5))) ? -1 : 1;
    }
}
