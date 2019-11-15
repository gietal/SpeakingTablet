package com.gietal.speakingtablet.recycler;

import com.gietal.speakingtablet.models.ButtonInfo;

public interface IButtonRecyclerListener {
    void onClicked(ButtonRecyclerAdapter sender, ButtonInfo buttonInfo);
}
