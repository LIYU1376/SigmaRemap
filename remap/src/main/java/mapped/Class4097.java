// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Class4097 extends Item
{
    private static String[] field18197;
    
    public Class4097(final Properties properties) {
        super(properties);
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        class1847.method6706(null, class1848.getPosX(), class1848.getPosY(), class1848.getPosZ(), Class8520.field35172, Class286.field1584, 0.5f, 0.4f / (Class4097.field17363.nextFloat() * 0.4f + 0.8f));
        class1848.method2906().method25772(this, 20);
        if (!class1847.isRemote) {
            final Class412 class1850 = new Class412(class1847, class1848);
            class1850.method2012(method2715);
            class1850.method1963(class1848, class1848.rotationPitch, class1848.rotationYaw, 0.0f, 1.5f, 1.0f);
            class1847.method6886(class1850);
        }
        class1848.method2859(Class8276.field33981.method8449(this));
        if (!class1848.field3025.field27304) {
            method2715.method27693(1);
        }
        return Class9355.method34674(method2715);
    }
}
