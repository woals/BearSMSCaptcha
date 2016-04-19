package com.bear.smscaptcha;

import android.app.Application;

import com.thinkland.sdk.util.CommonFun;

public class MyApplication extends Application {

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		super.onCreate();

		// 在使用SDK各组件之前初始化context信息，传入ApplicationContext
		// 注意该方法要再setContentView方法之前实现
		/**
		 * 初始化方法
		 *
		 * @param context
		 * @needFriends 是否需要好友功能
		 */

		CommonFun.initialize(getApplicationContext(), false);
	}

}
