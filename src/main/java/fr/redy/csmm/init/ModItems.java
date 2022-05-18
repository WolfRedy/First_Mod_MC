package fr.redy.csmm.init;

import fr.redy.csmm.CSMM;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.spongepowered.asm.mixin.injection.Group;

import javax.swing.*;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, CSMM.MODID);
    public static final RegistryObject<Item> COPPER_INGOT = ITEMS.register("copper_ingot", ()-> new Item(new Item.Properties()));
    public static final RegistryObject<Item> COPPER_STICK = ITEMS.register("copper_stick", ()-> new Item(new Item.Properties().stacksTo(1).tab(CreativeModeTab.TAB_MATERIALS)));
}
