package mapped;

import java.io.IOException;

public class Class4998 extends FullBox {
   public Class4998() {
      super("Item Information Box");
   }

   @Override
   public void method15262(MP4InputStream var1) throws IOException {
      super.method15262(var1);
      int var4 = (int)var1.readBits(2);
      this.method15442(var1, var4);
   }
}
