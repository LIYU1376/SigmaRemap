// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.renderer.Matrix4f;
import org.lwjgl.opengl.GL11;
import slick2d.Texture;

import java.awt.image.BufferedImage;
import java.net.URL;

public class Class4908 extends Class4825
{
    private static String[] field20591;
    public static Class6523 field20996;
    public URL field20997;
    public BufferedImage field20998;
    public boolean field20999;
    private Texture field21000;
    private Texture field21001;
    private Class9572 field21002;
    
    public Class4908(final Class4803 class4803, final String s, final int n, final int n2, final int n3, final int n4) {
        super(class4803, s, n, n2, n3, n4, Class4908.field20996, s, false);
        this.field20997 = null;
        this.field20999 = false;
    }
    
    @Override
    public void method14200(final int n, final int n2) {
        super.method14200(n, n2);
    }
    
    @Override
    public void draw(final float n) {
        final double max = Math.max(-1.0, Math.min(1.0, (Minecraft.method5277().field4650.method26959() - Minecraft.method5277().window.method7694() / 2) / (Minecraft.method5277().window.method7694() / 2)));
        final double max2 = Math.max(-1.0, Math.min(1.0, (Minecraft.method5277().field4650.method26960() - Minecraft.method5277().window.method7695() / 2) / (Minecraft.method5277().window.method7695() / 2)));
        GL11.glPushMatrix();
        GL11.glMatrixMode(5888);
        GL11.glEnable(2929);
        GL11.glTranslatef((float)(this.field20478 + this.field20480 / 2), (float)(this.field20479 + this.field20481 / 2), -1000.0f);
        RenderSystem.method30067(Matrix4f.method20755(20.0, (float)(Minecraft.method5277().window.method7692() / Minecraft.method5277().window.method7693()), 0.5f, 1.0f));
        RenderSystem.method30057(5888);
        RenderSystem.method30058();
        GL11.glRotated(1.0 * Math.abs(max * max2), max2, max, 0.0);
        GL11.glTranslatef((float)(-this.field20478 - this.field20480 / 2), (float)(-this.field20479 - this.field20481 / 2), 0.0f);
        GL11.glDisable(2929);
        RenderUtil.method26874((float)this.field20478, (float)this.field20479, (float)this.field20480, (float)this.field20481, ClientColors.field1283.color);
        GL11.glPopMatrix();
        super.draw(n);
    }
    
    static {
        Class4908.field20996 = new Class6523(ClientColors.field1273.color, ClientColors.field1273.color, ClientColors.field1273.color, ClientColors.field1273.color, Class2056.field11734, Class2056.field11738);
    }
}
