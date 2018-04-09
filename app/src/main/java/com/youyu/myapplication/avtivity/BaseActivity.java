package com.youyu.myapplication.avtivity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by Administrator on 2018/4/9.
 */

public abstract class BaseActivity extends AppCompatActivity{
    private Toast mToast;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutRes());
        initViews();
    }

    protected abstract void initViews();
    protected abstract int getLayoutRes();
    public void showToast(String msg){
        if(mToast==null){
            mToast=Toast.makeText(this,"",Toast.LENGTH_SHORT);
        }
        mToast.setText(msg);
        mToast.show();
    }


}
