package remapped;

import java.util.Comparator;

public class class_4394 implements Comparator<Entity> {
   private static String[] field_21519;

   public class_4394(class_4017 var1) {
      this.field_21518 = var1;
   }

   public int compare(Entity var1, Entity var2) {
      float var5 = class_4017.method_18510().field_9632.method_37175(var1);
      float var6 = class_4017.method_18511().field_9632.method_37175(var2);
      return (int)(var5 - var6);
   }
}
