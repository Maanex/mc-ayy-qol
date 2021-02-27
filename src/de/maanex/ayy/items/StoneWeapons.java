package de.maanex.ayy.items;


import java.util.UUID;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


public class StoneWeapons {

	private StoneWeapons() {
	}

	public static final ItemStack	STONE_SPEAR;
	public static final ItemStack	STONE_GLAIVE;

	static {
		ItemMeta m;

		STONE_SPEAR = new ItemStack(Material.STONE_SWORD);
		m = STONE_SPEAR.getItemMeta();
		m.setCustomModelData(1);
		m.setDisplayName("§rStone Spear");
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "Attack Speed", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "Attack Damage", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		STONE_SPEAR.setItemMeta(m);

		STONE_GLAIVE = new ItemStack(Material.STONE_SWORD);
		m = STONE_GLAIVE.getItemMeta();
		m.setCustomModelData(2);
		m.setDisplayName("§rStone Glaive");
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, new AttributeModifier(UUID.randomUUID(), "Attack Speed", 2, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		m.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, new AttributeModifier(UUID.randomUUID(), "Attack Damage", 4, AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND));
		STONE_GLAIVE.setItemMeta(m);
	}

}
