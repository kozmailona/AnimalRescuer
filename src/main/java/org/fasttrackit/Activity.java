package org.fasttrackit;

public class Activity {

    String name;
    String location;        //inside, outside, in the park
    double duration;       //duration of activity/hour; for example 1.5 (an hour and 30 minutes)

    public Activity(String name, String location) {
        this.name = name;
        this.location = location;
    }
}
