package net.minecraft.resources;

import mapped.*;
import net.minecraft.util.Unit;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public interface IResourceManagerReloadListener extends Class268 {
   @Override
   default CompletableFuture<Void> method777(Class7121 var1, IResourceManager var2, IProfiler var3, IProfiler var4, Executor var5, Executor var6) {
      return var1.<Unit>method22225(Unit.INSTANCE).thenRunAsync(() -> {
         var4.startTick();
         var4.startSection("listener");
         this.method737(var2);
         var4.endSection();
         var4.endTick();
      }, var6);
   }

   void method737(IResourceManager var1);
}
