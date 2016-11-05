package com.antolet.catchup.achievements;

/**
 * Created by luca on 05/11/16.
 */


class AchievementImpl  {

    private String name;
    private int resourceId;

    public AchievementImpl(String name, int res) {
        this.name = name;
        this.resourceId = res;
    }

    public String getName() {
        return this.name;
    }

    public int getImage() {
        return this.resourceId;
    }




}
