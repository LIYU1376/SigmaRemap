// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;
import javax.imageio.ImageIO;
import java.net.URL;
import java.awt.image.BufferedImage;

public class Class8773
{
    private String field36881;
    private boolean field36882;
    private long field36883;
    private boolean field36884;
    private String field36885;
    private BufferedImage field36886;
    private Class7776 field36887;
    
    public Class8773(final String field36881, final boolean field36882) {
        this.field36883 = System.currentTimeMillis();
        this.field36884 = true;
        this.field36885 = "";
        this.field36881 = field36881;
        if (this.field36882 = field36882) {
            new Thread(() -> {
                try {
                    new URL("https://jelloprg.sigmaclient.info/captcha/" + str + ".png");
                    final URL input;
                    this.field36886 = ImageIO.read(input);
                }
                catch (final IOException ex) {}
            }).start();
        }
    }
    
    public void finalize() throws Throwable {
        try {
            if (this.field36887 != null) {
                Class9463.method35173().method35182(this.field36887);
            }
        }
        finally {
            super.finalize();
        }
    }
    
    public Class7776 method30470() {
        if (this.field36887 == null && this.field36886 != null) {
            try {
                this.field36887 = Class9399.method34928("", this.field36886);
            }
            catch (final IOException ex) {
                ex.printStackTrace();
            }
        }
        return this.field36887;
    }
    
    public boolean method30471() {
        return this.field36882;
    }
    
    public boolean method30472() {
        return this.field36884 && this.field36883 > System.currentTimeMillis() - 300000L;
    }
    
    public void method30473(final boolean field36884) {
        this.field36884 = field36884;
    }
    
    public String method30474() {
        return this.field36885;
    }
    
    public void method30475(final String field36885) {
        this.field36885 = field36885;
    }
    
    public String method30476() {
        return this.field36881;
    }
}
