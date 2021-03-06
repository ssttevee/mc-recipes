package com.ssttevee.mcrecipes.helper;

import java.util.Arrays;
import android.util.SparseArray;
import android.util.SparseIntArray;

import com.ssttevee.mcrecipes.R;


public class VanillaItems {
	
	public static SparseIntArray items = new SparseIntArray();
	public static SparseArray<Recipe> recipes = new SparseArray<Recipe>();
	
	public static Integer[] ITEM_SET_TOOL_MATS = 	new Integer[] {5, 4, 265, 264, 266}; // wood -> stone -> iron -> diamond -> gold
	public static Integer[] ITEM_SET_TOOL_SWORD = 	new Integer[] {268, 272, 267, 276, 283};
	public static Integer[] ITEM_SET_TOOL_SHOVEL = 	new Integer[] {269, 273, 256, 277, 284};
	public static Integer[] ITEM_SET_TOOL_PICKAXE = new Integer[] {270, 274, 257, 278, 285};
	public static Integer[] ITEM_SET_TOOL_AXE = 	new Integer[] {271, 275, 258, 279, 286};
	public static Integer[] ITEM_SET_TOOL_HOE = 	new Integer[] {290, 291, 292, 293, 294};

	public static Integer[] ITEM_SET_ARMOR_MATS = 	new Integer[] {334, 51, 265, 264, 266}; // leather -> fire -> iron -> diamond -> gold
	public static Integer[] ITEM_SET_ARMOR_HEAD = 	new Integer[] {298, 302, 306, 310, 314};
	public static Integer[] ITEM_SET_ARMOR_CHEST = 	new Integer[] {299, 303, 307, 311, 315};
	public static Integer[] ITEM_SET_ARMOR_LEGS = 	new Integer[] {300, 304, 308, 312, 316};
	public static Integer[] ITEM_SET_ARMOR_FEET = 	new Integer[] {301, 305, 309, 313, 317};
	
	public static int ITEM_AIR, ITEM_NULL = 0;
	public static int ITEM_STONE = 1;
	public static int ITEM_COBBLESTONE = 4;
	public static int ITEM_WOOD_PLANKS = 5;
	public static int ITEM_FIRE = 51;
	public static int ITEM_IRON_SHOVEL = 256;
	public static int ITEM_IRON_PICKAXE = 257;
	public static int ITEM_IRON_AXE = 258;
	public static int ITEM_FLINT_STEEL = 259;
	public static int ITEM_APPLE_RED = 260;
	public static int ITEM_BOW = 261;
	public static int ITEM_ARROW = 262;
	public static int ITEM_COAL = 263;
	public static int ITEM_DIAMOND = 264;
	public static int ITEM_IRON_INGOT = 265;
	public static int ITEM_GOLD_INGOT = 266;
	public static int ITEM_IRON_SWORD = 267;
	public static int ITEM_WOOD_SWORD = 268;
	public static int ITEM_WOOD_SHOVEL = 269;
	public static int ITEM_WOOD_PICKAXE = 270;
	public static int ITEM_WOOD_AXE = 271;
	public static int ITEM_STONE_SWORD = 272;
	public static int ITEM_STONE_SHOVEL = 273;
	public static int ITEM_STONE_PICKAXE = 274;
	public static int ITEM_STONE_AXE = 275;
	public static int ITEM_DIAMOND_SWORD = 276;
	public static int ITEM_DIAMOND_SHOVEL = 277;
	public static int ITEM_DIAMOND_PICKAXE = 278;
	public static int ITEM_DIAMOND_AXE = 279;
	public static int ITEM_STICK = 280;
	public static int ITEM_BOWL = 281;
	public static int ITEM_MUSHROOM_STEW = 282;
	public static int ITEM_GOLD_SWORD = 283;
	public static int ITEM_GOLD_SHOVEL = 284;
	public static int ITEM_GOLD_PICKAXE = 285;
	public static int ITEM_GOLD_AXE = 286;
	public static int ITEM_STRING = 287;
	public static int ITEM_FEATHER = 288;
	public static int ITEM_GUN_POWDER = 289;
	public static int ITEM_WOOD_HOE = 290;
	public static int ITEM_STONE_HOE = 291;
	public static int ITEM_IRON_HOE = 292;
	public static int ITEM_DIAMOND_HOE = 293;
	public static int ITEM_GOLD_HOE = 294;
	public static int ITEM_SEEDS = 295;
	public static int ITEM_WHEAT = 296;
	public static int ITEM_BREAD = 297;
	public static int ITEM_LEATHER_CAP = 298;
	public static int ITEM_LEATHER_CHESTPLATE = 299;
	public static int ITEM_LEATHER_LEGS = 300;
	public static int ITEM_LEATHER_BOOTS = 301;
	public static int ITEM_CHAIN_HELMET = 302;
	public static int ITEM_CHAIN_CHESTPLATE = 303;
	public static int ITEM_CHAIN_LEGS = 304;
	public static int ITEM_CHAIN_BOOTS = 305;
	public static int ITEM_IRON_HELMET = 306;
	public static int ITEM_IRON_CHESTPLATE = 307;
	public static int ITEM_IRON_LEGS = 308;
	public static int ITEM_IRON_BOOTS = 309;
	public static int ITEM_DIAMOND_HELMET = 310;
	public static int ITEM_DIAMOND_CHESTPLATE = 311;
	public static int ITEM_DIAMOND_LEGS = 312;
	public static int ITEM_DIAMOND_BOOTS = 313;
	public static int ITEM_GOLD_HELMET = 314;
	public static int ITEM_GOLD_CHESTPLATE = 315;
	public static int ITEM_GOLD_LEGS = 316;
	public static int ITEM_GOLD_BOOTS = 317;
	public static int ITEM_FLINT = 318;
	public static int ITEM_PORKCHOP_RAW = 319;
	public static int ITEM_PORKCHOP_COOKED = 320;
	public static int ITEM_PAINTING = 321;
	public static int ITEM_APPLE_GOLDEN = 322;
	public static int ITEM_SIGN = 323;
	
