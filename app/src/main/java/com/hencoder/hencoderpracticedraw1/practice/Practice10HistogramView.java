package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    public Practice10HistogramView(Context context) {
        super(context);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paintLine = new Paint();
    Paint paintRect = new Paint();
    Paint paintText = new Paint();

    int widthLeft = 120;
    int widthRight = widthLeft + 100;
    int height = 300;
    int widthText = 140;

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        paintLine.setColor(Color.WHITE);
        canvas.drawLine(100, 50, 100, 600, paintLine);
        canvas.drawLine(100, 600, getWidth() - 100, 600, paintLine);
//        System.out.println("getWidth::"+getWidth());//1080

        //画矩形
        paintRect.setStyle(Paint.Style.FILL);
        paintRect.setColor(Color.GREEN);
        canvas.drawRect(widthLeft, height, widthRight, 600, paintRect);
        for (int i = 0; i < 6; i++) {
            widthLeft = widthRight + 20;
            widthRight = widthLeft + 100;
            height = height - 20;
            canvas.drawRect(widthLeft, height, widthRight, 600, paintRect);
        }

        //绘制文字
        paintText.setColor(Color.WHITE);
        paintText.setTextSize(26);
        canvas.drawText("Froyo", widthText,625,paintText );

        widthText = widthText+120;
        canvas.drawText("GB",widthText,625,paintText);

        widthText = widthText+120;
        canvas.drawText("ICS",widthText,625,paintText);

        widthText = widthText+120;
        canvas.drawText("JB",widthText,625,paintText);

        widthText = widthText+120;
        canvas.drawText("KITKAT",widthText,625,paintText);

        widthText = widthText+120;
        canvas.drawText("L",widthText,625,paintText);

        widthText = widthText+120;
        canvas.drawText("M",widthText,625,paintText);

    }
}
