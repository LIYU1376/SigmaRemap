// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.ClientAssets;

public class Class4687 implements Class4659
{
    public final /* synthetic */ Class9198 field20237;
    
    public Class4687(final Class9198 field20237) {
        this.field20237 = field20237;
    }
    
    @Override
    public void method13945(final Object... array) {
        System.out.println("disconnect");
        Client.getInstance().method35197().method25776(new Class6224("Jello connect", "Connexion Failed. Try relogging.", ClientAssets.gingerbread));
    }
}
