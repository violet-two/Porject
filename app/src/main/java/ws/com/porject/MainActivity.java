package ws.com.porject;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import ws.com.porject.adapter.SectionPagerAdapter;
import ws.com.porject.api.GoodsInfoAPI;
import ws.com.porject.service.GoodsInfoService;
import ws.com.porject.util.HttpUtil;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    public PopupWindow popupWindow;
    private View root;


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
        //更改状态栏颜色 改为黑色
        Window window = this.getWindow();
        window.getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);

        //弹出menu菜单
        root = this.getLayoutInflater().inflate(R.layout.popupwindow_menu, null);
        popupWindow = new PopupWindow(root, 300, 550);
        //设置失去焦点事件
        popupWindow.setFocusable(true);

    }

    @Override
    public void onClick(View view) {

    }
    public void addShoppingCar(View view) {
        Toast.makeText(this, "加入购物车成功", Toast.LENGTH_SHORT).show();
    }
    public void reBack(View view) {
        finish();
    }
    public void showMenu(View view) {
        popupWindow.setFocusable(true);
        popupWindow.showAsDropDown(view);
        popupWindow.showAtLocation(findViewById(R.id.menu), Gravity.CENTER, 20, 20);
    }

}