

package com.example.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.view.View;

public class LineView extends View {
       private Paint bpaint;

    public LineView(Context context) {
        super(context);

        
        // Blue transparent paint
        bpaint = new Paint();
       // Semi-transparent red (alpha = 128 out of 255)
bpaint.setColor(Color.argb(240,0, 70, 60));
       


         }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        // Draw red background
        
        // Clear blue area (transparent effect)
        canvas.drawRect(0, 0, 480, 960, bpaint); // Adjust position/size as needed
    }
}

