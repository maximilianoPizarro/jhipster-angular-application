package com.angular.myapp.security;

import jakarta.ws.rs.NotAuthorizedException;

public class UsernameNotFoundException extends NotAuthorizedException {

    public UsernameNotFoundException(String message) {
        super(message);
    }
}
