// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class6225
{
    private static final float field25093;
    private static final float field25094;
    
    public Class8754 method18519(final Class9138 class9138, final Class9138 class9139, final Class8111 class9140, final Class1912 class9141, final Class179 class9142, final Class2123 class9143, final Class8225 class9144, final boolean b, final Class1932 class9145) {
        Class8435 class9146 = class9140.field33426;
        if (class9143.method8278()) {
            class9146 = method18520(class9140.field33426, class9142, class9143.method8274(), class9145);
        }
        final float[] array = new float[class9146.field34667.length];
        System.arraycopy(class9146.field34667, 0, array, 0, array.length);
        final float method7509 = class9141.method7509();
        final float n = (class9146.field34667[0] + class9146.field34667[0] + class9146.field34667[2] + class9146.field34667[2]) / 4.0f;
        final float n2 = (class9146.field34667[1] + class9146.field34667[1] + class9146.field34667[3] + class9146.field34667[3]) / 4.0f;
        class9146.field34667[0] = Class9546.method35700(method7509, class9146.field34667[0], n);
        class9146.field34667[2] = Class9546.method35700(method7509, class9146.field34667[2], n);
        class9146.field34667[1] = Class9546.method35700(method7509, class9146.field34667[1], n2);
        class9146.field34667[3] = Class9546.method35700(method7509, class9146.field34667[3], n2);
        final int[] method7510 = this.method18521(class9146, class9141, class9142, this.method18524(class9138, class9139), class9143.method8274(), class9144, !Class9570.field41285.method22605() && b);
        final Class179 method7511 = method18530(method7510);
        System.arraycopy(array, 0, class9146.field34667, 0, array.length);
        if (class9144 == null) {
            this.method18531(method7510, method7511);
        }
        if (!Class9570.field41285.method22605()) {
            return new Class8754(method7510, class9140.field33424, method7511, class9141);
        }
        Class9570.method35818(Class9570.field41285, method7510, method7511);
        return new Class8754(method7510, class9140.field33424, method7511, class9141, b);
    }
    
    public static Class8435 method18520(final Class8435 class8435, final Class179 class8436, final Class9294 class8437, final Class1932 class8438) {
        final Class6789 method34328 = Class7235.method22138(class8437, class8436, () -> "Unable to resolve UVLock for model: " + obj).method34328();
        final float method34329 = class8435.method28163(class8435.method28166(0));
        final float method34330 = class8435.method28164(class8435.method28166(0));
        final Class8526 class8439 = new Class8526(method34329 / 16.0f, method34330 / 16.0f, 0.0f, 1.0f);
        class8439.method28603(method34328);
        final float n = 16.0f * class8439.method28595();
        final float n2 = 16.0f * class8439.method28596();
        final float method34331 = class8435.method28163(class8435.method28166(2));
        final float method34332 = class8435.method28164(class8435.method28166(2));
        final Class8526 class8440 = new Class8526(method34331 / 16.0f, method34332 / 16.0f, 0.0f, 1.0f);
        class8440.method28603(method34328);
        final float n3 = 16.0f * class8440.method28595();
        final float n4 = 16.0f * class8440.method28596();
        float n5;
        float n6;
        if (Math.signum(method34331 - method34329) != Math.signum(n3 - n)) {
            n5 = n3;
            n6 = n;
        }
        else {
            n5 = n;
            n6 = n3;
        }
        float n7;
        float n8;
        if (Math.signum(method34332 - method34330) != Math.signum(n4 - n2)) {
            n7 = n4;
            n8 = n2;
        }
        else {
            n7 = n2;
            n8 = n4;
        }
        final float n9 = (float)Math.toRadians(class8435.field34668);
        final Class9138 class8441 = new Class9138(Class9546.method35639(n9), Class9546.method35638(n9), 0.0f);
        class8441.method33324(new Class9429(method34328));
        return new Class8435(new float[] { n5, n7, n6, n8 }, Math.floorMod(-(int)Math.round(Math.toDegrees(Math.atan2(class8441.method33312(), class8441.method33311())) / 90.0) * 90, 360));
    }
    
    private int[] method18521(final Class8435 class8435, final Class1912 class8436, final Class179 class8437, final float[] array, final Class9294 class8438, final Class8225 class8439, final boolean b) {
        final int[] array2 = new int[Class8571.method28955() ? Class9237.field39612 : Class9237.field39611];
        for (int i = 0; i < 4; ++i) {
            this.method18525(array2, i, class8437, class8435, array, class8436, class8438, class8439, b);
        }
        return array2;
    }
    
    private int method18522(final Class179 class179) {
        final int method35651 = Class9546.method35651((int)(method18523(class179) * 255.0f), 0, 255);
        return 0xFF000000 | method35651 << 16 | method35651 << 8 | method35651;
    }
    
    public static float method18523(final Class179 class179) {
        switch (Class8668.field36447[class179.ordinal()]) {
            case 1: {
                if (Class8571.method28955()) {
                    return Class9216.field39371;
                }
                return 0.5f;
            }
            case 2: {
                return 1.0f;
            }
            case 3:
            case 4: {
                if (Class8571.method28955()) {
                    return Class9216.field39373;
                }
                return 0.8f;
            }
            case 5:
            case 6: {
                if (Class8571.method28955()) {
                    return Class9216.field39372;
                }
                return 0.6f;
            }
            default: {
                return 1.0f;
            }
        }
    }
    
    private float[] method18524(final Class9138 class9138, final Class9138 class9139) {
        final float[] array = new float[Class179.values().length];
        array[Class6352.field25404] = class9138.method33311() / 16.0f;
        array[Class6352.field25403] = class9138.method33312() / 16.0f;
        array[Class6352.field25402] = class9138.method33313() / 16.0f;
        array[Class6352.field25401] = class9139.method33311() / 16.0f;
        array[Class6352.field25400] = class9139.method33312() / 16.0f;
        array[Class6352.field25399] = class9139.method33313() / 16.0f;
        return array;
    }
    
    private void method18525(final int[] array, final int n, final Class179 class179, final Class8435 class180, final float[] array2, final Class1912 class181, final Class9294 class182, final Class8225 class183, final boolean b) {
        final Class179 method777 = Class179.method777(class182.method34328(), class179);
        final int n2 = b ? this.method18522(method777) : -1;
        final Class8859 method778 = Class1962.method7951(class179).method7952(n);
        final Class9138 class184 = new Class9138(array2[method778.field37246], array2[method778.field37247], array2[method778.field37248]);
        this.method18527(class184, class183);
        this.method18528(class184, class182);
        Class6778.method20692(class184);
        this.method18526(array, n, class184, n2, class181, class180);
    }
    
    private void method18526(final int[] array, final int n, final Class9138 class9138, final int n2, final Class1912 class9139, final Class8435 class9140) {
        final int n3 = n * (array.length / 4);
        array[n3] = Float.floatToRawIntBits(class9138.method33311());
        array[n3 + 1] = Float.floatToRawIntBits(class9138.method33312());
        array[n3 + 2] = Float.floatToRawIntBits(class9138.method33313());
        array[n3 + 3] = n2;
        array[n3 + 4] = Float.floatToRawIntBits(class9139.method7499(class9140.method28163(n)));
        array[n3 + 4 + 1] = Float.floatToRawIntBits(class9139.method7502(class9140.method28164(n)));
    }
    
    private void method18527(final Class9138 class9138, final Class8225 class9139) {
        if (class9139 != null) {
            Class9138 class9140 = null;
            Class9138 class9141 = null;
            switch (Class8668.field36448[class9139.field33784.ordinal()]) {
                case 1: {
                    class9140 = new Class9138(1.0f, 0.0f, 0.0f);
                    class9141 = new Class9138(0.0f, 1.0f, 1.0f);
                    break;
                }
                case 2: {
                    class9140 = new Class9138(0.0f, 1.0f, 0.0f);
                    class9141 = new Class9138(1.0f, 0.0f, 1.0f);
                    break;
                }
                case 3: {
                    class9140 = new Class9138(0.0f, 0.0f, 1.0f);
                    class9141 = new Class9138(1.0f, 1.0f, 0.0f);
                    break;
                }
                default: {
                    throw new IllegalArgumentException("There are only 3 axes");
                }
            }
            final Class9389 class9142 = new Class9389(class9140, class9139.field33785, true);
            if (class9139.field33786) {
                if (Math.abs(class9139.field33785) == 22.5f) {
                    class9141.method33314(Class6225.field25093);
                }
                else {
                    class9141.method33314(Class6225.field25094);
                }
                class9141.method33318(1.0f, 1.0f, 1.0f);
            }
            else {
                class9141.method33317(1.0f, 1.0f, 1.0f);
            }
            this.method18529(class9138, class9139.field33783.method33329(), new Class6789(class9142), class9141);
        }
    }
    
    public void method18528(final Class9138 class9138, final Class9294 class9139) {
        if (class9139 != Class9294.method34322()) {
            this.method18529(class9138, new Class9138(0.5f, 0.5f, 0.5f), class9139.method34328(), new Class9138(1.0f, 1.0f, 1.0f));
        }
    }
    
    private void method18529(final Class9138 class9138, final Class9138 class9139, final Class6789 class9140, final Class9138 class9141) {
        final Class8526 class9142 = new Class8526(class9138.method33311() - class9139.method33311(), class9138.method33312() - class9139.method33312(), class9138.method33313() - class9139.method33313(), 1.0f);
        class9142.method28603(class9140);
        class9142.method28599(class9141);
        class9138.method33317(class9142.method28595() + class9139.method33311(), class9142.method28596() + class9139.method33312(), class9142.method28597() + class9139.method33313());
    }
    
    public static Class179 method18530(final int[] array) {
        final int n = array.length / 4;
        final int n2 = n * 2;
        final Class9138 class9138 = new Class9138(Float.intBitsToFloat(array[0]), Float.intBitsToFloat(array[1]), Float.intBitsToFloat(array[2]));
        final Class9138 class9139 = new Class9138(Float.intBitsToFloat(array[n]), Float.intBitsToFloat(array[n + 1]), Float.intBitsToFloat(array[n + 2]));
        final Class9138 class9140 = new Class9138(Float.intBitsToFloat(array[n2]), Float.intBitsToFloat(array[n2 + 1]), Float.intBitsToFloat(array[n2 + 2]));
        final Class9138 method33329 = class9138.method33329();
        method33329.method33320(class9139);
        final Class9138 method33330 = class9140.method33329();
        method33330.method33320(class9139);
        final Class9138 method33331 = method33330.method33329();
        method33331.method33323(method33329);
        method33331.method33322();
        Class179 class9141 = null;
        float n3 = 0.0f;
        for (final Class179 class9142 : Class179.values()) {
            final Class352 method33332 = class9142.method802();
            final float method33333 = method33331.method33321(new Class9138((float)method33332.method1074(), (float)method33332.method1075(), (float)method33332.method1076()));
            if (method33333 >= 0.0f) {
                if (method33333 > n3) {
                    n3 = method33333;
                    class9141 = class9142;
                }
            }
        }
        return (class9141 != null) ? class9141 : Class179.field512;
    }
    
    private void method18531(final int[] array, final Class179 class179) {
        final int[] array2 = new int[array.length];
        System.arraycopy(array, 0, array2, 0, array.length);
        final float[] array3 = new float[Class179.values().length];
        array3[Class6352.field25404] = 999.0f;
        array3[Class6352.field25403] = 999.0f;
        array3[Class6352.field25402] = 999.0f;
        array3[Class6352.field25401] = -999.0f;
        array3[Class6352.field25400] = -999.0f;
        array3[Class6352.field25399] = -999.0f;
        final int n = array.length / 4;
        for (int i = 0; i < 4; ++i) {
            final int n2 = n * i;
            final float intBitsToFloat = Float.intBitsToFloat(array2[n2]);
            final float intBitsToFloat2 = Float.intBitsToFloat(array2[n2 + 1]);
            final float intBitsToFloat3 = Float.intBitsToFloat(array2[n2 + 2]);
            if (intBitsToFloat < array3[Class6352.field25404]) {
                array3[Class6352.field25404] = intBitsToFloat;
            }
            if (intBitsToFloat2 < array3[Class6352.field25403]) {
                array3[Class6352.field25403] = intBitsToFloat2;
            }
            if (intBitsToFloat3 < array3[Class6352.field25402]) {
                array3[Class6352.field25402] = intBitsToFloat3;
            }
            if (intBitsToFloat > array3[Class6352.field25401]) {
                array3[Class6352.field25401] = intBitsToFloat;
            }
            if (intBitsToFloat2 > array3[Class6352.field25400]) {
                array3[Class6352.field25400] = intBitsToFloat2;
            }
            if (intBitsToFloat3 > array3[Class6352.field25399]) {
                array3[Class6352.field25399] = intBitsToFloat3;
            }
        }
        final Class1962 method7951 = Class1962.method7951(class179);
        for (int j = 0; j < 4; ++j) {
            final int n3 = n * j;
            final Class8859 method7952 = method7951.method7952(j);
            final float n4 = array3[method7952.field37246];
            final float n5 = array3[method7952.field37247];
            final float n6 = array3[method7952.field37248];
            array[n3] = Float.floatToRawIntBits(n4);
            array[n3 + 1] = Float.floatToRawIntBits(n5);
            array[n3 + 2] = Float.floatToRawIntBits(n6);
            for (int k = 0; k < 4; ++k) {
                final int n7 = n * k;
                final float intBitsToFloat4 = Float.intBitsToFloat(array2[n7]);
                final float intBitsToFloat5 = Float.intBitsToFloat(array2[n7 + 1]);
                final float intBitsToFloat6 = Float.intBitsToFloat(array2[n7 + 2]);
                if (Class9546.method35662(n4, intBitsToFloat4)) {
                    if (Class9546.method35662(n5, intBitsToFloat5)) {
                        if (Class9546.method35662(n6, intBitsToFloat6)) {
                            array[n3 + 4] = array2[n7 + 4];
                            array[n3 + 4 + 1] = array2[n7 + 4 + 1];
                        }
                    }
                }
            }
        }
    }
    
    static {
        field25093 = 1.0f / (float)Math.cos(0.39269909262657166) - 1.0f;
        field25094 = 1.0f / (float)Math.cos(0.7853981852531433) - 1.0f;
    }
}
