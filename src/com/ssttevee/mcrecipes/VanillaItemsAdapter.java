package com.ssttevee.mcrecipes;

import java.util.ArrayList;
import java.util.List;

import android.content.Context;
import android.database.DataSetObserver;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.ssttevee.mcrecipes.helper.VanillaItems;
import com.ssttevee.mcrecipes.views.ItemDisplayView;
import com.tonicartos.widget.stickygridheaders.StickyGridHeadersBaseAdapter;

public class VanillaItemsAdapter extends BaseAdapter implements StickyGridHeadersBaseAdapter {
	
	List<Integer> items = new ArrayList<Integer>();
	int[][] headers = new int[][] {
			{0, 5},
			{1, 7}};
	
	Context context;
	LayoutInflater inflator;

	public VanillaItemsAdapter(Context context) {
		this.context = context;
		inflator = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		
		items.add(VanillaItems.ITEM_IRON_SHOVEL);
		items.add(VanillaItems.ITEM_IRON_PICKAXE);
		items.add(VanillaItems.ITEM_IRON_AXE);
		items.add(VanillaItems.ITEM_IRON_HOE);
		items.add(VanillaItems.ITEM_FLINT_STEEL);
		
		items.add(VanillaItems.ITEM_IRON_HELMET);
		items.add(VanillaItems.ITEM_IRON_CHESTPLATE);
		items.add(VanillaItems.ITEM_IRON_LEGS);
		items.add(VanillaItems.ITEM_IRON_BOOTS);
		items.add(VanillaItems.ITEM_IRON_SWORD);
		items.add(VanillaItems.ITEM_BOW);
		items.add(VanillaItems.ITEM_ARROW);
	}

	@Override
	public boolean areAllItemsEnabled() {
		return true;
	}

	@Override
	public boolean isEnabled(int position) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public void registerDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void unregisterDataSetObserver(DataSetObserver observer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return items.get(position);
	}

	@Override
	public boolean hasStableIds() {
		return true;
	}

	@Override
	public int getItemViewType(int position) {
		return 0;
	}

	@Override
	public int getViewTypeCount() {
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCountForHeader(int header) {
		// TODO Auto-generated method stub
		return headers[header][1];
	}

	@Override
	public int getNumHeaders() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public View getHeaderView(int position, View convertView, ViewGroup parent) {
        HeaderViewHolder holder;
        if (convertView == null) {
            holder = new HeaderViewHolder();
            convertView = inflator.inflate(android.R.layout.preference_category, parent, false);
            holder.text = (TextView) convertView.findViewById(android.R.id.title);
            convertView.setTag(holder);
        } else {
            holder = (HeaderViewHolder) convertView.getTag();
        }
        String headerText = "" + getSectionName(position);
        holder.text.setText(headerText);
        return convertView;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		ItemDisplayView idv;
		if(convertView == null){
			idv = new ItemDisplayView(context);
		} else {
			idv = (ItemDisplayView) convertView;
		}
	    idv.setItem((int) getItemId(position));
		return idv;
	}

	class HeaderViewHolder {
		TextView text;
	}
	
	private String getSectionName(int sect) {
		if(sect == 0) return "Tools";
		else if(sect == 1) return "Combat";
		else return "Miscellaneous";
	}

}
