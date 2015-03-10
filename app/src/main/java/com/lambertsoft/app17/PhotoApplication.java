package com.lambertsoft.app17;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseCrashReporting;
import com.parse.ParseUser;

/**
 * Created by InnovaTI on 09-03-15.
 */
public class PhotoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Initialize Crash Reporting.
        ParseCrashReporting.enable(this);

        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        // Add your initialization code here
        Parse.initialize(this, "Cfw3CXG4HCeFhW03AiYFpplJYYH0V4nnZlzkPCFX", "Y9yq6bVaDvlBHCliVhk6OPQXb7OAklpiR3JDSIYb");


        ParseUser.enableAutomaticUser();
        ParseUser.getCurrentUser().saveInBackground();

    }
}