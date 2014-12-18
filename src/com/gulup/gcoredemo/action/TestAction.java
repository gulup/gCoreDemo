package com.gulup.gcoredemo.action;

import org.gulup.core.ext.NativeHandleAction;
import org.gulup.utils.OtherUtil;

import com.gulup.gcoredemo.SecondView;

import android.content.Context;

public class TestAction extends NativeHandleAction {

    public TestAction(Context context) {
	super(context);
    }

    public void checkNetWork(){
	if(!OtherUtil.checkNetworkState(context)){
	    changedNativeData(1, true);
	}else{
	    changeView(context, SecondView.class, true);
	}
    }
    
}
