// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4271 implements Class4252<Class5800>
{
    private static String[] field19156;
    private Class354 field19157;
    private Class7096 field19158;
    
    public Class4271() {
    }
    
    public Class4271(final Class1855 class1855, final Class354 field19157) {
        this.field19157 = field19157;
        this.field19158 = class1855.method6701(field19157);
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19157 = class8654.method29494();
        this.field19158 = Class3833.field17391.method499(class8654.method29501());
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19157);
        class8654.method29505(Class3833.method11774(this.field19158));
    }
    
    public void method12764(final Class5800 class5800) {
        class5800.method17289(this);
    }
    
    public Class7096 method12817() {
        return this.field19158;
    }
    
    public Class354 method12818() {
        return this.field19157;
    }
}
