// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import it.unimi.dsi.fastutil.objects.ObjectOpenHashSet;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;

import java.util.List;

public enum Class2167 implements Class2168
{
    field12888("BLACKLIST", 0, new Block[] { Class7521.field29647, Class7521.field29341, Class7521.field29697, Class7521.field29698, Class7521.field29699, Class7521.field29700, Class7521.field29701, Class7521.field29702, Class7521.field29703, Class7521.field29704, Class7521.field29705, Class7521.field29706, Class7521.field29707, Class7521.field29708, Class7521.field29709, Class7521.field29710, Class7521.field29711, Class7521.field29712, Class7521.field29465, Class7521.field29466, Class7521.field29467, Class7521.field29404, Class7521.field29177, Class7521.field29175, Class7521.field29176, Class7521.field29300, Class7521.field29301, Class7521.field29302, Class7521.field29303, Class7521.field29304, Class7521.field29305, Class7521.field29310, Class7521.field29311, Class7521.field29312, Class7521.field29313, Class7521.field29314, Class7521.field29315 }) {
        public Class2173(final String s, final int n, final Block... array) {
        }
        
        @Override
        public Class7096 method8335(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
            return class7096;
        }
    }, 
    field12889("DEFAULT", 1, new Block[0]) {
        public Class2169(final String s, final int n, final Block... array) {
        }
        
        @Override
        public Class7096 method8335(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
            return class7096.method21748(class7097, class7099.getBlockState(class7101), class7099, class7100, class7101);
        }
    }, 
    field12890("CHEST", 2, new Block[] { Class7521.field29292, Class7521.field29468 }) {
        public Class2170(final String s, final int n, final Block... array) {
        }
        
        @Override
        public Class7096 method8335(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
            if (class7098.method21696() == class7096.method21696()) {
                if (class7097.getAxis().isHorizontal()) {
                    if (class7096.method21772(Class3865.field17498) == Class180.field530) {
                        if (class7098.method21772(Class3865.field17498) == Class180.field530) {
                            final Direction class7102 = class7096.method21772((IProperty<Direction>)Class3865.field17497);
                            if (class7097.getAxis() != class7102.getAxis()) {
                                if (class7102 == class7098.method21772((IProperty<Direction>)Class3865.field17497)) {
                                    final Class180 class7103 = (class7097 != class7102.rotateY()) ? Class180.field532 : Class180.field531;
                                    class7099.setBlockState(class7101, (Class7096)((StateHolder<Object, Object>)class7098).with(Class3865.field17498, class7103.method812()), 18);
                                    if (class7102 == Direction.NORTH || class7102 == Direction.EAST) {
                                        final TileEntity method6727 = class7099.getTileEntity(class7100);
                                        final TileEntity method6728 = class7099.getTileEntity(class7101);
                                        if (method6727 instanceof Class475) {
                                            if (method6728 instanceof Class475) {
                                                Class475.method2425((Class475)method6727, (Class475)method6728);
                                            }
                                        }
                                    }
                                    return (Class7096)((StateHolder<Object, Object>)class7096).with(Class3865.field17498, class7103);
                                }
                            }
                        }
                    }
                }
            }
            return class7096;
        }
    }, 
    field12891("LEAVES", 3, true, new Block[] { Class7521.field29209, Class7521.field29207, Class7521.field29210, Class7521.field29208, Class7521.field29205, Class7521.field29206 }) {
        private final ThreadLocal<List<ObjectSet<BlockPos>>> field12895;
        
        {
            this.field12895 = ThreadLocal.withInitial(() -> Lists.newArrayListWithCapacity(7));
        }
        
        @Override
        public Class7096 method8335(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
            final Class7096 method21748 = class7096.method21748(class7097, class7099.getBlockState(class7101), class7099, class7100, class7101);
            if (class7096 != method21748) {
                final int intValue = method21748.method21772((IProperty<Integer>)Class8970.field37778);
                final List list = this.field12895.get();
                if (list.isEmpty()) {
                    for (int i = 0; i < 7; ++i) {
                        list.add(new ObjectOpenHashSet());
                    }
                }
                ((ObjectSet)list.get(intValue)).add((Object)class7100.toImmutable());
            }
            return class7096;
        }
        
        @Override
        public void method8336(final Class1851 class1851) {
            final Mutable class1852 = new Mutable();
            final List list = this.field12895.get();
            for (int i = 2; i < list.size(); ++i) {
                final int j = i - 1;
                final ObjectSet set = (ObjectSet)list.get(j);
                final ObjectSet set2 = (ObjectSet)list.get(i);
                for (final BlockPos class1853 : set) {
                    final Class7096 method6701 = class1851.getBlockState(class1853);
                    if (((StateHolder<Object, Class7096>)method6701).get((IProperty<Integer>)Class8970.field37778) < j) {
                        continue;
                    }
                    class1851.setBlockState(class1853, ((StateHolder<Object, Class7096>)method6701).with((IProperty<Comparable>)Class8970.field37778, j), 18);
                    if (i == 7) {
                        continue;
                    }
                    final Direction[] field12893 = Class2171.field12893;
                    for (int length = field12893.length, k = 0; k < length; ++k) {
                        class1852.method1287(class1853).method1290(field12893[k]);
                        if (class1851.getBlockState(class1852).method21771((IProperty<Comparable>)Class8970.field37778)) {
                            if (((StateHolder<Object, Class7096>)method6701).get((IProperty<Integer>)Class8970.field37778) > i) {
                                set2.add((Object)class1852.toImmutable());
                            }
                        }
                    }
                }
            }
            list.clear();
        }
    }, 
    field12892("STEM_BLOCK", 4, new Block[] { Class7521.field29387, Class7521.field29386 }) {
        public Class2172(final String s, final int n, final Block... array) {
        }
        
        @Override
        public Class7096 method8335(final Class7096 class7096, final Direction class7097, final Class7096 class7098, final Class1851 class7099, final BlockPos class7100, final BlockPos class7101) {
            if (class7096.method21772((IProperty<Integer>)Class3873.field17516) == 7) {
                final Class3993 method11949 = ((Class3873)class7096.method21696()).method11949();
                if (class7098.method21696() == method11949) {
                    return (Class7096)((StateHolder<Object, Object>)method11949.method12143().getDefaultState()).with((IProperty<Comparable>)Class3892.field17564, class7097);
                }
            }
            return class7096;
        }
    };
    
    public static final Direction[] field12893;
    
    private Class2167(final Block[] array) {
        this(false, array);
    }
    
    private Class2167(final boolean b, final Block[] array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            Class8288.method27553().put(array[i], this);
        }
        if (b) {
            Class8288.method27554().add(this);
        }
    }
    
    static {
        field12893 = Direction.values();
    }
}
