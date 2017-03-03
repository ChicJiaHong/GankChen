package com.cjh.gank.net;

import com.cjh.gank.entity.MeiZi;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Administrator on 2017/3/2.
 */

public interface GankApi {

    @GET("data/福利/{count}/1")
    Call<List<MeiZi>> getMeiZi(@Path("count") int count);

}
