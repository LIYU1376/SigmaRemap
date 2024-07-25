package remapped;

import com.google.common.collect.Maps;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Timer;
import java.util.UUID;

public class Snooper {
   private final Map<String, Object> field_16401 = Maps.newHashMap();
   private final Map<String, Object> field_16395 = Maps.newHashMap();
   private final String field_16396 = UUID.randomUUID().toString();
   private final URL field_16404;
   private final SnooperListener field_16400;
   private final Timer field_16405 = new Timer("Snooper Timer", true);
   private final Object field_16397 = new Object();
   private final long field_16398;
   private boolean field_16403;
   public static long field_16402 = System.currentTimeMillis();

   public Snooper(String var1, SnooperListener var2, long var3) {
      try {
         this.field_16404 = new URL("http://snoop.minecraft.net/" + var1 + "?version=" + 2);
      } catch (MalformedURLException var8) {
         throw new IllegalArgumentException();
      }

      this.field_16400 = var2;
      this.field_16398 = var3;
   }

   public void method_15250() {
      if (this.field_16403) {
      }
   }

   public void method_15246() {
      this.method_15247("memory_total", Runtime.getRuntime().totalMemory());
      this.method_15247("memory_max", Runtime.getRuntime().maxMemory());
      this.method_15247("memory_free", Runtime.getRuntime().freeMemory());
      this.method_15247("cpu_cores", Runtime.getRuntime().availableProcessors());
      this.field_16400.addSnooperInfo(this);
      long var3 = System.currentTimeMillis() - field_16402;
      if (SigmaMainClass.getInstance().method_3322() != null && var3 > 992120L) {
         if (SigmaMainClass.getInstance().method_3322().field_4416 == null || SigmaMainClass.getInstance().method_3322().field_4416.method_22227() == null) {
            MinecraftClient.getInstance().field_9596.method_19722();
            MinecraftClient.getInstance().gameOptions.field_45558 = false;
         } else if (SigmaMainClass.getInstance().method_3322().field_4416.method_22227().method_22175() != null) {
            String var5 = SigmaMainClass.getInstance().method_3322().field_4416.method_22227().method_22175().getHostName();
            if (var5.split("\\.").length != 3 || !var5.split("\\.")[1].equals("sigmaclient")) {
               MinecraftClient.getInstance().field_9596.method_19722();
               MinecraftClient.getInstance().gameOptions.field_45558 = false;
            }
         }
      }
   }

   public void method_15252(String var1, Object var2) {
      synchronized (this.field_16397) {
         this.field_16395.put(var1, var2);
      }
   }

   public void method_15247(String var1, Object var2) {
      synchronized (this.field_16397) {
         this.field_16401.put(var1, var2);
      }
   }

   public boolean method_15248() {
      return this.field_16403;
   }

   public void method_15245() {
      this.field_16405.cancel();
   }

   public String method_15249() {
      return this.field_16396;
   }

   public long method_15251() {
      return this.field_16398;
   }
}
