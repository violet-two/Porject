package ws.com.porject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import org.w3c.dom.Text;

import ws.com.porject.adapter.SectionPagerAdapter;
import ws.com.porject.fragment.BodyFragment;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout goodsTitleTabLayout = findViewById(R.id.goodsTitle_tabLayout);
        ViewPager goodsInfoViewPager = findViewById(R.id.goodsInfo_viewPager);

        //关联goodsTitle和goodsInfoViewPager
        goodsInfoViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(goodsTitleTabLayout));
        goodsTitleTabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(goodsInfoViewPager));


        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        goodsInfoViewPager.setAdapter(adapter);

    }

    public void addShoppingCar(View view) {
        Toast.makeText(this,"加入购物车成功",Toast.LENGTH_SHORT).show();
    }


    public void reBack(View view) {
        finish();
    }


}