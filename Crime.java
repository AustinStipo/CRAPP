/**
 * @author Sarah Carlucci
 */

import java.util.ArrayList;

public class Crime {
    
    private String location;
    private String date;
    private String description;
    private String crimeType;
    private ArrayList<Victim> victims;
    private ArrayList<Witness> witnesses;
    private ArrayList<Suspect> suspects;
    private ArrayList<Criminal> criminals;
    private ArrayList<PersonOfInterest> personOfInterest;
    private ArrayList<Evidence> evidence;
    private ArrayList<User> users;
    private boolean solved;
    private int severity;
    private String jurisdiction;
    private User enteredCrime;
    private String extraInfo;
    private ArrayList<User> addedInfo;
    private String image;
    private int id;

    public Crime(int id, String location, String date, String description, String crimeType, ArrayList<User> detectives, int severity, String jurisdiction, User enteredCrime) {
        this.id = id;
        this.location = location;
        this.date = date;
        this.description = description;
        this.crimeType = crimeType;
        this.users = detectives;
        this.severity = severity;
        this.jurisdiction = jurisdiction;
        this.enteredCrime = enteredCrime;
    }
    
    public int getUuid() {
        return id;
    }

    public String getLocation() {
        return this.location;
    }


    public void setLocation(String location) {
        this.location = location;
    } 

    public String getDate() {
        return this.date;
    } 

    public void setDate(String date){
        this.date = date;
    } 

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    } 

    public String getCrimeType(){
        return this.crimeType;
    } 

    public void setCrimeType(String crimeType){
        this.crimeType = crimeType;
    } 

    public void addVictim(Victim victim){
        victims.add(victim);
    } 

    public ArrayList<Victim> getVictims(){
        return victims;
    } 

    public void addWitness(Witness witness){
        witnesses.add(witness);
    } 

    public ArrayList<Witness> getWitnesses(){
        return witnesses;
    } 

    public void addPersonOfInterest(PersonOfInterest person){
        personOfInterest.add(person);
    } 

    public ArrayList<PersonOfInterest> getPersonOfInterest(){
        return personOfInterest;
    } 

    public void addSuspect(Suspect suspect){
        suspects.add(suspect);
    } 

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    public void addUser(User user) {
        users.add(user);
    } 

    public ArrayList<User> getUsers() {
        return users;
    } 
    
    public void addEvidence(Evidence evidence){
        this.evidence.add(evidence);
    } 

    public ArrayList<Evidence> getEvidence() {
        return evidence;
    } 

    public boolean getSolved() {
        return solved;
    } 

    public void setSolved(boolean solved) {
        this.solved = solved;
    } 

    public int getSeverity() {
        return severity;
    } 

    public void setSeverity(int severity) {
        this.severity = severity;
    } 

    public void addCriminal (Criminal criminal) {
        criminals.add(criminal);
    } 

    public ArrayList<Criminal> getCriminals() {
        return criminals;
    } 

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    } 

    public User getEnteredCrime() {
        if(users == null) {
            return null;
        }
        return users.get(0);
    }

    public void setCrimeSeverity(int severity) {
        this.severity = severity;
    } 
    
    public String toString() {
        String userNames = "";
        String victs = "";
        String witns = "";
        String pois = "";
        String susps = "";
        String crims = "";
        for(User u: users) {
            userNames = userNames + u.getFirstName() + " " + u.getLastName() + ", ";
        }
        for(Victim v: victims) {
            victs = victs + v.getFirstName() + " " + v.getLastName() + ", ";
        }
        for(Witness w: witnesses) {
            witns = witns + w.getFirstName() + " " + w.getLastName() + ", ";
        }
        for(PersonOfInterest p: personOfInterest) {
            pois = pois + p.getFirstName() + " " + p.getLastName() + ", ";
        }
        for(Suspect s: suspects) {
            susps = susps + s.getFirstName() + " " + s.getLastName() + ", ";
        }
        for(Criminal c: criminals) {
            crims = crims + c.getFirstName() + " " + c.getLastName() + ", ";
        }
        for(User u: users) {
            userNames = userNames + u.getFirstName() + " " + u.getLastName() + ", ";
        }
        return "A " + crimeType + " happenned on " + date + " at the " + location + "\nDescription: " + description + "\nSolved?: " + solved + "\nSeverity: " + severity +
        "\nJurisdiction: " + jurisdiction + "\nOn the case: " + userNames + "\nVictims: " + victs + "\nWitnesses: " + witns + "\nPersons of Interest: " + pois + "\nSuspects: " + susps + "\n" +
        "\nCriminals: " + crims + "\nExtra Info: " + extraInfo;
    }

    public void addingInfo(String info, User user){
        addedInfo.add(user);
        extraInfo = extraInfo + "\n" + info;
    } 

    public String getImage() {
        return image;
    } 

    public void setImage(String image) {
        this.image = image;
    } 


}
