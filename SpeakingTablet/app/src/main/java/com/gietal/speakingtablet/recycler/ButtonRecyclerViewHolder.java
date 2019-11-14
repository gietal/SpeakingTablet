package com.gietal.speakingtablet.recycler;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.gietal.speakingtablet.R;
import com.gietal.speakingtablet.models.LeafButton;

public class ButtonRecyclerViewHolder extends RecyclerView.ViewHolder {

    private Button mainButton;

    public ButtonRecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        this.mainButton = itemView.findViewById(R.id.buttonViewHolder);
    }

    public void setModel(LeafButton button) {
        mainButton.setText(button.getTitle());
    }
}
