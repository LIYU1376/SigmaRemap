// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class Class4068 extends Item
{
    private static String[] field18161;
    private static final Class6423 field18162;
    private final Class2080 field18163;
    
    public Class4068(final Class2080 field18163, final Properties properties) {
        super(properties);
        this.field18163 = field18163;
        Class3955.method12069(this, Class4068.field18162);
    }
    
    @Override
    public Class2201 method11694(final Class7075 class7075) {
        final World method21654 = class7075.method21654();
        final BlockPos method21655 = class7075.method21639();
        final BlockState method21656 = method21654.getBlockState(method21655);
        if (method21656.method21755(Class7188.field27906)) {
            final ItemStack method21657 = class7075.method21651();
            if (!method21654.isRemote) {
                final Class104 class7076 = (method21656.getBlock() instanceof Class4017) ? method21656.get(((Class4017)method21656.getBlock()).method12205()) : Class104.field311;
                double n = 0.0;
                if (class7076.method597()) {
                    n = 0.5;
                }
                final Class428 method21658 = Class428.method2122(method21654, method21655.getX() + 0.5, method21655.getY() + 0.0625 + n, method21655.getZ() + 0.5, this.field18163);
                if (method21657.method27667()) {
                    method21658.method1872(method21657.method27664());
                }
                method21654.method6886(method21658);
            }
            method21657.method27693(1);
            return Class2201.field13400;
        }
        return Class2201.field13403;
    }
    
    static {
        field18162 = new Class6421();
    }
}
