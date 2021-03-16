/**
 * @author Sarah Carlucci 
 */
import java.util.ArrayList;

public class PersonOfInterest extends Person{
    
    private String phoneNumber;
    private String email;
    private Suspect suspectAssociatedTo;
    private String associtationToSuspect;
    private ArrayList<String> stories;

    public PersonOfInterest(int id, String firstName, String lastName, int age, int height, int weight, String skinColor, String hairColor, String eyeColor, String address, String phoneNumber, String email, Suspect suspectAssociatedTo, String associationToCase, String associationToSuspect) {
        super(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setAssociationToSuspect(associationToSuspect);
        setSuspectAssociatedTo(suspectAssociatedTo);
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
        return associtationToSuspect;
    } 

    public void setAssociationToSuspect(String associationToSuspect) {
        this.associtationToSuspect = associationToSuspect;
    }

    public String getSuspectAssociatedTo() {
        return this.associtationToSuspect;
    }

    public void setSuspectAssociatedTo(Suspect association) {
        this.suspectAssociatedTo = association;
    }

    public void addStory(String story) {
        stories.add(story);
    } 

    public  String getLastStory() {
        return stories.get(stories.size()-1);
    }
}
