// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

public class Class8591
{
    private static String[] field36091;
    private static Class869 field36092;
    
    public static double method29091(final Class399 class399) {
        final double n = method29093(Class8591.field36092.field4684).field38854 - method29093(class399).field38854;
        final double n2 = method29093(Class8591.field36092.field4684).field38855 - method29093(class399).field38855;
        final double n3 = method29093(Class8591.field36092.field4684).field38856 - method29093(class399).field38856;
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public static double method29092(final Class354 class354) {
        final double n = method29093(Class8591.field36092.field4684).field38854 - class354.method1074();
        final double n2 = method29093(Class8591.field36092.field4684).field38855 - class354.method1075();
        final double n3 = method29093(Class8591.field36092.field4684).field38856 - class354.method1076();
        return n * n + n2 * n2 + n3 * n3;
    }
    
    public static Class9172 method29093(final Class399 class399) {
        return new Class9172(class399.field2417 + (class399.field2395 - class399.field2417) * Class8591.field36092.field4633.field26528, class399.field2418 + (class399.field2396 - class399.field2418) * Class8591.field36092.field4633.field26528, class399.field2419 + (class399.field2397 - class399.field2419) * Class8591.field36092.field4633.field26528);
    }
    
    public static Class9172 method29094(final Class399 class399) {
        final Class9172 method29093 = method29093(class399);
        return new Class9172(method29093.field38854 - Class869.method5277().field4644.method5833().method18161().method16760(), method29093.field38855 - Class869.method5277().field4644.method5833().method18161().method16761(), method29093.field38856 - Class869.method5277().field4644.method5833().method18161().method16762());
    }
    
    public static Class9172 method29095(final Class354 class354) {
        return new Class9172(class354.method1074() - Class869.method5277().field4644.method5833().method18161().method16760(), class354.method1075() - Class869.method5277().field4644.method5833().method18161().method16761(), class354.method1076() - Class869.method5277().field4644.method5833().method18161().method16762());
    }
    
    static {
        Class8591.field36092 = Class869.method5277();
    }
}
