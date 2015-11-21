package com.example.shachar.todolist;

import java.util.List;

/**
 * Created by Shachar Romi on 15/11/2015.
 */
public class TaskController implements ITaskController {


    private IDataAccess dao;

    public TaskController() {
        this.dao = new MockDAO();
    }

    @Override
    public List<TaskItem> getTasks() {
        return dao.GetTasks();
    }


}
