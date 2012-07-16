package com.birk5437.discgolf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.os.Bundle;
import java.util.LinkedList;
import java.lang.Math;
import android.content.Intent;
import android.app.Activity;
import 	android.app.AlertDialog;
import 	android.view.LayoutInflater;
import android.widget.TextView;
import android.content.SharedPreferences;
import android.app.Activity;


public class GameView extends View {

  private Paint paint;
  private Activity parentContext;
  private Context myContext;

  private int xMin = 0;
  private int xMax;
  private int yMin = 0;
  private int yMax;

  public GameView(Context context) {
    super(context);
    //parentContext = context;
    parentContext = (Activity)context;
    myContext = this.getContext();

    paint = new Paint();
    this.setFocusable(true);
    this.requestFocus();
    this.setFocusableInTouchMode(true);
  }

  @Override
  protected void onDraw(Canvas canvas) {
    RectF oval = new RectF(xMax/2 - 5, yMax/2 - 5, xMax/2 + 5, yMax/2 + 5);
    canvas.drawOval(oval, paint);
  }

  private void update() {

  }

  @Override
  public void onSizeChanged(int w, int h, int oldW, int oldH) {
    // Set the movement bounds for the ball
    xMax = w-1;
    yMax = h-1;
  }

}