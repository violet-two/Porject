package ws.com.porject.service;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.bumptech.glide.Glide;

import java.util.HashMap;

import retrofit2.Call;
import ws.com.porject.R;
import ws.com.porject.api.GoodsInfoAPI;
import ws.com.porject.bean.BeanData;
import ws.com.porject.util.HttpUtil;

public class GoodsInfoService {
    private static String TAG = "HttpUtil";
    private static Handler handler;


    @SuppressLint("HandlerLeak")
    public static void goodsInfo(View view, GoodsInfoAPI api, int page) {
        handler = new Handler() {
            @Override
            public void handleMessage(@NonNull Message msg) {
                Bundle args = msg.getData();
                BeanData result = (BeanData) args.getSerializable("result");
                Log.d(TAG, "GoodsInfoService: "+result);
                if(page==1){
                    ((TextView)view.findViewById(R.id.storeName)).setText(result.getMerchantName());
                    ((TextView)view.findViewById(R.id.goodsNameAndId)).setText(result.getProductName());
                    ((TextView)view.findViewById(R.id.price)).setText("￥"+result.getBaseMemberPrice());
                }
                else if(page==2){
                    ImageView detailsImage = view.findViewById(R.id.detailsImage);
                    Glide.with(view.getContext()).load(result.getDetailNoticeImageUrl()).into(detailsImage);
                }
            }
        };
        HashMap<String, String> params = new HashMap<>();
        params.put("id", "p_1650067");
        params.put("imageSize", "1080X900");
        Call<BeanData> task = api.goodsInfo(params);
        HttpUtil.loginTask(handler, task);
    }
}
