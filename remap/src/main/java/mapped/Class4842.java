// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;

public class Class4842 extends Class4841
{
    private static String[] field20591;
    private Class7643 field20748;
    public float field20749;
    
    public Class4842(final CustomGuiScreen customGuiScreen, final String s, final int n, final int n2, final int n3, final int n4) {
        super(customGuiScreen, s, n, n2, n3, n4, false);
        this.field20748 = Client.getInstance().method35199();
        this.field20749 = -1.0f;
        this.method14256((class4803, n) -> this.field20749 = Math.min((int)this.field20748.method24186() / (float)this.field20748.method24192(), 1.0f));
        this.method14258((class4803, n) -> {
            if (this.method14308()) {
                if (this.method14306()) {
                    this.field20748.method24194((int)Math.min((int)(this.field20749 * this.field20748.method24192()), this.field20748.method24187()));
                }
            }
        });
    }
    
    @Override
    public void draw(final float n) {
        final int n2 = (int)this.field20748.method24186();
        final double method24187 = this.field20748.method24187();
        final int method24188 = this.field20748.method24192();
        float n3 = Math.max(0.0f, Math.min(n2 / (float)method24188, 1.0f));
        final float max = Math.max(0.0f, Math.min((float)method24187 / method24188, 1.0f));
        if (this.method14309()) {
            if (this.method14308()) {
                if (method24187 != 0.0) {
                    this.field20749 = Math.min(Math.max((this.method14320() - this.method14280()) / (float)this.method14276(), 0.0f), max);
                    n3 = this.field20749;
                }
            }
        }
        if (n2 == 0 && !this.field20748.method24184()) {
            RenderUtil.method26874((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.43f * n));
        }
        else {
            RenderUtil.method26874((float)this.method14272(), (float)this.method14274(), (float)this.method14276(), (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.MID_GREY.color, 0.075f));
            RenderUtil.method26874(this.method14272() + this.method14276() * max, (float)this.method14274(), this.method14276() * (1.0f - max), (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.DEEP_TEAL.color, 0.43f * n));
            RenderUtil.method26874((float)this.method14272(), (float)this.method14274(), this.method14276() * n3, (float)this.method14278(), ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n * n));
            if (n3 != 0.0f) {
                RenderUtil.method26905(this.method14272() + this.method14276() * n3, (float)this.method14274(), 5.0f, 5.0f, ClientAssets.shadow_right);
            }
        }
    }
}
