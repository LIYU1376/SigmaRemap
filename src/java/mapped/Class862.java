// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import java.util.function.Predicate;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.Logger;

public class Class862 extends Class860
{
    private static final Logger field4602;
    private static final Class8810<Class8321> field4603;
    private static final Class8810<Integer> field4604;
    private float field4605;
    
    public Class862(final Class7499<? extends Class862> class7499, final Class1847 class7500) {
        super(class7499, class7500);
        this.field4605 = 1.0f;
    }
    
    public Class862(final Class1847 class1847, final Class354 class1848, final Class179 class1849) {
        super(Class7499.field28993, class1847, class1848);
        this.field4605 = 1.0f;
        this.method5186(class1849);
    }
    
    @Override
    public float method1890(final Class290 class290, final Class8295 class291) {
        return 0.0f;
    }
    
    @Override
    public void method1649() {
        this.method1650().method33565(Class862.field4603, Class8321.field34174);
        this.method1650().method33565(Class862.field4604, 0);
    }
    
    @Override
    public void method5186(final Class179 field4600) {
        Validate.notNull((Object)field4600);
        this.field4600 = field4600;
        if (!field4600.method790().method601()) {
            this.field2400 = (float)(-90 * field4600.method781().method936());
            this.field2399 = 0.0f;
        }
        else {
            this.field2400 = 0.0f;
            this.field2399 = (float)(this.field4600.method780() * 90);
        }
        this.field2402 = this.field2400;
        this.field2401 = this.field2399;
        this.method5187();
    }
    
    @Override
    public void method5187() {
        if (this.field4600 != null) {
            final double n = this.field4599.method1074() + 0.5 - this.field4600.method785() * 0.46875;
            final double n2 = this.field4599.method1075() + 0.5 - this.field4600.method786() * 0.46875;
            final double n3 = this.field4599.method1076() + 0.5 - this.field4600.method787() * 0.46875;
            this.method1948(n, n2, n3);
            double n4 = this.method5190();
            double n5 = this.method5191();
            double n6 = this.method5190();
            switch (Class8602.field36115[this.field4600.method790().ordinal()]) {
                case 1: {
                    n4 = 1.0;
                    break;
                }
                case 2: {
                    n5 = 1.0;
                    break;
                }
                case 3: {
                    n6 = 1.0;
                    break;
                }
            }
            final double n7 = n4 / 32.0;
            final double n8 = n5 / 32.0;
            final double n9 = n6 / 32.0;
            this.method1889(new Class6221(n - n7, n2 - n8, n3 - n9, n + n7, n2 + n8, n3 + n9));
        }
    }
    
    @Override
    public boolean method5189() {
        if (this.field2391.method6977(this)) {
            final Class7096 method6701 = this.field2391.method6701(this.field4599.method1149(this.field4600.method782()));
            return (method6701.method21697().method26439() || (this.field4600.method790().method601() && Class3895.method11975(method6701))) && this.field2391.method6737(this, this.method1886(), Class862.field4597).isEmpty();
        }
        return false;
    }
    
    @Override
    public float method1790() {
        return 0.0f;
    }
    
    @Override
    public void method1648() {
        this.method5197(this.method5198());
        super.method1648();
    }
    
    @Override
    public boolean method1740(final Class7929 class7929, final float n) {
        if (this.method1849(class7929)) {
            return false;
        }
        if (!class7929.method25707() && !this.method5198().method27620()) {
            if (!this.field2391.field10067) {
                this.method5196(class7929.method25714(), false);
                this.method1695(Class8520.field35324, 1.0f, 1.0f);
            }
            return true;
        }
        return super.method1740(class7929, n);
    }
    
    @Override
    public int method5190() {
        return 12;
    }
    
    @Override
    public int method5191() {
        return 12;
    }
    
    @Override
    public boolean method1753(final double n) {
        final double n2 = 16.0 * 64.0 * method1869();
        return n < n2 * n2;
    }
    
    @Override
    public void method5192(final Class399 class399) {
        this.method1695(Class8520.field35322, 1.0f, 1.0f);
        this.method5196(class399, true);
    }
    
    @Override
    public void method5193() {
        this.method1695(Class8520.field35323, 1.0f, 1.0f);
    }
    
    private void method5196(final Class399 class399, final boolean b) {
        if (this.field2391.method6765().method31216(Class8878.field37321)) {
            final Class8321 method5198 = this.method5198();
            this.method5199(Class8321.field34174);
            if (class399 instanceof Class512 && ((Class512)class399).field3025.field27304) {
                this.method5197(method5198);
                return;
            }
            if (b) {
                this.method1764(Class7739.field31515);
            }
            if (!method5198.method27620()) {
                final Class8321 method5199 = method5198.method27641();
                this.method5197(method5199);
                if (this.field2423.nextFloat() < this.field4605) {
                    this.method1766(method5199);
                }
            }
        }
        else if (class399 == null) {
            this.method5197(this.method5198());
        }
    }
    
