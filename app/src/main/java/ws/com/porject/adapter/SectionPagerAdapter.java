package ws.com.porject.adapter;

import androidx.annotation.NonNull;
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
}
