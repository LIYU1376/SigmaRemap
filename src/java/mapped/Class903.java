// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class903 extends Thread
{
    public final /* synthetic */ Class5079 field4854;
    
    public Class903(final Class5079 field4854, final String name) {
        this.field4854 = field4854;
        super(name);
    }
    
    @Override
    public void run() {
        final Class9513 method35444 = Class9513.method35444();
        try {
            if (method35444.method35454()) {
                Class9513.method35445();
                Class5079.method15819().info("Switched to stage");
                Class5079.method15822().method32593();
            }
        }
        catch (final Class2330 obj) {
            Class5079.method15819().error("Couldn't connect to Realms: " + obj);
        }
        catch (final IOException ex) {
            Class5079.method15819().error("Couldn't parse response connecting to Realms: " + ex.getMessage());
        }
    }
}
