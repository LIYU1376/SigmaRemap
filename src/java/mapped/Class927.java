// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class927 extends Thread
{
    public final /* synthetic */ Class5079 field4911;
    
    public Class927(final Class5079 field4911, final String name) {
        this.field4911 = field4911;
        super(name);
    }
    
    @Override
    public void run() {
        try {
            final Class7437 method15807 = Class5079.method15807(this.field4911, Class5079.method15806(this.field4911));
            if (method15807 != null) {
                Class9513.method35444().method35457(method15807.field28675);
                Class5079.method15822().method32604(method15807);
                Class5079.method15823(this.field4911).remove(method15807);
                Class5079.method15824(this.field4911).method15535().removeIf(class2331 -> class2331 instanceof Class626 && ((Class626)class2331).field3607.field28675 == Class5079.method15806(this.field4911));
                Class5079.method15824(this.field4911).method15519(-1);
                Class5079.method15825(this.field4911, null);
                Class5079.method15826(this.field4911, -1L);
                Class5079.method15827(this.field4911).method16917(false);
            }
        }
        catch (final Class2330 class2330) {
            Class5079.method15819().error("Couldn't configure world");
            Class7847.method25362(new Class5074(class2330, this.field4911));
        }
    }
}
