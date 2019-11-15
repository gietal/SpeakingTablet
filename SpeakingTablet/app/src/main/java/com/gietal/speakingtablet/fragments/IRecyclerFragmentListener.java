package com.gietal.speakingtablet.fragments;

import androidx.fragment.app.Fragment;

import com.gietal.speakingtablet.models.ButtonInfo;
import com.gietal.speakingtablet.recycler.ButtonRecyclerAdapter;

public interface IRecyclerFragmentListener {
    void onCLicked(Fragment sender, ButtonRecyclerAdapter recycler, ButtonInfo buttonInfo);
}
