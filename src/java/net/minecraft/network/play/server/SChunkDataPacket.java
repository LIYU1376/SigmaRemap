package net.minecraft.network.play.server;

import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import mapped.*;
import net.minecraft.client.network.play.IClientPlayNetHandler;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.nbt.LongArrayNBT;
import net.minecraft.network.Packet;
import net.minecraft.network.PacketBuffer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import javax.annotation.Nullable;

public class SChunkDataPacket implements Packet<IClientPlayNetHandler> {
   private int field24514;
   private int field24515;
   private int field24516;
   private CompoundNBT field24517;
   private int[] field24518;
   private byte[] field24519;
   public List<CompoundNBT> field24520;
   public boolean field24521;
   private Map<String, Object> field24522;

   public SChunkDataPacket() {
   }

   public SChunkDataPacket(Chunk var1, int var2) {
      ChunkPos var5 = var1.method7072();
      this.field24514 = var5.field32174;
      this.field24515 = var5.field32175;
      this.field24521 = var2 == 65535;
      this.field24517 = new CompoundNBT();

      for (Entry var7 : var1.method7068()) {
         if (((Class101)var7.getKey()).method284()) {
            this.field24517.put(((Class101)var7.getKey()).method283(), new LongArrayNBT(((Class7527)var7.getValue()).method24583()));
         }
      }

      if (this.field24521) {
         this.field24518 = var1.method7077().method7198();
      }

      this.field24519 = new byte[this.method17377(var1, var2)];
      this.field24516 = this.method17376(new PacketBuffer(this.method17375()), var1, var2);
      this.field24520 = Lists.newArrayList();

      for (Entry var14 : var1.method7145().entrySet()) {
         BlockPos var8 = (BlockPos)var14.getKey();
         TileEntity var9 = (TileEntity)var14.getValue();
         int var10 = var8.getY() >> 4;
         if (this.method17381() || (var2 & 1 << var10) != 0) {
            CompoundNBT var11 = var9.method3777();
            this.field24520.add(var11);
         }
      }

      this.field24522 = new HashMap<String, Object>();
      Class8870 var13 = Class1676.method7168(var1);
      this.field24522.put("ChunkDataOF", var13);
   }

   @Override
   public void readPacketData(PacketBuffer var1) throws IOException {
      this.field24514 = var1.readInt();
      this.field24515 = var1.readInt();
      this.field24521 = var1.readBoolean();
      this.field24516 = var1.readVarInt();
      this.field24517 = var1.method35721();
      if (this.field24521) {
         this.field24518 = var1.method35703(Class1684.field9154);
      }

      int var4 = var1.readVarInt();
      if (var4 > 2097152) {
         throw new RuntimeException("Chunk Packet trying to allocate too much memory on read.");
      } else {
         this.field24519 = new byte[var4];
         var1.readBytes(this.field24519);
         int var5 = var1.readVarInt();
         this.field24520 = Lists.newArrayList();

         for (int var6 = 0; var6 < var5; var6++) {
            this.field24520.add(var1.method35721());
         }
      }
   }

   @Override
   public void writePacketData(PacketBuffer var1) throws IOException {
      var1.writeInt(this.field24514);
      var1.writeInt(this.field24515);
      var1.writeBoolean(this.field24521);
      var1.writeVarInt(this.field24516);
      var1.method35720(this.field24517);
      if (this.field24518 != null) {
         var1.method35701(this.field24518);
      }

      var1.writeVarInt(this.field24519.length);
      var1.writeBytes(this.field24519);
      var1.writeVarInt(this.field24520.size());

      for (CompoundNBT var5 : this.field24520) {
         var1.method35720(var5);
      }
   }

   public void processPacket(IClientPlayNetHandler var1) {
      var1.handleChunkData(this);
   }

   public PacketBuffer method17374() {
      return new PacketBuffer(Unpooled.wrappedBuffer(this.field24519), this.field24522);
   }

   private ByteBuf method17375() {
      ByteBuf var3 = Unpooled.wrappedBuffer(this.field24519);
      var3.writerIndex(0);
      return var3;
   }

   public int method17376(PacketBuffer var1, Chunk var2, int var3) {
      int var6 = 0;
      Class7038[] var7 = var2.method7067();
      int var8 = 0;

      for (int var9 = var7.length; var8 < var9; var8++) {
         Class7038 var10 = var7[var8];
         if (var10 != Chunk.field9111 && (!this.method17381() || !var10.method21858()) && (var3 & 1 << var8) != 0) {
            var6 |= 1 << var8;
            var10.method21867(var1);
         }
      }

      return var6;
   }

   public int method17377(Chunk var1, int var2) {
      int var5 = 0;
      Class7038[] var6 = var1.method7067();
      int var7 = 0;

      for (int var8 = var6.length; var7 < var8; var7++) {
         Class7038 var9 = var6[var7];
         if (var9 != Chunk.field9111 && (!this.method17381() || !var9.method21858()) && (var2 & 1 << var7) != 0) {
            var5 += var9.method21868();
         }
      }

      return var5;
   }

   public int method17378() {
      return this.field24514;
   }

   public int method17379() {
      return this.field24515;
   }

   public int method17380() {
      return this.field24516;
   }

   public boolean method17381() {
      return this.field24521;
   }

   public CompoundNBT method17382() {
      return this.field24517;
   }

   public List<CompoundNBT> method17383() {
      return this.field24520;
   }

   @Nullable
   public int[] method17384() {
      return this.field24518;
   }
}
