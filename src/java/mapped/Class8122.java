package mapped;

public class Class8122 {
   private static final EquipmentSlotType[] field34895 = new EquipmentSlotType[]{EquipmentSlotType.field13736, EquipmentSlotType.field13735, EquipmentSlotType.field13734, EquipmentSlotType.field13733};
   public static final Class6069 field34896 = method28125("protection", new ProtectionEnchantment(Class1937.field12586, Class1957.field12753, field34895));
   public static final Class6069 field34897 = method28125("fire_protection", new ProtectionEnchantment(Class1937.field12587, Class1957.field12754, field34895));
   public static final Class6069 field34898 = method28125("feather_falling", new ProtectionEnchantment(Class1937.field12587, Class1957.field12755, field34895));
   public static final Class6069 field34899 = method28125("blast_protection", new ProtectionEnchantment(Class1937.field12588, Class1957.field12756, field34895));
   public static final Class6069 field34900 = method28125("projectile_protection", new ProtectionEnchantment(Class1937.field12587, Class1957.field12757, field34895));
   public static final Class6069 field34901 = method28125("respiration", new Class6071(Class1937.field12588, field34895));
   public static final Class6069 field34902 = method28125("aqua_affinity", new Class6085(Class1937.field12588, field34895));
   public static final Class6069 field34903 = method28125("thorns", new Class6093(Class1937.field12589, field34895));
   public static final Class6069 field34904 = method28125("depth_strider", new Class6098(Class1937.field12588, field34895));
   public static final Class6069 field34905 = method28125("frost_walker", new FrostWalkerEnchantment(Class1937.field12588, EquipmentSlotType.field13733));
   public static final Class6069 field34906 = method28125("binding_curse", new Class6077(Class1937.field12589, field34895));
   public static final Class6069 field34907 = method28125("soul_speed", new Class6097(Class1937.field12589, EquipmentSlotType.field13733));
   public static final Class6069 field34908 = method28125("sharpness", new Class6076(Class1937.field12586, 0, EquipmentSlotType.field13731));
   public static final Class6069 field34909 = method28125("smite", new Class6076(Class1937.field12587, 1, EquipmentSlotType.field13731));
   public static final Class6069 field34910 = method28125("bane_of_arthropods", new Class6076(Class1937.field12587, 2, EquipmentSlotType.field13731));
   public static final Class6069 field34911 = method28125("knockback", new Class6083(Class1937.field12587, EquipmentSlotType.field13731));
   public static final Class6069 field34912 = method28125("fire_aspect", new Class6080(Class1937.field12588, EquipmentSlotType.field13731));
   public static final Class6069 field34913 = method28125("looting", new Class6074(Class1937.field12588, Class2242.field14675, EquipmentSlotType.field13731));
   public static final Class6069 field34914 = method28125("sweeping", new Class6079(Class1937.field12588, EquipmentSlotType.field13731));
   public static final Class6069 field34915 = method28125("efficiency", new Class6072(Class1937.field12586, EquipmentSlotType.field13731));
   public static final Class6069 field34916 = method28125("silk_touch", new Class6073(Class1937.field12589, EquipmentSlotType.field13731));
   public static final Class6069 field34917 = method28125("unbreaking", new Class6095(Class1937.field12587, EquipmentSlotType.field13731));
   public static final Class6069 field34918 = method28125("fortune", new Class6074(Class1937.field12588, Class2242.field14676, EquipmentSlotType.field13731));
   public static final Class6069 field34919 = method28125("power", new Class6091(Class1937.field12586, EquipmentSlotType.field13731));
   public static final Class6069 field34920 = method28125("punch", new Class6075(Class1937.field12588, EquipmentSlotType.field13731));
   public static final Class6069 field34921 = method28125("flame", new Class6092(Class1937.field12588, EquipmentSlotType.field13731));
   public static final Class6069 field34922 = method28125("infinity", new Class6090(Class1937.field12589, EquipmentSlotType.field13731));
   public static final Class6069 field34923 = method28125("luck_of_the_sea", new Class6074(Class1937.field12588, Class2242.field14677, EquipmentSlotType.field13731));
   public static final Class6069 field34924 = method28125("lure", new Class6088(Class1937.field12588, Class2242.field14677, EquipmentSlotType.field13731));
   public static final Class6069 field34925 = method28125("loyalty", new Class6084(Class1937.field12587, EquipmentSlotType.field13731));
   public static final Class6069 field34926 = method28125("impaling", new Class6070(Class1937.field12588, EquipmentSlotType.field13731));
   public static final Class6069 field34927 = method28125("riptide", new Class6078(Class1937.field12588, EquipmentSlotType.field13731));
   public static final Class6069 field34928 = method28125("channeling", new Class6081(Class1937.field12589, EquipmentSlotType.field13731));
   public static final Class6069 field34929 = method28125("multishot", new Class6082(Class1937.field12588, EquipmentSlotType.field13731));
   public static final Class6069 field34930 = method28125("quick_charge", new Class6068(Class1937.field12587, EquipmentSlotType.field13731));
   public static final Class6069 field34931 = method28125("piercing", new Class6087(Class1937.field12586, EquipmentSlotType.field13731));
   public static final Class6069 field34932 = method28125("mending", new Class6086(Class1937.field12588, EquipmentSlotType.values()));
   public static final Class6069 field34933 = method28125("vanishing_curse", new Class6094(Class1937.field12589, EquipmentSlotType.values()));

   private static Class6069 method28125(String var0, Class6069 var1) {
      return Registry.<Class6069>method9194(Registry.field16073, var0, var1);
   }
}
