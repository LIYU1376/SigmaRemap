// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.stream.Stream;
import java.util.Arrays;

public class Class706 extends Class703
{
    private Class606 field3878;
    private static final Class6469[] field3879;
    
    public Class706(final Screen class527, final Class5760 class528) {
        super(class527, class528, new Class2259("options.mouse_settings.title", new Object[0]));
    }
    
    @Override
    public void init() {
        this.field3878 = new Class606(this.minecraft, this.width, this.height, 32, this.height - 32, 25);
        if (!Class8341.method27802()) {
            this.field3878.method3567(Class706.field3879);
        }
        else {
            this.field3878.method3567(Stream.concat((Stream<?>)Arrays.stream(Class706.field3879), (Stream<?>)Stream.of(Class6469.field25716)).toArray(Class6469[]::new));
        }
        this.children.add(this.field3878);
        this.method3029(new Class654(this.width / 2 - 100, this.height - 27, 200, 20, Class8822.method30773("gui.done", new Object[0]), class654 -> {
            this.field3869.method17121();
            this.minecraft.method5244(this.field3868);
        }));
    }
    
    @Override
    public void method2975(final int n, final int n2, final float n3) {
        this.renderBackground();
        this.field3878.method2975(n, n2, n3);
        this.method3295(this.font, this.field3148.getFormattedText(), this.width / 2, 5, 16777215);
        super.method2975(n, n2, n3);
    }
    
    static {
        field3879 = new Class6469[] { Class6469.field25718, Class6469.field25739, Class6469.field25715, Class6469.field25735, Class6469.field25746 };
    }
}
