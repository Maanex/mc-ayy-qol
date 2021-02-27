package de.maanex.ayy.items;


import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class Battleaxes {

	private Battleaxes() {
	}

	public static final ItemStack	WOODEN_BATTLEAXE;
	public static final ItemStack	STONE_BATTLEAXE;
	public static final ItemStack	GOLDEN_BATTLEAXE;
	public static final ItemStack	IRON_BATTLEAXE;
	public static final ItemStack	DIAMOND_BATTLEAXE;

	static {
		ItemMeta m;

		WOODEN_BATTLEAXE = new ItemStack(Material.WOODEN_AXE);
		m = WOODEN_BATTLEAXE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rWooden Battleaxe");
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 9, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		WOODEN_BATTLEAXE.setItemMeta(m);

		STONE_BATTLEAXE = new ItemStack(Material.STONE_AXE);
		m = STONE_BATTLEAXE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rStone Battleaxe");
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 10, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		STONE_BATTLEAXE.setItemMeta(m);

		GOLDEN_BATTLEAXE = new ItemStack(Material.GOLDEN_AXE);
		m = GOLDEN_BATTLEAXE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rGolden Battleaxe");
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 9, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		GOLDEN_BATTLEAXE.setItemMeta(m);

		IRON_BATTLEAXE = new ItemStack(Material.IRON_AXE);
		m = IRON_BATTLEAXE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rIron Battleaxe");
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 11, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		IRON_BATTLEAXE.setItemMeta(m);

		DIAMOND_BATTLEAXE = new ItemStack(Material.DIAMOND_AXE);
		m = DIAMOND_BATTLEAXE.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rDiamond Battleaxe");
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 12, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", 1, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		m.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		DIAMOND_BATTLEAXE.setItemMeta(m);
	}

}
