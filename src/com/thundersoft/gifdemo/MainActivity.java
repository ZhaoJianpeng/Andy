package com.thundersoft.gifdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.ant.liao.GifView;
import com.ant.liao.GifView.GifImageType;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		GifView mGifView = (GifView) findViewById(R.id.gifView);

		// 设置Gif图片源


		
		// 添加监听器
		mGifView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
			}
		});
		// 设置显示的大小，拉伸或者压缩
		mGifView.setShowDimension(300, 300);
		// 设置加载方式：先加载后显示、边加载边显示、只显示第一帧再显示
		mGifView.setGifImageType(GifImageType.WAIT_FINISH);
	}

}
