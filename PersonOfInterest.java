/**
 * @author Sarah Carlucci 
 */
import java.util.ArrayList;

public class PersonOfInterest extends Person{
    
    private String phoneNumber;
    private String email;
    private Suspect suspectAssociatedTo;
    private String associationToSuspect;
    private ArrayList<String> stories;

    public PersonOfInterest(int id, String firstName, String lastName, int age, int height, int weight, String skinColor, String hairColor, String eyeColor, String address, String phoneNumber, String email, Suspect suspectAssociatedTo, String associationToSuspect) {
        super(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setAssociationToSuspect(associationToSuspect);
        setSuspectAssociatedTo(suspectAssociatedTo);
        stories = new ArrayList<String>();
    }

    /**
     * Empty PersonOfInterest constructor
     */
    public PersonOfInterest() {

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
        return associationToSuspect;
    } 

    public void setAssociationToSuspect(String associationToSuspect) {
        this.associationToSuspect = associationToSuspect;
    }

    public Suspect getSuspectAssociatedTo() {
        return suspectAssociatedTo;
    }

    public void setSuspectAssociatedTo(Suspect association) {
        this.suspectAssociatedTo = association;
    }

    public void addStory(String story) {
        stories.add(story);
    } 

    public ArrayList<String> getStory() {
        return stories;
    }

    public  String getLastStory() {
        return stories.get(stories.size()-1);
    }
}
