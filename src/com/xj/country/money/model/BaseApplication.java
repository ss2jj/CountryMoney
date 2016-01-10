package com.xj.country.money.model;

import com.xj.country.money.util.Const;

import cn.bmob.v3.Bmob;
import android.app.Application;

public class BaseApplication extends Application {
	public BaseApplication() {
		// TODO Auto-generated constructor stub
		Bmob.initialize(this, Const.ApplicationID);
	}

}
