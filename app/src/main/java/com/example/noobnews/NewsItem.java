package com.example.noobnews;
// NewsItem.java
import java.io.Serializable;

public class NewsItem implements Serializable {
    private String title;
    private String imageUrl;
    private String description;

    public NewsItem(String title, String imageUrl, String description) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }
}

