package com.jsfmrydvd.register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Josef David on 7:26 PM, 10/12/2018
 **/
public class UserService {

    private String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    static Map<String, String> map = new HashMap<String, String>();
    static List<UserService> userService = new ArrayList<UserService>();
    //check if user is valid

    public static boolean isUserValid(String user, String password) {
        boolean isValid = false;
        if(user.equals("admin") && password.equals("admin")) isValid = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(user.equals(entry.getKey()) && password.equals(entry.getValue())) {
               isValid = true;
               break;
            } else if(user.equals("admin") && password.equals("admin")) {
                isValid = true;
                break;
            } else {
                isValid = false;
            }
        }
        return isValid;
    }
    public boolean isUserTaken(String user, String password) {
        boolean isValid = false;
        if(user.equals("admin")) isValid = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if(user.equals(entry.getKey())) {
                isValid = true;
                break;
            } else {
                isValid = false;
            }
        }
        return isValid;
    }

//    ADD USER
    public Map<String, String> addUser(String name, String password) {
        map.put(name, password);
       return map;
    }

}
