package com.gietal.speakingtablet.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.gietal.speakingtablet.R;
import com.gietal.speakingtablet.recycler.ButtonRecyclerAdapter;
import com.gietal.speakingtablet.services.ButtonProvider;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BottomCategoriesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BottomCategoriesFragment extends Fragment {

    public BottomCategoriesFragment() {
        // Required empty public constructor
    }

    public static BottomCategoriesFragment newInstance() {
        BottomCategoriesFragment fragment = new BottomCategoriesFragment();
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
        View v = inflater.inflate(R.layout.fragment_bottom_categories, container, false);

        // attach the recycler here
        RecyclerView recylerView = (RecyclerView)v.findViewById(R.id.buttonRecycler);
        recylerView.setHasFixedSize(false);

        // then create the adapter
        ButtonRecyclerAdapter adapter = new ButtonRecyclerAdapter(new ButtonProvider(), "main");
        recylerView.setAdapter(adapter);

        // layout the recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recylerView.setLayoutManager(layoutManager);

        return v;
    }

}
