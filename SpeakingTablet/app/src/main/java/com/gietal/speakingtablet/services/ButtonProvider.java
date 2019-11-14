package com.gietal.speakingtablet.services;

import com.gietal.speakingtablet.models.LeafButton;

import java.util.ArrayList;
import java.util.Map;

public class ButtonProvider {
    private Map<String, ArrayList<LeafButton>> buttonsMap;
    private IButtonStorage fixedButtonStorage;

    public ButtonProvider() {
        fixedButtonStorage = new FixedButtonStorage();
        buttonsMap = fixedButtonStorage.getButtons();
    }

    public ArrayList<LeafButton> getButtonsForCategory(String category) {
        return buttonsMap.get(category);
    }
}
