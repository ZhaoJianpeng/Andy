package com.thundersoft.gifdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

import com.ant.liao.GifView;
import com.ant.liao.GifView.GifImageType;

public class MainActivity extends Activity {
	//.......nihao 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		GifView mGifView = (GifView) findViewById(R.id.gifView);

		// ����GifͼƬԴ


		
		// ��Ӽ�����
		mGifView.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				
			}
		});
		// ������ʾ�Ĵ�С���������ѹ��
		mGifView.setShowDimension(300, 300);
		// ���ü��ط�ʽ���ȼ��غ���ʾ���߼��ر���ʾ��ֻ��ʾ��һ֡����ʾ
		mGifView.setGifImageType(GifImageType.WAIT_FINISH);
	}

}
