package com.gietal.speakingtablet.recycler;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.gietal.speakingtablet.R;
import com.gietal.speakingtablet.models.ButtonInfo;
import com.gietal.speakingtablet.services.ButtonProvider;

public class CenterContainerRecyclerViewHolder extends RecyclerView.ViewHolder implements IButtonRecyclerListener {
    private ButtonRecyclerAdapter recyclerAdapter;
    private RecyclerView recyclerView;
    private TextView titleView;
    private Context context;

    public CenterContainerRecyclerViewHolder(@NonNull View itemView, Context context) {
        super(itemView);

        this.recyclerView = itemView.findViewById(R.id.centerContainerHolderRecycler);
        this.context = context;
        this.titleView = itemView.findViewById(R.id.centerContainerHolderTitle);
        recyclerView.setHasFixedSize(false);

        // layout the recycler view
        LinearLayoutManager layoutManager = new LinearLayoutManager(context);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

    }

    public void setModel(ButtonProvider provider, String category) {
        // create the adapter
        recyclerAdapter = new ButtonRecyclerAdapter(provider, category);
        recyclerAdapter.setListener(this);
        recyclerView.setAdapter(recyclerAdapter);

        titleView.setText(category);
    }

    @Override
    public void onClicked(ButtonRecyclerAdapter sender, ButtonInfo buttonInfo) {

    }
}
