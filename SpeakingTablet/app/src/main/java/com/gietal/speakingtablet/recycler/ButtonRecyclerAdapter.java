package com.gietal.speakingtablet.recycler;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.gietal.speakingtablet.models.ButtonInfo;
import com.gietal.speakingtablet.services.ButtonProvider;
import com.gietal.speakingtablet.R;

import java.util.ArrayList;

public class ButtonRecyclerAdapter extends RecyclerView.Adapter<ButtonRecyclerViewHolder> implements IButtonRecyclerViewHolderListener {

    private ButtonProvider provider;
    private String buttonCategory;

    public IButtonRecyclerListener getListener() {
        return listener;
    }

    public void setListener(IButtonRecyclerListener listener) {
        this.listener = listener;
    }

    private IButtonRecyclerListener listener;

    public ButtonRecyclerAdapter(ButtonProvider provider, String category) {
        this.provider = provider;
        this.buttonCategory = category;
    }

    @NonNull
    @Override
    public ButtonRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View holderView = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_leaf_button, parent, false);
        return new ButtonRecyclerViewHolder(holderView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ButtonRecyclerViewHolder holder, int position) {
        ArrayList<ButtonInfo> buttons =  provider.getButtonsForCategory(buttonCategory);

        ButtonInfo button = buttons.get(position);
        if (button == null) {
            Log.e("ButtonRecyclerAdapter", "button is null for position " + position + ". size is: " + buttons.size());
            return;
        }

        holder.setModel(button);
    }

    @Override
    public int getItemCount() {
        ArrayList buttons =  provider.getButtonsForCategory(buttonCategory);
        if (buttons == null) {
            return 0;
        }

        return buttons.size();
    }

    @Override
    public void onClicked(ButtonRecyclerViewHolder sender) {
//        Log.d(this.getClass().getName(), "onButtonClicked");
        if (listener != null) {
            listener.onClicked(this, sender.getModel());
        }
    }
}
