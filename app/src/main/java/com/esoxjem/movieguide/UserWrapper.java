package com.esoxjem.movieguide;

import com.squareup.moshi.Json;

import java.util.List;

public class UserWrapper {

    @Json(name = "results")
    private List<User> users;

    public List<User> getUserList() {
        return users;
    }

    public void setUserList(List<User> userList) {
        this.users= userList;
    }
}
