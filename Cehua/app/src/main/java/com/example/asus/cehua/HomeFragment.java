package com.example.asus.cehua;

import android.media.Rating;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;





/**
 * 1. 类的用途
 * 2. @author forever
 * 3. @date 2017/3/10 10:26
 */

public class HomeFragment extends Fragment {




    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, null);

        return view;
    }


}
