// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.CommandDispatcher;

public class Class8667
{
    public static void method29672(final CommandDispatcher<Class7492> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)Class7788.method25001("setworldspawn").requires(class7492 -> class7492.method23210(2))).executes(commandContext -> method29673((Class7492)commandContext.getSource(), new Class354(((Class7492)commandContext.getSource()).method23249())))).then(Class7788.method25002("pos", (com.mojang.brigadier.arguments.ArgumentType<Object>)Class8330.method27767()).executes(commandContext -> method29673((Class7492)commandContext.getSource(), Class8330.method27769((CommandContext<Class7492>)commandContext, "pos")))));
    }
    
    private static int method29673(final Class7492 class7492, final Class354 class7493) {
        class7492.method23250().method6759(class7493);
        class7492.method23255().method1537().method20586(new Class4335(class7493));
        class7492.method23257(new Class2259("commands.setworldspawn.success", new Object[] { class7493.method1074(), class7493.method1075(), class7493.method1076() }), true);
        return 1;
    }
}
