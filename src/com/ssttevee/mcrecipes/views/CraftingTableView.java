package com.ssttevee.mcrecipes.views;

import com.ssttevee.mcrecipes.R;
import com.ssttevee.mcrecipes.helper.Recipe;
import com.ssttevee.mcrecipes.helper.VanillaItems;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.widget.ImageView;

public class CraftingTableView extends ImageView {
	
	private Recipe r = null;
	private SparseArray<Bitmap> itemBitmaps = new SparseArray<Bitmap>();
	private SparseArray<Integer[]> itemMats = new SparseArray<Integer[]>();
	
	private Paint mPaint;
	private Bitmap mFrame;
	
	private boolean stop = false;
	private boolean thread_on = false;
	private int matStep = 0;

	public CraftingTableView(Context context) {
		super(context);
        
        mPaint = new Paint();
        mPaint.setDither(false);
        mPaint.setAntiAlias(false);
        
        mFrame = BitmapFactory.decodeResource(getResources(), R.drawable.template_workbench_framed);
	}

	public CraftingTableView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	public CraftingTableView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        int w = this.getMeasuredWidth();
        int h = (int) (w / 130F * 68F);

        setMeasuredDimension(w, h);
	}
	
    @Override
    protected void onDraw(final Canvas canvas)
    {
        canvas.drawBitmap(mFrame, null, new RectF(getLeft(), getTop(), getRight(), getMeasuredHeight()), mPaint);
        
        for (int i = 0; i < r.getRecipe().size(); i++) {
        	if(itemMats.get(i) == null) {
	    		int item = r.getRecipe().get(i);
	            canvas.drawBitmap(itemBitmaps.get(item), null, getItemLocById(i), mPaint);
        	} else {
	            canvas.drawBitmap(itemBitmaps.get(itemMats.get(i)[matStep % itemMats.get(i).length]), null, getItemLocById(i), mPaint);
        	}
		}
        
        if(itemMats.get(9) == null) {
        	canvas.drawBitmap(itemBitmaps.get(r.getResult()), null, getItemLocById(-1), mPaint);
        } else {
        	canvas.drawBitmap(itemBitmaps.get(itemMats.get(9)[matStep % itemMats.get(9).length]), null, getItemLocById(-9), mPaint);
        }

        
        if(r.getMultiMat() && !thread_on) {
        	new Thread(new Runnable() {
				@Override
				public void run() {
					thread_on = true;
					try {
						while(!stop) {
							Thread.sleep(1250);
							postInvalidate();
							if(matStep <= itemMats.valueAt(9).length - 2) matStep++;
							else matStep = 0;
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}).start();
        }
    }
    
    @Override
    protected void onDetachedFromWindow() {
    	stop = true;
    	thread_on = false;
    }
    
    private RectF getItemLocById(int id) {
    	float pixel = getMeasuredHeight() / 68F;
    	float left = 0;
		float top = 0;
    	
    	switch (id) {
		case 0: // top left
			left = getLeft() + (pixel * 8);
			top = getTop() + (pixel * 8);
	    	return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
		case 1: // top center
			left = getLeft() + (pixel * 26);
			top = getTop() + (pixel * 8);
	    	return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
		case 2: // top right
			left = getLeft() + (pixel * 44);
			top = getTop() + (pixel * 8);
	    	return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
	    	
		case 3: // middle left
			left = getLeft() + (pixel * 8);
			top = getTop() + (pixel * 26);
	    	return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
		case 4: // middle center
			left = getLeft() + (pixel * 26);
			top = getTop() + (pixel * 26);
			return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
		case 5: // middle right
			left = getLeft() + (pixel * 44);
			top = getTop() + (pixel * 26);
			return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
			
		case 6: // bottom left
			left = getLeft() + pixel + (pixel * 7);
			top = getTop() + (pixel * 44);
			return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
		case 7: // bottom center
			left = getLeft() + (pixel * 26);
			top = getTop() + (pixel * 44);
			return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
		case 8: // bottom right
			left = getLeft() + (pixel * 44);
			top = getTop() + (pixel * 44);
			return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
			
		default: // resultant item
			left = getLeft() + (pixel * 102);
			top = getTop() + (pixel * 26);
			return new RectF(left, top, left + (pixel * 16), top + (pixel * 16));
		}
    }
    
    public CraftingTableView setRecipe(Recipe r) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = false;
        options.inScaled = false;

    	for (int i = 0; i < r.getRecipe().size(); i++) {
    		int item = r.getRecipe().get(i);
    		if(itemBitmaps.get(item) == null) {
    	        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), VanillaItems.getResourceIdFromItemId(item), options);
    	        itemBitmaps.put(item, bitmap);
    		}
		}
    	
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), VanillaItems.getResourceIdFromItemId(r.getResult()), options);
        itemBitmaps.put(r.getResult(), bitmap);

    	if(VanillaItems.hasMultiMats(r.getResult())) {
    		
	    	r.setMultiMat(true);
	    	for (int i = 0; i < r.getRecipe().size(); i++) {
	    		int item = r.getRecipe().get(i);
	    		itemMats.append(i, VanillaItems.getCorrespondingSet(r.getResult(), item));
	    		
	    		if(VanillaItems.getCorrespondingSet(r.getResult(), item) != null)
		    		for (int j = 0; j < VanillaItems.getCorrespondingSet(r.getResult(), item).length; j++) {
		    			int mat = VanillaItems.getCorrespondingSet(r.getResult(), item)[j];
		        		if(itemBitmaps.get(mat) == null) {
		        	        Bitmap bmap = BitmapFactory.decodeResource(getResources(), VanillaItems.getResourceIdFromItemId(mat), options);
		        	        itemBitmaps.put(mat, bmap);
		        		}
					}
			}

    		itemMats.append(9, VanillaItems.getCorrespondingSet(r.getResult(), r.getResult()));

    		if(VanillaItems.getCorrespondingSet(r.getResult(), r.getResult()) != null)
	    		for (int j = 0; j < VanillaItems.getCorrespondingSet(r.getResult(), r.getResult()).length; j++) {
	    			int mat = VanillaItems.getCorrespondingSet(r.getResult(), r.getResult())[j];
	        		if(itemBitmaps.get(mat) == null) {
	        	        Bitmap bmap = BitmapFactory.decodeResource(getResources(), VanillaItems.getResourceIdFromItemId(mat), options);
	        	        itemBitmaps.put(mat, bmap);
	        		}
				}
	    	
    	}

    	this.r = r;
    	return this;
    }

}
