package com.ukilop0617.magicalcode.proxy;

import com.ukilop0617.magicalcode.MagicalCode;
import com.ukilop0617.magicalcode.Reference;

import init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;

public class ClientProxy implements CommonProxy{

	@Override
	public void init() {
		ModItems.registerRenders();
	}
}
