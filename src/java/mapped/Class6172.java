// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public abstract class Class6172 extends Class6173
{
    public float field24930;
    
    public Class6172(final Class1847 class1847, final double n, final double n2, final double n3) {
        super(class1847, n, n2, n3);
        this.field24930 = 0.1f * (this.field24949.nextFloat() * 0.5f + 0.5f) * 2.0f;
    }
    
    public Class6172(final Class1847 class1847, final double n, final double n2, final double n3, final double n4, final double n5, final double n6) {
        super(class1847, n, n2, n3, n4, n5, n6);
        this.field24930 = 0.1f * (this.field24949.nextFloat() * 0.5f + 0.5f) * 2.0f;
    }
    
    @Override
    public void method18432(final Class4150 class4150, final Class6092 class4151, final float n) {
        final Class5487 method18161 = class4151.method18161();
        final float n2 = (float)(Class9546.method35701(n, this.field24933, this.field24936) - method18161.method16760());
        final float n3 = (float)(Class9546.method35701(n, this.field24934, this.field24937) - method18161.method16761());
        final float n4 = (float)(Class9546.method35701(n, this.field24935, this.field24938) - method18161.method16762());
        Class9389 method18162;
        if (this.field24957 != 0.0f) {
            method18162 = new Class9389(class4151.method18165());
            method18162.method34903(Class9138.field38720.method33327(Class9546.method35700(n, this.field24958, this.field24957)));
        }
        else {
            method18162 = class4151.method18165();
        }
        new Class9138(-1.0f, -1.0f, 0.0f).method33325(method18162);
        final Class9138[] array = { new Class9138(-1.0f, -1.0f, 0.0f), new Class9138(-1.0f, 1.0f, 0.0f), new Class9138(1.0f, 1.0f, 0.0f), new Class9138(1.0f, -1.0f, 0.0f) };
        final float method18163 = this.method18430(n);
        for (int i = 0; i < 4; ++i) {
            final Class9138 class4152 = array[i];
            class4152.method33325(method18162);
            class4152.method33314(method18163);
            class4152.method33318(n2, n3, n4);
        }
        final float method18164 = this.method18424();
        final float method18165 = this.method18425();
        final float method18166 = this.method18426();
        final float method18167 = this.method18427();
        final int method18168 = this.method18419(n);
        class4150.method12432(array[0].method33311(), array[0].method33312(), array[0].method33313()).method12391(method18165, method18167).method12439(this.field24953, this.field24954, this.field24955, this.field24956).method12440(method18168).method12397();
        class4150.method12432(array[1].method33311(), array[1].method33312(), array[1].method33313()).method12391(method18165, method18166).method12439(this.field24953, this.field24954, this.field24955, this.field24956).method12440(method18168).method12397();
        class4150.method12432(array[2].method33311(), array[2].method33312(), array[2].method33313()).method12391(method18164, method18166).method12439(this.field24953, this.field24954, this.field24955, this.field24956).method12440(method18168).method12397();
        class4150.method12432(array[3].method33311(), array[3].method33312(), array[3].method33313()).method12391(method18164, method18167).method12439(this.field24953, this.field24954, this.field24955, this.field24956).method12440(method18168).method12397();
    }
    
    public float method18430(final float n) {
        return this.field24930;
    }
    
    @Override
    public Class6173 method18433(final float n) {
        this.field24930 *= n;
        return super.method18433(n);
    }
    
    public abstract float method18424();
    
    public abstract float method18425();
    
    public abstract float method18426();
    
    public abstract float method18427();
}
