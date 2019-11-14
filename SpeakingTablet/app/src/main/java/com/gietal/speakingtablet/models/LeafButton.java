package com.gietal.speakingtablet.models;

public class LeafButton {
    String id;
    String title;
    String category;
    String soundId;
    String imageId;

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public LeafButton(String id, String title, String category, String soundId, String imageId) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.soundId = soundId;
        this.imageId = imageId;
    }


}
