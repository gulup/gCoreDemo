package com.gulup.gcoredemo;

import org.gulup.annotation.GContentView;
import org.gulup.annotation.GView;
import org.gulup.core.GData;
import org.gulup.view.GBaseView;

import android.os.Bundle;
import android.widget.TextView;

@GContentView(R.layout.second_activity)
public class SecondView extends GBaseView {
    
    @GView(R.id.test)
    private TextView test;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        test.setText("这是网络可用的界面");
    }

    @Override
    public void requestSuccess(GData data) {
    }

    @Override
    public void requestFail(GData data) {
    }

}
