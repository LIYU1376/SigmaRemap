// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientFonts;

public class Class4900 extends Class4841
{
    public Class4831 field20956;
    
    public Class4900(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, Class6523.field25964, "", false);
        this.field20496 = ClientFonts.JelloLight20;
        this.addVisualThing(this.field20956 = new Class4831(this, "chat", 14, 0, n3 - 28, n4, Class4831.field20670, "", "Chat..."));
        this.field20956.method14478(false);
        this.field20956.method14317(ClientFonts.JelloLight20);
        this.field20956.method14307(true);
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        super.method14228();
        RenderUtil.method26917(this.field20478, this.field20479, this.field20480, this.field20481, ColorUtils.applyAlpha(ClientColors.LIGHT_GREYISH_BLUE.color, n));
        super.draw(n);
    }
    
    @Override
    public void method14204(final int n) {
        super.method14204(n);
        if (n == 257) {
            ((Class4930)this.method14267()).method14804(this.field20956.method14314());
            Client.getInstance().method35201().field25697.method33660("SF4FSERFERF", this.field20956.method14314());
            this.field20956.method14315("");
            this.field20956.method14307(true);
        }
    }
}
