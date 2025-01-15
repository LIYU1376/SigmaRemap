// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import java.util.Collection;
import java.util.Arrays;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Class3176 extends Class3167
{
    private List<Class9052> field15541;
    private Class7838 field15542;
    private Class354 field15543;
    private Class354 field15544;
    private Class3833 field15545;
    private Class9052 field15546;
    private boolean field15547;
    private boolean field15548;
    private final int field15549 = 0;
    private List<String> field15550;
    private int field15551;
    private int field15552;
    
    public Class3176() {
        super(Class8013.field32987, "JelloEdit", "Client side world edit");
        this.field15548 = true;
        this.field15550 = new ArrayList<String>();
        final File file = new File(Class9463.method35173().method35208() + "/shematics");
        if (file.exists()) {
            this.field15550 = new ArrayList<String>(Arrays.asList(file.list()));
            for (int i = 0; i < this.field15550.size(); ++i) {
                if (this.field15550.get(i).startsWith(".")) {
                    this.field15550.remove(i);
                    break;
                }
            }
            this.method9881(new Class5001("Shematics", "shematics", 0, (String[])this.field15550.toArray(new String[this.field15550.size()])));
        }
    }
    
    private Class354 method9965(final int n) {
        return new Class354(this.field15543.method1074() + this.field15542.method25323().get(n).method31757().method7836(), this.field15543.method1075() + this.field15542.method25323().get(n).method31757().method7840(), this.field15543.method1076() + this.field15542.method25323().get(n).method31757().method7844());
    }
    
    private Class3833 method9966(final int n) {
        return Class3833.method11775(this.field15542.method25323().get(n).method31755()).method21696();
    }
    
    private Class354 method9967() {
        this.field15545 = this.method9966(this.field15552);
        return this.field15544 = this.method9965(this.field15552++);
    }
    
    private Class9052 method9968() {
        return this.field15546 = this.field15541.get(this.field15551++);
    }
    
    @Override
    public void method9879() {
        final File file = new File(Class9463.method35173().method35208() + "/shematics/" + (String)this.method9882("Shematics"));
        if (!file.exists()) {
            Class6430.method19106("Schematic does not exist");
            this.method9910();
            return;
        }
        this.field15542 = new Class7838(file);
        if (this.field15542.method25316() && this.field15542.method25323().size() > 0) {
            Class6430.method19106(this.field15542.method25323().size() + " blocks loaded from schematic");
            this.field15543 = new Class354(Class3176.field15514.field4684.field2395 + this.field15542.method25322().method7835() * 0.0, Class3176.field15514.field4684.field2396 + this.field15542.method25322().method7839() * 0.0, Class3176.field15514.field4684.field2397 + this.field15542.method25322().method7843() * 0.0);
            this.method9967();
            return;
        }
        Class6430.method19106("Unable to load schematic");
        this.method9910();
    }
    
    @Class6753
    private void method9969(final Class5739 class5739) {
        if (this.method9906()) {
            GL11.glAlphaFunc(516, 0.0f);
            for (final Class8951 class5740 : this.field15542.method25323()) {
                final Class354 class5741 = new Class354(this.field15543.method1074() + class5740.method31757().method7835(), this.field15543.method1075() + class5740.method31757().method7839(), this.field15543.method1076() + class5740.method31757().method7843());
                if (Class4609.method13666(class5741) != Class7521.field29147) {
                    continue;
                }
                final double n = class5741.method1074() - Class3176.field15514.field4644.method5833().method18161().method16760();
                final double n2 = class5741.method1075() - Class3176.field15514.field4644.method5833().method18161().method16761();
                final double n3 = class5741.method1076() - Class3176.field15514.field4644.method5833().method18161().method16762();
                final Class7644 class5742 = new Class7644(n, n2, n3, n + 1.0, n2 + 1.0, n3 + 1.0);
                Class8154.method26909(class5742, Class6430.method19118(Class265.field1285.field1292, 0.02f));
                GL11.glEnable(2848);
                Class8154.method26911(class5742, Class6430.method19118(Class265.field1285.field1292, 0.03f));
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
            }
            final Iterator<Class9052> iterator2 = this.field15541.iterator();
            while (iterator2.hasNext()) {
                final Class354 field38320 = iterator2.next().field38320;
                final double n4 = field38320.method1074() - Class3176.field15514.field4644.method5833().method18161().method16760();
                final double n5 = field38320.method1075() - Class3176.field15514.field4644.method5833().method18161().method16761();
                final double n6 = field38320.method1076() - Class3176.field15514.field4644.method5833().method18161().method16762();
                final Class7644 class5743 = new Class7644(n4, n5, n6, n4 + 1.0, n5 + 1.0, n6 + 1.0);
                Class8154.method26909(class5743, Class6430.method19118(Class265.field1274.field1292, 0.1f));
                Class8154.method26911(class5743, Class6430.method19118(Class265.field1274.field1292, 0.2f));
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
            }
        }
    }
}
