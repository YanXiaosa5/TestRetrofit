package com.baitu.testretrofit.block;


import com.baitu.testretrofit.bean.JavaBean;
import com.baitu.testretrofit.bean.SearchBean;
import com.baitu.testretrofit.network.NetWorkManager;
import com.baitu.testretrofit.network.response.Response;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import io.reactivex.Observable;

/**
 * Created by yxs on 2018/3/1.
 */

public class Model implements Contract.Model {

    @Override
    public Observable<Response<List<SearchBean>>> getCarList(String name) {
        Map<String,String> params = new HashMap<>();
        params.put("name",name);
        return NetWorkManager.getRequest().getList(params);
    }

}
