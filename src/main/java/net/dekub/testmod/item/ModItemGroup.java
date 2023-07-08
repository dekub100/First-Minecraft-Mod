package net.dekub.testmod.item;

import net.dekub.testmod.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup UNKNOWN_ORE = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "unknown_ore"), () -> new ItemStack(ModItems.UNKNOWN_ORE));
}
