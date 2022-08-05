package ws.com.porject;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ws.com.porject.adapter.SectionPagerAdapter;

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

        //定义适配器
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        goodsInfoViewPager.setAdapter(adapter);
        //解决滑动冲突问题
        goodsInfoViewPager.setOffscreenPageLimit(3);
    }



    public void addShoppingCar(View view) {
        Toast.makeText(this, "加入购物车成功", Toast.LENGTH_SHORT).show();
    }


    public void reBack(View view) {
        finish();
    }


}