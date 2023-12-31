/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.usermanagementproject;

import java.util.ArrayList;

/**
 *
 * @author USER
 */
public class UserService {

    private ArrayList<User> userList;
    private int lastId = 1;

    public UserService() {
        userList = new ArrayList<User>();
    }

    public User addUser(User newUser) {
        newUser.setId(lastId++);
        userList.add(newUser);
        return newUser;
    }

    public User getUser(int index) {
        return userList.get(index);
    }

    public ArrayList<User> getUsers() {
        return userList;
    }

    public int getSize() {
        return userList.size();
    }

    public void logUserList() {
        for (User user : userList) {
            System.out.println(user);

        }

    }

    void updateUser(int index, User updateUser) {
       
      User user = userList.get(index);
      user.setLogin(updateUser.getLogin());
      user.setName(updateUser.getName());
      user.setPassword(updateUser.getPassword());
      user.setGender(updateUser.getGender());
      user.setRole(updateUser.getRole());
        
    }
    User deleteUser(int index){
       return userList.remove(index);
    }
}
