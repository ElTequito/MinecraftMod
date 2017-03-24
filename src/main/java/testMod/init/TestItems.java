package testMod.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class TestItems {
	
	public static Item test_item;

	public static void init() {
		test_item = new Item().setUnlocalizedName("test_item");
	}

	public static void register() {
		
	}
}
