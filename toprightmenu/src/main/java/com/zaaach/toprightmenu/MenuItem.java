package com.zaaach.toprightmenu;

/**
 * Author：Bro0cL on 2016/12/26.
 */

public class MenuItem {
    private String id;
    private int icon;
    private String text;

    public MenuItem() {}

    public MenuItem(String text) {
        this.text = text;
    }

    public MenuItem(int iconId, String text) {
        this.icon = iconId;
        this.text = text;
    }

    public MenuItem(String id, int iconId, String text) {
        this.id = id;
        this.icon = iconId;
        this.text = text;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIcon() {
        return icon;

}
    public void setIcon(int iconId) {
        this.icon = iconId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
