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

    public Criminal(int id, String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, User enteredCriminal) {
        super(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        this.enteredCriminal = enteredCriminal;
        tattoos = new ArrayList<String>();
        aliases = new ArrayList<String>();
        associates = new ArrayList<Person>();
        pastCrimes = new ArrayList<Crime>();
        addedInfo = new ArrayList<User>();
    }

    /**
     * Empty Criminal Constructor
     */
    public Criminal() {

    }

    public User getEnteredCriminal() {
        return enteredCriminal;
    }

    public void addTattoo(String tattoo) {
        tattoos.add(tattoo);
    }

    public String getTattoo() {
        return tattoos.get(tattoos.size() - 1);
    }

    public boolean getHasTattoos() {
        return hasTattoos;
    }

    public void addAlias(String alias) {
        aliases.add(alias);
    }

    public String getAlias() {
        return aliases.get(aliases.size() - 1);
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
        jail = !jail;
    }

    public boolean getAlive() {
        return this.alive;
    }

    public void setAlive(boolean living) {
        alive = living;
    }

    public void changeAlive() {
        alive = !alive;
    }

    public void setChargesDropped(boolean dropped) {
        chargesDropped = dropped;
        if(pastCrimes.size() > 0) {
            pastCrimes.remove(pastCrimes.size() - 1);
        }
    }

    public boolean getChargesDropped() {
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

    // public void addingInfo(String info, User user) {
    //     addedInfo.add(info);
    //     addedInfo.add(user);
    // } Do we even need this method. It doesn't seem to make a lot of sense

    public String getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Suspect convertToSuspect() {
        return new Suspect(this.getUuid(), this.getFirstName(), this.getLastName(), 
        this.getAge(), this.getHeight(), this.getWeight(), this.getSkinColor(), 
        this.getHairColor(), this.getEyeColor(), this.getAddress(), "no alibi");
    }
}
