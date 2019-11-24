package com.gietal.speakingtablet.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gietal.speakingtablet.R;
import com.gietal.speakingtablet.services.ButtonProvider;

import java.util.ArrayList;

public class CenterContainerRecyclerAdapter extends RecyclerView.Adapter<CenterContainerRecyclerViewHolder> {

    private ButtonProvider provider;
    private String category;

    public CenterContainerRecyclerAdapter(ButtonProvider provider, String category) {
        this.provider = provider;
        this.category = category;
    }

    @NonNull
    @Override
    public CenterContainerRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holderView = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_center_container_recycler, parent, false);
        return new CenterContainerRecyclerViewHolder(holderView, parent.getContext());
    }

    @Override
    public void onBindViewHolder(@NonNull CenterContainerRecyclerViewHolder holder, int position) {
        ArrayList<String> childCategories = provider.getChildCategories(category);
        String childCategory = childCategories.get(position);

        holder.setModel(provider, childCategory);
    }

    @Override
    public int getItemCount() {
        ArrayList<String> childCategories = provider.getChildCategories(category);
        return childCategories.size();
    }
}
