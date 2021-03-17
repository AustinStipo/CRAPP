/**
 * @author Sarah Carlucci 
 */
import java.util.ArrayList;

public class Evidence {
    
    private int id;
    private String evidenceType;
    private String location;
    private String time;
    private User enteredEvidence;
    // private User handleEvidence;
    private ArrayList<String> comments;


    public Evidence(int id, String evidenceType, String location, String time, User enteredEvidence, ArrayList<String> comment) {
        this.id = id;
        this.evidenceType = evidenceType;
        this.location = location;
        this.time = time;
        this.enteredEvidence = enteredEvidence;
        this.comments = comment;
    }
    
    public int getUuid() {
        return id;
    }

    public String getEvidenceType() {
        return "Evidence Type: "+ evidenceType;
    } 

    public void setLocation(String location) {
        this.location = location ;
    } 

    public String getLocation() {
        return location;
    } 

    // public String getLastLocation() {
    //     return locations.get(locations.size()-1);
    // } 

    public void setTime(String time) {
        this.time = time;
    } 

    public String getTime() {
        return time;
    } 

    // public String getLastTime() {
    //     return times.get(times.size()-1);
    // } 

    public User getEnteredEvidence() {
        return enteredEvidence;
    } 

    // public void addHandleEvidence(User user) {
    //     handleEvidence.add(user);
    // } 

    // public  ArrayList<User> getHandleEvidence() {
    //     return handleEvidence;
    // }

    // public User getLastHandleEvidence() {
    //     return handleEvidence.get(handleEvidence.size()-1);
    // }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public ArrayList<String> getComments() {
        return comments;
    } 

    public String getLastComment() {
        return comments.get(comments.size()-1);
    }
}
