package com.ssttevee.mcrecipes;


import com.ssttevee.mcrecipes.recipe.Recipe;
import com.ssttevee.mcrecipes.views.CraftingTableView;
import com.ssttevee.mcrecipes.views.ItemDisplayView;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.widget.LinearLayout;

public class AllItemsActivity extends Activity {
	
	private LinearLayout ll;

	public AllItemsActivity() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        setContentView(ll = new LinearLayout(this));
        
        new AlertDialog.Builder(this).setView(new CraftingTableView(this).setRecipe(Recipe.RECIPE_ITEM_PICKAXE)).create().show();
        ll.addView(new ItemDisplayView(this).setItem(278));
        
		super.onCreate(savedInstanceState);
	}
}
