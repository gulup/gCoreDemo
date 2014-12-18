package com.gulup.gcoredemo;

import org.gulup.annotation.GAction;
import org.gulup.annotation.GContentView;
import org.gulup.annotation.GView;
import org.gulup.core.GData;
import org.gulup.utils.ScreenUtil;
import org.gulup.view.GBaseView;

import com.gulup.gcoredemo.action.TestAction;

import android.os.Bundle;
import android.widget.TextView;

@GContentView(R.layout.activity_main)
public class MainActivity extends GBaseView {

    @GView(R.id.test)
    private TextView test;
    
    @GAction
    private TestAction action;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
	ScreenUtil.initScreen(this, 720, 1280);
        super.onCreate(savedInstanceState,false);
    }

    @Override
    public void init() {
	action.checkNetWork();
    }
    
    @Override
    public void requestSuccess(GData data) {
	switch (data.getRequestType()) {
	case 1:
	    test.setText("网络不可用");
	    break;
	default:
	    break;
	}
    }

    @Override
    public void requestFail(GData data) {
	
    }
}
