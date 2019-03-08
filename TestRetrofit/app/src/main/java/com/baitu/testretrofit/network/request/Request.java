package com.baitu.testretrofit.network.request;


import com.baitu.testretrofit.bean.JavaBean;
import com.baitu.testretrofit.bean.SearchBean;
import com.baitu.testretrofit.network.response.Response;

import java.util.List;
import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

/**
 * Created by yxs on 2018/2/28.
 * 封装请求的接口
 */
public interface Request {

    public static String HOST = "http://api.apiopen.top/";

    @GET("searchAuthors?")
    Observable<Response<List<SearchBean>>> getList(@QueryMap Map<String,String> params);


}
