package com.gietal.speakingtablet.services;

import com.gietal.speakingtablet.models.ButtonInfo;

import java.util.ArrayList;
import java.util.Map;

public interface IButtonStorage {
    Map<String, ArrayList<ButtonInfo>> getButtons();
}
