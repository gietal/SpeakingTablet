package com.gietal.speakingtablet.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gietal.speakingtablet.R;
import com.gietal.speakingtablet.models.ButtonInfo;
import com.gietal.speakingtablet.recycler.ButtonRecyclerAdapter;
import com.gietal.speakingtablet.recycler.CenterContainerRecyclerAdapter;
import com.gietal.speakingtablet.recycler.IButtonRecyclerListener;
import com.gietal.speakingtablet.services.ButtonProvider;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CenterContainerFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CenterContainerFragment extends Fragment implements IButtonRecyclerListener {

    public IRecyclerFragmentListener getListener() {
        return listener;
    }

    public void setListener(IRecyclerFragmentListener listener) {
        this.listener = listener;
    }

    private IRecyclerFragmentListener listener;

    public CenterContainerFragment() {
        // Required empty public constructor
    }

    RecyclerView recyclerView;
    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     * @return A new instance of fragment CenterContainerFragment.
     */
    public static CenterContainerFragment newInstance() {
        CenterContainerFragment fragment = new CenterContainerFragment();
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
        View v = inflater.inflate(R.layout.fragment_center_container, container, false);

        // attach the recycler
        recyclerView = (RecyclerView)v.findViewById(R.id.centerContainerRecycler);
        recyclerView.setHasFixedSize(false);

        // layout the recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        return v;
    }

    @Override
    public void onClicked(ButtonRecyclerAdapter sender, ButtonInfo buttonInfo) {
        if (listener != null) {
            listener.onCLicked(this, sender, buttonInfo);
        }
    }

    public void setCategory(String category) {
        // recreate the adapter
        // then create the adapter
        CenterContainerRecyclerAdapter adapter = new CenterContainerRecyclerAdapter(new ButtonProvider(),category );
//        adapter.setListener(this);
        recyclerView.setAdapter(adapter);

    }
}
