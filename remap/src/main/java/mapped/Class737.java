// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class737 extends Screen
{
    private final Class498 field3999;
    private Class576 field4000;
    private Class576 field4001;
    private Class576 field4002;
    private Class654 field4003;
    
    public Class737(final Class498 field3999) {
        super(NarratorChatListener.EMPTY);
        this.field3999 = field3999;
    }
    
    @Override
    public void tick() {
        this.field4000.method3376();
        this.field4001.method3376();
        this.field4002.method3376();
    }
    
    private void method4046() {
        this.method4048();
        this.minecraft.method5244(null);
    }
    
    private void method4047() {
        this.minecraft.method5244(null);
    }
    
    private void method4048() {
        this.minecraft.method5269().method17292(new Class4270(this.field3999.getPos(), new ResourceLocation(this.field4000.method3378()), new ResourceLocation(this.field4001.method3378()), this.field4002.method3378()));
    }
    
    @Override
    public void method3028() {
        this.method4047();
    }
    
    @Override
    public void init() {
        this.minecraft.field4651.method22505(true);
        this.field4003 = this.method3029(new Class654(this.width / 2 - 4 - 150, 210, 150, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> this.method4046()));
        this.method3029(new Class654(this.width / 2 + 4, 210, 150, 20, Class8822.method30773("gui.cancel", new Object[0]), class654 -> this.method4047()));
        (this.field4001 = new Class576(this.font, this.width / 2 - 152, 40, 300, 20, Class8822.method30773("jigsaw_block.target_pool", new Object[0]))).method3397(128);
        this.field4001.method3377(this.field3999.method2532().toString());
        this.field4001.method3374(p0 -> this.method4049());
        this.children.add(this.field4001);
        (this.field4000 = new Class576(this.font, this.width / 2 - 152, 80, 300, 20, Class8822.method30773("jigsaw_block.attachement_type", new Object[0]))).method3397(128);
        this.field4000.method3377(this.field3999.method2531().toString());
        this.field4000.method3374(p0 -> this.method4049());
        this.children.add(this.field4000);
        (this.field4002 = new Class576(this.font, this.width / 2 - 152, 120, 300, 20, Class8822.method30773("jigsaw_block.final_state", new Object[0]))).method3397(256);
        this.field4002.method3377(this.field3999.method2533());
        this.children.add(this.field4002);
        this.method3476(this.field4001);
        this.method4049();
    }
    
    public void method4049() {
        this.field4003.field3431 = (ResourceLocation.method7803(this.field4000.method3378()) & ResourceLocation.method7803(this.field4001.method3378()));
    }
    
    @Override
    public void method2970(final Minecraft class869, final int n, final int n2) {
        final String method3378 = this.field4000.method3378();
        final String method3379 = this.field4001.method3378();
        final String method3380 = this.field4002.method3378();
        this.init(class869, n, n2);
        this.field4000.method3377(method3378);
        this.field4001.method3377(method3379);
        this.field4002.method3377(method3380);
    }
    
    @Override
    public void removed() {
        this.minecraft.field4651.method22505(false);
    }
    
    @Override
    public boolean keyPressed(final int n, final int n2, final int n3) {
        if (super.keyPressed(n, n2, n3)) {
            return true;
        }
        if (this.field4003.field3431 && (n == 257 || n == 335)) {
            this.method4046();
            return true;
        }
        return false;
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.method3297(this.font, Class8822.method30773("jigsaw_block.target_pool", new Object[0]), this.width / 2 - 153, 30, 10526880);
        this.field4001.method2975(n, n2, n3);
        this.method3297(this.font, Class8822.method30773("jigsaw_block.attachement_type", new Object[0]), this.width / 2 - 153, 70, 10526880);
        this.field4000.method2975(n, n2, n3);
        this.method3297(this.font, Class8822.method30773("jigsaw_block.final_state", new Object[0]), this.width / 2 - 153, 110, 10526880);
        this.field4002.method2975(n, n2, n3);
        super.method2975(n, n2, n3);
    }
}
