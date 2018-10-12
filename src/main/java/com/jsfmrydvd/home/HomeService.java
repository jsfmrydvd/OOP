package com.jsfmrydvd.home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josef David on 10:07 AM, 10/12/2018
 **/
public class HomeService {

    private static List<Todo> todos = new ArrayList<Todo>();

    static {
        todos.add(new Todo("Sample Todo List"));
        todos.add(new Todo("Add more functions"));
    }
    public List<Todo> retrieveTodos() {
        return todos;
    }
    //add to list
    public void add(Todo todo) {
        todos.add(todo);
    }
    //delete to list
    public void delete(Todo todo) {
        todos.remove(todo);
    }

}
