package mapped;

import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;

import java.io.IOException;

public class Class5570 implements Packet<IServerPlayNetHandler> {
   private static String[] field24707;
   private BlockRayTraceResult field24708;
   private Hand field24709;

   public Class5570() {
   }

   public Class5570(Hand var1, BlockRayTraceResult var2) {
      this.field24709 = var1;
      this.field24708 = var2;
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24709 = var1.<Hand>method35712(Hand.class);
      this.field24708 = var1.method35735();
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.method35713(this.field24709);
      var1.method35736(this.field24708);
   }

   public void method17180(IServerPlayNetHandler var1) {
      var1.method15630(this);
   }

   public Hand method17497() {
      return this.field24709;
   }

   public BlockRayTraceResult method17498() {
      return this.field24708;
   }
}
