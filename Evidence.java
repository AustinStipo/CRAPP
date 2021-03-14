/**
 * @author Sarah Carlucci 
 */
import java.util.ArrayList;

public class Evidence {
    
    private String evidenceType;
    private ArrayList<String> locations;
    private ArrayList<String> times;
    private User enteredEvidence;
    private ArrayList<User> handleEvidence;
    private ArrayList<String> comments;


    public Evidence(String evidenceType, String location, String time, User enteredEvidence, String comment) {

    }

    public String getEvidenceType() {
        return "Evidence Type: "+ evidenceType;
    } 

    public void addLocation(String location) {
        this.location = location;
    } 

    public ArrayList<String> getLocations() {
        return locations;
    } 

    public String getLastLocation() {
        return "";
    } 

    public void addTime(String time) {

    } 

    public ArrayList<String> getTimes() {
        return times;
    } 

    public String getLastTime() {
        return "";
    } 

    public User getEnteredEvidence() {
        return handleEvidence.get(0);
    } 

    public void addHandleEvidence(User user) {

    } 

    public  ArrayList<User> getHandleEvidence() {
        return handleEvidence;
    }

    public User getLastHandleEvidence() {
        return handleEvidence.get(0);
    }

    public void addComment(String comment) {

    }

    public ArrayList<String> getComments() {
        return comments;
    } 

    public String getLastComment() {
        return "";
    }
}
