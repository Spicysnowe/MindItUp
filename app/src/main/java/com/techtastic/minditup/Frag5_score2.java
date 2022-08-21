package com.techtastic.minditup;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public class Frag5_score2 extends Fragment {

    public Frag5_score2() {
        // Required empty public constructor
    }

    private TextView result1, result2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View v =  inflater.inflate(R.layout.frag5_score2, container, false);

        result1 = v.findViewById(R.id.result1);
        result2 = v.findViewById(R.id.result2);

        Bundle bundle = new Bundle();
        bundle=getArguments();
        String A = bundle.getString("defg");
        int total = bundle.getInt("total");


        result2.setText(A);

        if(total>=5 && total<=11){
            result1.setText("You have low");
        }
        else if(total>=12 && total<=18){
            result1.setText("You have moderate");
        }
        else if(total>=19 && total<=25){
            result1.setText("You have severe");
        }







       return v;
    }
}