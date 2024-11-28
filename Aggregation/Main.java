public class Main {
    public static void main(String[] args) {
        // Create Astronaut objects
        Astronaut astronaut1 = new Astronaut("John Smith", "Commander");
        Astronaut astronaut2 = new Astronaut("Alice Johnson", "Scientist");
        Astronaut astronaut3 = new Astronaut("Michael Lee", "Engineer");

        // Create a SpaceMission object
        SpaceMission mission = new SpaceMission("Mars Exploration");

        // Add astronauts to the mission
        mission.addAstronaut(astronaut1);
        mission.addAstronaut(astronaut2);
        mission.addAstronaut(astronaut3);

        // Display mission details
        mission.displayMissionInfo();
    }
}
