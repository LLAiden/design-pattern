package com.llaiden.designpattern;

public class Worker {

    private String name = "Aiden";

    private TrafficTool trafficTool;

    public void setTrafficTool(TrafficTool trafficTool) {
        this.trafficTool = trafficTool;
    }

    public void work() {
        String commute = "坐公交车";
        if (trafficTool != null) {
            commute = trafficTool.commute();
        }
        System.out.println(name + commute + "去上班");
    }
}
