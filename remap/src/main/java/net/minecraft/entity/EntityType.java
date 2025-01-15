// 
// Decompiled by Procyon v0.6.0
// 

package net.minecraft.entity;

import mapped.*;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;
import org.apache.logging.log4j.LogManager;
import java.util.function.Function;
import java.util.UUID;
import java.util.Collections;
import javax.annotation.Nullable;
import java.util.Optional;
import org.apache.logging.log4j.Logger;

public class EntityType<T extends Entity>
{
    private static final Logger field28956;
    public static final EntityType<Class426> field28957;
    public static final EntityType<Class857> field28958;
    public static final EntityType<Class405> field28959;
    public static final EntityType<Class856> field28960;
    public static final EntityType<Class798> field28961;
    public static final EntityType<Class849> field28962;
    public static final EntityType<Class423> field28963;
    public static final EntityType<Class800> field28964;
    public static final EntityType<Class847> field28965;
    public static final EntityType<Class818> field28966;
    public static final EntityType<Class836> field28967;
    public static final EntityType<Class804> field28968;
    public static final EntityType<Class765> field28969;
    public static final EntityType<Class814> field28970;
    public static final EntityType<Class840> field28971;
    public static final EntityType<Class420> field28972;
    public static final EntityType<Class830> field28973;
    public static final EntityType<Class845> field28974;
    public static final EntityType<Class858> field28975;
    public static final EntityType<Class852> field28976;
    public static final EntityType<Class850> field28977;
    public static final EntityType<Class842> field28978;
    public static final EntityType<Class507> field28979;
    public static final EntityType<Class771> field28980;
    public static final EntityType<Class508> field28981;
    public static final EntityType<Class408> field28982;
    public static final EntityType<Class424> field28983;
    public static final EntityType<Class406> field28984;
    public static final EntityType<Class803> field28985;
    public static final EntityType<Class761> field28986;
    public static final EntityType<Class764> field28987;
    public static final EntityType<Class844> field28988;
    public static final EntityType<Class808> field28989;
    public static final EntityType<Class829> field28990;
    public static final EntityType<Class769> field28991;
    public static final EntityType<Class427> field28992;
    public static final EntityType<Class862> field28993;
    public static final EntityType<Class417> field28994;
    public static final EntityType<Class863> field28995;
    public static final EntityType<Class815> field28996;
    public static final EntityType<Class400> field28997;
    public static final EntityType<Class854> field28998;
    public static final EntityType<Class430> field28999;
    public static final EntityType<Class505> field29000;
    public static final EntityType<Class429> field29001;
    public static final EntityType<Class506> field29002;
    public static final EntityType<Class454> field29003;
    public static final EntityType<Class431> field29004;
    public static final EntityType<Class432> field29005;
    public static final EntityType<Class813> field29006;
    public static final EntityType<Class805> field29007;
    public static final EntityType<Class817> field29008;
    public static final EntityType<Class861> field29009;
    public static final EntityType<Class791> field29010;
    public static final EntityType<Class796> field29011;
    public static final EntityType<Class801> field29012;
    public static final EntityType<Class838> field29013;
    public static final EntityType<Class828> field29014;
    public static final EntityType<Class790> field29015;
    public static final EntityType<Class510> field29016;
    public static final EntityType<Class792> field29017;
    public static final EntityType<Class837> field29018;
    public static final EntityType<Class802> field29019;
    public static final EntityType<Class841> field29020;
    public static final EntityType<Class509> field29021;
    public static final EntityType<Class848> field29022;
    public static final EntityType<Class782> field29023;
    public static final EntityType<Class809> field29024;
    public static final EntityType<Class853> field29025;
    public static final EntityType<Class418> field29026;
    public static final EntityType<Class784> field29027;
    public static final EntityType<Class411> field29028;
    public static final EntityType<Class404> field29029;
    public static final EntityType<Class846> field29030;
    public static final EntityType<Class839> field29031;
    public static final EntityType<Class783> field29032;
    public static final EntityType<Class816> field29033;
    public static final EntityType<Class835> field29034;
    public static final EntityType<Class793> field29035;
    public static final EntityType<Class410> field29036;
    public static final EntityType<Class412> field29037;
    public static final EntityType<Class413> field29038;
    public static final EntityType<Class415> field29039;
    public static final EntityType<Class403> field29040;
    public static final EntityType<Class843> field29041;
    public static final EntityType<Class824> field29042;
    public static final EntityType<Class786> field29043;
    public static final EntityType<Class775> field29044;
    public static final EntityType<Class773> field29045;
    public static final EntityType<Class821> field29046;
    public static final EntityType<Class778> field29047;
    public static final EntityType<Class767> field29048;
    public static final EntityType<Class781> field29049;
    public static final EntityType<Class421> field29050;
    public static final EntityType<Class799> field29051;
    public static final EntityType<Class827> field29052;
    public static final EntityType<Class811> field29053;
    public static final EntityType<Class826> field29054;
    public static final EntityType<Class851> field29055;
    public static final EntityType<Class779> field29056;
    public static final EntityType<LightningBoltEntity> field29057;
    public static final EntityType<Class512> field29058;
    public static final EntityType<Class425> field29059;
    private final Class8962<T> field29060;
    private final Class1976 field29061;
    private final boolean field29062;
    private final boolean field29063;
    private final boolean field29064;
    private final boolean field29065;
    private String field29066;
    private ITextComponent field29067;
    private Class1932 field29068;
    private final EntitySize field29069;
    
