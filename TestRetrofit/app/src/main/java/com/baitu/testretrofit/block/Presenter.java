package com.baitu.testretrofit.block;



import com.baitu.testretrofit.network.response.ResponseTransformer;
import com.baitu.testretrofit.network.schedulers.BaseSchedulerProvider;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

/**
 * Created by yxs on 2018/3/1.
 */

public class Presenter {

    private Model model;

    private Contract.View view;

    private BaseSchedulerProvider schedulerProvider;

    private CompositeDisposable mDisposable;

    public Presenter(Model model,
                     Contract.View view,
                     BaseSchedulerProvider schedulerProvider) {
        this.model = model;
        this.view = view;
        this.schedulerProvider = schedulerProvider;
        mDisposable = new CompositeDisposable();
    }

    public void despose(){
        mDisposable.dispose();
    }

    /**
     * 获取数据
     */
    public void getList() {

        Disposable disposable = model.getCarList("李白")
                .compose(ResponseTransformer.handleResult())
                .compose(schedulerProvider.applySchedulers())
                .subscribe(carBeans -> {
                    // 处理数据 直接获取到List<JavaBean> carBeans
                    view.getDataSuccess(carBeans);
                }, throwable -> {
                    // 处理异常
                    view.getDataFail(throwable);
                });

        mDisposable.add(disposable);
    }

}