    private void method5197(final Class8321 class8321) {
        if (class8321.method27622() == Class7739.field31425) {
            final Class6356 method12328 = Class4094.method12328(class8321, this.field2391);
            method12328.method18924(this.field4599, this.method1643());
            method12328.method18904(true);
        }
        class8321.method27678(null);
    }
    
    public Class8321 method5198() {
        return this.method1650().method33568(Class862.field4603);
    }
    
    public void method5199(final Class8321 class8321) {
        this.method5200(class8321, true);
    }
    
    public void method5200(Class8321 method27641, final boolean b) {
        if (!method27641.method27620()) {
            method27641 = method27641.method27641();
            method27641.method27691(1);
            method27641.method27678(this);
        }
        this.method1650().method33569(Class862.field4603, method27641);
        if (!method27641.method27620()) {
            this.method1695(Class8520.field35321, 1.0f, 1.0f);
        }
        if (b) {
            if (this.field4599 != null) {
                this.field2391.method6783(this.field4599, Class7521.field29147);
            }
        }
    }
    
    @Override
    public boolean method1893(final int n, final Class8321 class8321) {
        if (n != 0) {
            return false;
        }
        this.method5199(class8321);
        return true;
    }
    
    @Override
    public void method1880(final Class8810<?> class8810) {
        if (class8810.equals(Class862.field4603)) {
            final Class8321 method5198 = this.method5198();
            if (!method5198.method27620()) {
                if (method5198.method27679() != this) {
                    method5198.method27678(this);
                }
            }
        }
    }
    
    public int method5201() {
        return this.method1650().method33568(Class862.field4604);
    }
    
    public void method5202(final int n) {
        this.method5203(n, true);
    }
    
    private void method5203(final int n, final boolean b) {
        this.method1650().method33569(Class862.field4604, n % 8);
        if (b) {
            if (this.field4599 != null) {
                this.field2391.method6783(this.field4599, Class7521.field29147);
            }
        }
    }
    
    @Override
    public void method1761(final Class51 class51) {
        super.method1761(class51);
        if (!this.method5198().method27620()) {
            class51.method295("Item", this.method5198().method27627(new Class51()));
            class51.method296("ItemRotation", (byte)this.method5201());
            class51.method304("ItemDropChance", this.field4605);
        }
        class51.method296("Facing", (byte)this.field4600.method779());
    }
    
    @Override
    public void method1760(final Class51 class51) {
        super.method1760(class51);
        final Class51 method327 = class51.method327("Item");
        if (method327 != null) {
            if (!method327.method331()) {
                final Class8321 method328 = Class8321.method27619(method327);
                if (method328.method27620()) {
                    Class862.field4602.warn("Unable to load item from: {}", (Object)method327);
                }
                final Class8321 method329 = this.method5198();
                if (!method329.method27620()) {
                    if (!Class8321.method27643(method328, method329)) {
                        this.method5197(method329);
                    }
                }
                this.method5200(method328, false);
                this.method5203(class51.method317("ItemRotation"), false);
                if (class51.method316("ItemDropChance", 99)) {
                    this.field4605 = class51.method321("ItemDropChance");
                }
            }
        }
        this.method5186(Class179.method792(class51.method317("Facing")));
    }
    
    @Override
    public boolean method1770(final Class512 class512, final Class316 class513) {
        final Class8321 method2715 = class512.method2715(class513);
        final boolean b = !this.method5198().method27620();
        final boolean b2 = !method2715.method27620();
        if (this.field2391.field10067) {
            return b || b2;
        }
        if (b) {
            this.method1695(Class8520.field35325, 1.0f, 1.0f);
            this.method5202(this.method5201() + 1);
        }
        else if (b2) {
            this.method5199(method2715);
            if (!class512.field3025.field27304) {
                method2715.method27693(1);
            }
        }
        return true;
    }
    
    public int method5204() {
        return this.method5198().method27620() ? 0 : (this.method5201() % 8 + 1);
    }
    
    @Override
    public Class4252<?> method1932() {
        return new Class4339(this, this.method1642(), this.field4600.method779(), this.method5194());
    }
    
    static {
        field4602 = LogManager.getLogger();
        field4603 = Class9184.method33564(Class862.class, Class7709.field30659);
        field4604 = Class9184.method33564(Class862.class, Class7709.field30654);
    }
}
