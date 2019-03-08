package com.baitu.testretrofit.block;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.baitu.testretrofit.R;
import com.baitu.testretrofit.bean.JavaBean;
import com.baitu.testretrofit.bean.SearchBean;
import com.baitu.testretrofit.network.schedulers.SchedulerProvider;
import com.google.gson.Gson;

import java.util.List;


/**
 * Created by yxs on 2018/3/1.
 */

public class ViewActivity extends AppCompatActivity implements Contract.View {

    private Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout);
        presenter = new Presenter(new Model(), this, SchedulerProvider.getInstance());
        findViewById(R.id.btnRequest).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnRequest(v);
            }
        });
    }

    /**
     * 按钮的点击事件,在xml文件中已经注册
     * @param view
     */
    public void btnRequest(View view) {
        presenter.getList();
    }

    @Override
    public void getDataSuccess(List<SearchBean> data) {
        System.out.println("获取数据成功"+new Gson().toJson(data));
    }

    @Override
    public void getDataFail(Throwable throwable) {
        System.out.println("数据获取失败"+new Gson().toJson(throwable));
    }
}
