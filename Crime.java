/**
 * @author Sarah Carlucci
 */

import java.util.ArrayList;
import java.util.UUID;

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
    private UUID id;

    public Crime(UUID id, String location, String date, String description, String crimeType, ArrayList<User> detectives, int severity, String jurisdiction, User enteredCrime) {

    }

    public String getLocation() {
        return "";
    }


    public void setLocation(String location) {

    } 

    public String getDate() {
        return "";
    } 

    public void setDate(String date){

    } 

    public String getDescription() {
        return "";
    }

    public void setDescription(String description){

    } 

    public String getCrimeType(){
        return "";
    } 

    public void setCrimeType(String crimeType){

    } 

    public void addVictim(Victim victim){

    } 

    public ArrayList<Victim> getVictims(){
        return victims;
    } 

    public void addWitness(Witness witness){

    } 

    public ArrayList<Witness> getWitnesses(){
        return witnesses;
    } 

    public void addPersonOfInterest(PersonOfInterest person){

    } 

    public ArrayList<PersonOfInterest> getPersonOfInterest(){
        return personOfInterest;
    } 

    public void addSuspect(Suspect suspect){

    } 

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    public void addUser(User user) {

    } 

    public ArrayList<User> getUsers() {
        return users;
    } 
    
    public void addEvidence(Evidence evidence){

    } 

    public ArrayList<Evidence> getEvidence() {
        return evidence;
    } 

    public boolean getSolved() {
        return true;
    } 

    public void setSolved(boolean solved) {

    } 

    public int getSeverity() {
        return 1;
    } 

    public void setSeverity(int severity) {

    } 

    public void addCriminal (Criminal criminal) {

    } 

    public ArrayList<Criminal> getCriminals() {
        return criminals;
    } 

    public String getJurisdiction() {
        return "";
    }

    public void setJurisdiction(String jurisdiction) {

    } 

    public User getEnteredCrime() {
        return users.get(0);
    }

    public void setCrimeSeverity(int severity) {

    } 

    public String toString() {
        return "";
    }

    public void addingInfo(String info, User user){

    } 

    public String getImage() {
        return "";
    } 

    public void setImage(String image) {

    } 


}
