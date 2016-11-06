package com.antolet.catchup.people;

/**
 * Created by luca on 06/11/16.
 */

public class PersonImpl implements Person {
    private String name;
    private String sex;
    private int resourceId;

    public PersonImpl(String name, String sex, int resourceId) {
        this.name = name;
        this.sex = sex;
        this.resourceId = resourceId;
    }

    public int getResourceId() {
        return resourceId;
    }

    public void setResourceId(int resourceId) {
        this.resourceId = resourceId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
