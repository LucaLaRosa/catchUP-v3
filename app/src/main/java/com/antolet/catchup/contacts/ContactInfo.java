package com.antolet.catchup.contacts;

/**
 * Created by luca on 05/11/16.
 */

public class ContactInfo {

    private String title;
    private int distance;
    private String info;

    public ContactInfo(String title, int distance, String info) {
        this.title = title;
        this.distance = distance;
        this.info = info;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }


}
