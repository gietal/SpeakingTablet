package com.gietal.speakingtablet.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gietal.speakingtablet.R;
import com.gietal.speakingtablet.models.ButtonInfo;
import com.gietal.speakingtablet.recycler.ButtonRecyclerAdapter;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment implements IRecyclerFragmentListener {

    BottomCategoriesFragment bottomCategoriesFragment;
    CenterContainerFragment centerContainerFragment;

    public MainFragment() {

        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
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
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        // create the bottom view
        // since we're on a fragment, we need to get the activity first
        FragmentManager fm = getActivity().getSupportFragmentManager();

        bottomCategoriesFragment = BottomCategoriesFragment.newInstance();
        bottomCategoriesFragment.setListener(this);
        fm.beginTransaction().add(R.id.mainBottomContainer, bottomCategoriesFragment).commit();

        centerContainerFragment = CenterContainerFragment.newInstance();
        centerContainerFragment.setListener(this);
        fm.beginTransaction().add(R.id.mainCenterContainer, centerContainerFragment).commit();

        return v;
    }

    @Override
    public void onCLicked(Fragment sender, ButtonRecyclerAdapter recycler, ButtonInfo buttonInfo) {
        Log.d(this.getClass().getName(), "onClicked: [" + buttonInfo.getCategory() + ", " + buttonInfo.getTitle() + "]");

        if (sender == bottomCategoriesFragment) {
            centerContainerFragment.setCategory(buttonInfo.getTitle());
        }
    }
}
