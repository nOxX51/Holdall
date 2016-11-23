package com.noxx.holdall;

import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HB on 22/11/2016.
 */

public class Picture{

    private int color;
    private String title;
    private String url;
    private int ressources;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getRessources() {
        return ressources;
    }

    public void setRessources(int ressources) {
        this.ressources = ressources;
    }

    public Picture(int color, String title, String url, int ressources) {
        this.color = color;
        this.title = title;
        this.url = url;
        this.ressources = ressources;
    }



}
