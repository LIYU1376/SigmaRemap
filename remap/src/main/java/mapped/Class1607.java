// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import com.mentalfrostbyte.Client;
import com.mentalfrostbyte.jello.mods.Module;
import com.mentalfrostbyte.jello.mods.ModuleWithSettings;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Class1607 implements Runnable
{
    public static Thread thread;
    public static boolean field8977;
    public static HashMap<Object, Integer> field8978;
    
    @Override
    public void run() {
        Class1607.field8978 = new HashMap<>();
        while (!Thread.currentThread().isInterrupted()) {
            try {
                Thread.sleep(150000L);
                if (!Thread.currentThread().isInterrupted()) {
                    if (Minecraft.method5277().world == null) {
                        continue;
                    }
                    boolean b = false;
                    boolean b2 = false;
                    if (Client.getInstance().method35189() == null) {
                        continue;
                    }
                    final List<Module> list = new ArrayList(Client.getInstance().method35189().getModuleMap().values());
                    for (final Module class3167 : Client.getInstance().method35189().getModuleMap().values()) {
                        if (class3167 instanceof ModuleWithSettings) {
                            list.addAll(Arrays.asList(((ModuleWithSettings)class3167).field15742));
                        }
                    }
                    for (final Module key : list) {
                        if (key.getClass().getSuperclass() != Module.class && key.getClass().getSuperclass() != ModuleWithSettings.class) {
                            b = true;
                            if (Class1607.field8978.containsKey(key) && Class1607.field8978.get(key) != key.method9904()) {
                                System.out.println(key.getName() + " DIFFER!");
                                b2 = true;
                            }
                            Class1607.field8978.put(key, key.method9904());
                        }
                    }
                    if (!b2 && b) {
                        continue;
                    }
                    Class1607.field8977 = true;
                    continue;
                }
            }
            catch (final InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            break;
        }
    }
    
    static {
        Class1607.thread = new Thread(new Class1607());
        Class1607.field8977 = false;
        Class1607.thread.start();
    }
}
