/**
 * @author Sarah Carlucci 
 */
import java.util.ArrayList;
import java.util.UUID;

public class PersonOfInterest extends Person{
    
    private String phoneNumber;
    private String email;
    private Suspect suspectAssociatedTo;
    private String associtationToSuspect;
    private ArrayList<String> stories;

    public PersonOfInterest(UUID id, String firstName, String lastName, int age, int height, int weight, String skinColor, String hairColor, String eyeColor, String address, String phoneNumber, String email, String associationToCase, String associationToSuspect) {

    }

    public String getPhoneNumber() {
        return "";
    } 

    public void setPhoneNumber(String phoneNumber) {

    } 

    public String getEmail() {
        return "";
    } 

    public void setEmail(String email) {

    }

    public String getAssociationToSuspect() {
        return "";
    } 

    public void setAssociationToSuspect(String association) {

    }

    public String getSuspectAssociatedTo() {
        return "";
    }

    public void setSuspectAssociatedTo(String association) {

    }

    public void addStory(String story) {

    } 

    public  String getLastStory() {
        return "";
    }
}
