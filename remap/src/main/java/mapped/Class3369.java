// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3369 extends Class3167
{
    public Class3369() {
        super(Class8013.field32990, "NoClip", "NoClip phase");
    }
    
    @Class6753
    private void method10715(final Class5713 class5713) {
        if (this.method9906()) {
            class5713.method16961(true);
        }
    }
    
    @Class6753
    public void method10716(final Class5753 class5753) {
        if (this.method9906() && Class3369.field15514.world != null) {
            if (class5753.method17064().getY() >= Class3369.field15514.player.posY) {
                class5753.method17067(VoxelShapes.empty());
            }
        }
    }
    
    @Class6753
    public void method10717(final Class5743 class5743) {
        if (!this.method9906()) {
            return;
        }
        Class3369.field15514.player.field2985 = 3;
        if (Class3369.field15514.player.ticksExisted % 2 != 0) {
            return;
        }
        if (Class3369.field15514.player.onGround) {
            if (!Class3369.field15514.player.field2967) {
                if (Class3369.field15514.player.method1809()) {
                    Class3369.field15514.player.setPosition(Class3369.field15514.player.posX, Class3369.field15514.player.posY - 1.0, Class3369.field15514.player.posZ);
                }
            }
            else {
                Class3369.field15514.player.setPosition(Class3369.field15514.player.posX, Class3369.field15514.player.posY + 1.0, Class3369.field15514.player.posZ);
            }
        }
    }
}
