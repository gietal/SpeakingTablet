package com.gietal.speakingtablet.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gietal.speakingtablet.R;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainHeaderFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainHeaderFragment extends Fragment {

    public MainHeaderFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static MainHeaderFragment newInstance(String param1, String param2) {
        MainHeaderFragment fragment = new MainHeaderFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main_header, container, false);
    }

}
