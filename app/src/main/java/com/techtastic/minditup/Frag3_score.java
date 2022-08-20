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
public class Frag3_score extends Fragment {


    public Frag3_score() {
        // Required empty public constructor
    }

    private TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.frag3_score, container, false);

        result = v.findViewById(R.id.result);

        Bundle bundle = new Bundle();
        bundle=getArguments();
        int dep = bundle.getInt("depression");
        int ptsd = bundle.getInt("ptsd");
        int adhd = bundle.getInt("adhd");
        int anx = bundle.getInt("anxiety");

        if(dep==ptsd && ptsd==adhd && adhd==anx && anx==0){
            result.setText(dep +" "+ ptsd +" "+ adhd +" "+ anx + " You have no problem");
        }
        else if(dep<=2 && ptsd<=2 && adhd<=2 && anx<=2 ){
             result.setText(dep +" "+ ptsd +" "+ adhd +" "+ anx + " You have thodi si problem");
        }
        else{
             result.setText(dep +" "+ ptsd +" "+ adhd +" "+ anx + " You have problem");
        }




        return v;

    }

}