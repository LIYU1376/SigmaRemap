// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4374 implements Class4252<Class5800>
{
    private static String[] field19581;
    private Class2250 field19582;
    private Class2250 field19583;
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19582 = class8654.method29497();
        this.field19583 = class8654.method29497();
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29498(this.field19582);
        class8654.method29498(this.field19583);
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17339(this);
    }
    
    public Class2250 method13151() {
        return this.field19582;
    }
    
    public Class2250 method13152() {
        return this.field19583;
    }
}
