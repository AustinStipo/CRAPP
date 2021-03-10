import java.util.ArrayList;

public class Criminal extends Person{
    private boolean hasTattoos;
    private ArrayList<String> tattoos;
    private ArrayList<String> aliases;
    private ArrayList<Person> associates;
    private ArrayList<Crime> pastCrimes;
    private boolean jail;
    private boolean alive;
    private boolean chargesDropped;
    private int severity;
    private User enteredCriminal;
    private ArrayList<User> addedInfo;
    private String birthDate;

    public Criminal(String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, User enteredCriminal) {
        super(firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        this.enteredCriminal = enteredCriminal;
    }

    public void addTattoo(String tattoos) {
        
    }

    public void addAlias(String aliases) {

    }

    public void addAssociate(Person person) {
        
    }

    public void addCrime(Crime crime) {
        
    }

    public void removeCrime(Crime crime){

    }

    public boolean getJail() {
        return this.jail;
    }

    public void changeJail() {
        
    }

    public boolean getAlive() {
        return this.alive;
    }

    public void changeAlive() {
        
    }

    public void chargesDropped() {
        
    }

    public int getSeverity() {
        return this.severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String toString(){
        return "";
    }

    public void addingInfo(String info, User user) {
        
    }

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Suspect convertToSuspect() {
        return new Suspect(birthDate, birthDate, severity, severity, severity, birthDate, birthDate, birthDate, birthDate, birthDate);
    }
}
