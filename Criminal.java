import java.util.ArrayList;

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

    public Criminal(String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, User enteredCriminal) {
        super(firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        this.enteredCriminal = enteredCriminal;
    }

    public void addTattoo(String tattoos) {
        tattos.add(tattoos);
    }

    public void addAlias(String aliases) {
        aliases.add(aliases);
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

    public void changeJail() {
        if(Criminal.getJail == true) {
            Criminal.getJail == false;
        }
        if(Criminal.getJail == false) {
            Criminal.getJail == true;
        }
    }

    public boolean getAlive() {
        return this.alive;
    }

    public void changeAlive() {
        if(Criminal.getAlive == true) {
            Criminal.getAlive == false;
        }
        if(Criminal.getAlive == false) {
            Criminal.getAlive == true;
        }
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
        addedInfo.add(info);
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
