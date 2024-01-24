package com.github.BeadiestStar64.Plugin;

import org.bukkit.enchantments.Enchantment;

public interface OrderMade {

    String getNameSpace();
    String getDisplayName();
    String getLevelLore(Enchantment enchantment);
}
