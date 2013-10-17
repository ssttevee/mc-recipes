package com.ssttevee.mcrecipes.helper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Recipe {
	private List<Integer> recipe = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0, 0);
	private int result = 0;
	
	private boolean isMultiMat = false;
	
	public static Recipe RECIPE_ITEM_BOW = new Recipe(261, Arrays.asList(0, 280, 287, 280, 0, 287, 0, 280, 287));
	public static Recipe RECIPE_ITEM_ARROW = new Recipe(262, Arrays.asList(0, 318, 0, 0, 280, 0, 0, 288, 0));
	public static Recipe RECIPE_ITEM_FLINT_STEEL = new Recipe(259, Arrays.asList(0, 0, 0, 0, 265, 0, 0, 0, 318));
	
	public static Recipe RECIPE_ITEM_SWORD = new Recipe(267, Arrays.asList(0, 265, 0, 0, 265, 0, 0, 280, 0));
	public static Recipe RECIPE_ITEM_SHOVEL = new Recipe(256, Arrays.asList(0, 265, 0, 0, 280, 0, 0, 280, 0));
	public static Recipe RECIPE_ITEM_PICKAXE = new Recipe(257, Arrays.asList(265, 265, 265, 0, 280, 0, 0, 280, 0));
	public static Recipe RECIPE_ITEM_AXE = new Recipe(258, Arrays.asList(265, 265, 0, 265, 280, 0, 0, 280, 0));
	public static Recipe RECIPE_ITEM_HOE = new Recipe(292, Arrays.asList(265, 265, 0, 0, 280, 0, 0, 280, 0));
	
	public static Recipe RECIPE_ARMOR_HEAD = new Recipe(306, Arrays.asList(265, 265, 265, 265, 0, 265, 0, 280, 0));
	public static Recipe RECIPE_ARMOR_CHEST = new Recipe(307, Arrays.asList(265, 0, 265, 265, 265, 265, 265, 265, 265));
	public static Recipe RECIPE_ARMOR_LEGS = new Recipe(308, Arrays.asList(265, 265, 265, 265, 0, 265, 265, 0, 265));
	public static Recipe RECIPE_ARMOR_FEET = new Recipe(309, Arrays.asList(265, 0, 265, 265, 0, 265, 0, 0, 0));

	
	public Recipe(int result) {
		this.result = result;
	}

	public Recipe(int result, List<Integer> recipe) {
		this.recipe = recipe;
		this.result = result;
	}
	
	public Recipe setRecipe(int... ingredients) {
        if(ingredients.length != 9) throw new NullPointerException("There are not 9 ingredients");
        
        List<Integer> r = new ArrayList<Integer>();
        for (int i = 0; i < ingredients.length; i++) {
			r.add(ingredients[i]);
		}
        this.recipe = r;
        return this;
	}
	
	public List<Integer> getRecipe() {
		return recipe;
	}
	
	public int getResult() {
		return result;
	}
	
	public void setMultiMat(boolean multimat) {
		this.isMultiMat = multimat;
	}
	
	public boolean getMultiMat() {
		return this.isMultiMat;
	}

}
