package sample.crafts;
import sample.Spacecraft;

public class X5000 extends Spacecraft {

    private String colour;
    private boolean autoPilot;
    private String projectManager;

    public X5000(String model, String fuelType, String launchDate, String colour, boolean autoPilot) {

        super(model, fuelType, launchDate);
            this.colour = colour;
            this.autoPilot = autoPilot;

    }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public boolean isAutoPilot() { return autoPilot; }
    public void setAutoPilot(boolean autoPilot) { this.autoPilot = autoPilot; }

    public String getProjectManager() { return projectManager; }
    public void setProjectManager(String projectManager) { this.projectManager = projectManager; }

}
