// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class4059 extends Item
{
    private static String[] field18154;
    
    public Class4059(final Properties properties) {
        super(properties);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final BlockState method21656 = method21654.getBlockState(method21655);
        if (method21656.getBlock() != Blocks.OBSIDIAN && method21656.getBlock() != Blocks.field29172) {
            return Class2201.field13403;
        }
        final BlockPos method21657 = method21655.method1137();
        if (!method21654.method6961(method21657)) {
            return Class2201.field13403;
        }
        final double n = method21657.getX();
        final double n2 = method21657.getY();
        final double n3 = method21657.getZ();
        if (method21654.method7127(null, new AxisAlignedBB(n, n2, n3, n + 1.0, n2 + 2.0, n3 + 1.0)).isEmpty()) {
            if (!method21654.isRemote) {
                final Class858 class7076 = new Class858(method21654, n + 0.5, n2, n3 + 0.5);
                class7076.method5184(false);
                method21654.method6886(class7076);
                if (method21654.dimension instanceof Class6738) {
                    ((Class6738)method21654.dimension).method20509().method29253();
                }
            }
            class7075.method21651().method27693(1);
            return Class2201.field13400;
        }
        return Class2201.field13403;
    }
    
    @Override
    public boolean method11730(final ItemStack class8321) {
        return true;
    }
}
