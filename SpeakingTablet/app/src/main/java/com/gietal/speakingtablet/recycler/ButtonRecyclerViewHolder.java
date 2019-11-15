package com.gietal.speakingtablet.recycler;

import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.gietal.speakingtablet.R;
import com.gietal.speakingtablet.models.ButtonInfo;

public class ButtonRecyclerViewHolder extends RecyclerView.ViewHolder {

    private Button mainButton;
    private IButtonRecyclerViewHolderListener listener;
    private ButtonInfo model;

    public ButtonRecyclerViewHolder(@NonNull View itemView, final IButtonRecyclerViewHolderListener listener) {
        super(itemView);

        this.mainButton = itemView.findViewById(R.id.buttonViewHolder);
        this.listener = listener;

        if (listener != null) {
            final ButtonRecyclerViewHolder tempThis = this;
            mainButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onClicked(tempThis);
                }
            });
        }
    }

    public void setModel(ButtonInfo info) {
        model = info;
        mainButton.setText(info.getTitle());
    }

    public ButtonInfo getModel() {
        return model;
    }
}
