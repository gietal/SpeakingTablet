package com.gietal.speakingtablet.models;

public class ButtonInfo {
    public enum Type {
        Category,
        Item
    }

    String id;
    String title;
    String category;
    Type type;
    String soundId;
    String imageId;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public ButtonInfo(String id, String title, String category, Type type, String soundId, String imageId) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.type = type;
        this.soundId = soundId;
        this.imageId = imageId;
    }


}
