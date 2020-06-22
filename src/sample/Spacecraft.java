package sample;

public class Spacecraft {

    private String model;
    private String fuelType;
    private String launchDate;

    public String getModel() { return model; }
    public void setModel(String model) { this.model = model; }

    public String getFuelType() { return fuelType; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }

    public String getLaunchDate() { return launchDate; }
    public void setLaunchDate(String launchDate) { this.launchDate = launchDate; }

    public Spacecraft(String model, String fuelType, String launchDate) {

        this.model = model;
        this.fuelType = fuelType;
        this.launchDate = launchDate;

    }
}
