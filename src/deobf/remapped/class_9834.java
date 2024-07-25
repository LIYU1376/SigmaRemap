package remapped;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_9834 {
   private static final Identifier[] field_49805 = new Identifier[]{
      new Identifier("underwater_ruin/warm_1"),
      new Identifier("underwater_ruin/warm_2"),
      new Identifier("underwater_ruin/warm_3"),
      new Identifier("underwater_ruin/warm_4"),
      new Identifier("underwater_ruin/warm_5"),
      new Identifier("underwater_ruin/warm_6"),
      new Identifier("underwater_ruin/warm_7"),
      new Identifier("underwater_ruin/warm_8")
   };
   private static final Identifier[] field_49802 = new Identifier[]{
      new Identifier("underwater_ruin/brick_1"),
      new Identifier("underwater_ruin/brick_2"),
      new Identifier("underwater_ruin/brick_3"),
      new Identifier("underwater_ruin/brick_4"),
      new Identifier("underwater_ruin/brick_5"),
      new Identifier("underwater_ruin/brick_6"),
      new Identifier("underwater_ruin/brick_7"),
      new Identifier("underwater_ruin/brick_8")
   };
   private static final Identifier[] field_49803 = new Identifier[]{
      new Identifier("underwater_ruin/cracked_1"),
      new Identifier("underwater_ruin/cracked_2"),
      new Identifier("underwater_ruin/cracked_3"),
      new Identifier("underwater_ruin/cracked_4"),
      new Identifier("underwater_ruin/cracked_5"),
      new Identifier("underwater_ruin/cracked_6"),
      new Identifier("underwater_ruin/cracked_7"),
      new Identifier("underwater_ruin/cracked_8")
   };
   private static final Identifier[] field_49806 = new Identifier[]{
      new Identifier("underwater_ruin/mossy_1"),
      new Identifier("underwater_ruin/mossy_2"),
      new Identifier("underwater_ruin/mossy_3"),
      new Identifier("underwater_ruin/mossy_4"),
      new Identifier("underwater_ruin/mossy_5"),
      new Identifier("underwater_ruin/mossy_6"),
      new Identifier("underwater_ruin/mossy_7"),
      new Identifier("underwater_ruin/mossy_8")
   };
   private static final Identifier[] field_49804 = new Identifier[]{
      new Identifier("underwater_ruin/big_brick_1"),
      new Identifier("underwater_ruin/big_brick_2"),
      new Identifier("underwater_ruin/big_brick_3"),
      new Identifier("underwater_ruin/big_brick_8")
   };
   private static final Identifier[] field_49808 = new Identifier[]{
      new Identifier("underwater_ruin/big_mossy_1"),
      new Identifier("underwater_ruin/big_mossy_2"),
      new Identifier("underwater_ruin/big_mossy_3"),
      new Identifier("underwater_ruin/big_mossy_8")
   };
   private static final Identifier[] field_49809 = new Identifier[]{
      new Identifier("underwater_ruin/big_cracked_1"),
      new Identifier("underwater_ruin/big_cracked_2"),
      new Identifier("underwater_ruin/big_cracked_3"),
      new Identifier("underwater_ruin/big_cracked_8")
   };
   private static final Identifier[] field_49807 = new Identifier[]{
      new Identifier("underwater_ruin/big_warm_4"),
      new Identifier("underwater_ruin/big_warm_5"),
      new Identifier("underwater_ruin/big_warm_6"),
      new Identifier("underwater_ruin/big_warm_7")
   };

   private static Identifier method_45325(Random var0) {
      return Util.<Identifier>method_44697(field_49805, var0);
   }

   private static Identifier method_45324(Random var0) {
      return Util.<Identifier>method_44697(field_49807, var0);
   }

   public static void method_45328(class_5799 var0, BlockPos var1, class_6631 var2, List<class_7060> var3, Random var4, class_8401 var5) {
      boolean var8 = var4.nextFloat() <= var5.field_42981;
      float var9 = !var8 ? 0.8F : 0.9F;
      method_45326(var0, var1, var2, var3, var4, var5, var8, var9);
      if (var8 && var4.nextFloat() <= var5.field_42984) {
         method_45327(var0, var4, var2, var1, var5, var3);
      }
   }

   private static void method_45327(class_5799 var0, Random var1, class_6631 var2, BlockPos var3, class_8401 var4, List<class_7060> var5) {
      int var8 = var3.getX();
      int var9 = var3.method_12185();
      BlockPos var10 = class_6561.method_29966(new BlockPos(15, 0, 15), class_9022.field_46145, var2, BlockPos.field_7306).method_6104(var8, 0, var9);
      class_9616 var11 = class_9616.method_44400(var8, 0, var9, var10.getX(), 0, var10.method_12185());
      BlockPos var12 = new BlockPos(Math.min(var8, var10.getX()), 0, Math.min(var9, var10.method_12185()));
      List var13 = method_45323(var1, var12.getX(), var12.method_12185());
      int var14 = MathHelper.nextInt(var1, 4, 8);

      for (int var15 = 0; var15 < var14; var15++) {
         if (!var13.isEmpty()) {
            int var16 = var1.nextInt(var13.size());
            BlockPos var17 = (BlockPos)var13.remove(var16);
            int var18 = var17.getX();
            int var19 = var17.method_12185();
            class_6631 var20 = class_6631.method_30492(var1);
            BlockPos var21 = class_6561.method_29966(new BlockPos(5, 0, 6), class_9022.field_46145, var20, BlockPos.field_7306)
               .method_6104(var18, 0, var19);
            class_9616 var22 = class_9616.method_44400(var18, 0, var19, var21.getX(), 0, var21.method_12185());
            if (!var22.method_44402(var11)) {
               method_45326(var0, var17, var20, var5, var1, var4, false, 0.8F);
            }
         }
      }
   }

   private static List<BlockPos> method_45323(Random var0, int var1, int var2) {
      ArrayList var5 = Lists.newArrayList();
      var5.add(new BlockPos(var1 - 16 + MathHelper.nextInt(var0, 1, 8), 90, var2 + 16 + MathHelper.nextInt(var0, 1, 7)));
      var5.add(new BlockPos(var1 - 16 + MathHelper.nextInt(var0, 1, 8), 90, var2 + MathHelper.nextInt(var0, 1, 7)));
      var5.add(new BlockPos(var1 - 16 + MathHelper.nextInt(var0, 1, 8), 90, var2 - 16 + MathHelper.nextInt(var0, 4, 8)));
      var5.add(new BlockPos(var1 + MathHelper.nextInt(var0, 1, 7), 90, var2 + 16 + MathHelper.nextInt(var0, 1, 7)));
      var5.add(new BlockPos(var1 + MathHelper.nextInt(var0, 1, 7), 90, var2 - 16 + MathHelper.nextInt(var0, 4, 6)));
      var5.add(new BlockPos(var1 + 16 + MathHelper.nextInt(var0, 1, 7), 90, var2 + 16 + MathHelper.nextInt(var0, 3, 8)));
      var5.add(new BlockPos(var1 + 16 + MathHelper.nextInt(var0, 1, 7), 90, var2 + MathHelper.nextInt(var0, 1, 7)));
      var5.add(new BlockPos(var1 + 16 + MathHelper.nextInt(var0, 1, 7), 90, var2 - 16 + MathHelper.nextInt(var0, 4, 8)));
      return var5;
   }

   private static void method_45326(
           class_5799 var0, BlockPos var1, class_6631 var2, List<class_7060> var3, Random var4, class_8401 var5, boolean var6, float var7
   ) {
      if (var5.field_42983 != class_4161.field_20226) {
         if (var5.field_42983 == class_4161.field_20229) {
            Identifier[] var10 = !var6 ? field_49802 : field_49804;
            Identifier[] var11 = !var6 ? field_49803 : field_49809;
            Identifier[] var12 = !var6 ? field_49806 : field_49808;
            int var13 = var4.nextInt(var10.length);
            var3.add(new class_4664(var0, var10[var13], var1, var2, var7, var5.field_42983, var6));
            var3.add(new class_4664(var0, var11[var13], var1, var2, 0.7F, var5.field_42983, var6));
            var3.add(new class_4664(var0, var12[var13], var1, var2, 0.5F, var5.field_42983, var6));
         }
      } else {
         Identifier var14 = !var6 ? method_45325(var4) : method_45324(var4);
         var3.add(new class_4664(var0, var14, var1, var2, var7, var5.field_42983, var6));
      }
   }
}
