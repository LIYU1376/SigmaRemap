// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import com.mentalfrostbyte.jello.mods.Category;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.impl.gui.BrainFreeze;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Map;

public class Class4801 extends Class4800
{
    public Class4919 field20459;
    private static Minecraft field20460;
    private static Class9572 field20461;
    private static boolean field20462;
    private static boolean field20463;
    private Map<Category, Class4924> field20464;
    public Class4833 field20465;
    public Class4912 field20466;
    public Class4889 field20467;
    public Class4895 field20468;
    public Class4907 field20469;
    private static boolean field20470;
    public Class4924 field20471;
    
    public Class4801() {
        super("JelloScreen");
        this.field20464 = new HashMap<Category, Class4924>();
        this.field20471 = null;
        Class4801.field20463 |= !Class4801.field20462;
        int n = 30;
        int n2 = 30;
        this.method14239(this.field20466 = new Class4912(this, "brainFreeze"));
        for (final Module class3167 : Client.method35173().method35189().method21553().values()) {
            if (this.field20464.containsKey(class3167.getCategory2())) {
                continue;
            }
            final Class4924 class3168 = new Class4924(this, class3167.getCategory2().getName(), n, n2, class3167.getCategory2());
            this.field20464.put(class3167.getCategory2(), class3168);
            this.method14239(class3168);
            n += class3168.method14276() + 10;
            if (this.field20464.size() == 4) {
                n = 30;
                n2 += class3168.method14278() - 20;
            }
            class3168.method14775(class4802 -> class4801.method14225(() -> {
                final Class4895 field20468 = new Class4895(class4803, "settings", 0, 0, this.field20480, this.field20481, class4804);
                class4803.method14239(this.field20468 = field20468);
                this.field20468.method14301(true);
            }));
        }
        this.method14239(this.field20465 = new Class4833(this, "musicPlayer"));
        this.field20465.method14385(true);
        final Class4873 class3169;
        this.method14239(class3169 = new Class4873(this, "more", this.method14276() - 69, this.method14278() - 55, 55, 41, ClientAssets.options2));
        class3169.method14318().method19730(Class6430.method19118(Class265.field1278.field1292, 0.3f));
        class3169.method14311(false);
        this.field20465.method14297(Class4801.field20470);
        class3169.method14260((class4803, n) -> this.method14225(() -> {
            if (this.field20467 != null && this.method14248(this.field20467)) {
                this.method14243(this.field20467);
            }
            else {
                final Class4889 field20467 = new Class4889(this, "morepopover", this.method14276() - 14, this.method14278() - 14);
                this.method14239(this.field20467 = field20467);
                this.field20467.method14301(true);
            }
        }));
        Class4801.field20461 = new Class9572(450, 125);
        this.field20459 = new Class4919(this, this, "overlay");
        Class6430.method19169();
        Class6430.method19170(Class4801.field20461.method35858());
    }
    
    public boolean method14208() {
        if (Client.method35173().method35199().method24199() && Client.method35173().method35199().method24200()) {
            return false;
        }
        if (this.field20469 == null) {
            this.method14225(() -> {
                final ArrayList list = new ArrayList();
                list.add(new Class7976(Class294.field1678, "Music", 40));
                list.add(new Class7976(Class294.field1675, "Jello Music requires:", 20));
                if (!Client.method35173().method35199().method24199()) {
                    list.add(new Class7976(Class294.field1675, "- Python 2.7.17", 30));
                }
                if (!Client.method35173().method35199().method24200()) {
                    list.add(new Class7976(Class294.field1675, "- Visual C++ 2010 x86", 30));
                }
                list.add(new Class7976(Class294.field1677, "Download", 55));
                final Class4907 field20469 = new Class4907(this, "music", true, "Dependencies.", (Class7976[])list.toArray(new Class7976[0]));
                this.method14242(this.field20469 = field20469);
                this.field20469.method14516(class4841 -> {
                    if (!Client.method35173().method35199().method24199()) {
                        Util.method27845().method980("https://www.python.org/ftp/python/2.7.17/python-2.7.17-macosx10.9.pkg");
                    }
                    if (!Client.method35173().method35199().method24200()) {
                        Util.method27845().method980("https://www.microsoft.com/en-US/download/details.aspx?id=5555");
                    }
                });
                this.field20469.method14745(class4841 -> new Thread(() -> {
                    try {
                        Thread.sleep(114L);
                        this.method14225(() -> {
                            this.method14245(this.field20469);
                            this.field20469 = null;
                        });
                    }
                    catch (final InterruptedException ex) {
                        ex.printStackTrace();
                    }
                }).start());
                this.field20469.method14744(true);
                return;
            });
            return true;
        }
        return true;
    }
    
