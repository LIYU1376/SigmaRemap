// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class3184 extends Class3167
{
    private double field15580;
    private float field15581;
    private float field15582;
    private boolean field15583;
    public double field15584;
    
    public Class3184() {
        super(Class8013.field32990, "Strafe", "Strafe in mid air");
    }
    
    @Class6753
    public void method9991(final Class5717 class5717) {
        if (!this.method9906()) {
            return;
        }
        this.field15580 = Class7482.method23136();
        final float n = Class7482.method23143()[1];
        final float n2 = Class7482.method23143()[2];
        final float method23147 = Class7482.method23147();
        final double cos = Math.cos(Math.toRadians(method23147));
        final double sin = Math.sin(Math.toRadians(method23147));
        double field15584 = Math.sqrt(class5717.method16972() * class5717.method16972() + class5717.method16976() * class5717.method16976());
        if (!Class7482.method23148()) {
            field15584 = 0.0;
        }
        final float n3 = 0.2f;
        if (field15584 <= this.field15584 + 0.10000000149011612) {
            this.field15584 = field15584;
            if (field15584 != 0.0) {
                field15584 = Math.max(field15584, Class7482.method23136());
            }
            class5717.method16973(class5717.method16972() * (1.0f - n3) + field15584 * cos * n3);
            class5717.method16977(class5717.method16976() * (1.0f - n3) + field15584 * sin * n3);
            if (Class7482.method23148()) {}
            return;
        }
        this.field15584 = field15584;
    }
}
