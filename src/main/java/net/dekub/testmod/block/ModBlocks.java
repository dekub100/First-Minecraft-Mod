package net.dekub.testmod.block;

import net.dekub.testmod.TestMod;
import net.dekub.testmod.block.custom.JumpyBlock;
import net.dekub.testmod.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block", new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.RUBY);

    public static final Block COMPRESSED_DIAMOND_BLOCK = registerBlock("compressed_diamond_block", new Block(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool()), ModItemGroup.RUBY);

    public static final Block RUBY_ORE = registerBlock("ruby_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.RUBY);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore", new OreBlock(FabricBlockSettings.of(Material.STONE).strength(4f).requiresTool(), UniformIntProvider.create(3, 7)), ModItemGroup.RUBY);

    public static final Block JUMPY_BLOCK = registerBlock("jumpy_block", new JumpyBlock(FabricBlockSettings.of(Material.METAL).strength(4f).requiresTool()), ModItemGroup.RUBY);

private static Block registerBlock(String name, Block block, ItemGroup tab) {
    registerBlockItem(name, block, tab);
    return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
}

    private static Item registerBlockItem(String name,Block block, ItemGroup tab) {

    return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        TestMod.LOGGER.debug("Registering Mod Blocks for " + TestMod.MOD_ID);
    }
}
