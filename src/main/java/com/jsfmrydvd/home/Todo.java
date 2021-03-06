package com.jsfmrydvd.home;

import java.util.Objects;

/**
 * Created by Josef David on 8:40 PM, 10/12/2018
 **/
public class Todo {
    public Todo(String name) {
        super();
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Todo [name=" + name + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Todo todo = (Todo) o;
        return Objects.equals(name, todo.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
