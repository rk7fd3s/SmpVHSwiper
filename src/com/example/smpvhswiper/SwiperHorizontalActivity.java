package com.example.smpvhswiper;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.DirectionalViewPager;
import android.util.Log;

import com.example.smpvhswiper.fragment.SwiperVertical;

public class SwiperHorizontalActivity extends FragmentActivity {
	private String TAG = "MainActivity";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.swiper_horizontal);

		final DirectionalViewPager pager = (DirectionalViewPager) findViewById(R.id.horizontal_pager);
		Log.d(TAG, "onCreate");
		
		SwiperHorisontalAdapter swiperHorisontalAdapter = new SwiperHorisontalAdapter(getSupportFragmentManager());
		pager.setAdapter(swiperHorisontalAdapter);
	}

	private static class SwiperHorisontalAdapter extends FragmentStatePagerAdapter {
		private String TAG = "MainActivity_MyPagerAdapter";

		public SwiperHorisontalAdapter(FragmentManager fm) {
			super(fm);
		}

		@Override
		public Fragment getItem(int position) {
			Log.d(TAG, "getItem" + Integer.toString(position));
			SwiperVertical ins = SwiperVertical.newInstance(position);
			return ins;
		}

		@Override
		public int getCount() {
			return 5;
		}
	}
}
