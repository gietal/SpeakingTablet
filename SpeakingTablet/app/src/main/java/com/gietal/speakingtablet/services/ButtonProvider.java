package com.gietal.speakingtablet.services;

import com.gietal.speakingtablet.models.ButtonInfo;

import java.util.ArrayList;
import java.util.Map;

public class ButtonProvider {
    private Map<String, ArrayList<ButtonInfo>> buttonsMap;
    private IButtonStorage fixedButtonStorage;

    public ButtonProvider() {
        fixedButtonStorage = new FixedButtonStorage();
        buttonsMap = fixedButtonStorage.getButtons();
    }

    public ArrayList<ButtonInfo> getButtonsForCategory(String category) {
        return buttonsMap.get(category);
    }
}
