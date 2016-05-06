package com.example.game2048;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.GridLayout;

public class GameView extends GridLayout {

	public GameView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		
		initGameView();
	}

	public GameView(Context context) {
		super(context);
		
		initGameView();
	}

	public GameView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		initGameView();
	}
	
	private void initGameView() {
		setOnTouchListener(new View.OnTouchListener() {
			
			private float startX, startY, offsetX, offsetY;
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				
				switch (event.getAction()) {
				case MotionEvent.ACTION_DOWN:
					startX = event.getX();
					startY = event.getY();
					break;
				case MotionEvent.ACTION_UP:
					offsetX = event.getX() - startX;
					offsetY = event.getY() - startY;
					
					if (Math.abs(offsetX) > Math.abs(offsetY)) {
						// 向左
						if (offsetX < -5) {
							swipeLeft();
//							System.out.println("left");
						// 向右	
						} else if (offsetX > 5) {
							swipeRight();
//							System.out.println("right");
						}
					} else {
						// 向上
						if (offsetY < -5) {
							swipeUp();
//							System.out.println("up");
						// 向下	
						} else if (offsetY > 5) {
							swipeDown();
//							System.out.println("down");
						}
					}
					
					break;
				default:
					break;
				}
				
				return true;
			}
		});
	}
	
	private void swipeLeft() {
		
	}
	
	private void swipeRight() {
		
	}
	
	private void swipeUp() {
		
	}
	
	private void swipeDown() {
		
	}
	

}
