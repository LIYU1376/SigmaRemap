// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.util.Iterator;
import java.util.List;

public class Class8222 extends Class8221
{
    private List<String> field33776;
    private int field33777;
    public int field33778;
    public int field33779;
    
    public Class8222(final List<String> field33776, final int n) {
        super(n);
        this.field33776 = field33776;
        this.method27243();
    }
    
    public void method27241(final int n, final String s) {
        if (n < this.field33776.size()) {
            this.field33776.set(n, s);
        }
    }
    
    public void method27242(final List<String> field33776) {
        this.field33776 = field33776;
        if (this.field33778 < 0) {
            this.field33778 = 0;
        }
        if (this.field33778 > this.field33776.size() - 1) {
            this.field33778 = this.field33776.size() - 1;
        }
        this.method27243();
    }
    
    private void method27243() {
        this.field33777 = 0;
        final Iterator<String> iterator = this.field33776.iterator();
        while (iterator.hasNext()) {
            this.field33777 = Math.max(this.field33777, this.field33770.method23505(iterator.next()));
        }
    }
    
    @Override
    public void method27232(final float n) {
        Class8154.method26874((float)this.method27234(), (float)this.method27235(), (float)this.method27233(), (float)this.method27239(), Class6430.method19118(Class265.field1273.field1292, n * 0.6f));
        this.field33779 += this.method27247();
        final int n2 = this.method27234() + 4;
        final int n3 = this.method27235() + this.field33779 + 4;
        final int n4 = this.method27233() - 8;
        final int n5 = 25;
        final int n6 = -15781024;
        final int n7 = -15626304;
        Class8154.method26882(n2, n3, n2 + n4, n3 + n5, n6, n7, n7, n6);
        int n8 = 6;
        for (String substring : this.field33776) {
            int n9 = Class265.field1278.field1292;
            if (substring.startsWith("§7")) {
                substring = substring.substring("§7".length());
                n9 = Class265.field1281.field1292;
            }
            Class8154.method26889(this.field33770, (float)(7 + this.method27234()), (float)(this.method27235() + n8), substring, Class6430.method19118(n9, Math.min(1.0f, n * 1.7f)));
            n8 += 25;
        }
    }
    
    @Override
    public int method27233() {
        return Math.max(super.method27233(), this.field33777 + 14);
    }
    
    @Override
    public int method27239() {
        return this.field33776.size() * 25 + 8;
    }
    
    public void method27244() {
        --this.field33778;
        if (this.field33778 < 0) {
            this.field33778 = this.field33776.size() - 1;
        }
    }
    
    public void method27245() {
        ++this.field33778;
        if (this.field33778 > this.field33776.size() - 1) {
            this.field33778 = 0;
        }
    }
    
    public boolean method27246() {
        return this.field33774.method35858() == 1.0f;
    }
    
    public int method27247() {
        final float n = (float)(this.field33778 * 25);
        final float abs = Math.abs(n - this.field33779);
        final boolean b = n - this.field33779 != abs;
        float min = Math.min(abs * 0.8f, abs * 0.3f * (60.0f / Class869.method5338()));
        if (b) {
            min *= -1.0f;
        }
        if (min > 0.0f) {
            if (min < 1.0f) {
                min = 1.0f;
            }
        }
        if (min < 0.0f) {
            if (min > -1.0f) {
                min = -1.0f;
            }
        }
        return Math.round(min);
    }
}
