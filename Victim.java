import java.util.ArrayList;

public class Victim extends Person {
    private String phoneNumber;
    private String email;
    private String associationToSuspect;
    private ArrayList<String> stories;
    private boolean hospitalized;
    private boolean alive;

    public Victim(int id, String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, String phoneNumber, String email, String associationToSuspect) {
        super(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setAssociationToSuspect(associationToSuspect);
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAssociationToSuspect() {
        return this.associationToSuspect;
    }

    public void setAssociationToSuspect(String associationToSuspect) {
        this.associationToSuspect = associationToSuspect;
    }

    public void addStory(String story) {
        stories.add(story);
    }
    
    public String getLastStory() {
        return stories.get(stories.size()-1);
    }

    public boolean getHospitalized() {
        return this.hospitalized;
    }

    public void setHospitalized(boolean hospitalized) {
        this.hospitalized = hospitalized;
    }

    public void changeHospitalized() {
        hospitalized = !hospitalized;
    }

    public boolean getAlive() {
        return this.alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public void changeAlive() {
        alive = !alive;
    }
}
