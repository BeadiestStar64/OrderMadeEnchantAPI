package com.github.BeadiestStar64.Plugin;

import org.bukkit.enchantments.Enchantment;

public abstract class OrderMadeType implements OrderMade {

    @Override
    public String getNameSpace() {
        return null;
    }

    @Override
    public String getDisplayName() {
        return null;
    }

    @Override
    public String getLevelLore(Enchantment enchantment) {
        return null;
    }
}
