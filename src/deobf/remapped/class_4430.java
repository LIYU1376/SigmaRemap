package remapped;

import com.mojang.serialization.Codec;
import java.util.Random;
import java.util.stream.Stream;

public class class_4430 extends class_5788<class_9504> {
   public class_4430(Codec<class_9504> var1) {
      super(var1);
   }

   public Stream<BlockPos> method_20581(class_6680 var1, Random var2, class_9504 var3, BlockPos var4) {
      if (var2.nextInt(700) == 0) {
         int var7 = var2.nextInt(16) + var4.getX();
         int var8 = var2.nextInt(16) + var4.getZ();
         int var9 = var1.method_30648(class_3801.field_18595, var7, var8);
         if (var9 > 0) {
            int var10 = var9 + 3 + var2.nextInt(7);
            return Stream.<BlockPos>of(new BlockPos(var7, var10, var8));
         }
      }

      return Stream.<BlockPos>empty();
   }
}
