package net.dekub.testmod.item;

import net.dekub.testmod.TestMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item RAW_RUBY = registerItem("raw_ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));
    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings().group(ModItemGroup.RUBY)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TestMod.LOGGER.debug("Registering Mod Items for " + TestMod.MOD_ID);
    }
}
