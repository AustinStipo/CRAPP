import java.util.ArrayList;

public class Witness extends Person{
    private String phoneNumber;
    private String email;
    private ArrayList<String> stories;

    public Witness(String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, String phoneNumber, String email) {
        super(firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
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
        
    }

    public String getLastStory() {
        return "";
    }
    
}
