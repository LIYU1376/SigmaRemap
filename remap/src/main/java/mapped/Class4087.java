// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.function.Predicate;

public class Class4087 extends Class4085
{
    public Class4087(final Properties properties) {
        super(properties);
        this.method11705(new ResourceLocation("pull"), (class8321, class8322, class8323) -> {
            if (class8323 != null) {
                return (class8323.method2766().getItem() == Items.field31279) ? ((class8321.method27652() - class8323.method2767()) / 20.0f) : 0.0f;
            }
            return 0.0f;
        });
        this.method11705(new ResourceLocation("pulling"), (class8321, class8322, class8323) -> {
            if (class8323 != null) {
                if (class8323.method2756()) {
                    if (class8323.method2766() == class8321) {
                        return 1.0f;
                    }
                }
            }
            return 0.0f;
        });
    }
    
    @Override
    public void method11727(final ItemStack class8321, final World class8322, final LivingEntity class8323, final int n) {
        if (class8323 instanceof PlayerEntity) {
            final PlayerEntity class8324 = (PlayerEntity)class8323;
            final boolean b = class8324.field3025.field27304 || Class8742.method30195(Class7882.field32372, class8321) > 0;
            ItemStack method2790 = class8324.method2790(class8321);
            if (!method2790.method27620() || b) {
                if (method2790.method27620()) {
                    method2790 = new ItemStack(Items.field31280);
                }
                final float method2791 = method12318(this.method11726(class8321) - n);
                if (method2791 >= 0.1) {
                    final boolean b2 = b && method2790.getItem() == Items.field31280;
                    if (!class8322.isRemote) {
                        final Class402 method2792 = ((Class3824)((method2790.getItem() instanceof Class3824) ? method2790.getItem() : Items.field31280)).method11758(class8322, method2790, class8324);
                        method2792.method1963(class8324, class8324.rotationPitch, class8324.rotationYaw, 0.0f, method2791 * 3.0f, 1.0f);
                        if (method2791 == 1.0f) {
                            method2792.method1978(true);
                        }
                        final int method2793 = Class8742.method30195(Class7882.field32369, class8321);
                        if (method2793 > 0) {
                            method2792.method1975(method2792.method1976() + method2793 * 0.5 + 0.5);
                        }
                        final int method2794 = Class8742.method30195(Class7882.field32370, class8321);
                        if (method2794 > 0) {
                            method2792.method1977(method2794);
                        }
                        if (Class8742.method30195(Class7882.field32371, class8321) > 0) {
                            method2792.setFire(100);
                        }
                        class8321.method27636(1, class8324, class8326 -> class8326.method2795(class8325.method2757()));
                        Label_0454: {
                            if (!b2) {
                                if (!class8324.field3025.field27304) {
                                    break Label_0454;
                                }
                                if (method2790.getItem() != Items.field31580) {
                                    if (method2790.getItem() != Items.field31581) {
                                        break Label_0454;
                                    }
                                }
                            }
                            method2792.field2474 = Class2151.field12784;
                        }
                        class8322.method6886(method2792);
                    }
                    class8322.method6706(null, class8324.getPosX(), class8324.getPosY(), class8324.getPosZ(), Class8520.field34993, Class286.field1585, 1.0f, 1.0f / (Class4087.field17363.nextFloat() * 0.4f + 1.2f) + method2791 * 0.5f);
                    if (!b2) {
                        if (!class8324.field3025.field27304) {
                            method2790.method27693(1);
                            if (method2790.method27620()) {
                                class8324.inventory.method2365(method2790);
                            }
                        }
                    }
                    class8324.method2859(Class8276.field33981.method8449(this));
                }
            }
        }
    }
    
    public static float method12318(final int n) {
        final float n2 = n / 20.0f;
        float n3 = (n2 * n2 + n2 * 2.0f) / 3.0f;
        if (n3 > 1.0f) {
            n3 = 1.0f;
        }
        return n3;
    }
    
    @Override
    public int method11726(final ItemStack class8321) {
        return 72000;
    }
    
    @Override
    public Class1992 method11725(final ItemStack class8321) {
        return Class1992.field11158;
    }
    
    @Override
    public Class9355<ItemStack> method11695(final World class1847, final PlayerEntity class1848, final Class316 class1849) {
        final ItemStack method2715 = class1848.method2715(class1849);
        final boolean b = !class1848.method2790(method2715).method27620();
        if (!class1848.field3025.field27304 && !b) {
            return Class9355.method34677(method2715);
        }
        class1848.method2762(class1849);
        return Class9355.method34675(method2715);
    }
    
    @Override
    public Predicate<ItemStack> method12290() {
        return Class4087.field18189;
    }
}
