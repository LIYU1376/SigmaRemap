// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class Class7614
{
    private static String[] field30173;
    private final Class8491 field30174;
    private HashMap<Class354, Class7096> field30175;
    private HashMap<Class354, Class7096> field30176;
    private Set<Class6977> field30177;
    private Set<Class9488> field30178;
    private Set<Class9488> field30179;
    
    public Class7614(final Class8491 field30174) {
        this.field30175 = new HashMap<Class354, Class7096>();
        this.field30176 = new HashMap<Class354, Class7096>();
        this.field30177 = new HashSet<Class6977>();
        this.field30178 = new HashSet<Class9488>();
        this.field30179 = new HashSet<Class9488>();
        this.field30174 = field30174;
        this.method23916();
    }
    
    private void method23915(final Class6977 class6977) {
        this.field30177.add(class6977);
    }
    
    private void method23916() {
        this.method23915(new Class6976());
        this.method23915(new Class6979());
        this.method23915(new Class6985());
        this.method23915(new Class6978());
        this.method23915(new Class6980());
        this.method23915(new Class6981());
        this.method23915(new Class6983());
        this.method23915(new Class6984());
        this.method23915(new Class6986());
        this.method23915(new Class6982());
    }
    
    public void method23917() {
        for (final Map.Entry entry : this.field30175.entrySet()) {
            this.method23921((Class354)entry.getKey(), (Class7096)entry.getValue());
        }
        this.field30175.clear();
    }
    
    public void method23918() {
        for (final Map.Entry entry : this.field30176.entrySet()) {
            this.method23924((Class354)entry.getKey(), (Class7096)entry.getValue());
        }
        this.field30176.clear();
    }
    
    public void method23919() {
        this.field30178.clear();
        this.field30175.clear();
    }
    
    public void method23920() {
        for (final Class9488 class9488 : this.field30179) {
            Class869.method5277().field4683.method6692(class9488.field40785, class9488.field40786);
        }
        this.field30179.clear();
    }
    
    private void method23921(final Class354 class354, final Class7096 class355) {
        final Class6977 method23922 = this.method23922(class355);
        if (method23922 != null) {
            this.field30178.addAll(method23922.method21398(class354, class355, this));
        }
    }
    
    private Class6977 method23922(final Class7096 class7096) {
        for (final Class6977 class7097 : this.field30177) {
            if (class7097.field27276 != class7096.method21696().getClass()) {
                continue;
            }
            return class7097;
        }
        return null;
    }
    
    public Class4252 method23923(final Class4252 class4252) {
        final HashMap hashMap = new HashMap();
        if (!(class4252 instanceof Class4312)) {
            if (class4252 instanceof Class4271) {
                final Class4271 class4253 = (Class4271)class4252;
                if (this.method23925(class4253.method12817())) {
                    hashMap.put(class4253.method12818(), new Class9488(class4253.method12818(), class4253.method12817()));
                }
            }
        }
        else {
            for (final Class7870 class4254 : ((Class4312)class4252).method12963()) {
                if (this.method23925(class4254.method25491())) {
                    hashMap.put(class4254.method25489(), new Class9488(class4254.method25489(), class4254.method25491()));
                }
            }
        }
        for (final Class9488 class4255 : this.field30178) {
            hashMap.put(class4255.field40785, new Class9488(class4255.field40785, class4255.field40786));
        }
        this.field30178.clear();
        if (hashMap.size() != 0) {
            final Class354 class4256 = (Class354)hashMap.keySet().toArray()[0];
            final Class4312 class4257 = new Class4312();
            class4257.field19330 = new Class7859(class4256.method1074() >> 4, class4256.method1076() >> 4);
            final ArrayList list = new ArrayList();
            for (final Map.Entry<Class354, V> entry : hashMap.entrySet()) {
                final short n = (short)((entry.getKey().method1074() & 0xF) << 12 | (entry.getKey().method1076() & 0xF) << 8 | entry.getKey().method1075());
                final ArrayList list2 = list;
                final Class4312 class4258 = class4257;
                class4258.getClass();
                list2.add(new Class7870(class4258, n, ((Class9488)entry.getValue()).field40786));
            }
            class4257.field19331 = (Class7870[])list.toArray(new Class7870[0]);
            return class4257;
        }
        return class4252;
    }
    
    private void method23924(final Class354 class354, final Class7096 class355) {
        final Class6977 method23922 = this.method23922(class355);
        if (method23922 != null) {
            this.field30179.addAll(method23922.method21399(class354, class355, this));
        }
    }
    
    public boolean method23925(final Class7096 class7096) {
        return this.method23922(class7096) != null;
    }
    
    public void method23926(final Class354 class354, final Class7096 class355) {
        this.field30175.put(class354, class355);
        this.field30176.put(class354, class355);
    }
    
    public Class7096 method23927(final Class354 class354) {
        if (this.field30175.containsKey(class354)) {
            return this.field30175.get(class354);
        }
        if (!this.field30176.containsKey(class354)) {
            return Class869.method5277().field4683.method6701(class354);
        }
        return this.field30176.get(class354);
    }
    
    public void method23928(final Class1862 class1862) {
        for (final Class9488 class1863 : this.field30178) {
            class1862.method7008(class1863.field40785, class1863.field40786, false);
        }
        this.field30178.clear();
    }
}
