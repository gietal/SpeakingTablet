package com.gietal.speakingtablet.services;

import com.gietal.speakingtablet.models.LeafButton;

import java.util.ArrayList;
import java.util.Map;

public interface IButtonStorage {
    Map<String, ArrayList<LeafButton>> getButtons();
}
