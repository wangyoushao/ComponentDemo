package com.loong.login;

import android.app.Application;

import com.loong.base.BaseApp;
import com.loong.componentbase.ServiceFactory;

public class LoginApp extends BaseApp {

    @Override
    public void onCreate() {//组件化时不走这个生命周期
        super.onCreate();
        initModuleApp(this);
        initModuleData(this);
    }

    @Override
    public void initModuleApp(Application application) {
        ServiceFactory.getInstance().setAccountService(new AccountService());
    }

    @Override
    public void initModuleData(Application application) {

    }
}