	public static int ITEM_LEATHER = 334;
	
	static {
		
		items.append(ITEM_AIR, 				R.drawable.item_000);
		items.append(ITEM_COBBLESTONE, 		R.drawable.item_004);
		items.append(ITEM_WOOD_PLANKS, 		R.drawable.item_005);
		items.append(ITEM_FIRE, 			R.drawable.item_051);
		items.append(ITEM_IRON_SHOVEL, 		R.drawable.item_256);
		items.append(ITEM_IRON_PICKAXE, 	R.drawable.item_257);
		items.append(ITEM_IRON_AXE, 		R.drawable.item_258);
		items.append(ITEM_FLINT_STEEL, 		R.drawable.item_259);
		items.append(ITEM_APPLE_RED, 		R.drawable.item_260);
		items.append(ITEM_BOW, 				R.drawable.item_261);
		items.append(ITEM_ARROW, 			R.drawable.item_262);
		items.append(ITEM_COAL, 			R.drawable.item_263);
		items.append(ITEM_DIAMOND, 			R.drawable.item_264);
		items.append(ITEM_IRON_INGOT, 		R.drawable.item_265);
		items.append(ITEM_GOLD_INGOT, 		R.drawable.item_266);
		items.append(ITEM_IRON_SWORD, 		R.drawable.item_267);
		items.append(ITEM_WOOD_SWORD, 		R.drawable.item_268);
		items.append(ITEM_WOOD_SHOVEL, 		R.drawable.item_269);
		items.append(ITEM_WOOD_PICKAXE, 	R.drawable.item_270);
		items.append(ITEM_WOOD_AXE, 		R.drawable.item_271);
		items.append(ITEM_STONE_SWORD, 		R.drawable.item_272);
		items.append(ITEM_STONE_SHOVEL, 	R.drawable.item_273);
		items.append(ITEM_STONE_PICKAXE, 	R.drawable.item_274);
		items.append(ITEM_STONE_AXE,		R.drawable.item_275);
		items.append(ITEM_DIAMOND_SWORD, 	R.drawable.item_276);
		items.append(ITEM_DIAMOND_SHOVEL, 	R.drawable.item_277);
		items.append(ITEM_DIAMOND_PICKAXE, 	R.drawable.item_278);
		items.append(ITEM_DIAMOND_AXE, 		R.drawable.item_279);
		items.append(ITEM_STICK, 			R.drawable.item_280);
		items.append(ITEM_BOWL, 			R.drawable.item_281);
		items.append(ITEM_MUSHROOM_STEW, 	R.drawable.item_282);
		items.append(ITEM_GOLD_SWORD, 		R.drawable.item_283);
		items.append(ITEM_GOLD_SHOVEL, 		R.drawable.item_284);
		items.append(ITEM_GOLD_PICKAXE, 	R.drawable.item_285);
		items.append(ITEM_GOLD_AXE, 		R.drawable.item_286);
		items.append(ITEM_STRING, 			R.drawable.item_287);
		items.append(ITEM_FEATHER, 			R.drawable.item_288);
		items.append(ITEM_GUN_POWDER, 		R.drawable.item_289);
		items.append(ITEM_WOOD_HOE, 		R.drawable.item_290);
		items.append(ITEM_STONE_HOE, 		R.drawable.item_291);
		items.append(ITEM_IRON_HOE, 		R.drawable.item_292);
		items.append(ITEM_DIAMOND_HOE, 		R.drawable.item_293);
		items.append(ITEM_GOLD_HOE, 		R.drawable.item_294);
		items.append(ITEM_SEEDS, 			R.drawable.item_295);
		items.append(ITEM_WHEAT, 			R.drawable.item_296);
		items.append(ITEM_BREAD, 			R.drawable.item_297);
		items.append(ITEM_LEATHER_CAP, 		R.drawable.item_298);
		items.append(ITEM_LEATHER_CHESTPLATE, R.drawable.item_299);
		items.append(ITEM_LEATHER_LEGS, 	R.drawable.item_300);
		items.append(ITEM_LEATHER_BOOTS, 	R.drawable.item_301);
		items.append(ITEM_CHAIN_HELMET, 	R.drawable.item_302);
		items.append(ITEM_CHAIN_CHESTPLATE, R.drawable.item_303);
		items.append(ITEM_CHAIN_LEGS, 		R.drawable.item_304);
		items.append(ITEM_CHAIN_BOOTS, 		R.drawable.item_305);
		items.append(ITEM_IRON_HELMET, 		R.drawable.item_306);
		items.append(ITEM_IRON_CHESTPLATE, 	R.drawable.item_307);
		items.append(ITEM_IRON_LEGS, 		R.drawable.item_308);
		items.append(ITEM_IRON_BOOTS, 		R.drawable.item_309);
		items.append(ITEM_DIAMOND_HELMET, 	R.drawable.item_310);
		items.append(ITEM_DIAMOND_CHESTPLATE, R.drawable.item_311);
		items.append(ITEM_DIAMOND_LEGS, 	R.drawable.item_312);
		items.append(ITEM_DIAMOND_BOOTS, 	R.drawable.item_313);
		items.append(ITEM_GOLD_HELMET, 		R.drawable.item_314);
		items.append(ITEM_GOLD_CHESTPLATE, 	R.drawable.item_315);
		items.append(ITEM_GOLD_LEGS, 		R.drawable.item_316);
		items.append(ITEM_GOLD_BOOTS, 		R.drawable.item_317);
		items.append(ITEM_FLINT, 			R.drawable.item_318);
		items.append(ITEM_PORKCHOP_RAW, 	R.drawable.item_319);
		items.append(ITEM_PORKCHOP_COOKED, 	R.drawable.item_320);
		items.append(ITEM_PAINTING, 		R.drawable.item_321);
		items.append(ITEM_APPLE_GOLDEN, 	R.drawable.item_322);
		items.append(ITEM_APPLE_GOLDEN, 	R.drawable.item_323);
		
		items.append(ITEM_LEATHER, 	R.drawable.item_334);
		
		
		recipes.append(ITEM_BOW, Recipe.RECIPE_ITEM_BOW);
		recipes.append(ITEM_ARROW, Recipe.RECIPE_ITEM_ARROW);
		recipes.append(ITEM_FLINT_STEEL, Recipe.RECIPE_ITEM_FLINT_STEEL);
	}
	
