// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import net.minecraft.util.text.ITextComponent;

import java.lang.reflect.InvocationTargetException;

public class Class8004
{
    private static String[] field32965;
    private static final Minecraft field32966;
    
    public static void method26199(final int n) {
        if (Client.getInstance().method35209() == Class2209.field13466) {
            return;
        }
        if (n == -1) {
            return;
        }
        for (final Class8879 class8879 : Client.getInstance().method35189().method21557().method21964(n)) {
            if (class8879 != null && class8879.method31228()) {
                switch (Class9204.field38998[class8879.method31231().ordinal()]) {
                    case 1: {
                        class8879.method31234().method9910();
                        continue;
                    }
                    case 2: {
                        try {
                            final Screen class8880 = (Screen)class8879.method31233().getDeclaredConstructor(ITextComponent.class).newInstance(new StringTextComponent(Class9000.field37983.get(class8879.method31233())));
                            if (!Client.getInstance().method35193().method32158(class8880)) {
                                continue;
                            }
                            Class8004.field32966.displayGuiScreen(class8880);
                        }
                        catch (final InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException ex) {
                            ((Throwable)ex).printStackTrace();
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static void method26200(final int n) {
        Client.getInstance().method35188().method21097(new Class5715(n));
    }
    
    static {
        field32966 = Minecraft.method5277();
    }
}
