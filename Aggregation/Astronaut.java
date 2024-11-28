public class Astronaut {
    private String name;
    private String skill;

    // Constructor
    public Astronaut(String name, String skill) {
        this.name = name;
        this.skill = skill;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getSkill() {
        return skill;
    }

    // Display astronaut details
    public void displayAstronautInfo() {
        System.out.println("Astronaut: " + name + " | Skill: " + skill);
    }
}
