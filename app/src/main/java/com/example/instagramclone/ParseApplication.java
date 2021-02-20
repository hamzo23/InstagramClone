package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    //Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("3UGJ6nEweXHYIOjcfc1VnjRFUAOM45tvqp820gaY")
                .clientKey("VaEMxgarrSrngNUcgJ7Z2I6QEhnUR3f6DLfj0EXP")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
