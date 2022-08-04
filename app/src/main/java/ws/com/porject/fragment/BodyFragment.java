package ws.com.porject.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ws.com.porject.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BodyFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BodyFragment extends Fragment implements View.OnClickListener {


    private TextView mNum;
    private int num = 1;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_SECTION_NUMBER = "section_number";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private int sectionNumber;
    private TextView plus;
    private TextView minus;
    private TextView selectNum;

    public BodyFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static BodyFragment newInstance(int sectionNumber) {
        BodyFragment fragment = new BodyFragment();
        Bundle args = new Bundle();
        args.putInt("position",sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    //从包裹取出位置号
    private int getPosition(){
        return getArguments().getInt("position");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View inflate = null;
        if(getPosition()==1){
            inflate = inflater.inflate(R.layout.fragment_goods_info, container, false);
            mNum = inflate.findViewById(R.id.num);
            plus = inflate.findViewById(R.id.plus);
            minus = inflate.findViewById(R.id.minus);
            selectNum = inflate.findViewById(R.id.selectNum);
            plus.setOnClickListener(this);
            minus.setOnClickListener(this);
        }
       if(getPosition()==2){
           inflate = inflater.inflate(R.layout.fragment_details, container, false);
       }
        if(getPosition()==3){
            inflate = inflater.inflate(R.layout.fragment_evaluate, container, false);
        }
        return inflate;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.plus:
                num++;
                mNum.setText(String.valueOf(num));
                selectNum.setText(num+"件");
                break;
            case R.id.minus:
                if(num<=1);
                else{
                    num--;
                    mNum.setText(String.valueOf(num));
                    selectNum.setText("已选： "+num+"件");
                }
            break;
        }
    }
}