// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.Int2IntMap;

public class Class5024
{
    private static String[] field21532;
    public final Int2IntMap field21533;
    
    public Class5024() {
        this.field21533 = (Int2IntMap)new Int2IntOpenHashMap();
    }
    
    public void method15242(final Class8321 class8321) {
        if (!class8321.method27631()) {
            if (!class8321.method27675()) {
                if (!class8321.method27667()) {
                    this.method15243(class8321);
                }
            }
        }
    }
    
    public void method15243(final Class8321 class8321) {
        this.method15244(class8321, 64);
    }
    
    public void method15244(final Class8321 class8321, final int a) {
        if (!class8321.method27620()) {
            this.method15248(method15245(class8321), Math.min(a, class8321.method27690()));
        }
    }
    
    public static int method15245(final Class8321 class8321) {
        return Class90.field211.method504(class8321.method27622());
    }
    
    private boolean method15246(final int n) {
        return this.field21533.get(n) > 0;
    }
    
    private int method15247(final int n, final int n2) {
        final int value = this.field21533.get(n);
        if (value < n2) {
            return 0;
        }
        this.field21533.put(n, value - n2);
        return n;
    }
    
    private void method15248(final int n, final int n2) {
        this.field21533.put(n, this.field21533.get(n) + n2);
    }
    
    public boolean method15249(final Class3662<?> class3662, final IntList list) {
        return this.method15250(class3662, list, 1);
    }
    
    public boolean method15250(final Class3662<?> class3662, final IntList list, final int n) {
        return new Class8830(class3662).method30823(n, list);
    }
    
    public int method15251(final Class3662<?> class3662, final IntList list) {
        return this.method15252(class3662, Integer.MAX_VALUE, list);
    }
    
    public int method15252(final Class3662<?> class3662, final int n, final IntList list) {
        return new Class8830(class3662).method30836(n, list);
    }
    
    public static Class8321 method15253(final int n) {
        return (n != 0) ? new Class8321(Class3820.method11697(n)) : Class8321.field34174;
    }
    
    public void method15254() {
        this.field21533.clear();
    }
}
