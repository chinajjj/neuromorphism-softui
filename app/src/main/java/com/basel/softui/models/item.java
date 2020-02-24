package com.basel.softui.models;

public class item {

    private String name;
    private String des;
    private int iconRes;

    public item(String name, String des, int iconRes) {
        this.name = name;
        this.des = des;
        this.iconRes = iconRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public int getIconRes() {
        return iconRes;
    }

    public void setIconRes(int iconRes) {
        this.iconRes = iconRes;
    }
}
