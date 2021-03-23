import java.util.ArrayList;

/**
 * A Suspect
 * @author Connor Downey, Alex Santoro, Austin Stipo, and Sarah Carlucci
 */
public class Suspect extends Person{
    private boolean hasTattoos;
    private ArrayList<String> tattoos;
    private ArrayList<String> aliases;
    private ArrayList<Person> associates;
    private ArrayList<Crime> pastCrimes;
    private ArrayList<Evidence> evidence;
    private String alibi;

    /**
     * @param id an identifier for the suspect
     * @param firstName first name of the suspect
     * @param lastName last name of the suspect
     * @param age age of the suspect
     * @param height height of the suspect
     * @param weight weight of the suspect
     * @param skinColor skin color of the suspect
     * @param hairColor hair color of the suspect
     * @param eyeColor eye color of the suspect
     * @param address address of the suspect
     * @param alibi alibi of the suspect
     */
    public Suspect(int id, String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, String alibi) {
        super(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        setAlibi(alibi);
        tattoos = new ArrayList<String>();
        aliases = new ArrayList<String>();
        associates = new ArrayList<Person>();
        pastCrimes = new ArrayList<Crime>();
        evidence = new ArrayList<Evidence>();
    }

    /**
     * Empty Suspect Constructor
     */
    public Suspect() {

    }

    /**
     * Adds a tattoo to the list of tattoos
     * @param tattoos tattoos of the suspect
     */
    public void addTattoo(String tattoos) {
        this.tattoos.add(tattoos);
    }

    /**
     * Returns the tattoos of the suspect
     * @return The tattos
     */
    public String getTattoo() {
        return tattoos.get(tattoos.size() - 1);
    }

    /**
     * Returns true if tattos are present on the suspect
     * @return The tattos
     */
    public boolean getHasTattoos() {
        if(tattoos.size() > 0) {
            hasTattoos = true;
        }
        return hasTattoos;
    }

    /**
     * Adds an alias to the list of alias
     * @param aliases alias of the suspect
     */
    public void addAlias(String aliases) {
        this.aliases.add(aliases);
    }

    /**
     * Returns the aliases of the suspect
     * @return The alias
     */
    public String getAlias() {
        return aliases.get(aliases.size() - 1);
    }

    /**
     * Adds an associate to the list of associates
     * @param associates associate of the suspect
     */
    public void addAssociate(Person person) {
        associates.add(person);
    }

    /**
     * Adds a crime to the list of past crimes
     * @param crime past crimes of the suspect
     */
    public void addCrime(Crime crime) {
        pastCrimes.add(crime);
    }

    /**
     * Returns list of past crimes 
     * @param pastCrimes past crimes of the suspect
     */
    public ArrayList<Crime> getCrimes() {
        return pastCrimes;
    }

    /**
     * Removes a crime to the list of past crimes
     * @param pastCrimes crimes of the suspect
     */
    public void removeCrime(Crime crime){
        pastCrimes.remove(crime);
    }

    /**
     * Adds evidence to the list of evidence
     * @param evidence evidence related to suspect
     */
    public void addEvidence(Evidence evidence) {
        this.evidence.add(evidence);
    }

    /**
     * Returns the alibi of the suspect
     * @return The alibi
     */
    public String getAlibi() {
        return this.alibi;
    }

    /**
     * Sets the alibis of the suspect
     * @param alibi alibi of the suspect
     */
    public void setAlibi(String alibi) {
        this.alibi = alibi;
    }
}
