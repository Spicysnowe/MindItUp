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
        whichProblem();
        return v;

    }

    private void whichProblem(){
        Bundle bundle = new Bundle();
        bundle=getArguments();
        int dep = bundle.getInt("depression");
        int ptsd = bundle.getInt("ptsd");
        int adhd = bundle.getInt("adhd");
        int anx = bundle.getInt("anxiety");


//        scenario 1
        if(dep==ptsd && ptsd==adhd && adhd==anx && anx==0){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep +" You have no problem");
        }

//        scenario 2
        else if(dep<=2 && ptsd<=2 && adhd<=2 && anx<=2 ){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep +" You have thodi si problem");
        }

//        scenario 3
//        no equality
        else if(anx>adhd && anx>ptsd && anx>dep){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + " You have anx");
        }
        else if(dep>adhd && dep>anx && dep>ptsd){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "you have dep");
        }
        else if(ptsd>adhd && ptsd>anx && ptsd>dep){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "you have ptsd");
        }
        else if(adhd>ptsd && adhd>anx && adhd>dep){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "you have adhd");
        }


//        3 equality
        else if(ptsd==adhd && adhd==dep){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call ptsd adhd dep set");
        }
        else if(ptsd==anx && anx==adhd){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call anx ptsd adhd set");
        }
        else if(ptsd==anx && anx==dep){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call anx dep ptsd set");
        }
        else if(anx==dep && dep==adhd){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call anx dep adhd set");
        }


//        2 equality
        else if(ptsd==adhd){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call ptsd adhd set");
        }
        else if(ptsd==dep){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call ptsd dep set");
        }
        else if(ptsd==anx){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call ptsd anx set");
        }
        else if(dep==adhd){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call dep adhd set");
        }
        else if(anx==adhd){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call anx adhd set");
        }
        else if(anx==dep){
            result.setText("ptsd: "+ ptsd +" adhd: "+ adhd +"anx: "+ anx + "dep: "+ dep + "Call anx dep set");
        }


    }

}