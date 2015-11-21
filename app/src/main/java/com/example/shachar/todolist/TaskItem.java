package com.example.shachar.todolist;

/**
 * Created by Shachar Romi on 15/11/2015.
 */
public class TaskItem {

    private String description;

    public TaskItem(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