    public void method14209() {
        final Iterator<Class4924> iterator = this.field20464.values().iterator();
        while (iterator.hasNext()) {
            iterator.next().method14772();
        }
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        this.field20465.method14297(this.field20465.method14276() < this.method14276() && this.field20465.method14278() < this.method14278());
        super.method14200(n, n2);
        Class6430.method19170(Math.min(1.0f, Class4801.field20461.method35858() * 4.0f));
        this.field20466.method14297(Client.method35173().method35189().method21551(BrainFreeze.class).method9906());
        if (this.field20467 != null) {
            final int n3 = n - this.field20467.method14280();
            final int n4 = n2 - this.field20467.method14281();
            if (n3 < -10 || n4 < -10) {
                this.field20467.method14638();
            }
        }
        if (this.field20467 != null) {
            if (this.field20467.method14639()) {
                this.method14245(this.field20467);
                this.field20467 = null;
            }
        }
        if (Class4801.field20461.method35857() == Class2186.field12965) {
            if (this.field20468 != null) {
                if (!this.field20468.field20936) {
                    this.field20468.field20936 = true;
                }
            }
        }
        if (this.field20468 != null) {
            if (this.field20468.field20936) {
                if (this.field20468.field20926.method35858() == 0.0f) {
                    this.method14225(() -> {
                        this.method14245(this.field20468);
                        this.field20468 = null;
                        return;
                    });
                }
            }
        }
        if (Class4801.field20463) {
            final float n5 = (float)(0.029999999329447746 * (60.0 / this.method14201()));
            final Class2186 method35857 = Class4801.field20461.method35857();
            Class4801.field20461.method35855(Class4801.field20462 ? Class2186.field12965 : Class2186.field12964);
            if (Class4801.field20461.method35858() <= 0.0f && Class4801.field20462) {
                this.method14210(Class4801.field20462 = false);
            }
            else if (Class4801.field20461.method35858() >= 1.0f) {
                if (Class4801.field20461.method35857() == method35857) {
                    this.method14210(Class4801.field20462 = true);
                }
            }
        }
        if (Class4801.field20463) {
            if (Class4801.field20462) {
                Class6430.method19172();
            }
        }
    }
    
    @Override
    public int method14201() {
        final Minecraft field20460 = Class4801.field20460;
        return Minecraft.method5338();
    }
    
    @Override
    public Class4405 method14202(final Class4405 class4405) {
        Class6430.method19172();
        this.method14243(this.field20459);
        return super.method14202(class4405);
    }
    
    @Override
    public void method14203(final Class4405 class4405) {
        super.method14203(class4405);
    }
    
    private void method14210(final boolean b) {
        Class4801.field20463 = false;
        if (!b) {
            Class4801.field20460.displayGuiScreen(null);
        }
    }
    
    @Override
    public boolean method14211(final int n, final int n2, final int n3) {
        if (n3 <= 1) {
            return super.method14211(n, n2, n3);
        }
        this.method14204(n3);
        return false;
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        final int method21959 = Client.method35173().method35189().method21557().method21959(Class722.class);
        if (n != 256) {
            if (n != method21959) {
                return;
            }
            if (this.field20468 != null) {
                return;
            }
            if (this.method14230()) {
                return;
            }
        }
        if (Class4801.field20463) {
            Class4801.field20462 = !Class4801.field20462;
        }
        Class4801.field20463 = true;
    }
    
    public float method14212(final float n, final float n2) {
        if (Class4801.field20461.method35857() != Class2186.field12965) {
            return (float)(Math.pow(2.0, -10.0f * n) * Math.sin((n - n2 / 4.0f) * 6.283185307179586 / n2) + 1.0);
        }
        return Class7791.method25030(n, 0.0f, 1.0f, 1.0f);
    }
    
    @Override
    public void method14205(final float n) {
        float n2 = (Class4801.field20463 && !Class4801.field20462) ? (this.method14212(Class4801.field20461.method35858(), 0.8f) * 0.5f + 0.5f) : (Class4801.field20463 ? this.method14212(Class4801.field20461.method35858(), 1.0f) : 1.0f);
        Class8154.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.field20480), (float)(this.field20479 + this.field20481), Class6430.method19118(Class265.field1273.field1292, 0.2f * n * n2));
        float n3 = 1.0f;
        if (this.field20468 != null) {
            float n4 = Class7707.method24584(this.field20468.field20927.method35858(), 0.0f, 1.0f, 1.0f);
            if (this.field20468.field20927.method35857() == Class2186.field12965) {
                n4 = Class8468.method28269(this.field20468.field20927.method35858(), 0.0f, 1.0f, 1.0f);
            }
            n3 -= this.field20468.field20927.method35858() * 0.1f;
            n2 *= 1.0f + n4 * 0.2f;
        }
        if (Client.method35173().method35189().method21556().method32707() != null) {
            final String field33839 = Client.method35173().method35189().method21556().method32707().field33839;
            Class8154.method26889(ClientFonts.JelloLight20, (float)(this.field20480 - ClientFonts.JelloLight20.getWidth(field33839) - 80), (float)(this.field20481 - 47), field33839, Class6430.method19118(Class265.field1278.field1292, 0.5f * Math.max(0.0f, Math.min(1.0f, n2))));
        }
        for (final Class4803 class4803 : this.method14250()) {
            class4803.method14295((int)((class4803.method14272() + class4803.method14276() / 2 - Class4801.field20460.field4632.method7694() / 2) * (1.0f - n2) * 0.5f), (int)((class4803.method14274() + class4803.method14278() / 2 - Class4801.field20460.field4632.method7695() / 2) * (1.0f - n2) * 0.5f));
            class4803.method14288(1.5f - n2 * 0.5f, 1.5f - n2 * 0.5f);
        }
        super.method14205(n * Math.min(1.0f, n2) * n3);
        if (this.field20471 != null) {
            this.field20471.method14301(false);
        }
        this.field20459.method14301(false);
        this.method14243(this.field20459);
    }
    
    static {
        Class4801.field20460 = Minecraft.method5277();
        Class4801.field20470 = true;
    }
}
