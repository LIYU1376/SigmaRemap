// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class4049 extends Item
{
    public Class4049(final Properties properties) {
        super(properties);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final Class7096 method21656 = method21654.getBlockState(method21655);
        if (method21656.method21696() != Blocks.LECTERN) {
            return Class2201.field13402;
        }
        return Class3930.method12040(method21654, method21655, method21656, class7075.method21651()) ? Class2201.field13400 : Class2201.field13402;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        class1848.method2835(method2715, class1849);
        class1848.method2859(Class8276.field33981.method8449(this));
        return Class9355.method34674(method2715);
    }
    
    public static boolean method12247(final CompoundNBT class51) {
        if (class51 == null) {
            return false;
        }
        if (class51.contains("pages", 9)) {
            final ListNBT method328 = class51.getList("pages", 8);
            for (int i = 0; i < method328.size(); ++i) {
                if (method328.method353(i).length() > 32767) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
