package ws.com.porject.util;

import static java.net.HttpURLConnection.HTTP_OK;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

import java.io.Serializable;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import ws.com.porject.bean.BeanData;

public class HttpUtil {
    private static String BASE_URL = "http://119.96.82.181:8081/WS_Administration";
    private static String TAG = "HttpUtil";

    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://vote.wushang.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    public static Retrofit getRetrofit(){
        return retrofit;
    }

    public static void loginTask(Handler handler, Call<BeanData> task){
        task.enqueue(new Callback<BeanData>() {
            @Override
            public void onResponse(Call<BeanData> call, Response<BeanData> response) {
                if (response.code() == HTTP_OK) {
                    try {
                        BeanData result = response.body();
//                        Log.d(TAG, "onResponse: "+result);
                        Message msg = new Message();
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("result",result);
                        msg.setData(bundle);
                        handler.sendMessage(msg);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<BeanData> call, Throwable t) {
                Log.d(TAG, "onResponse: " + t);
            }
        });
    }
}
