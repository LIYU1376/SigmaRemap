// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class712 extends Class698
{
    private Screen field3888;
    private Class5760 field3889;
    private static Class6469[] field3890;
    
    public Class712(final Screen field3888, final Class5760 field3889) {
        super(new StringTextComponent(Class8822.method30773("of.options.animationsTitle", new Object[0])));
        this.field3888 = field3888;
        this.field3889 = field3889;
    }
    
    @Override
    public void init() {
        this.field3842.clear();
        for (int i = 0; i < Class712.field3890.length; ++i) {
            this.method3029(Class712.field3890[i].method19362(this.minecraft.field4648, this.width / 2 - 155 + i % 2 * 160, this.height / 6 + 21 * (i / 2) - 12, 150));
        }
        this.method3029(new Class673(210, this.width / 2 - 155, this.height / 6 + 168 + 11, 70, 20, Class4647.method13876("of.options.animation.allOn")));
        this.method3029(new Class673(211, this.width / 2 - 155 + 80, this.height / 6 + 168 + 11, 70, 20, Class4647.method13876("of.options.animation.allOff")));
        this.method3029(new Class678(200, this.width / 2 + 5, this.height / 6 + 168 + 11, Class8822.method30773("gui.done", new Object[0])));
    }
    
    @Override
    public void method3896(final Class573 class573) {
        if (class573 instanceof Class673) {
            final Class673 class574 = (Class673)class573;
            if (class574.field3431) {
                if (class574.field3708 == 200) {
                    this.minecraft.field4648.method17121();
                    this.minecraft.method5244(this.field3888);
                }
                if (class574.field3708 == 210) {
                    this.minecraft.field4648.method17140(true);
                }
                if (class574.field3708 == 211) {
                    this.minecraft.field4648.method17140(false);
                }
                this.minecraft.method5248();
            }
        }
    }
    
    @Override
    public void removed() {
        this.minecraft.field4648.method17121();
        super.removed();
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.method3295(this.minecraft.fontRenderer, this.field3148.getFormattedText(), this.width / 2, 15, 16777215);
        super.method2975(n, n2, n3);
    }
    
    static {
        Class712.field3890 = new Class6469[] { Class6469.field25758, Class6469.field25759, Class6469.field25760, Class6469.field25761, Class6469.field25767, Class6469.field25768, Class6469.field25769, Class6469.field25770, Class6469.field25780, Class6469.field25781, Class6469.field25782, Class6469.field25783, Class6469.field25784, Class6469.field25787, Class6469.field25789, Class6469.field25800, Class6469.field25785, Class6469.field25727 };
    }
}
