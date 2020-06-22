package sample.crafts;
import sample.Spacecraft;

public class V9000 extends Spacecraft {

    private String colour;
    private boolean autoPilot;

    public V9000(String model, String fuelType, String launchDate, String colour, boolean autoPilot) {

        super(model, fuelType, launchDate);
            this.colour = colour;
            this.autoPilot = autoPilot;

    }

    public String getColour() { return colour; }
    public void setColour(String colour) { this.colour = colour; }

    public boolean isAutoPilot() { return autoPilot; }
    public void setAutoPilot(boolean autoPilot) { this.autoPilot = autoPilot; }

}
