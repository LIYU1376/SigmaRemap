// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;
import com.mentalfrostbyte.jello.ClientFonts;
import slick2d.Texture;

public class Class4897 extends Class4841
{
    public float field20943;
    private final int field20944 = 10;
    private final int field20945 = 60;
    public int field20508;
    public int field20509;
    public int field20946;
    public int field20947;
    private Class7994 field20948;
    
    public Class4897(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4, final String s2) {
        super(class4803, s, n, n2, n3, n4, Class6523.field25964, s2, false);
        this.field20943 = 0.0f;
        this.field20496 = ClientFonts.JelloLight20;
    }
    
    @Override
    public void method14200(final int field20508, final int field20509) {
        this.field20508 = field20508;
        this.field20509 = field20509;
    }
    
    @Override
    public void draw(final float n) {
        this.field20948 = Client.getInstance().method35201().method19347();
        String field32930 = "Log in";
        final Texture field32931 = ClientAssets.account;
        if (this.field20948 != null) {
            field32930 = this.field20948.field32930;
        }
        this.method14277(this.field20496.getWidth(field32930) + 50 + 60);
        this.method14273(Minecraft.method5277().window.method7694() - this.field20480 - 20);
        this.field20943 = Math.max(0.0f, Math.min(1.0f, this.field20943 + ((this.field20508 >= this.field20478 && this.field20509 <= this.field20479 + this.method14278()) ? 0.1f : -0.1f)));
        RenderUtil.method26913((float)this.field20478, (float)this.field20479, (float)this.method14276(), (float)this.method14278(), 20.0f, this.field20943 * 0.2f * n);
        RenderUtil.method26876((float)this.field20478, (float)this.field20479, (float)(this.field20478 + this.method14276()), (float)(this.field20479 + this.method14278()), ColorUtils.applyAlpha(ClientColors.field1282.color, (0.2f * this.field20943 + (this.method14309() ? 0.2f : 0.0f)) * n));
        final float n2 = (float)(this.field20478 + this.field20480 - 60 - 10);
        final float n3 = (float)(this.field20479 + 10);
        RenderUtil.method26899((float)(this.field20478 + this.field20480 - 60 - 10), (float)(this.field20479 + 10), 60.0f, 60.0f, field32931, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, (0.5f + 0.5f * this.field20943) * n));
        RenderUtil.drawString(this.field20496, (float)(this.field20478 + this.field20480 - 90 - this.field20496.getWidth(field32930)), (float)(this.field20479 + 27), field32930, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, (0.5f + 0.5f * this.field20943) * n));
        super.draw(n);
    }
}