    private static <T extends Entity> EntityType<T> method23353(final String s, final Class8868<T> class8868) {
        return Class90.method511(Class90.field210, s, class8868.method31162(s));
    }
    
    public static Class1932 method23354(final EntityType<?> class7499) {
        return Class90.field210.method503(class7499);
    }
    
    public static Optional<EntityType<?>> method23355(final String s) {
        return Class90.field210.method506(Class1932.method7795(s));
    }
    
    public EntityType(final Class8962<T> field29060, final Class1976 field29061, final boolean field29062, final boolean field29063, final boolean field29064, final boolean field29065, final EntitySize field29066) {
        this.field29060 = field29060;
        this.field29061 = field29061;
        this.field29065 = field29065;
        this.field29062 = field29062;
        this.field29063 = field29063;
        this.field29064 = field29064;
        this.field29069 = field29066;
    }
    
    @Nullable
    public Entity method23356(final World class1847, final ItemStack class1848, final Class512 class1849, final BlockPos class1850, final Class2101 class1851, final boolean b, final boolean b2) {
        return this.method23357(class1847, (class1848 != null) ? class1848.method27657() : null, (class1848 != null && class1848.method27667()) ? class1848.method27664() : null, class1849, class1850, class1851, b, b2);
    }
    
    @Nullable
    public T method23357(final World class1847, final Class51 class1848, final ITextComponent class1849, final Class512 class1850, final BlockPos class1851, final Class2101 class1852, final boolean b, final boolean b2) {
        final Entity method23358 = this.method23358(class1847, class1848, class1849, class1850, class1851, class1852, b, b2);
        class1847.method6886(method23358);
        return (T)method23358;
    }
    
    @Nullable
    public T method23358(final World class1847, final Class51 class1848, final ITextComponent class1849, final Class512 class1850, final BlockPos class1851, final Class2101 class1852, final boolean b, final boolean b2) {
        final Class759 method23371 = (Class759)this.method23371(class1847);
        if (method23371 != null) {
            double method23372;
            if (!b) {
                method23372 = 0.0;
            }
            else {
                method23371.setPosition(class1851.getX() + 0.5, class1851.getY() + 1, class1851.getZ() + 0.5);
                method23372 = method23359(class1847, class1851, b2, method23371.getBoundingBox());
            }
            method23371.method1730(class1851.getX() + 0.5, class1851.getY() + method23372, class1851.getZ() + 0.5, MathHelper.method35668(class1847.rand.nextFloat() * 360.0f), 0.0f);
            if (method23371 instanceof Class759) {
                final Class759 class1853 = method23371;
                class1853.field2953 = class1853.rotationYaw;
                class1853.field2951 = class1853.rotationYaw;
                class1853.method4188(class1847, class1847.method6784(new BlockPos(class1853)), class1852, null, class1848);
                class1853.method4156();
            }
            if (class1849 != null) {
                if (method23371 instanceof LivingEntity) {
                    method23371.method1872(class1849);
                }
            }
            method23360(class1847, class1850, method23371, class1848);
            return (T)method23371;
        }
        return null;
    }
    