	public static int getResourceIdFromItemId(int id) {
		return items.get(id);	
	}
	
	public static boolean hasMultiMats(int id) {
		if(Arrays.asList(ITEM_SET_TOOL_PICKAXE).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_TOOL_SWORD).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_TOOL_SHOVEL).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_TOOL_AXE).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_TOOL_HOE).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_ARMOR_HEAD).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_ARMOR_CHEST).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_ARMOR_LEGS).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_ARMOR_FEET).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_ARMOR_MATS).contains(id)) return true;
		else if(Arrays.asList(ITEM_SET_TOOL_MATS).contains(id)) return true;
		else return false;
	}
	
	public static Integer[] getCorrespondingSet(int resultItem, int id) {
		
		if(Arrays.asList(ITEM_SET_TOOL_PICKAXE).contains(resultItem) || Arrays.asList(ITEM_SET_TOOL_SWORD).contains(resultItem) || Arrays.asList(ITEM_SET_TOOL_SHOVEL).contains(resultItem) || Arrays.asList(ITEM_SET_TOOL_AXE).contains(resultItem) || Arrays.asList(ITEM_SET_TOOL_HOE).contains(resultItem)) {
			if(Arrays.asList(ITEM_SET_TOOL_PICKAXE).contains(id)) return ITEM_SET_TOOL_PICKAXE;
			else if(Arrays.asList(ITEM_SET_TOOL_SWORD).contains(id)) return ITEM_SET_TOOL_SWORD;
			else if(Arrays.asList(ITEM_SET_TOOL_SHOVEL).contains(id)) return ITEM_SET_TOOL_SHOVEL;
			else if(Arrays.asList(ITEM_SET_TOOL_AXE).contains(id)) return ITEM_SET_TOOL_AXE;
			else if(Arrays.asList(ITEM_SET_TOOL_HOE).contains(id)) return ITEM_SET_TOOL_HOE;
			else if(Arrays.asList(ITEM_SET_TOOL_MATS).contains(id)) return ITEM_SET_TOOL_MATS;
			else return null;
		} else if(Arrays.asList(ITEM_SET_ARMOR_HEAD).contains(resultItem) || Arrays.asList(ITEM_SET_ARMOR_CHEST).contains(resultItem) || Arrays.asList(ITEM_SET_ARMOR_LEGS).contains(resultItem) || Arrays.asList(ITEM_SET_ARMOR_FEET).contains(resultItem)) {
			if(Arrays.asList(ITEM_SET_ARMOR_HEAD).contains(id)) return ITEM_SET_ARMOR_HEAD;
			else if(Arrays.asList(ITEM_SET_ARMOR_CHEST).contains(id)) return ITEM_SET_ARMOR_CHEST;
			else if(Arrays.asList(ITEM_SET_ARMOR_LEGS).contains(id)) return ITEM_SET_ARMOR_LEGS;
			else if(Arrays.asList(ITEM_SET_ARMOR_FEET).contains(id)) return ITEM_SET_ARMOR_FEET;
			else if(Arrays.asList(ITEM_SET_ARMOR_MATS).contains(id)) return ITEM_SET_ARMOR_MATS;
			else return null;
		} else return null;
	}
	
	public static Recipe getCorrespondingRecipe(int id) {
		if(Arrays.asList(ITEM_SET_TOOL_PICKAXE).contains(id)) return Recipe.RECIPE_ITEM_PICKAXE;
		else if(Arrays.asList(ITEM_SET_TOOL_SWORD).contains(id)) return Recipe.RECIPE_ITEM_SWORD;
		else if(Arrays.asList(ITEM_SET_TOOL_SHOVEL).contains(id)) return Recipe.RECIPE_ITEM_SHOVEL;
		else if(Arrays.asList(ITEM_SET_TOOL_AXE).contains(id)) return Recipe.RECIPE_ITEM_AXE;
		else if(Arrays.asList(ITEM_SET_TOOL_HOE).contains(id)) return Recipe.RECIPE_ITEM_HOE;
		else if(Arrays.asList(ITEM_SET_ARMOR_HEAD).contains(id)) return Recipe.RECIPE_ARMOR_HEAD;
		else if(Arrays.asList(ITEM_SET_ARMOR_CHEST).contains(id)) return Recipe.RECIPE_ARMOR_CHEST;
		else if(Arrays.asList(ITEM_SET_ARMOR_LEGS).contains(id)) return Recipe.RECIPE_ARMOR_LEGS;
		else if(Arrays.asList(ITEM_SET_ARMOR_FEET).contains(id)) return Recipe.RECIPE_ARMOR_FEET;
		else if(Arrays.asList(ITEM_SET_ARMOR_FEET).contains(id)) return Recipe.RECIPE_ARMOR_FEET;
		else if(recipes.get(id) != null) return recipes.get(id);
		else return new Recipe(0);
	}

	public VanillaItems() {
		// TODO Auto-generated constructor stub
	}

}
