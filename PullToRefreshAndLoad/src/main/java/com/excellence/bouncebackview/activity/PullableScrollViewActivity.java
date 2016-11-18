package com.excellence.bouncebackview.activity;


import android.app.Activity;
import android.os.Bundle;

import com.excellence.bouncebackview.MyListener;
import com.excellence.bouncebackview.PullToRefreshLayout;
import com.excellence.bouncebackview.R;

public class PullableScrollViewActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_scrollview);
		((PullToRefreshLayout) findViewById(R.id.refresh_view))
		.setOnRefreshListener(new MyListener());
	}
}
