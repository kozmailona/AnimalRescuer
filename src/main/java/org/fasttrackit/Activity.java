package org.fasttrackit;

public class Activity {

   private String name;
   private String location;        //inside, outside, in the park
   private double duration;       //duration of activity/hour; for example 1.5 (an hour and 30 minutes)

    public Activity(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }
}

