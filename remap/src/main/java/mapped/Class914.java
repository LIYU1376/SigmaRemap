// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.client.main.Main;

public final class Class914 extends Thread
{
    public final /* synthetic */ Minecraft field4876;
    
    public Class914(final String name, final Minecraft field4876) {
        this.field4876 = field4876;
        super(name);
    }
    
    @Override
    public void run() {
        try {
            RenderSystem.method29986(true);
            this.field4876.run();
        }
        catch (final Throwable t) {
            Main.method9787().error("Exception in client thread", t);
        }
    }
}
