package com.jsfmrydvd.register;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Josef David on 2:33 PM, 10/11/2018
 **/
public class RegisterService {
    private List<UserService> userList = new ArrayList<UserService>();
    //show all users
    public List<UserService> showList() {
        return userList;
    }
    //add user
    public void add(UserService user) {
        userList.add(user);
    }
    //delete user
    public void remove(UserService user) {
        userList.remove(user);
    }
}
