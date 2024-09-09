package mapped;

import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;

public class Class6396 extends Class6395 {
   private CompoundNBT field28007;

   public Class6396(IntegratedServer var1, DynamicRegistriesImpl var2, Class8716 var3) {
      super(var1, var2, var3, 8);
      this.method19487(10);
   }

   @Override
   public void method19449(ServerPlayerEntity var1) {
      if (var1.getName().getString().equals(this.method19444().method1332())) {
         this.field28007 = var1.writeWithoutTypeId(new CompoundNBT());
      }

      super.method19449(var1);
   }

   @Override
   public ITextComponent method19451(SocketAddress var1, GameProfile var2) {
      return (ITextComponent)(var2.getName().equalsIgnoreCase(this.method19444().method1332()) && this.method19465(var2.getName()) != null
         ? new TranslationTextComponent("multiplayer.disconnect.name_taken")
         : super.method19451(var1, var2));
   }

   public IntegratedServer method19444() {
      return (IntegratedServer)super.method19444();
   }

   @Override
   public CompoundNBT method19479() {
      return this.field28007;
   }
}
