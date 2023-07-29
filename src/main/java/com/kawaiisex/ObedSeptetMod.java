package com.kawaiisex;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObedSeptetMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("obedseptet");
	public static final Item DSWORD = new Item(new FabricItemSettings());

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		Registry.register(Registries.ITEM, new Identifier("obedseptet", "dildo-sword"), DSWORD);
	}
}