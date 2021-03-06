package me.constantindev.ccl.etc;

import net.minecraft.enchantment.Enchantment;

public class EnchantEntry {
    private final Enchantment enchant;
    private final String name;

    public EnchantEntry(Enchantment enchant, String name) {
        this.enchant = enchant;
        this.name = name;
    }

    public Enchantment getEnchant() {
        return this.enchant;
    }

    public String getName() {
        return this.name;
    }
}
