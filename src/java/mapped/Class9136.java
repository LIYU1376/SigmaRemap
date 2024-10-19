package mapped;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import net.minecraft.command.CommandSource;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.server.ServerWorld;

public class Class9136 {
   private static final SimpleCommandExceptionType field41985 = new SimpleCommandExceptionType(new TranslationTextComponent("commands.save.alreadyOff"));

   public static void method34112(CommandDispatcher<CommandSource> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder) Commands.method18839("save-off").requires(var0x -> var0x.method20129(4))).executes(var0x -> {
            CommandSource var3 = (CommandSource)var0x.getSource();
            boolean var4 = false;

            for (ServerWorld var6 : var3.getServer().method1320()) {
               if (var6 != null && !var6.field9047) {
                  var6.field9047 = true;
                  var4 = true;
               }
            }

            if (var4) {
               var3.sendFeedback(new TranslationTextComponent("commands.save.disabled"), true);
               return 1;
            } else {
               throw field41985.create();
            }
         })
      );
   }
}
