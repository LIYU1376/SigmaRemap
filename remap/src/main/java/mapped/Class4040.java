// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.world.World;

public class Class4040 extends Class4036
{
    private static String[] field18134;
    
    public Class4040(final Block class3833, final Properties class3834) {
        super(class3833, class3834);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        return Class2201.field13402;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final RayTraceResult method2716 = Item.method11733(class1847, class1848, RayTraceContext.FluidMode.SOURCE_ONLY);
        if (method2716.getType() != RayTraceResult.Type.MISS) {
            if (method2716.getType() == RayTraceResult.Type.BLOCK) {
                final BlockRayTraceResult class1850 = (BlockRayTraceResult)method2716;
                final BlockPos method2717 = class1850.getPos();
                final Direction method2718 = class1850.getFace();
                if (!class1847.method6760(class1848, method2717) || !class1848.method2881(method2717.method1149(method2718), method2718, method2715)) {
                    return Class9355.method34677(method2715);
                }
                final BlockPos method2719 = method2717.method1137();
                final Material method2720 = class1847.getBlockState(method2717).method21697();
                if (class1847.getFluidState(method2717).getFluid() == Class7558.field29976 || method2720 == Material.ICE) {
                    if (class1847.method6961(method2719)) {
                        class1847.setBlockState(method2719, Blocks.field29393.getDefaultState(), 11);
                        if (class1848 instanceof Class513) {
                            Class7770.field31799.method13836((Class513)class1848, method2719, method2715);
                        }
                        if (!class1848.field3025.field27304) {
                            method2715.method27693(1);
                        }
                        class1848.method2859(Class8276.field33981.method8449(this));
                        class1847.method6705(class1848, method2717, Class8520.field35699, Class286.field1582, 1.0f, 1.0f);
                        return Class9355.method34674(method2715);
                    }
                }
            }
            return Class9355.method34677(method2715);
        }
        return Class9355.method34676(method2715);
    }
}
