
package com.example.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class LineView extends View {
    private Paint paint;
   private Paint bpaint;
    public LineView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(4);
    bpaint =new Paint();
    bpaint.setColor(Color.BLUE);
         
}

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(0, 0, 480, 960, paint);
        canvas.drawRect(0, 0, 480, 960, bpaint);

    }

}
                                                                                                                                                                    
