package com.baitu.testretrofit.block;


import com.baitu.testretrofit.bean.JavaBean;
import com.baitu.testretrofit.bean.SearchBean;
import com.baitu.testretrofit.network.response.Response;

import java.util.List;

import io.reactivex.Observable;

/**
 * Created by Zaifeng on 2018/3/1.
 */

public class Contract {

    public interface Persenter {
        public void getCarList(String name);
    }

    public interface View {
        void getDataSuccess(List<SearchBean> data);
        void getDataFail(Throwable throwable);
    }

    public interface Model {
        public Observable<Response<List<SearchBean>>> getCarList(String name);
    }

}
