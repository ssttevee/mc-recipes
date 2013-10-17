package com.ssttevee.mcrecipes;


import com.actionbarsherlock.app.SherlockActivity;
import com.ssttevee.mcrecipes.helper.Recipe;
import com.ssttevee.mcrecipes.helper.VanillaItems;
import com.ssttevee.mcrecipes.views.CraftingTableView;
import com.ssttevee.mcrecipes.views.ItemDisplayView;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersGridView;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;

public class AllItemsActivity extends SherlockActivity {

    private StickyGridHeadersGridView mGridView;

	public AllItemsActivity() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.grid_vanilla_items);


        mGridView = (StickyGridHeadersGridView) findViewById(R.id.vanilla_items_grid);
        mGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		        new AlertDialog.Builder(AllItemsActivity.this).setView(new CraftingTableView(AllItemsActivity.this).setRecipe(VanillaItems.getCorrespondingRecipe((int) id))).create().show();
			}
		});

        mGridView.setAdapter(new VanillaItemsAdapter(this));



//        mGridView.setOnHeaderClickListener(this);
//        mGridView.setOnHeaderLongClickListener(this);

        
		super.onCreate(savedInstanceState);
	}
}
