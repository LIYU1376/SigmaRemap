// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.item.ItemStack;

public class Class3420 extends Class3418
{
    private static String[] field16162;
    private final IInventory field16163;
    private final Class7604 field16164;
    
    public Class3420(final int n) {
        this(n, new Class443(1), new Class7607(1));
    }
    
    public Class3420(final int n, final IInventory field16163, final Class7604 field16164) {
        super(Class8471.field34771, n);
        Class3418.method10868(field16163, 1);
        Class3418.method10869(field16164, 1);
        this.field16163 = field16163;
        this.field16164 = field16164;
        this.method10870(new Class6616(this, field16163, 0, 0, 0));
        this.method10872(field16164);
    }
    
    @Override
    public boolean method10877(final PlayerEntity playerEntity, final int n) {
        if (n >= 100) {
            this.method10884(0, n - 100);
            return true;
        }
        switch (n) {
            case 1: {
                this.method10884(0, this.field16164.method23902(0) - 1);
                return true;
            }
            case 2: {
                this.method10884(0, this.field16164.method23902(0) + 1);
                return true;
            }
            case 3: {
                if (!playerEntity.method2880()) {
                    return false;
                }
                final ItemStack method2159 = this.field16163.method2159(0);
                this.field16163.method2161();
                if (!playerEntity.inventory.method2362(method2159)) {
                    playerEntity.method2822(method2159, false);
                }
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    @Override
    public void method10884(final int n, final int n2) {
        super.method10884(n, n2);
        this.method10876();
    }
    
    @Override
    public boolean method10854(final PlayerEntity playerEntity) {
        return this.field16163.method2162(playerEntity);
    }
    
    public ItemStack method10900() {
        return this.field16163.getStackInSlot(0);
    }
    
    public int method10901() {
        return this.field16164.method23902(0);
    }
}
