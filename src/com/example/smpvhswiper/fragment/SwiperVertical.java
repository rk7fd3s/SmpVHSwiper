package com.example.smpvhswiper.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.DirectionalViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.smpvhswiper.R;

public class SwiperVertical extends Fragment {
	private String TAG = "PagerFragment";
	private int position;

	private LinearLayout layout;
	private SwiperVerticalAdapter swiperVerticalAdapter;
	private DirectionalViewPager pager;

	public static SwiperVertical newInstance(final int position) {
		SwiperVertical fragment = new SwiperVertical();
		fragment.position = position;

		return fragment;
	}

	@Override
	public View onCreateView(final LayoutInflater inflater,
			final ViewGroup container, final Bundle savedInstanceState) {

		layout = (LinearLayout) inflater.inflate(R.layout.swiper_vertical,
				container, false);

		// final View view = inflater.inflate(R.layout.swiper_vertical, null);
		pager = (DirectionalViewPager) layout.findViewById(R.id.vertical_pager);

		Log.d(TAG, "onCreateView");
		if (swiperVerticalAdapter == null) {
			swiperVerticalAdapter = new SwiperVerticalAdapter(
					getChildFragmentManager(), position);
		}
		pager.setAdapter(swiperVerticalAdapter);

		// layout = (LinearLayout)
		// inflater.inflate(R.layout.fragment_lower,container, false);

		return layout;
	}

	/***
	 * Fragmentの初期化処理を行う
	 */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.d(TAG, "onCreate");
	}

	/***
	 * 親となるActivityの「onCreate」の終了を知らせる
	 */
	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		Log.d(TAG, "onActivityCreated");
	}

	/***
	 * Activityの「onStart」に基づき開始される
	 */
	@Override
	public void onStart() {
		super.onStart();
		Log.d(TAG, "onStart");
	}

	/***
	 * Activityの「onResume」に基づき開始される
	 */
	@Override
	public void onResume() {
		super.onResume();
		Log.d(TAG, "onResume");
	}

	/***
	 * Activityが「onPause」になった場合や、Fragmentが変更更新されて操作を受け付けなくなった場合に呼び出される
	 */
	@Override
	public void onPause() {
		super.onPause();
		Log.d(TAG, "onPause");
	}

	/***
	 * フォアグラウンドでなくなった場合に呼び出される
	 */
	@Override
	public void onStop() {
		super.onStop();
		Log.d(TAG, "onStop");
	}

	/***
	 * Fragmentの内部のViewリソースの整理を行う
	 */
	@Override
	public void onDestroyView() {
		super.onDestroyView();
		Log.d(TAG, "onDestroyView");
	}

	/***
	 * Fragmentが破棄される時、最後に呼び出される
	 */
	@Override
	public void onDestroy() {
		super.onDestroy();
		Log.d(TAG, "onDestroy");
	}

	/***
	 * Activityの関連付けから外された時に呼び出される
	 */
	@Override
	public void onDetach() {
		super.onDetach();
		Log.d(TAG, "onDetach");
	}

	private static class SwiperVerticalAdapter extends
			FragmentStatePagerAdapter {
		private String TAG = "MyPagerAdapter";
		private int number;

		public SwiperVerticalAdapter(FragmentManager fm, int number) {
			super(fm);
			Log.d(TAG, fm.toString());
			
			this.number = number;
		}

		@Override
		public Fragment getItem(int position) {
			Log.d(TAG, "getItem" + Integer.toString(position));

			switch (position) {
			case 0:
				return FragmentUpper.newInstance(number);
			default:
				return FragmentLower.newInstance(number);
			}
		}

		@Override
		public int getCount() {
			return 2;
		}
	}
}
