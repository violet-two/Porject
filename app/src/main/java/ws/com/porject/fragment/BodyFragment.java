package ws.com.porject.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import java.io.Serializable;
import java.util.ArrayList;

import ws.com.porject.R;
import ws.com.porject.adapter.ImagePagerAdapter;
import ws.com.porject.api.GoodsInfoAPI;
import ws.com.porject.bean.GoodsInfo;
import ws.com.porject.service.GoodsInfoService;
import ws.com.porject.util.HttpUtil;

public class BodyFragment extends Fragment implements View.OnClickListener {


    private static final String TAG = "BodyFragment";
    private TextView mNum;
    private int num = 1;
    private TextView plus;
    private TextView minus;
    private TextView selectNum;
    private ViewPager goodsInfoImageViewPager;
    private View inflate;
    private TextView minusByPop;
    private TextView plusByPop;
    private TextView numByPop;
    private Serializable result;
    private static GoodsInfoAPI api;

    public BodyFragment() {
    }

    public static BodyFragment newInstance(int sectionNumber) {
        BodyFragment fragment = new BodyFragment();
        Bundle args = new Bundle();
        args.putInt("position", sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    //从包裹取出位置号
    private int getPosition() {
        return getArguments().getInt("position");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        result = getArguments().getSerializable("result");
    }

    private ArrayList<GoodsInfo> mGoodsList = GoodsInfo.getDefaultList();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        inflate = null;
        api = HttpUtil.getRetrofit().create(GoodsInfoAPI.class);
        if (getPosition() == 1) {
            inflate = inflater.inflate(R.layout.fragment_goods_info, container, false);
            GoodsInfoService.goodsInfo(inflate,api,1);
            Log.d(TAG, "onCreateView: "+result);
            //初始化商品信息视图
            initGoodsView();

//        ImageFragment imageFragment = new ImageFragment();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.goodsInfoImageViewPager, imageFragment, "imageFragment");
//        fragmentTransaction.commit();
            //定义适配器
            FragmentManager fragmentManager = getFragmentManager();
            ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(fragmentManager, mGoodsList);
            goodsInfoImageViewPager.setAdapter(imagePagerAdapter);
            //解决滑动冲突问题
            goodsInfoImageViewPager.setOffscreenPageLimit(mGoodsList.size());
            //默认页面为0
            goodsInfoImageViewPager.setCurrentItem(0);
        }
        if (getPosition() == 2) {
            inflate = inflater.inflate(R.layout.fragment_details, container, false);
            GoodsInfoService.goodsInfo(inflate,api, 2);
        }
        if (getPosition() == 3) {
            inflate = inflater.inflate(R.layout.fragment_evaluate, container, false);
        }
        return inflate;
    }

    private void initGoodsView() {
        //初始化activity_main.xml的添加减少件数视图
        mNum = inflate.findViewById(R.id.num);
        plus = inflate.findViewById(R.id.plus);
        minus = inflate.findViewById(R.id.minus);
        selectNum = inflate.findViewById(R.id.selectNum);
        TextView buyNow = getActivity().findViewById(R.id.buyNow);
        //初始化activity_main.xml的添加减少件数点击事件
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        mNum.setOnClickListener(this);
        buyNow.setOnClickListener(this);
        //初始化popupwindow_buy_goods.xml视图
        mInflateGoods = this.getLayoutInflater().inflate(R.layout.popupwindow_buy_goods, null);
        mPopGoods = new PopupWindow(mInflateGoods, LinearLayoutCompat.LayoutParams.MATCH_PARENT,
                LinearLayoutCompat.LayoutParams.WRAP_CONTENT, true);
        goodsInfoImageViewPager = inflate.findViewById(R.id.goodsInfoImageViewPager);
        numByPop = mInflateGoods.findViewById(R.id.numByPop);
        minusByPop = mInflateGoods.findViewById(R.id.minusByPop);
        plusByPop = mInflateGoods.findViewById(R.id.plusByPop);
        TextView nowBuy = mInflateGoods.findViewById(R.id.nowBuy);
        //初始化popupwindow_buy_goods.xml点击事件
        minusByPop.setOnClickListener(this);
        plusByPop.setOnClickListener(this);
        nowBuy.setOnClickListener(view -> {
            Toast.makeText(getContext(),"购买成功",Toast.LENGTH_SHORT).show();
            mPopGoods.dismiss();
        });
    }


    private View mInflateGoods;
    private PopupWindow mPopGoods;

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.plus:
            case R.id.plusByPop:
                num++;
                mNum.setText(String.valueOf(num));
                selectNum.setText(num + "件");
                numByPop.setText(String.valueOf(num));
                break;
            case R.id.minus:
            case R.id.minusByPop:
                if (num <= 1) ;
                else {
                    num--;
                    mNum.setText(String.valueOf(num));
                    selectNum.setText(num + "件");
                    numByPop.setText(String.valueOf(num));
                }
                break;
            case R.id.num:
            case R.id.buyNow:
                buyGoods();
                break;
        }
    }

    public void buyGoods() {
        mPopGoods.showAtLocation(mInflateGoods, Gravity.BOTTOM, 0, 0);
        backgroundAlpha(0.75f);
        mPopGoods.setOnDismissListener(new PopupWindow.OnDismissListener() {
            @Override
            public void onDismiss() {
                backgroundAlpha(1f);
            }
        });
    }

    public void backgroundAlpha(float bgAlpha) {
        WindowManager.LayoutParams lp = getActivity().getWindow().getAttributes();
        lp.alpha = bgAlpha; // 0.0~1.0
        getActivity().getWindow().setAttributes(lp);
    }



}