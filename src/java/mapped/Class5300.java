// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import io.netty.buffer.ByteBuf;

public class Class5300 extends Class5260<Class8322>
{
    public Class5300() {
        super(Class8322.class);
    }
    
    public Class8322 method16412(final ByteBuf byteBuf) {
        final long long1 = byteBuf.readLong();
        return new Class8322(long1 >> 38, long1 >> 26 & 0xFFFL, long1 << 38 >> 38);
    }
    
    public void method16413(final ByteBuf byteBuf, final Class8322 class8322) {
        byteBuf.writeLong(((long)class8322.method27704() & 0x3FFFFFFL) << 38 | ((long)class8322.method27705() & 0xFFFL) << 26 | ((long)class8322.method27706() & 0x3FFFFFFL));
    }
}
