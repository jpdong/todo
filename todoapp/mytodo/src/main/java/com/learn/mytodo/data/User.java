package com.learn.mytodo.data;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * Created by dong on 2017/3/7 0007.
 */

public class User {

    @NonNull
    private String userId;

    private String name;

    private String token;

    @Nullable
    private String phone;

    @Nullable
    private String email;

    @Nullable
    private String password;

    public User(String userId) {
        this.userId = userId;
        this.token = token;
    }

    public User(String userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
