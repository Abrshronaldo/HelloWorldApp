
package com.example.helloworld;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class LineView extends View {
    private Paint paint;

    public LineView(Context context) {
        super(context);
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(4);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawLine(100, 200, 350, 200, paint);
       canvas.drawLine(100, 200 ,100 ,450, paint);       
      canvas.drawLine(350, 200 ,350 ,450 ,paint);
     canvas.drawLine(100 ,450, 350, 450 ,paint);
    }
}
                                                                                                                                                                    
