package com.ssttevee.mcrecipes.recipe;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
	private List<Integer> recipe;
	private int result;
	
	private boolean isMultiMat = false;
	
	public static Recipe RECIPE_ITEM_PICKAXE = new Recipe(257).setRecipe(265, 265, 265, 0, 280, 0, 0, 280, 0);

	
	public Recipe(int result) {
		this.result = result;
	}

	public Recipe(List<Integer> recipe, int result) {
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
