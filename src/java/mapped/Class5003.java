// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.awt.Color;

public class Class5003 extends Class4997<Integer>
{
    public boolean field21520;
    
    public Class5003(final String s, final String s2, final int i, final boolean field21520) {
        super(s, s2, Class2076.field11989, i);
        this.field21520 = false;
        this.field21520 = field21520;
    }
    
    public Class5003(final String s, final String s2, final int i) {
        super(s, s2, Class2076.field11989, i);
        this.field21520 = false;
    }
    
    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.field21511 = (T)Integer.valueOf(Class8105.method26632(class4405, "value", this.method15203()));
        this.field21520 = Class8105.method26630(class4405, "rainbow", false);
        return class4405;
    }
    
    public boolean method15219() {
        return this.field21520;
    }
    
    public void method15220(final boolean field21520) {
        this.field21520 = field21520;
    }
    
    @Override
    public Class4405 method15193(final Class4405 class4405) {
        class4405.method13301("name", this.method15204());
        class4405.method13301("value", this.method15222());
        class4405.method13295("rainbow", this.field21520);
        return class4405;
    }
    
    public Integer method15221() {
        if (!this.field21520) {
            return (Integer)this.field21511;
        }
        final Color color = new Color((int)this.field21511);
        final float[] rgBtoHSB = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        return Color.getHSBColor(System.currentTimeMillis() % 4000L / 4000.0f, rgBtoHSB[1], rgBtoHSB[2]).getRGB();
    }
    
    public Integer method15222() {
        return (Integer)this.field21511;
    }
}
