// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.io.IOException;

public class Class4299 implements Class4252<Class5807>
{
    private int field19276;
    private Class1932 field19277;
    private Class8654 field19278;
    
    @Override
    public void method12754(final Class8654 class8654) throws IOException {
        this.field19276 = class8654.method29501();
        this.field19277 = class8654.method29516();
        final int readableBytes = class8654.readableBytes();
        if (readableBytes >= 0 && readableBytes <= 1048576) {
            this.field19278 = new Class8654(class8654.readBytes(readableBytes));
            return;
        }
        throw new IOException("Payload may not be larger than 1048576 bytes");
    }
    
    @Override
    public void method12755(final Class8654 class8654) throws IOException {
        class8654.method29505(this.field19276);
        class8654.method29517(this.field19277);
        class8654.writeBytes(this.field19278.copy());
    }
    
    public void method12841(final Class5807 class5807) {
        class5807.method17408(this);
    }
    
    public int method12916() {
        return this.field19276;
    }
}