    public static double method23359(final Class1852 class1852, final BlockPos class1853, final boolean b, final AxisAlignedBB class1854) {
        AxisAlignedBB method18494 = new AxisAlignedBB(class1853);
        if (b) {
            method18494 = method18494.method18494(0.0, -1.0, 0.0);
        }
        return 1.0 + Class7698.method24498(Axis.Y, class1854, class1852.method6980(null, method18494, Collections.emptySet()), b ? -2.0 : -1.0);
    }
    
    public static void method23360(final World class1847, final Class512 class1848, final Entity class1849, final Class51 class1850) {
        if (class1850 != null) {
            if (class1850.method316("EntityTag", 10)) {
                final MinecraftServer method6679 = class1847.getServer();
                if (method6679 != null) {
                    if (class1849 != null) {
                        if (!class1847.isRemote) {
                            if (class1849.method1905()) {
                                if (class1848 == null) {
                                    return;
                                }
                                if (!method6679.method1537().method20597(class1848.method2844())) {
                                    return;
                                }
                            }
                        }
                        final Class51 method6680 = class1849.method1756(new Class51());
                        final UUID method6681 = class1849.method1865();
                        method6680.method338(class1850.method327("EntityTag"));
                        class1849.method1864(method6681);
                        class1849.method1757(method6680);
                    }
                }
            }
        }
    }
    
    public boolean method23361() {
        return this.field29062;
    }
    
    public boolean method23362() {
        return this.field29063;
    }
    
    public boolean method23363() {
        return this.field29064;
    }
    
    public boolean method23364() {
        return this.field29065;
    }
    
    public Class1976 method23365() {
        return this.field29061;
    }
    
    public String method23366() {
        if (this.field29066 == null) {
            this.field29066 = Class8349.method27836("entity", Class90.field210.method503(this));
        }
        return this.field29066;
    }
    
    public ITextComponent method23367() {
        if (this.field29067 == null) {
            this.field29067 = new Class2259(this.method23366(), new Object[0]);
        }
        return this.field29067;
    }
    
    public Class1932 method23368() {
        if (this.field29068 == null) {
            final Class1932 method503 = Class90.field210.method503(this);
            this.field29068 = new Class1932(method503.method7798(), "entities/" + method503.method7797());
        }
        return this.field29068;
    }
    
    public float method23369() {
        return this.field29069.field34097;
    }
    
    public float method23370() {
        return this.field29069.field34098;
    }
    
    @Nullable
    public T method23371(final World class1847) {
        return this.field29060.method31798(this, class1847);
    }
    
    @Nullable
    public static Entity method23372(final int n, final World class1847) {
        return method23374(class1847, Class90.field210.method499(n));
    }
    
    public static Optional<Entity> method23373(final Class51 class51, final World class52) {
        return Class8349.method27855(method23377(class51).map(class54 -> class54.method23371(class53)), class56 -> class56.method1757(class55), () -> EntityType.field28956.warn("Skipping Entity with id {}", (Object)class57.method323("id")));
    }
    
    @Nullable
    private static Entity method23374(final World class1847, final EntityType<?> class1848) {
        return (Entity)((class1848 != null) ? class1848.method23371(class1847) : null);
    }
    
    public AxisAlignedBB method23375(final double n, final double n2, final double n3) {
        final float n4 = this.method23369() / 2.0f;
        return new AxisAlignedBB(n - n4, n2, n3 - n4, n + n4, n2 + this.method23370(), n3 + n4);
    }
    
    public EntitySize getSize() {
        return this.field29069;
    }
    
    public static Optional<EntityType<?>> method23377(final Class51 class51) {
        return Class90.field210.method506(new Class1932(class51.method323("id")));
    }
    
    @Nullable
    public static Entity method23378(final Class51 class51, final World class52, final Function<Entity, Entity> mapper) {
        return method23379(class51, class52).map((Function<? super Entity, ?>)mapper).map(class55 -> {
            if (!(!class53.method316("Passengers", 9))) {
                class53.method328("Passengers", 10);
                int i = 0;
                final Class52 class56;
                while (i < class56.size()) {
                    method23378(class56.method346(i), class54, function);
                    final Entity class57;
                    if (class57 != null) {
                        class57.method1780(class55, true);
                    }
                    ++i;
                }
            }
            return class55;
        }).orElse(null);
    }
    
