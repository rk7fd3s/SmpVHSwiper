package com.example.smpvhswiper.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.smpvhswiper.R;
import com.example.smpvhswiper.item.ItemLower;

public class FragmentLower extends Fragment {
	private static String TAG = "FragmentLower";
	private static ItemLower item;

    private TextView lblText = null;

    public static FragmentLower newInstance(final int position) {
    	FragmentLower fragment = new FragmentLower();
    	setItem(ItemLower.newInstance(position));
    	
		return fragment;
    }

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.d(TAG, "onCreateView");

		LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_lower,container, false);

		lblText = (TextView) layout.findViewById(R.id.lblText);
		lblText.setText(getItem().getText());
		
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

	/**
	 * @return item
	 */
	public static ItemLower getItem() {
		return item;
	}

	/**
	 * @param item セットする item
	 */
	public static void setItem(ItemLower item) {
		FragmentLower.item = item;
	}
}
