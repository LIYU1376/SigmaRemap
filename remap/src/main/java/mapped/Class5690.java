// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class5690 extends Class5611
{
    public final /* synthetic */ RealmsMainScreen field23123;
    
    public Class5690(final RealmsMainScreen field23123) {
        this.field23123 = field23123;
        super(11, RealmsMainScreen.method15828(field23123) + 4, RealmsMainScreen.method15829(field23123) + 4, 12, 12, RealmsScreen.getLocalizedString("mco.selectServer.close"));
    }
    
    @Override
    public void method16922() {
        super.method16922();
    }
    
    @Override
    public void method16920(final int n, final int n2, final float n3) {
        super.method16920(n, n2, n3);
    }
    
    @Override
    public void method16934(final int n, final int n2, final float n3) {
        RealmsScreen.method15419("realms:textures/gui/realms/cross_icon.png");
        RenderSystem.method30068(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.pushMatrix();
        RealmsScreen.method15411(this.method16929(), this.method16928(), 0.0f, this.method16923().method3360() ? 12.0f : 0.0f, 12, 12, 12, 24);
        RenderSystem.popMatrix();
        if (this.method16923().isMouseOver(n, n2)) {
            RealmsMainScreen.method15830(this.field23123, this.method16923().method3369());
        }
    }
    
    @Override
    public void method16932() {
        RealmsMainScreen.method15831(this.field23123);
    }
}
