// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class4996<T extends Number> extends Class4997<Float>
{
    private Class<? extends T> field21506;
    private float field21507;
    private float field21508;
    private float field21509;
    
    public Class4996(final String s, final String s2, final float f, final Class<? extends T> field21506, final float field21507, final float field21508, final float field21509) {
        super(s, s2, Class2076.field11982, f);
        this.field21506 = field21506;
        this.field21507 = field21507;
        this.field21508 = field21508;
        this.field21509 = field21509;
    }
    
    public int method15185() {
        if (this.field21509 != 1.0f) {
            final String string = Float.toString(Math.abs(this.method15191()));
            return string.length() - string.indexOf(46) - 1;
        }
        return 0;
    }
    
    @Override
    public Class4405 method15186(final Class4405 class4405) {
        this.field21511 = (T)Float.valueOf(Class8105.method26634(class4405, "value", this.method15203()));
        return class4405;
    }
    
    public float method15187() {
        return this.field21507;
    }
    
    public void method15188(final float field21507) {
        this.field21507 = field21507;
    }
    
    public float method15189() {
        return this.field21508;
    }
    
    public void method15190(final float field21508) {
        this.field21508 = field21508;
    }
    
    public float method15191() {
        return this.field21509;
    }
    
    public void method15192(final float field21509) {
        this.field21509 = field21509;
    }
}
