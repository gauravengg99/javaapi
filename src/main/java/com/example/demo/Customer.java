package com.example.demo;

public class Customer {

    private String name;
    private String machineModel;
    private String location;
    private Double latitude;
    private Double longitude;
    
   public Customer() {
    }

    public Customer(String name, String machineModel, String location , Double latitude , Double longitude) {
        this.name = name;
        this.machineModel = machineModel;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;   
   } 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }
    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getMachineModel() {
        return machineModel;
    }

    public void setMachineModel(String machineModel) {
        this.machineModel = machineModel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}