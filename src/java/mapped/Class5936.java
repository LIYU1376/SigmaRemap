// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.Random;
import com.google.common.collect.Lists;
import java.util.List;

public abstract class Class5936
{
    public static final Class5936 field24429;
    private final Class4574<?> field24430;
    public final List<Class4473> field24431;
    public Class6997 field24432;
    private final int field24433;
    private final int field24434;
    private int field24435;
    public final Class2317 field24436;
    
    public Class5936(final Class4574<?> field24430, final int field24431, final int field24432, final Class6997 field24433, final int field24434, final long n) {
        this.field24431 = Lists.newArrayList();
        this.field24430 = field24430;
        this.field24433 = field24431;
        this.field24434 = field24432;
        this.field24435 = field24434;
        (this.field24436 = new Class2317()).method9440(n, field24431, field24432);
        this.field24432 = field24433;
    }
    
    public abstract void method17850(final Class6346<?> p0, final Class1795 p1, final int p2, final int p3, final Class3090 p4);
    
    public Class6997 method17851() {
        return this.field24432;
    }
    
    public List<Class4473> method17852() {
        return this.field24431;
    }
    
    public void method17853(final Class1851 class1851, final Class6346<?> class1852, final Random random, final Class6997 class1853, final Class7859 class1854) {
        synchronized (this.field24431) {
            final Iterator<Class4473> iterator = this.field24431.iterator();
            while (iterator.hasNext()) {
                final Class4473 class1855 = iterator.next();
                if (class1855.method13432().method21410(class1853) && !class1855.method13421(class1851, class1852, random, class1853, class1854)) {
                    iterator.remove();
                }
            }
            this.method17854();
        }
    }
    
    public void method17854() {
        this.field24432 = Class6997.method21407();
        final Iterator<Class4473> iterator = this.field24431.iterator();
        while (iterator.hasNext()) {
            this.field24432.method21412(iterator.next().method13432());
        }
    }
    
    public Class51 method17855(final int n, final int n2) {
        final Class51 class51 = new Class51();
        if (this.method17858()) {
            class51.method306("id", Class90.field230.method503(this.method17866()).toString());
            class51.method298("ChunkX", n);
            class51.method298("ChunkZ", n2);
            class51.method298("references", this.field24435);
            class51.method295("BB", this.field24432.method21421());
            final Class52 class52 = new Class52();
            synchronized (this.field24431) {
                final Iterator<Class4473> iterator = this.field24431.iterator();
                while (iterator.hasNext()) {
                    ((AbstractList<Class51>)class52).add(iterator.next().method13430());
                }
            }
            class51.method295("Children", class52);
            return class51;
        }
        class51.method306("id", "INVALID");
        return class51;
    }
    
    public void method17856(final int n, final Random random, final int n2) {
        final int n3 = n - n2;
        int n4 = this.field24432.method21418() + 1;
        if (n4 < n3) {
            n4 += random.nextInt(n3 - n4);
        }
        final int n5 = n4 - this.field24432.field27297;
        this.field24432.method21413(0, n5, 0);
        final Iterator<Class4473> iterator = this.field24431.iterator();
        while (iterator.hasNext()) {
            iterator.next().method13454(0, n5, 0);
        }
    }
    
    public void method17857(final Random random, final int n, final int n2) {
        final int bound = n2 - n + 1 - this.field24432.method21418();
        int n3;
        if (bound <= 1) {
            n3 = n;
        }
        else {
            n3 = n + random.nextInt(bound);
        }
        final int n4 = n3 - this.field24432.field27294;
        this.field24432.method21413(0, n4, 0);
        final Iterator<Class4473> iterator = this.field24431.iterator();
        while (iterator.hasNext()) {
            iterator.next().method13454(0, n4, 0);
        }
    }
    
    public boolean method17858() {
        return !this.field24431.isEmpty();
    }
    
    public int method17859() {
        return this.field24433;
    }
    
    public int method17860() {
        return this.field24434;
    }
    
    public Class354 method17861() {
        return new Class354(this.field24433 << 4, 0, this.field24434 << 4);
    }
    
    public boolean method17862() {
        return this.field24435 < this.method17865();
    }
    
    public void method17863() {
        ++this.field24435;
    }
    
    public int method17864() {
        return this.field24435;
    }
    
    public int method17865() {
        return 1;
    }
    
    public Class4574<?> method17866() {
        return this.field24430;
    }
    
    static {
        field24429 = new Class5946(Class4535.field19959, 0, 0, Class6997.method21407(), 0, 0L);
    }
}