    private static Optional<Entity> method23379(final Class51 class51, final World class52) {
        try {
            return method23373(class51, class52);
        }
        catch (final RuntimeException ex) {
            EntityType.field28956.warn("Exception loading entity: ", (Throwable)ex);
            return Optional.empty();
        }
    }
    
    public int method23380() {
        if (this == EntityType.field29058) {
            return 32;
        }
        if (this != EntityType.field28975) {
            if (this != EntityType.field28976) {
                if (this != EntityType.field29016) {
                    if (this != EntityType.field28983) {
                        if (this != EntityType.field28993) {
                            if (this != EntityType.field28995) {
                                if (this != EntityType.field29009) {
                                    if (this != EntityType.field28958) {
                                        if (this != EntityType.field28981) {
                                            if (this != EntityType.field28957) {
                                                if (this != EntityType.field28979) {
                                                    if (this != EntityType.field29059) {
                                                        if (this != EntityType.field28959) {
                                                            if (this != EntityType.field29029) {
                                                                if (this != EntityType.field29040) {
                                                                    if (this != EntityType.field29026) {
                                                                        if (this != EntityType.field28972) {
                                                                            if (this != EntityType.field28994) {
                                                                                if (this != EntityType.field29050) {
                                                                                    if (this != EntityType.field29028) {
                                                                                        if (this != EntityType.field28997) {
                                                                                            if (this != EntityType.field29037) {
                                                                                                if (this != EntityType.field28982) {
                                                                                                    if (this != EntityType.field29036) {
                                                                                                        if (this != EntityType.field29039) {
                                                                                                            if (this != EntityType.field29038) {
                                                                                                                if (this != EntityType.field28984) {
                                                                                                                    if (this != EntityType.field28992) {
                                                                                                                        return 5;
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    return 4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 10;
        }
        return 16;
    }
    
    public int method23381() {
        if (this == EntityType.field29058 || this == EntityType.field28979) {
            return 2;
        }
        if (this == EntityType.field28982) {
            return 4;
        }
        if (this != EntityType.field29059) {
            if (this != EntityType.field29026) {
                if (this != EntityType.field28972) {
                    if (this != EntityType.field28994) {
                        if (this != EntityType.field29050) {
                            if (this != EntityType.field29028) {
                                if (this != EntityType.field28997) {
                                    if (this != EntityType.field29037) {
                                        if (this != EntityType.field29036) {
                                            if (this != EntityType.field29039) {
                                                if (this != EntityType.field29038) {
                                                    if (this != EntityType.field28984) {
                                                        if (this != EntityType.field29016) {
                                                            if (this != EntityType.field28959) {
                                                                if (this != EntityType.field29029) {
                                                                    if (this != EntityType.field29040) {
                                                                        if (this != EntityType.field28992) {
                                                                            if (this != EntityType.field28983) {
                                                                                if (this != EntityType.field28981) {
                                                                                    if (this != EntityType.field28993) {
                                                                                        if (this != EntityType.field28995) {
                                                                                            if (this != EntityType.field29009) {
                                                                                                if (this != EntityType.field28957) {
                                                                                                    if (this != EntityType.field28975) {
                                                                                                        return 3;
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    return Integer.MAX_VALUE;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            return 20;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return 10;
        }
        return 5;
    }
    
    public boolean method23382() {
        if (this != EntityType.field29058) {
            if (this != EntityType.field28997) {
                if (this != EntityType.field29048) {
                    if (this != EntityType.field28960) {
                        if (this != EntityType.field28993) {
                            if (this != EntityType.field28995) {
                                if (this != EntityType.field29009) {
                                    if (this != EntityType.field28975) {
                                        if (this != EntityType.field28979) {
                                            return true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public boolean method23383(final Class7909<EntityType<?>> class7909) {
        return class7909.method25618(this);
    }
    
    static {
        field28956 = LogManager.getLogger();
        field28957 = method23353("area_effect_cloud", (Class8868<Class426>)Class8868.method31155((Class8962<T>)Class426::new, Class1976.field10952).method31160().method31157(6.0f, 0.5f));
        field28958 = method23353("armor_stand", (Class8868<Class857>)Class8868.method31155((Class8962<T>)Class857::new, Class1976.field10952).method31157(0.5f, 1.975f));
        field28959 = method23353("arrow", (Class8868<Class405>)Class8868.method31155((Class8962<T>)Class405::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field28960 = method23353("bat", (Class8868<Class856>)Class8868.method31155((Class8962<T>)Class856::new, Class1976.field10950).method31157(0.5f, 0.9f));
        field28961 = method23353("bee", (Class8868<Class798>)Class8868.method31155((Class8962<T>)Class798::new, Class1976.field10949).method31157(0.7f, 0.6f));
        field28962 = method23353("blaze", (Class8868<Class849>)Class8868.method31155((Class8962<T>)Class849::new, Class1976.field10948).method31160().method31157(0.6f, 1.8f));
        field28963 = method23353("boat", (Class8868<Class423>)Class8868.method31155((Class8962<T>)Class423::new, Class1976.field10952).method31157(1.375f, 0.5625f));
        field28964 = method23353("cat", (Class8868<Class800>)Class8868.method31155((Class8962<T>)Class800::new, Class1976.field10949).method31157(0.6f, 0.7f));
        field28965 = method23353("cave_spider", (Class8868<Class847>)Class8868.method31155((Class8962<T>)Class847::new, Class1976.field10948).method31157(0.7f, 0.5f));
        field28966 = method23353("chicken", (Class8868<Class818>)Class8868.method31155((Class8962<T>)Class818::new, Class1976.field10949).method31157(0.4f, 0.7f));
        field28967 = method23353("cod", (Class8868<Class836>)Class8868.method31155((Class8962<T>)Class836::new, Class1976.field10951).method31157(0.5f, 0.3f));
        field28968 = method23353("cow", (Class8868<Class804>)Class8868.method31155((Class8962<T>)Class804::new, Class1976.field10949).method31157(0.9f, 1.4f));
        field28969 = method23353("creeper", (Class8868<Class765>)Class8868.method31155((Class8962<T>)Class765::new, Class1976.field10948).method31157(0.6f, 1.7f));
        field28970 = method23353("donkey", (Class8868<Class814>)Class8868.method31155((Class8962<T>)Class814::new, Class1976.field10949).method31157(1.3964844f, 1.5f));
        field28971 = method23353("dolphin", (Class8868<Class840>)Class8868.method31155((Class8962<T>)Class840::new, Class1976.field10951).method31157(0.9f, 0.6f));
        field28972 = method23353("dragon_fireball", (Class8868<Class420>)Class8868.method31155((Class8962<T>)Class420::new, Class1976.field10952).method31157(1.0f, 1.0f));
        field28973 = method23353("drowned", (Class8868<Class830>)Class8868.method31155((Class8962<T>)Class830::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field28974 = method23353("elder_guardian", (Class8868<Class845>)Class8868.method31155((Class8962<T>)Class845::new, Class1976.field10948).method31157(1.9975f, 1.9975f));
        field28975 = method23353("end_crystal", (Class8868<Class858>)Class8868.method31155((Class8962<T>)Class858::new, Class1976.field10952).method31157(2.0f, 2.0f));
        field28976 = method23353("ender_dragon", (Class8868<Class852>)Class8868.method31155((Class8962<T>)Class852::new, Class1976.field10948).method31160().method31157(16.0f, 8.0f));
        field28977 = method23353("enderman", (Class8868<Class850>)Class8868.method31155((Class8962<T>)Class850::new, Class1976.field10948).method31157(0.6f, 2.9f));
        field28978 = method23353("endermite", (Class8868<Class842>)Class8868.method31155((Class8962<T>)Class842::new, Class1976.field10948).method31157(0.4f, 0.3f));
        field28979 = method23353("evoker_fangs", (Class8868<Class507>)Class8868.method31155((Class8962<T>)Class507::new, Class1976.field10952).method31157(0.5f, 0.8f));
        field28980 = method23353("evoker", (Class8868<Class771>)Class8868.method31155((Class8962<T>)Class771::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field28981 = method23353("experience_orb", (Class8868<Class508>)Class8868.method31155((Class8962<T>)Class508::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field28982 = method23353("eye_of_ender", (Class8868<Class408>)Class8868.method31155((Class8962<T>)Class408::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field28983 = method23353("falling_block", (Class8868<Class424>)Class8868.method31155((Class8962<T>)Class424::new, Class1976.field10952).method31157(0.98f, 0.98f));
        field28984 = method23353("firework_rocket", (Class8868<Class406>)Class8868.method31155((Class8962<T>)Class406::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field28985 = method23353("fox", (Class8868<Class803>)Class8868.method31155((Class8962<T>)Class803::new, Class1976.field10949).method31157(0.6f, 0.7f));
        field28986 = method23353("ghast", (Class8868<Class761>)Class8868.method31155((Class8962<T>)Class761::new, Class1976.field10948).method31160().method31157(4.0f, 4.0f));
        field28987 = method23353("giant", (Class8868<Class764>)Class8868.method31155((Class8962<T>)Class764::new, Class1976.field10948).method31157(3.6f, 12.0f));
        field28988 = method23353("guardian", (Class8868<Class844>)Class8868.method31155((Class8962<T>)Class844::new, Class1976.field10948).method31157(0.85f, 0.85f));
        field28989 = method23353("horse", (Class8868<Class808>)Class8868.method31155((Class8962<T>)Class808::new, Class1976.field10949).method31157(1.3964844f, 1.6f));
        field28990 = method23353("husk", (Class8868<Class829>)Class8868.method31155((Class8962<T>)Class829::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field28991 = method23353("illusioner", (Class8868<Class769>)Class8868.method31155((Class8962<T>)Class769::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field28992 = method23353("item", (Class8868<Class427>)Class8868.method31155((Class8962<T>)Class427::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field28993 = method23353("item_frame", (Class8868<Class862>)Class8868.method31155((Class8962<T>)Class862::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field28994 = method23353("fireball", (Class8868<Class417>)Class8868.method31155((Class8962<T>)Class417::new, Class1976.field10952).method31157(1.0f, 1.0f));
        field28995 = method23353("leash_knot", (Class8868<Class863>)Class8868.method31155((Class8962<T>)Class863::new, Class1976.field10952).method31159().method31157(0.5f, 0.5f));
        field28996 = method23353("llama", (Class8868<Class815>)Class8868.method31155((Class8962<T>)Class815::new, Class1976.field10949).method31157(0.9f, 1.87f));
        field28997 = method23353("llama_spit", (Class8868<Class400>)Class8868.method31155((Class8962<T>)Class400::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field28998 = method23353("magma_cube", (Class8868<Class854>)Class8868.method31155((Class8962<T>)Class854::new, Class1976.field10948).method31160().method31157(2.04f, 2.04f));
        field28999 = method23353("minecart", (Class8868<Class430>)Class8868.method31155((Class8962<T>)Class430::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29000 = method23353("chest_minecart", (Class8868<Class505>)Class8868.method31155((Class8962<T>)Class505::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29001 = method23353("command_block_minecart", (Class8868<Class429>)Class8868.method31155((Class8962<T>)Class429::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29002 = method23353("furnace_minecart", (Class8868<Class506>)Class8868.method31155((Class8962<T>)Class506::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29003 = method23353("hopper_minecart", (Class8868<Class454>)Class8868.method31155((Class8962<T>)Class454::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29004 = method23353("spawner_minecart", (Class8868<Class431>)Class8868.method31155((Class8962<T>)Class431::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29005 = method23353("tnt_minecart", (Class8868<Class432>)Class8868.method31155((Class8962<T>)Class432::new, Class1976.field10952).method31157(0.98f, 0.7f));
        field29006 = method23353("mule", (Class8868<Class813>)Class8868.method31155((Class8962<T>)Class813::new, Class1976.field10949).method31157(1.3964844f, 1.6f));
        field29007 = method23353("mooshroom", (Class8868<Class805>)Class8868.method31155((Class8962<T>)Class805::new, Class1976.field10949).method31157(0.9f, 1.4f));
        field29008 = method23353("ocelot", (Class8868<Class817>)Class8868.method31155((Class8962<T>)Class817::new, Class1976.field10949).method31157(0.6f, 0.7f));
        field29009 = method23353("painting", (Class8868<Class861>)Class8868.method31155((Class8962<T>)Class861::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field29010 = method23353("panda", (Class8868<Class791>)Class8868.method31155((Class8962<T>)Class791::new, Class1976.field10949).method31157(1.3f, 1.25f));
        field29011 = method23353("parrot", (Class8868<Class796>)Class8868.method31155((Class8962<T>)Class796::new, Class1976.field10949).method31157(0.5f, 0.9f));
        field29012 = method23353("pig", (Class8868<Class801>)Class8868.method31155((Class8962<T>)Class801::new, Class1976.field10949).method31157(0.9f, 0.9f));
        field29013 = method23353("pufferfish", (Class8868<Class838>)Class8868.method31155((Class8962<T>)Class838::new, Class1976.field10951).method31157(0.7f, 0.7f));
        field29014 = method23353("zombie_pigman", (Class8868<Class828>)Class8868.method31155((Class8962<T>)Class828::new, Class1976.field10948).method31160().method31157(0.6f, 1.95f));
        field29015 = method23353("polar_bear", (Class8868<Class790>)Class8868.method31155((Class8962<T>)Class790::new, Class1976.field10949).method31157(1.4f, 1.4f));
        field29016 = method23353("tnt", (Class8868<Class510>)Class8868.method31155((Class8962<T>)Class510::new, Class1976.field10952).method31160().method31157(0.98f, 0.98f));
        field29017 = method23353("rabbit", (Class8868<Class792>)Class8868.method31155((Class8962<T>)Class792::new, Class1976.field10949).method31157(0.4f, 0.5f));
        field29018 = method23353("salmon", (Class8868<Class837>)Class8868.method31155((Class8962<T>)Class837::new, Class1976.field10951).method31157(0.7f, 0.4f));
        field29019 = method23353("sheep", (Class8868<Class802>)Class8868.method31155((Class8962<T>)Class802::new, Class1976.field10949).method31157(0.9f, 1.3f));
        field29020 = method23353("shulker", (Class8868<Class841>)Class8868.method31155((Class8962<T>)Class841::new, Class1976.field10948).method31160().method31161().method31157(1.0f, 1.0f));
        field29021 = method23353("shulker_bullet", (Class8868<Class509>)Class8868.method31155((Class8962<T>)Class509::new, Class1976.field10952).method31157(0.3125f, 0.3125f));
        field29022 = method23353("silverfish", (Class8868<Class848>)Class8868.method31155((Class8962<T>)Class848::new, Class1976.field10948).method31157(0.4f, 0.3f));
        field29023 = method23353("skeleton", (Class8868<Class782>)Class8868.method31155((Class8962<T>)Class782::new, Class1976.field10948).method31157(0.6f, 1.99f));
        field29024 = method23353("skeleton_horse", (Class8868<Class809>)Class8868.method31155((Class8962<T>)Class809::new, Class1976.field10949).method31157(1.3964844f, 1.6f));
        field29025 = method23353("slime", (Class8868<Class853>)Class8868.method31155((Class8962<T>)Class853::new, Class1976.field10948).method31157(2.04f, 2.04f));
        field29026 = method23353("small_fireball", (Class8868<Class418>)Class8868.method31155((Class8962<T>)Class418::new, Class1976.field10952).method31157(0.3125f, 0.3125f));
        field29027 = method23353("snow_golem", (Class8868<Class784>)Class8868.method31155((Class8962<T>)Class784::new, Class1976.field10952).method31157(0.7f, 1.9f));
        field29028 = method23353("snowball", (Class8868<Class411>)Class8868.method31155((Class8962<T>)Class411::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29029 = method23353("spectral_arrow", (Class8868<Class404>)Class8868.method31155((Class8962<T>)Class404::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field29030 = method23353("spider", (Class8868<Class846>)Class8868.method31155((Class8962<T>)Class846::new, Class1976.field10948).method31157(1.4f, 0.9f));
        field29031 = method23353("squid", (Class8868<Class839>)Class8868.method31155((Class8962<T>)Class839::new, Class1976.field10951).method31157(0.8f, 0.8f));
        field29032 = method23353("stray", (Class8868<Class783>)Class8868.method31155((Class8962<T>)Class783::new, Class1976.field10948).method31157(0.6f, 1.99f));
        field29033 = method23353("trader_llama", (Class8868<Class816>)Class8868.method31155((Class8962<T>)Class816::new, Class1976.field10949).method31157(0.9f, 1.87f));
        field29034 = method23353("tropical_fish", (Class8868<Class835>)Class8868.method31155((Class8962<T>)Class835::new, Class1976.field10951).method31157(0.5f, 0.4f));
        field29035 = method23353("turtle", (Class8868<Class793>)Class8868.method31155((Class8962<T>)Class793::new, Class1976.field10949).method31157(1.2f, 0.4f));
        field29036 = method23353("egg", (Class8868<Class410>)Class8868.method31155((Class8962<T>)Class410::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29037 = method23353("ender_pearl", (Class8868<Class412>)Class8868.method31155((Class8962<T>)Class412::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29038 = method23353("experience_bottle", (Class8868<Class413>)Class8868.method31155((Class8962<T>)Class413::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29039 = method23353("potion", (Class8868<Class415>)Class8868.method31155((Class8962<T>)Class415::new, Class1976.field10952).method31157(0.25f, 0.25f));
        field29040 = method23353("trident", (Class8868<Class403>)Class8868.method31155((Class8962<T>)Class403::new, Class1976.field10952).method31157(0.5f, 0.5f));
        field29041 = method23353("vex", (Class8868<Class843>)Class8868.method31155((Class8962<T>)Class843::new, Class1976.field10948).method31160().method31157(0.4f, 0.8f));
        field29042 = method23353("villager", (Class8868<Class824>)Class8868.method31155((Class8962<T>)Class824::new, Class1976.field10952).method31157(0.6f, 1.95f));
        field29043 = method23353("iron_golem", (Class8868<Class786>)Class8868.method31155((Class8962<T>)Class786::new, Class1976.field10952).method31157(1.4f, 2.7f));
        field29044 = method23353("vindicator", (Class8868<Class775>)Class8868.method31155((Class8962<T>)Class775::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field29045 = method23353("pillager", (Class8868<Class773>)Class8868.method31155((Class8962<T>)Class773::new, Class1976.field10948).method31161().method31157(0.6f, 1.95f));
        field29046 = method23353("wandering_trader", (Class8868<Class821>)Class8868.method31155((Class8962<T>)Class821::new, Class1976.field10949).method31157(0.6f, 1.95f));
        field29047 = method23353("witch", (Class8868<Class778>)Class8868.method31155((Class8962<T>)Class778::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field29048 = method23353("wither", (Class8868<Class767>)Class8868.method31155((Class8962<T>)Class767::new, Class1976.field10948).method31160().method31157(0.9f, 3.5f));
        field29049 = method23353("wither_skeleton", (Class8868<Class781>)Class8868.method31155((Class8962<T>)Class781::new, Class1976.field10948).method31160().method31157(0.7f, 2.4f));
        field29050 = method23353("wither_skull", (Class8868<Class421>)Class8868.method31155((Class8962<T>)Class421::new, Class1976.field10952).method31157(0.3125f, 0.3125f));
        field29051 = method23353("wolf", (Class8868<Class799>)Class8868.method31155((Class8962<T>)Class799::new, Class1976.field10949).method31157(0.6f, 0.85f));
        field29052 = method23353("zombie", (Class8868<Class827>)Class8868.method31155((Class8962<T>)Class827::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field29053 = method23353("zombie_horse", (Class8868<Class811>)Class8868.method31155((Class8962<T>)Class811::new, Class1976.field10949).method31157(1.3964844f, 1.6f));
        field29054 = method23353("zombie_villager", (Class8868<Class826>)Class8868.method31155((Class8962<T>)Class826::new, Class1976.field10948).method31157(0.6f, 1.95f));
        field29055 = method23353("phantom", (Class8868<Class851>)Class8868.method31155((Class8962<T>)Class851::new, Class1976.field10948).method31157(0.9f, 0.5f));
        field29056 = method23353("ravager", (Class8868<Class779>)Class8868.method31155((Class8962<T>)Class779::new, Class1976.field10948).method31157(1.95f, 2.2f));
        field29057 = method23353("lightning_bolt", (Class8868<LightningBoltEntity>)Class8868.method31156(Class1976.field10952).method31159().method31157(0.0f, 0.0f));
        field29058 = method23353("player", (Class8868<Class512>)Class8868.method31156(Class1976.field10952).method31159().method31158().method31157(0.6f, 1.8f));
        field29059 = method23353("fishing_bobber", (Class8868<Class425>)Class8868.method31156(Class1976.field10952).method31159().method31158().method31157(0.25f, 0.25f));
    }
}
