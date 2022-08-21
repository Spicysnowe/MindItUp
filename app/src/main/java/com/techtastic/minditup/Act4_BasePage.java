package com.techtastic.minditup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.techtastic.minditup.databinding.Act4BasePageBinding;

public class Act4_BasePage extends AppCompatActivity {

    Act4BasePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = Act4BasePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        replaceFragment(new Frag6_home());


        binding.bottomNavigationView.setOnItemSelectedListener(item -> {

            switch (item.getItemId()){

                case R.id.home:
                    replaceFragment(new Frag6_home());
                    break;
                case R.id.community:
                    replaceFragment(new Frag7_Community());
                    break;
                case R.id.profile:
                    replaceFragment(new Frag8_Profile());
                    break;
            }

            return true;
        });
    }


    private void replaceFragment(Fragment fragment){

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.baseFrameLayout,fragment);
        fragmentTransaction.commit();
    }
}