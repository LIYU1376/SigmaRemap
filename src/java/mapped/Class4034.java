// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;

public class Class4034 extends Class3820
{
    public Class4034(final Class8959 class8959) {
        super(class8959);
    }
    
    @Override
    public boolean method11730(final Class8321 class8321) {
        return true;
    }
    
    @Override
    public boolean method11732(final Class8321 class8321) {
        return false;
    }
    
    public static Class52 method12225(final Class8321 class8321) {
        final Class51 method27657 = class8321.method27657();
        return (method27657 == null) ? new Class52() : method27657.method328("StoredEnchantments", 10);
    }
    
    @Override
    public void method11728(final Class8321 class8321, final Class1847 class8322, final List<Class2250> list, final Class1981 class8323) {
        super.method11728(class8321, class8322, list, class8323);
        Class8321.method27669(list, method12225(class8321));
    }
    
    public static void method12226(final Class8321 class8321, final Class6827 class8322) {
        final Class52 method12225 = method12225(class8321);
        int n = 1;
        final Class1932 method12226 = Class90.field209.method503(class8322.field26818);
        for (int i = 0; i < method12225.size(); ++i) {
            final Class51 method12227 = method12225.method346(i);
            final Class1932 method12228 = Class1932.method7795(method12227.method323("id"));
            if (method12228 != null && method12228.equals(method12226)) {
                if (method12227.method319("lvl") < class8322.field26819) {
                    method12227.method297("lvl", (short)class8322.field26819);
                }
                n = 0;
                break;
            }
        }
        if (n != 0) {
            final Class51 e = new Class51();
            e.method306("id", String.valueOf(method12226));
            e.method297("lvl", (short)class8322.field26819);
            ((AbstractList<Class51>)method12225).add(e);
        }
        class8321.method27658().method295("StoredEnchantments", method12225);
    }
    
    public static Class8321 method12227(final Class6827 class6827) {
        final Class8321 class6828 = new Class8321(Class7739.field31534);
        method12226(class6828, class6827);
        return class6828;
    }
    
    @Override
    public void method11735(final Class7207 class7207, final Class2265<Class8321> class7208) {
        if (class7207 != Class7207.field27998) {
            if (class7207.method22123().length != 0) {
                for (final Class6257 class7209 : Class90.field209) {
                    if (!class7207.method22125(class7209.field25118)) {
                        continue;
                    }
                    class7208.add(method12227(new Class6827(class7209, class7209.method18588())));
                }
            }
        }
        else {
            for (final Class6257 class7210 : Class90.field209) {
                if (class7210.field25118 == null) {
                    continue;
                }
                for (int i = class7210.method18593(); i <= class7210.method18588(); ++i) {
                    class7208.add(method12227(new Class6827(class7210, i)));
                }
            }
        }
    }
}
