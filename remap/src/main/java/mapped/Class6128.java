// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.Direction;

import java.util.Iterator;

public class Class6128 implements Class6113
{
    private static String[] field24872;
    private final Class869 field24873;
    
    public Class6128(final Class869 field24873) {
        this.field24873 = field24873;
    }
    
    @Override
    public void method18269(final Class7351 class7351, final Class7807 class7352, final double n, final double n2, final double n3) {
        final Class1847 field2391 = this.field24873.field4684.field2391;
        Class8726.method30011();
        Class8726.method30117();
        Class8726.method30072(2.0f);
        Class8726.method30041();
        Class8726.method30010(false);
        final BlockPos class7353 = new BlockPos(n, n2, n3);
        for (final BlockPos class7354 : BlockPos.method1154(class7353.method1134(-6, -6, -6), class7353.method1134(6, 6, 6))) {
            final Class7096 method6701 = field2391.method6701(class7354);
            if (method6701.method21696() == Class7521.field29147) {
                continue;
            }
            final Iterator<Class6221> iterator2 = method6701.method21725(field2391, class7354).method24545().iterator();
            while (iterator2.hasNext()) {
                final Class6221 method6702 = iterator2.next().method18500(class7354).method18496(0.002).method18499(-n, -n2, -n3);
                final double field2392 = method6702.field25073;
                final double field2393 = method6702.field25074;
                final double field2394 = method6702.field25075;
                final double field2395 = method6702.field25076;
                final double field2396 = method6702.field25077;
                final double field2397 = method6702.field25078;
                if (method6701.method21761(field2391, class7354, Direction.WEST)) {
                    final Class7392 method6703 = Class7392.method22694();
                    final Class4148 method6704 = method6703.method22696();
                    method6704.method12390(5, Class9237.field39615);
                    method6704.method12432(field2392, field2393, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6704.method12432(field2392, field2393, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6704.method12432(field2392, field2396, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6704.method12432(field2392, field2396, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6703.method22695();
                }
                if (method6701.method21761(field2391, class7354, Direction.SOUTH)) {
                    final Class7392 method6705 = Class7392.method22694();
                    final Class4148 method6706 = method6705.method22696();
                    method6706.method12390(5, Class9237.field39615);
                    method6706.method12432(field2392, field2396, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6706.method12432(field2392, field2393, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6706.method12432(field2395, field2396, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6706.method12432(field2395, field2393, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6705.method22695();
                }
                if (method6701.method21761(field2391, class7354, Direction.EAST)) {
                    final Class7392 method6707 = Class7392.method22694();
                    final Class4148 method6708 = method6707.method22696();
                    method6708.method12390(5, Class9237.field39615);
                    method6708.method12432(field2395, field2393, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6708.method12432(field2395, field2393, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6708.method12432(field2395, field2396, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6708.method12432(field2395, field2396, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6707.method22695();
                }
                if (method6701.method21761(field2391, class7354, Direction.NORTH)) {
                    final Class7392 method6709 = Class7392.method22694();
                    final Class4148 method6710 = method6709.method22696();
                    method6710.method12390(5, Class9237.field39615);
                    method6710.method12432(field2395, field2396, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6710.method12432(field2395, field2393, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6710.method12432(field2392, field2396, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6710.method12432(field2392, field2393, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6709.method22695();
                }
                if (method6701.method21761(field2391, class7354, Direction.DOWN)) {
                    final Class7392 method6711 = Class7392.method22694();
                    final Class4148 method6712 = method6711.method22696();
                    method6712.method12390(5, Class9237.field39615);
                    method6712.method12432(field2392, field2393, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6712.method12432(field2395, field2393, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6712.method12432(field2392, field2393, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6712.method12432(field2395, field2393, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                    method6711.method22695();
                }
                if (!method6701.method21761(field2391, class7354, Direction.UP)) {
                    continue;
                }
                final Class7392 method6713 = Class7392.method22694();
                final Class4148 method6714 = method6713.method22696();
                method6714.method12390(5, Class9237.field39615);
                method6714.method12432(field2392, field2396, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                method6714.method12432(field2392, field2396, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                method6714.method12432(field2395, field2396, field2394).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                method6714.method12432(field2395, field2396, field2397).method12439(1.0f, 0.0f, 0.0f, 0.5f).method12397();
                method6713.method22695();
            }
        }
        Class8726.method30010(true);
        Class8726.method30040();
        Class8726.method30012();
    }
}
