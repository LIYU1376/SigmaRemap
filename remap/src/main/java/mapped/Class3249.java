// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.AxisAlignedBB;

public class Class3249 extends Class3247
{
    public Class3249() {
        super(Class8013.field32990, "Spider", "Climp walls like spiders", new Class3167[] { new Class3307(), new Class3322() });
    }
    
    public int method10264() {
        final AxisAlignedBB class6221 = new AxisAlignedBB(Class3249.field15514.player.posX - 0.29, Class3249.field15514.player.posY + 1.9, Class3249.field15514.player.posZ + 0.29, Class3249.field15514.player.posX + 0.29, Class3249.field15514.player.posY, Class3249.field15514.player.posZ - 0.29);
        if (Class3249.field15514.world.method6981(Class3249.field15514.player, class6221.offset(0.3000001, 0.0, 0.0)).count() != 0L) {
            return 1;
        }
        if (Class3249.field15514.world.method6981(Class3249.field15514.player, class6221.offset(-0.3000001, 0.0, 0.0)).count() != 0L) {
            return 2;
        }
        if (Class3249.field15514.world.method6981(Class3249.field15514.player, class6221.offset(0.0, 0.0, 0.3000001)).count() != 0L) {
            return 3;
        }
        if (Class3249.field15514.world.method6981(Class3249.field15514.player, class6221.offset(0.0, 0.0, -0.3000001)).count() == 0L) {
            return 0;
        }
        return 4;
    }
}
