package com.example.finalproject1.service;

public interface SecurityService {
    boolean isAuthenticated();
    void autoLogin(String username, String password);
}
