package com.jsfmrydvd.home;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Josef David on 10:07 AM, 10/12/2018
 **/
public class HomeService {
    //add specific list into userList

    private static List<Todo> todos = new ArrayList<Todo>();



    static {
        String color = "<html><font color=red>Admin</font></html>";
        SimpleDateFormat formatter = new SimpleDateFormat("hh:mm a");
        Date date = new Date();
        String dateColor = "<html><font color=black><b>(" + formatter.format(date) + ")</b></font></html>";
        todos.add(new Todo(color + ": " +"Welcome to the Chat App" + " " + dateColor));
        todos.add(new Todo(color + ": " +"Please type something.." + " " + dateColor));
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
