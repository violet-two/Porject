package ws.com.porject.adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import ws.com.porject.bean.GoodsInfo;
import ws.com.porject.fragment.ImageFragment;

public class ImagePagerAdapter extends FragmentPagerAdapter {
    private final List<GoodsInfo> mGoodsInfo;

    public ImagePagerAdapter(FragmentManager supportFragmentManager, List<GoodsInfo> goodsInfo) {
        super(supportFragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.mGoodsInfo = goodsInfo;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        GoodsInfo info = mGoodsInfo.get(position);
        return ImageFragment.newInstance(position,info.pic);
    }


    @Override
    public int getCount() {
        return mGoodsInfo.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mGoodsInfo.get(position).name;
    }
}
