package com.ssttevee.mcrecipes.views;

import com.ssttevee.mcrecipes.R;
import com.ssttevee.mcrecipes.helper.VanillaItems;
import com.ssttevee.mcrecipes.recipe.Recipe;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;

public class ItemDisplayView extends ImageView {
	
	private Bitmap itemBitmap;

	public ItemDisplayView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
	}

	public ItemDisplayView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public ItemDisplayView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int w = this.getMeasuredWidth();

        setMeasuredDimension(w, w);

	}
	
    @Override
    protected void onDraw(final Canvas canvas)
    {
        
        Paint paint = new Paint();
        paint.setDither(false);
        paint.setAntiAlias(false);
        
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.frame_item_display), null, new RectF(getLeft(), getTop(), getRight(), getMeasuredHeight()), paint);

    	float pixel = getMeasuredHeight() / 20F;
        canvas.drawBitmap(itemBitmap, null, new RectF(getLeft() + (pixel * 4), getTop() + (pixel * 4), getRight() - (pixel * 4), getBottom() - (pixel * 4)), paint);

    }
    
    public ItemDisplayView setItem(int id) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        options.inScaled = false;
    	
        itemBitmap = BitmapFactory.decodeResource(getResources(), VanillaItems.getResourceIdFromItemId(id), options);

    	return this;
    }

}
