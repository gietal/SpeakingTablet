package com.gietal.speakingtablet.services;

import com.gietal.speakingtablet.models.LeafButton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FixedButtonStorage implements IButtonStorage {
    @Override
    public Map<String, ArrayList<LeafButton>> getButtons() {
        Map<String, ArrayList<LeafButton>> output = new HashMap<String, ArrayList<LeafButton>>();

        ArrayList<LeafButton> mainButtons = new ArrayList<LeafButton>();
        mainButtons.add(new LeafButton("", "Request", "main", "", ""));
        mainButtons.add(new LeafButton("", "Question", "main", "", ""));
        mainButtons.add(new LeafButton("", "Reject", "main", "", ""));

        ArrayList<LeafButton> subjectButtons = new ArrayList<LeafButton>();
        subjectButtons.add(new LeafButton("", "Aku", "subject", "", ""));
        subjectButtons.add(new LeafButton("", "Zaky", "subject", "", ""));
        subjectButtons.add(new LeafButton("", "Dia", "subject", "", ""));
        subjectButtons.add(new LeafButton("", "Kamu", "subject", "", ""));

        ArrayList<LeafButton> requestButtons = new ArrayList<LeafButton>();
        requestButtons.add(new LeafButton("", "Tolong", "request", "", ""));
        requestButtons.add(new LeafButton("", "Mau", "request", "", ""));
        requestButtons.add(new LeafButton("", "Ambil", "request", "", ""));
        requestButtons.add(new LeafButton("", "Simpan", "request", "", ""));

        output.put(mainButtons.get(0).getCategory(), mainButtons);
        output.put(subjectButtons.get(0).getCategory(), subjectButtons);
        output.put(requestButtons.get(0).getCategory(), requestButtons);
        return output;
    }
}
