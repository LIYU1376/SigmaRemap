// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import net.minecraft.util.math.MathHelper;

import java.util.Random;

public class Class4794 extends Class4703<Class852>
{
    public static final Class1932 field20436;
    private static final Class1932 field20437;
    private static final Class1932 field20438;
    private static final Class1932 field20439;
    private static final Class6332 field20440;
    private static final Class6332 field20441;
    private static final Class6332 field20442;
    private static final Class6332 field20443;
    private static final float field20444;
    private final Class5898 field20445;
    
    public Class4794(final Class8551 class8551) {
        super(class8551);
        this.field20445 = new Class5898();
        this.field20284 = 0.5f;
    }
    
    public void method14179(final Class852 class852, final float n, final float n2, final Class7351 class853, final Class7807 class854, final int n3) {
        class853.method22567();
        final float n4 = (float)class852.method5108(7, n2)[0];
        final float n5 = (float)(class852.method5108(5, n2)[1] - class852.method5108(10, n2)[1]);
        class853.method22566(Vector3f.field38718.rotationDegrees(-n4));
        class853.method22566(Vector3f.XP.rotationDegrees(n5 * 10.0f));
        class853.method22564(0.0, 0.0, 1.0);
        class853.method22565(-1.0f, -1.0f, 1.0f);
        class853.method22564(0.0, -1.5010000467300415, 0.0);
        final boolean b = class852.field2938 > 0;
        this.field20445.method17635(class852, 0.0f, 0.0f, n2);
        if (class852.field4546 <= 0) {
            this.field20445.method17564(class853, class854.method25214(Class4794.field20440), n3, Class1904.method7388(0.0f, b), 1.0f, 1.0f, 1.0f, 1.0f);
        }
        else {
            this.field20445.method17564(class853, class854.method25214(Class6332.method18778(Class4794.field20437, class852.field4546 / 200.0f)), n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
            this.field20445.method17564(class853, class854.method25214(Class4794.field20441), n3, Class1904.method7388(0.0f, b), 1.0f, 1.0f, 1.0f, 1.0f);
        }
        final Class4150 method25214 = class854.method25214(Class4794.field20442);
        if (Class8571.method28955()) {
            Class9216.method33837();
        }
        Class8571.method28908().field9363 = true;
        this.field20445.method17564(class853, method25214, n3, Class1904.field10335, 1.0f, 1.0f, 1.0f, 1.0f);
        Class8571.method28908().field9363 = false;
        if (Class8571.method28955()) {
            Class9216.method33838();
        }
        if (class852.field4546 > 0) {
            final float n6 = (class852.field4546 + n2) / 200.0f;
            float n7 = 0.0f;
            if (n6 > 0.8f) {
                n7 = (n6 - 0.8f) / 0.2f;
            }
            final Random random = new Random(432L);
            final Class4150 method25215 = class854.method25214(Class6332.method18789());
            class853.method22567();
            class853.method22564(0.0, -1.0, -2.0);
            for (int n8 = 0; n8 < (n6 + n6 * n6) / 2.0f * 60.0f; ++n8) {
                class853.method22566(Vector3f.XP.rotationDegrees(random.nextFloat() * 360.0f));
                class853.method22566(Vector3f.field38718.rotationDegrees(random.nextFloat() * 360.0f));
                class853.method22566(Vector3f.ZP.rotationDegrees(random.nextFloat() * 360.0f));
                class853.method22566(Vector3f.XP.rotationDegrees(random.nextFloat() * 360.0f));
                class853.method22566(Vector3f.field38718.rotationDegrees(random.nextFloat() * 360.0f));
                class853.method22566(Vector3f.ZP.rotationDegrees(random.nextFloat() * 360.0f + n6 * 90.0f));
                final float n9 = random.nextFloat() * 20.0f + 5.0f + n7 * 10.0f;
                final float n10 = random.nextFloat() * 2.0f + 1.0f + n7 * 2.0f;
                final Class6789 method25216 = class853.method22569().method32111();
                final int n11 = (int)(255.0f * (1.0f - n7));
                method14180(method25215, method25216, n11);
                method14181(method25215, method25216, n9, n10);
                method14182(method25215, method25216, n9, n10);
                method14180(method25215, method25216, n11);
                method14182(method25215, method25216, n9, n10);
                method14183(method25215, method25216, n9, n10);
                method14180(method25215, method25216, n11);
                method14183(method25215, method25216, n9, n10);
                method14181(method25215, method25216, n9, n10);
            }
            class853.method22568();
        }
        class853.method22568();
        if (class852.field4548 != null) {
            class853.method22567();
            method14184((float)(class852.field4548.method1938() - MathHelper.method35701(n2, class852.field2392, class852.method1938())), (float)(class852.field4548.method1941() - MathHelper.method35701(n2, class852.field2393, class852.method1941())) + Class4702.method13947(class852.field4548, n2), (float)(class852.field4548.method1945() - MathHelper.method35701(n2, class852.field2394, class852.method1945())), n2, class852.field2424, class853, class854, n3);
            class853.method22568();
        }
        super.method13951(class852, n, n2, class853, class854, n3);
    }
    
    private static void method14180(final Class4150 class4150, final Class6789 class4151, final int n) {
        class4150.method12444(class4151, 0.0f, 0.0f, 0.0f).method12399(255, 255, 255, n).method12397();
        class4150.method12444(class4151, 0.0f, 0.0f, 0.0f).method12399(255, 255, 255, n).method12397();
    }
    
    private static void method14181(final Class4150 class4150, final Class6789 class4151, final float n, final float n2) {
        class4150.method12444(class4151, -Class4794.field20444 * n2, n, -0.5f * n2).method12399(255, 0, 255, 0).method12397();
    }
    
    private static void method14182(final Class4150 class4150, final Class6789 class4151, final float n, final float n2) {
        class4150.method12444(class4151, Class4794.field20444 * n2, n, -0.5f * n2).method12399(255, 0, 255, 0).method12397();
    }
    
    private static void method14183(final Class4150 class4150, final Class6789 class4151, final float n, final float n2) {
        class4150.method12444(class4151, 0.0f, n, 1.0f * n2).method12399(255, 0, 255, 0).method12397();
    }
    
    public static void method14184(final float n, final float n2, final float n3, final float n4, final int n5, final Class7351 class7351, final Class7807 class7352, final int n6) {
        final float method35640 = MathHelper.method35640(n * n + n3 * n3);
        final float method35641 = MathHelper.method35640(n * n + n2 * n2 + n3 * n3);
        class7351.method22567();
        class7351.method22564(0.0, 2.0, 0.0);
        class7351.method22566(Vector3f.field38718.method33327((float)(-Math.atan2(n3, n)) - 1.5707964f));
        class7351.method22566(Vector3f.XP.method33327((float)(-Math.atan2(method35640, n2)) - 1.5707964f));
        final Class4150 method35642 = class7352.method25214(Class4794.field20443);
        final float n7 = 0.0f - (n5 + n4) * 0.01f;
        final float n8 = MathHelper.method35640(n * n + n2 * n2 + n3 * n3) / 32.0f - (n5 + n4) * 0.01f;
        float n9 = 0.0f;
        float n10 = 0.75f;
        float n11 = 0.0f;
        final Class8996 method35643 = class7351.method22569();
        final Class6789 method35644 = method35643.method32111();
        final Class9429 method35645 = method35643.method32112();
        for (int i = 1; i <= 8; ++i) {
            final float n12 = MathHelper.sin(i * 6.2831855f / 8.0f) * 0.75f;
            final float n13 = MathHelper.cos(i * 6.2831855f / 8.0f) * 0.75f;
            final float n14 = i / 8.0f;
            method35642.method12444(method35644, n9 * 0.2f, n10 * 0.2f, 0.0f).method12399(0, 0, 0, 255).method12391(n11, n7).method12441(Class1904.field10335).method12440(n6).method12445(method35645, 0.0f, -1.0f, 0.0f).method12397();
            method35642.method12444(method35644, n9, n10, method35641).method12399(255, 255, 255, 255).method12391(n11, n8).method12441(Class1904.field10335).method12440(n6).method12445(method35645, 0.0f, -1.0f, 0.0f).method12397();
            method35642.method12444(method35644, n12, n13, method35641).method12399(255, 255, 255, 255).method12391(n14, n8).method12441(Class1904.field10335).method12440(n6).method12445(method35645, 0.0f, -1.0f, 0.0f).method12397();
            method35642.method12444(method35644, n12 * 0.2f, n13 * 0.2f, 0.0f).method12399(0, 0, 0, 255).method12391(n14, n7).method12441(Class1904.field10335).method12440(n6).method12445(method35645, 0.0f, -1.0f, 0.0f).method12397();
            n9 = n12;
            n10 = n13;
            n11 = n14;
        }
        class7351.method22568();
    }
    
    public Class1932 method14185(final Class852 class852) {
        return Class4794.field20438;
    }
    
    static {
        field20436 = new Class1932("textures/entity/end_crystal/end_crystal_beam.png");
        field20437 = new Class1932("textures/entity/enderdragon/dragon_exploding.png");
        field20438 = new Class1932("textures/entity/enderdragon/dragon.png");
        field20439 = new Class1932("textures/entity/enderdragon/dragon_eyes.png");
        field20440 = Class6332.method18770(Class4794.field20438);
        field20441 = Class6332.method18776(Class4794.field20438);
        field20442 = Class6332.method18779(Class4794.field20439);
        field20443 = Class6332.method18774(Class4794.field20436);
        field20444 = (float)(Math.sqrt(3.0) / 2.0);
    }
}
