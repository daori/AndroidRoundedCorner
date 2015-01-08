package com.example.daori.roundedcorner;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;

/**
 * Created by daori on 1/8/15.
 */
public class RadiusDrawable extends Drawable {

    float radius;
    Context context;
    private Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);


    public RadiusDrawable(Context context, float radius){
        this.radius = radius;
        this.context = context;
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override
    public void draw(Canvas canvas) {

        Resources r = context.getResources();
        float px = TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, radius, r.getDisplayMetrics());
        canvas.drawRoundRect(new RectF(0, 0, canvas.getWidth(), canvas.getHeight()), px, px, paint);

    }

    @Override
    public void setAlpha(int alpha) {

    }

    @Override
    public void setColorFilter(ColorFilter cf) {

    }

    @Override
    public int getOpacity() {
        return 1;
    }
}
