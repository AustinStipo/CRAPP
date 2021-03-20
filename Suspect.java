import java.util.ArrayList;

public class Suspect extends Person{
    private boolean hasTattoos;
    private ArrayList<String> tattoos;
    private ArrayList<String> aliases;
    private ArrayList<Person> associates;
    private ArrayList<Crime> pastCrimes;
    private ArrayList<Evidence> evidence;
    private String alibi;

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

    public void addTattoo(String tattoos) {
        this.tattoos.add(tattoos);
    }

    public String getTattoo() {
        return tattoos.get(tattoos.size() - 1);
    }

    public boolean getHasTattoos() {
        if(tattoos.size() > 0) {
            hasTattoos = true;
        }
        return hasTattoos;
    }

    public void addAlias(String aliases) {
        this.aliases.add(aliases);
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

    public ArrayList<Crime> getCrimes() {
        return pastCrimes;
    }

    public void removeCrime(Crime crime){
        pastCrimes.remove(crime);
    }

    public void addEvidence(Evidence evidence) {
        this.evidence.add(evidence);
    }

    public String getAlibi() {
        return this.alibi;
    }

    public void setAlibi(String alibi) {
        this.alibi = alibi;
    }
    
}
