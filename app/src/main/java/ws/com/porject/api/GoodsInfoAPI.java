package ws.com.porject.api;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.QueryMap;
import ws.com.porject.bean.BeanData;

public interface GoodsInfoAPI {

    @POST("/phone_page/product/product_handler.jsp")
    Call<BeanData> goodsInfo(@QueryMap HashMap<String, String> params);
}
