package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    public Practice11PieChartView(Context context) {
        super(context);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint3 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint4 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint5 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint6 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paintText = new Paint(Paint.ANTI_ALIAS_FLAG);

    //画线
    Paint paintLine = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path mPath1 = new Path();
    Path mPath2 = new Path();
    Path mPath3 = new Path();
    Path mPath4 = new Path();
    Path mPath5 = new Path();
    Path mPath6 = new Path();
    Path mPath7 = new Path();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图

        //绘制扇形
        //红色
        paint1.setColor(Color.RED);
        canvas.drawArc(190, 80, 680, 600, -60, -120, true, paint1);

        //土黄色
        paint2.setColor(Color.parseColor("#FF9933"));
        canvas.drawArc(200, 100, 700, 600, -60, 55, true, paint2);

        //紫红色
        paint3.setColor(Color.parseColor("#663399"));
        canvas.drawArc(200, 100, 700, 600, -2, 8, true, paint3);

        //灰色
        paint4.setColor(Color.GRAY);
        canvas.drawArc(200, 100, 700, 600, 10, 5, true, paint4);

        //墨绿
        paint5.setColor(Color.parseColor("#009933"));
        canvas.drawArc(200, 100, 700, 600, 18, 60, true, paint5);

        //蓝色
        paint6.setColor(Color.BLUE);
        canvas.drawArc(200, 100, 700, 600, 80, 100, true, paint6);

        paintText.setColor(Color.WHITE);
        paintText.setTextSize(30);
        canvas.drawText("饼图", 400, 700, paintText);


        //画线
        paintLine.setColor(Color.WHITE);
        paintLine.setStyle(Paint.Style.STROKE);
        mPath1.moveTo(110,100);//移动到当前点
        mPath1.lineTo(280, 100);//从当前点移动
        mPath1.rLineTo(30,30);
        canvas.drawPath(mPath1, paintLine);
        canvas.drawText("Lollipop",10,100,paintText);

    }
}
