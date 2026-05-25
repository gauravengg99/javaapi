package com.example.demo;

public class CustomerMachine {
    private String customerName;
    private String machineModel;
    private Double latitude;
    private Double longitude;
    private String city;

  public CustomerMachine() {
    
}

    public CustomerMachine(String customerName,
                           String machineModel,
                           Double latitude,
                           Double longitude,
                           String city) {

        this.customerName = customerName;
        this.machineModel = machineModel;
        this.latitude = latitude;
        this.longitude = longitude;
        this.city = city;
    }
        public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getMachineModel() {
        return machineModel;
    }

    public void setMachineModel(String machineModel) {
        this.machineModel = machineModel;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
