package com.ssttevee.mcrecipes.views;

import java.util.ArrayList;
import java.util.List;

import com.ssttevee.mcrecipes.R;
import com.ssttevee.mcrecipes.helper.VanillaItems;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;

public class ItemDisplayView extends ImageView {

	private List<Bitmap> itemBitmap = new ArrayList<Bitmap>();
	private int matStep = 0;
	private boolean stop = false;

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

		canvas.drawBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.frame_item_display), null, new RectF(getLeft(), getTop(), getRight(), getMeasuredHeight()), null);

		float pixel = getMeasuredHeight() / 20F;

        
        if(itemBitmap.size() > 1) {
        	canvas.drawBitmap(itemBitmap.get(matStep % itemBitmap.size()), null, new RectF(getLeft() + (pixel * 4), getTop() + (pixel * 4), getRight() - (pixel * 4), getBottom() - (pixel * 4)), paint);
        } else {
        	canvas.drawBitmap(itemBitmap.get(0), null, new RectF(getLeft() + (pixel * 4), getTop() + (pixel * 4), getRight() - (pixel * 4), getBottom() - (pixel * 4)), paint);
        }
		
	}
	
	@Override
	protected void onAttachedToWindow() {
    	new Thread(new Runnable() {
			@Override
			public void run() {
				stop = false;
				try {
					while(!stop && itemBitmap.size() > 1) {
						Thread.sleep(1250);
						postInvalidate();
						if(matStep <= itemBitmap.size() - 2) matStep++;
						else matStep = 0;
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}).start();
		super.onAttachedToWindow();
	}
	
	@Override
	protected void onDetachedFromWindow() {
		stop = true;
		super.onDetachedFromWindow();
	}

	public ItemDisplayView setItem(int id) {
		BitmapFactory.Options options = new BitmapFactory.Options();
		options.inDither = false;
		options.inScaled = false;

		if(!VanillaItems.hasMultiMats(id)) {
			itemBitmap.add(BitmapFactory.decodeResource(getResources(), VanillaItems.getResourceIdFromItemId(id), options));
		} else {
    		for (int i = 0; i < VanillaItems.getCorrespondingSet(id, id).length; i++) {
    			int mat = VanillaItems.getCorrespondingSet(id, id)[i];
        	    itemBitmap.add(BitmapFactory.decodeResource(getResources(), VanillaItems.getResourceIdFromItemId(mat), options));
			}
		}
		
		invalidate();
		return this;
	}

}
