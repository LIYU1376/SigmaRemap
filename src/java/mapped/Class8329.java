package mapped;

import com.mentalfrostbyte.jello.Client;
import com.mentalfrostbyte.jello.event.EventTarget;
import com.mentalfrostbyte.jello.event.impl.ReceivePacketEvent;
import com.mentalfrostbyte.jello.event.impl.SendPacketEvent;
import com.mentalfrostbyte.jello.event.impl.WorldLoadEvent;
import com.mentalfrostbyte.jello.event.impl.TickEvent;
import com.mentalfrostbyte.jello.util.MultiUtilities;
import net.minecraft.client.Minecraft;
import net.minecraft.network.IPacket;
import net.minecraft.network.play.client.CClickWindowPacket;
import net.minecraft.network.play.client.CConfirmTransactionPacket;
import net.minecraft.network.play.server.SConfirmTransactionPacket;
import net.minecraft.network.play.server.SKeepAlivePacket;

import java.util.ArrayList;
import java.util.List;

public class Class8329 {
   private static String[] field35791;
   private short field35792;
   private short field35793;
   private short field35794;
   private boolean field35795 = false;
   private List<Class8721> field35796 = new ArrayList<Class8721>();
   public Minecraft field35797 = Minecraft.getInstance();

   public Class8329() {
      Client.getInstance().getEventManager().register(this);
   }

   @EventTarget
   @Class5631
   public void method29200(WorldLoadEvent var1) {
      this.field35796.clear();
      this.field35793 = this.field35794 = 0;
      this.field35795 = false;
   }

   @EventTarget
   @Class5631
   public void method29201(TickEvent var1) {
   }

   @EventTarget
   @Class5631
   public void method29202(SendPacketEvent var1) {
      if (!MultiUtilities.method17720() && MultiUtilities.method17718()) {
         IPacket var4 = var1.getPacket();
         if (!(var4 instanceof CClickWindowPacket)) {
            if (var4 instanceof CConfirmTransactionPacket) {
               CConfirmTransactionPacket var5 = (CConfirmTransactionPacket)var4;
               if (var5.getWindowId() == 0) {
                  int var6 = var5.getUid() - this.field35792;
                  if (var6 <= 0 && var6 >= -20) {
                  }
               }
            }
         } else {
            CClickWindowPacket var7 = (CClickWindowPacket)var4;
            this.field35792 = var7.getActionNumber();
         }
      }
   }

   @EventTarget
   @Class5631
   public void method29203(ReceivePacketEvent var1) {
      if (!MultiUtilities.method17720() && MultiUtilities.method17718()) {
         IPacket var4 = var1.getPacket();
         if (!(var4 instanceof SKeepAlivePacket) && var4 instanceof SConfirmTransactionPacket) {
            SConfirmTransactionPacket var5 = (SConfirmTransactionPacket)var4;
         }
      }
   }
}
