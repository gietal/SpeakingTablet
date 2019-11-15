package com.gietal.speakingtablet.services;

import com.gietal.speakingtablet.models.ButtonInfo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FixedButtonStorage implements IButtonStorage {
    @Override
    public Map<String, ArrayList<ButtonInfo>> getButtons() {
        Map<String, ArrayList<ButtonInfo>> output = new HashMap<String, ArrayList<ButtonInfo>>();

        ArrayList<ButtonInfo> mainButtons = new ArrayList<ButtonInfo>();
        mainButtons.add(new ButtonInfo("", "Request", "main", ButtonInfo.Type.Category , "", ""));
        mainButtons.add(new ButtonInfo("", "Question", "main", ButtonInfo.Type.Category, "", ""));
        mainButtons.add(new ButtonInfo("", "Reject", "main", ButtonInfo.Type.Category, "", ""));

        ArrayList<ButtonInfo> subjectButtons = new ArrayList<ButtonInfo>();
        subjectButtons.add(new ButtonInfo("", "Aku", "subject", ButtonInfo.Type.Item, "", ""));
        subjectButtons.add(new ButtonInfo("", "Zaky", "subject", ButtonInfo.Type.Item, "", ""));
        subjectButtons.add(new ButtonInfo("", "Dia", "subject", ButtonInfo.Type.Item, "", ""));
        subjectButtons.add(new ButtonInfo("", "Kamu", "subject", ButtonInfo.Type.Item, "", ""));

        ArrayList<ButtonInfo> requestButtons = new ArrayList<ButtonInfo>();
        requestButtons.add(new ButtonInfo("", "Tolong", "request", ButtonInfo.Type.Item, "", ""));
        requestButtons.add(new ButtonInfo("", "Mau", "request", ButtonInfo.Type.Item, "", ""));
        requestButtons.add(new ButtonInfo("", "Ambil", "request", ButtonInfo.Type.Item, "", ""));
        requestButtons.add(new ButtonInfo("", "Simpan", "request", ButtonInfo.Type.Item, "", ""));

        output.put(mainButtons.get(0).getCategory(), mainButtons);
        output.put(subjectButtons.get(0).getCategory(), subjectButtons);
        output.put(requestButtons.get(0).getCategory(), requestButtons);
        return output;
    }
}
