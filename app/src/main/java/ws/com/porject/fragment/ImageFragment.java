package ws.com.porject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import ws.com.porject.R;
import ws.com.porject.adapter.ImagePagerAdapter;
import ws.com.porject.bean.GoodsInfo;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ImageFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ImageFragment extends Fragment {
    private static final String TAG = "ImageFragment";


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ImageFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static ImageFragment newInstance(int position,int pic_id) {
        ImageFragment fragment = new ImageFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        args.putInt("pic_id", pic_id);
        fragment.setArguments(args);
        return fragment;
    }

    //从包裹取出位置号
    private int getPosition(){
        return getArguments().getInt("position");
    }
    private int getPicId(){
        return getArguments().getInt("pic_id");
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_image, container, false);
        Bundle arguments = getArguments();
        if(arguments!=null){
            ImageView iv_pic = view.findViewById(R.id.iv_pic);
            iv_pic.setImageResource(arguments.getInt("pic_id",0));
        }
        Log.d(TAG,"onCreateView position="+getPosition());
        Log.d(TAG,"onCreateView position="+getPicId());
        return view;
    }
}