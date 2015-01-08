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


    public RadiusDrawable(){
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.FILL);
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public void draw(Canvas canvas) {
        canvas.drawRoundRect(new RectF(0, 0, canvas.getWidth(), canvas.getHeight()), getRadius(), getRadius(), paint);

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
