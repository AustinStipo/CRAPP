import java.util.ArrayList;
import java.util.UUID;

public class Witness extends Person{
    private String phoneNumber;
    private String email;
    private ArrayList<String> stories;

    public Witness(UUID id, String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, String phoneNumber, String email) {
        super(id,firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
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

    public void addStory(String story) {
        stories.add(story);
    }

    public String getLastStory() {
        return stories.get(stories.size()-1);
    }
    
}
