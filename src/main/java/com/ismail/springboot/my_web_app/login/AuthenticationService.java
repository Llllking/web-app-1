package com.ismail.springboot.my_web_app.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {


    public boolean authenticate(String username, String password){
        return username.equalsIgnoreCase("ismail") && password.equalsIgnoreCase("la3ba");
    }

}
