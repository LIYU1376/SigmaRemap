// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.World;

import java.util.Random;

public class Class3879 extends Class3878
{
    private static String[] field17519;
    public static final Class7112 field17531;
    private static final VoxelShape[] field17532;
    
    public Class3879(final Class9288 class9288) {
        super(class9288);
    }
    
    @Override
    public Class7112 method11952() {
        return Class3879.field17531;
    }
    
    @Override
    public int method11953() {
        return 3;
    }
    
    @Override
    public Class3832 method11960() {
        return Items.field31576;
    }
    
    @Override
    public void method11822(final BlockState class7096, final Class1849 class7097, final BlockPos class7098, final Random random) {
        if (random.nextInt(3) != 0) {
            super.method11822(class7096, class7097, class7098, random);
        }
    }
    
    @Override
    public int method11958(final World class1847) {
        return super.method11958(class1847) / 3;
    }
    
    @Override
    public void method11875(final Class9500<Class3833, BlockState> class9500) {
        class9500.method35378(Class3879.field17531);
    }
    
    @Override
    public VoxelShape method11808(final BlockState class7096, final Class1855 class7097, final BlockPos class7098, final ISelectionContext class7099) {
        return Class3879.field17532[class7096.method21772((Class7111<Integer>)this.method11952())];
    }
    
    static {
        field17531 = Class8970.field37771;
        field17532 = new VoxelShape[] { Class3833.method11778(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), Class3833.method11778(0.0, 0.0, 0.0, 16.0, 8.0, 16.0) };
    }
}
