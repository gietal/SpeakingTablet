package com.gietal.speakingtablet.recycler;

import android.graphics.Rect;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MarginItemDecorator extends RecyclerView.ItemDecoration {
    public Rect margin = new Rect(0,0,0,0);

    @Override
    public void getItemOffsets(@NonNull Rect outRect, @NonNull View view, @NonNull RecyclerView parent, @NonNull RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        // we add the offset to the output
        outRect.left = margin.left;
        outRect.top = margin.top;
        outRect.bottom = margin.bottom;
        outRect.right = margin.right;
    }
}
