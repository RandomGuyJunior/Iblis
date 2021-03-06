package iblis.init;

import iblis.IblisMod;
import iblis.item.IblisItemArmor;
import iblis.item.ItemAmmo;
import iblis.item.ItemCrossbow;
import iblis.item.ItemCrossbowReloading;
import iblis.item.ItemGuideBook;
import iblis.item.ItemHeavyShield;
import iblis.item.ItemIngot;
import iblis.item.ItemMedkit;
import iblis.item.ItemShotgun;
import iblis.item.ItemShotgunReloading;
import iblis.item.ItemSubstanceContainer;
import iblis.item.ItemThrowingWeapon;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class IblisItems {
	public static Item GUIDE;
	public static Item SHOTGUN;
	public static Item SHOTGUN_RELOADING;
	public static Item SHOTGUN_BULLET;
	public static Item SHOTGUN_SHOT;
	public static Item CROSSBOW;
	public static Item CROSSBOW_RELOADING;
	public static Item CROSSBOW_BOLT;
	public static Item INGOT;
	public static Item NUGGET_STEEL;
	public static Item TRIGGER_SPRING;
	public static Item RAISIN;
	public static Item NONSTERILE_MEDKIT;
	public static ItemMedkit MEDKIT;
	public static ItemSubstanceContainer SUBSTANCE_CONTAINER;
	public static Item BOULDER;
	public static Item IRON_THROWING_KNIFE;
	public static Item HEAVY_SHIELD;
	public static Item STEEL_HELMET;
	public static Item STEEL_CHESTPLATE;
	public static Item STEEL_LEGGINS;
	public static Item STEEL_BOOTS;
	public static Item PARA_ARAMID_FABRIC;
	public static Item EPOXY_GLUE;
	public static Item PARA_ARAMID_HELMET;
	public static Item PARA_ARAMID_CHESTPLATE;
	public static Item PARA_ARAMID_LEGGINS;
	public static Item PARA_ARAMID_BOOTS;
	
	public static void init(){
		GUIDE = new ItemGuideBook();
		SHOTGUN = new ItemShotgun();
		SHOTGUN_RELOADING = new ItemShotgunReloading(SHOTGUN);
		SHOTGUN_BULLET = new ItemAmmo(2.0f, 0);
		SHOTGUN_SHOT = new ItemAmmo(1.0f, 1);
		CROSSBOW = new ItemCrossbow();
		CROSSBOW_RELOADING = new ItemCrossbowReloading(CROSSBOW);
		CROSSBOW_BOLT = new ItemAmmo(0.5f, 0);
		INGOT = new ItemIngot();
		NUGGET_STEEL = new Item();
		TRIGGER_SPRING = new Item();
		RAISIN = new ItemFood(4,0.3f,false);
		NONSTERILE_MEDKIT = new Item();
		MEDKIT = new ItemMedkit();
		SUBSTANCE_CONTAINER = new ItemSubstanceContainer();
		BOULDER = new ItemThrowingWeapon(ItemThrowingWeapon.ThrowableType.BOULDER);
		IRON_THROWING_KNIFE = new ItemThrowingWeapon(ItemThrowingWeapon.ThrowableType.IRON_KNIFE);
		HEAVY_SHIELD = new ItemHeavyShield();
		STEEL_HELMET = new IblisItemArmor(IblisMod.armorMaterialSteel, 0, EntityEquipmentSlot.HEAD);
		STEEL_CHESTPLATE = new IblisItemArmor(IblisMod.armorMaterialSteel, 0, EntityEquipmentSlot.CHEST);
		STEEL_LEGGINS = new IblisItemArmor(IblisMod.armorMaterialSteel, 0, EntityEquipmentSlot.LEGS);
		STEEL_BOOTS = new IblisItemArmor(IblisMod.armorMaterialSteel, 0, EntityEquipmentSlot.FEET);
		PARA_ARAMID_FABRIC = new Item();
		EPOXY_GLUE = new Item();
		PARA_ARAMID_HELMET = new IblisItemArmor(IblisMod.armorMaterialParaAramid, 0, EntityEquipmentSlot.HEAD);
		PARA_ARAMID_CHESTPLATE = new IblisItemArmor(IblisMod.armorMaterialParaAramid, 0, EntityEquipmentSlot.CHEST);
		PARA_ARAMID_LEGGINS = new IblisItemArmor(IblisMod.armorMaterialParaAramid, 0, EntityEquipmentSlot.LEGS);
		PARA_ARAMID_BOOTS = new IblisItemArmor(IblisMod.armorMaterialParaAramid, 0, EntityEquipmentSlot.FEET);

		GUIDE.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("guide")
			.setRegistryName(IblisMod.MODID, "guide")
			.setHasSubtypes(true)
			.setMaxDamage(0)
			.setMaxStackSize(1);
		SHOTGUN.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("six_barrels_shotgun")
			.setRegistryName(IblisMod.MODID, "six_barrels_shotgun")
			.setHasSubtypes(false)
			.setMaxDamage(1561)
			.setMaxStackSize(1);
		SHOTGUN_RELOADING
			.setUnlocalizedName("six_barrels_shotgun")
			.setRegistryName(IblisMod.MODID, "six_barrels_shotgun_reloading")
			.setHasSubtypes(true)
			.setMaxDamage(1561)
			.setMaxStackSize(1);
		SHOTGUN_BULLET.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("shotgun_bullet")
			.setRegistryName(IblisMod.MODID, "shotgun_bullet")
			.setHasSubtypes(true)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		SHOTGUN_SHOT.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("shotgun_shot")
			.setRegistryName(IblisMod.MODID, "shotgun_shot")
			.setHasSubtypes(true)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		CROSSBOW.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("double_crossbow")
			.setRegistryName(IblisMod.MODID, "double_crossbow")
			.setHasSubtypes(false)
			.setMaxDamage(1561)
			.setMaxStackSize(1);
		CROSSBOW_RELOADING
			.setUnlocalizedName("double_crossbow")
			.setRegistryName(IblisMod.MODID, "double_crossbow_reloading")
			.setHasSubtypes(true)
			.setMaxDamage(1561)
			.setMaxStackSize(1);
		CROSSBOW_BOLT.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("crossbow_bolt")
			.setRegistryName(IblisMod.MODID, "crossbow_bolt")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		INGOT.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("ingot_steel")
			.setRegistryName(IblisMod.MODID, "ingot_steel")
			.setHasSubtypes(true)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		PARA_ARAMID_FABRIC
			.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("para_aramid_fabric")
			.setRegistryName(IblisMod.MODID, "para_aramid_fabric")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		EPOXY_GLUE
			.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("epoxy_glue")
			.setRegistryName(IblisMod.MODID, "epoxy_glue")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		NUGGET_STEEL.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("nugget_steel")
			.setRegistryName(IblisMod.MODID, "nugget_steel")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		TRIGGER_SPRING.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("trigger_spring")
			.setRegistryName(IblisMod.MODID, "trigger_spring")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		RAISIN.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("raisin")
			.setRegistryName(IblisMod.MODID, "raisin")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(64);
		NONSTERILE_MEDKIT.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("non-sterile_medkit")
			.setRegistryName(IblisMod.MODID, "non-sterile_medkit")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(1);
		MEDKIT.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("medkit")
			.setRegistryName(IblisMod.MODID, "medkit")
			.setHasSubtypes(false)
			.setMaxDamage(10)
			.setMaxStackSize(1);
		SUBSTANCE_CONTAINER.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("flask")
			.setRegistryName(IblisMod.MODID, "flask")
			.setHasSubtypes(true)
			.setMaxDamage(0)
			.setMaxStackSize(1);
		BOULDER.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("boulder")
			.setRegistryName(IblisMod.MODID, "boulder")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(16);
		IRON_THROWING_KNIFE.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("iron_throwing_knife")
			.setRegistryName(IblisMod.MODID, "iron_throwing_knife")
			.setHasSubtypes(false)
			.setMaxDamage(0)
			.setMaxStackSize(16);
		HEAVY_SHIELD.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("heavy_shield")
			.setRegistryName(IblisMod.MODID, "heavy_shield")
			.setHasSubtypes(false)
			.setMaxDamage(600)
			.setMaxStackSize(1);
		STEEL_HELMET.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("steel_helmet")
			.setRegistryName(IblisMod.MODID, "steel_helmet");
		STEEL_CHESTPLATE.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("steel_chestplate")
			.setRegistryName(IblisMod.MODID, "steel_chestplate");
		STEEL_LEGGINS.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("steel_leggins")
			.setRegistryName(IblisMod.MODID, "steel_leggins");
		STEEL_BOOTS.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("steel_boots")
			.setRegistryName(IblisMod.MODID, "steel_boots");
		PARA_ARAMID_HELMET.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("para_aramid_helmet")
			.setRegistryName(IblisMod.MODID, "para_aramid_helmet");
		PARA_ARAMID_CHESTPLATE.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("para_aramid_chestplate")
			.setRegistryName(IblisMod.MODID, "para_aramid_chestplate");
		PARA_ARAMID_LEGGINS.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("para_aramid_leggins")
			.setRegistryName(IblisMod.MODID, "para_aramid_leggins");
		PARA_ARAMID_BOOTS.setCreativeTab(IblisMod.creativeTab)
			.setUnlocalizedName("para_aramid_boots")
			.setRegistryName(IblisMod.MODID, "para_aramid_boots");
		
		registerItem(GUIDE);
		registerItem(SHOTGUN);
		registerItem(SHOTGUN_RELOADING);
		registerItem(SHOTGUN_BULLET);
		registerItem(SHOTGUN_SHOT);
		registerItem(CROSSBOW);
		registerItem(CROSSBOW_RELOADING);
		registerItem(CROSSBOW_BOLT);
		registerItem(INGOT);
		registerItem(NUGGET_STEEL);
		registerItem(TRIGGER_SPRING);
		registerItem(RAISIN);
		registerItem(NONSTERILE_MEDKIT);
		registerItem(MEDKIT);
		registerItem(SUBSTANCE_CONTAINER);
		registerItem(BOULDER);
		registerItem(IRON_THROWING_KNIFE);
		registerItem(HEAVY_SHIELD);
		registerItem(STEEL_HELMET);
		registerItem(STEEL_CHESTPLATE);
		registerItem(STEEL_LEGGINS);
		registerItem(STEEL_BOOTS);
	}
	
	private static void registerItem(Item item) {
		RegistryEventHandler.items.add(item);
	}
}
