

package com.example.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;

public class LineView extends View {
    private Paint paint;
    private Paint bpaint;

    public LineView(Context context) {
        super(context);

        // Red background paint
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL);

        // Blue transparent paint
        bpaint = new Paint();
        bpaint.setColor(Color.BLUE);
        bpaint.setAlpha(0); // Fully transparent
        bpaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR)); // Clears pixels
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw red background
        canvas.drawRect(0, 0, getWidth(), getHeight(), paint);

        // Clear blue area (transparent effect)
        canvas.drawRect(100, 100, 380, 860, bpaint); // Adjust position/size as needed
    }
}

