// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.io.IOException;
import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;

public class Class4331 implements Class4252<Class5800>
{
    private static String[] field19389;
    private Class2227 field19390;
    private List<Class1932> field19391;
    private List<Class1932> field19392;
    private boolean field19393;
    private boolean field19394;
    private boolean field19395;
    private boolean field19396;
    
    public Class4331() {
    }
    
    public Class4331(final Class2227 field19390, final Collection<Class1932> collection, final Collection<Class1932> collection2, final boolean field19391, final boolean field19392, final boolean field19393, final boolean field19394) {
        this.field19390 = field19390;
        this.field19391 = (List<Class1932>)ImmutableList.copyOf((Collection)collection);
        this.field19392 = (List<Class1932>)ImmutableList.copyOf((Collection)collection2);
        this.field19393 = field19391;
        this.field19394 = field19392;
        this.field19395 = field19393;
        this.field19396 = field19394;
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17331(this);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19390 = class8654.method29499(Class2227.class);
        this.field19393 = class8654.readBoolean();
        this.field19394 = class8654.readBoolean();
        this.field19395 = class8654.readBoolean();
        this.field19396 = class8654.readBoolean();
        final int method29501 = class8654.method29501();
        this.field19391 = Lists.newArrayList();
        for (int i = 0; i < method29501; ++i) {
            this.field19391.add(class8654.method29516());
        }
        if (this.field19390 == Class2227.field13701) {
            final int method29502 = class8654.method29501();
            this.field19392 = Lists.newArrayList();
            for (int j = 0; j < method29502; ++j) {
                this.field19392.add(class8654.method29516());
            }
        }
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29500(this.field19390);
        class8654.writeBoolean(this.field19393);
        class8654.writeBoolean(this.field19394);
        class8654.writeBoolean(this.field19395);
        class8654.writeBoolean(this.field19396);
        class8654.method29505(this.field19391.size());
        final Iterator<Class1932> iterator = this.field19391.iterator();
        while (iterator.hasNext()) {
            class8654.method29517(iterator.next());
        }
        if (this.field19390 == Class2227.field13701) {
            class8654.method29505(this.field19392.size());
            final Iterator<Class1932> iterator2 = this.field19392.iterator();
            while (iterator2.hasNext()) {
                class8654.method29517(iterator2.next());
            }
        }
    }
    
    public List<Class1932> method13003() {
        return this.field19391;
    }
    
    public List<Class1932> method13004() {
        return this.field19392;
    }
    
    public boolean method13005() {
        return this.field19393;
    }
    
    public boolean method13006() {
        return this.field19394;
    }
    
    public boolean method13007() {
        return this.field19395;
    }
    
    public boolean method13008() {
        return this.field19396;
    }
    
    public Class2227 method13009() {
        return this.field19390;
    }
}
