package com.example.shachar.todolist;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Shachar Romi on 15/11/2015.
 */
public class MockDAO implements IDataAccess {

    private static MockDAO instance;

    public static MockDAO getInstance()
    {
        if(instance ==  null)
            instance = new MockDAO();
        return instance;
    }

    @Override
    public List<TaskItem> GetTasks() {

        //create 20 mock items
        List<TaskItem> taskItems = new ArrayList<TaskItem>();
        for (int i = 0 ; i < 20 ; i++) {

            TaskItem task = new TaskItem("mock task " + i);
            taskItems.add(task);
        }

        return taskItems;
    }
}

