package com.example.smpvhswiper;

import java.util.Arrays;
import java.util.List;

import com.example.smpvhswiper.fragment.SwiperVertical;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.DirectionalViewPager;
import android.util.Log;

public class SwiperHorizontalActivity extends FragmentActivity {
	private String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.swiper_horizontal);

		final DirectionalViewPager pager = (DirectionalViewPager) findViewById(R.id.horizontal_pager);
		Log.d(TAG, "onCreateView");
		pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
	}

	private static class MyPagerAdapter extends FragmentStatePagerAdapter {
		private String TAG = "MainActivity_MyPagerAdapter";

		private List<SwiperVertical> fragments;

		public MyPagerAdapter(FragmentManager fm) {
			super(fm);

			fragments = Arrays.asList(
					new SwiperVertical(1),
					new SwiperVertical(2), // 上下にスワイプするフラグメント
					new SwiperVertical(3), 
					new SwiperVertical(4),
					new SwiperVertical(5));
		}

		@Override
		public Fragment getItem(int position) {
			Log.d(TAG, "getItem" + Integer.toString(position));
			return fragments.get(position);
		}

		@Override
		public int getCount() {
			return fragments.size();
		}
	}
}
