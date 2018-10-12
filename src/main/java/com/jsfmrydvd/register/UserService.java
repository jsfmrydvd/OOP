package com.jsfmrydvd.register;

import javax.persistence.GeneratedValue;
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

    static Map<String, Object> map = new HashMap<String, Object>();

    //check if user is valid
    public static boolean isUserValid(String user, String password) {
        if(user.equals(map.get("name")) && password.equals(map.get("password"))) return true;
        return false;
    }

    //ADD USER
    public Map<String, Object> addUser(String name, String password) {
        map.put("name", name);
        map.put("password", password);
       return map;
    }
}
