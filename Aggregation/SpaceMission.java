import java.util.ArrayList;
import java.util.List;

public class SpaceMission {
    private String missionName;
    private List<Astronaut> astronauts; 

    // Constructor
    public SpaceMission(String missionName) {
        this.missionName = missionName;
        this.astronauts = new ArrayList<>();
    }

    // Add an astronaut to the mission
    public void addAstronaut(Astronaut astronaut) {
        astronauts.add(astronaut);
    }

    // Display mission details
    public void displayMissionInfo() {
        System.out.println("Space Mission: " + missionName);
        System.out.println("Astronauts on this mission:");
        for (Astronaut astronaut : astronauts) {
            astronaut.displayAstronautInfo();
        }
    }
}
