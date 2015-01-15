package com.villoro.sunshine;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by Arnau on 14/01/2015.
 */
public class MyView extends View {
    public MyView(Context context){
        super(context);
    }
    public MyView(Context context, AttributeSet attrs){
        super(context, attrs);
    }
    public MyView(Context context, AttributeSet attrs, int DefaultStyle)
    {
        super(context, attrs, DefaultStyle);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int x = getWidth();
        int y = getHeight();

        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        canvas.drawRect(0, 0, x/2, y, paint);

    }
}
