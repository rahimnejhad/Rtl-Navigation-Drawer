package com.rahimnejhad.rtlNavigationDrawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class NavDrawe extends Fragment {

    RelativeLayout item_1,item_2,item_3,item_setting;

    public NavDrawe() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mView=inflater.inflate(R.layout.fragment_nav_drawe, container, false);

        init(mView);

        return mView;
    }

    private void init(View mView){
        item_1=mView.findViewById(R.id.nav_item_1);
        item_2=mView.findViewById(R.id.nav_item_2);
        item_3=mView.findViewById(R.id.nav_item_3);
        item_setting=mView.findViewById(R.id.nav_item_setting);

        onClickListener();
    }

    private void onClickListener() {
        item_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "item 1 : selected", Toast.LENGTH_SHORT).show();
            }
        });

        item_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "item 2 : selected", Toast.LENGTH_SHORT).show();
            }
        });

        item_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "item 3 : selected", Toast.LENGTH_SHORT).show();
            }
        });

        item_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "item setting : selected", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
