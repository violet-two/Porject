package ws.com.porject.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import ws.com.porject.fragment.BodyFragment;

public class SectionPagerAdapter extends FragmentPagerAdapter {

    public SectionPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        return BodyFragment.newInstance(position+1);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    //解决滑动不出现图片问题
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }
}
