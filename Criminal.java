import java.util.ArrayList;
import java.util.UUID;

public class Criminal extends Person {
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

    public Criminal(UUID id, String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, User enteredCriminal) {
        super(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        this.enteredCriminal = enteredCriminal;
    }

    public void addTattoo(String tattoo) {
        tattoos.add(tattoo);
    }

    public void addAlias(String alias) {
        aliases.add(alias);
    }

    public void addAssociate(Person person) {
        associates.add(person);
    }

    public void addCrime(Crime crime) {
        pastCrimes.add(crime);
    }

    public void removeCrime(Crime crime){
        pastCrimes.remove(crime);
    }

    public boolean getJail() {
        return this.jail;
    }

    public void addPastCrime(Crime crime) {
        pastCrimes.add(crime);
    }

    public ArrayList<Crime> getPastCrimes() {
        return pastCrimes;
    }

    public void setJail(boolean jailed) {
        jail = jailed;
    }

    public void changeJail() {
        if(jail) {
            jail = false;
        }
        else {
            jail = true;
        }
    }

    public boolean getAlive() {
        return this.alive;
    }

    public void setAlive(boolean living) {
        alive = living;
    }

    public void changeAlive() {
        if(alive) {
            alive = false;
        }
        else {
            alive = true;
        }
    }

    public void setChargesDropped(boolean dropped) {
        chargesDropped = dropped;
    }

    public boolean chargesDropped() {
        return this.chargesDropped;
    }

    public int getSeverity() {
        return this.severity;
    }

    public void setSeverity(int severity) {
        this.severity = severity;
    }

    public String toString(){
        return "I'm not sure how we want to write this toString so I'll save this for later when we format";
    }

    public void addingInfo(String info, User user) {
        //addedInfo.add(info);
        addedInfo.add(user);
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
