// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4270 implements Class4252<Class5813>
{
    private static String[] field19151;
    private BlockPos field19152;
    private Class1932 field19153;
    private Class1932 field19154;
    private String field19155;
    
    public Class4270() {
    }
    
    public Class4270(final BlockPos field19152, final Class1932 field19153, final Class1932 field19154, final String field19155) {
        this.field19152 = field19152;
        this.field19153 = field19153;
        this.field19154 = field19154;
        this.field19155 = field19155;
    }
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19152 = class8654.method29494();
        this.field19153 = class8654.method29516();
        this.field19154 = class8654.method29516();
        this.field19155 = class8654.method29513(32767);
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29495(this.field19152);
        class8654.method29517(this.field19153);
        class8654.method29517(this.field19154);
        class8654.method29514(this.field19155);
    }
    
    public void method12756(final Class5813 class5813) {
        class5813.method17457(this);
    }
    
    public BlockPos method12813() {
        return this.field19152;
    }
    
    public Class1932 method12814() {
        return this.field19154;
    }
    
    public Class1932 method12815() {
        return this.field19153;
    }
    
    public String method12816() {
        return this.field19155;
    }
}
