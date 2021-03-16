import java.util.ArrayList;

public class Suspect extends Person{
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
    }

    public void addTattoo(String tattoos) {
        this.tattoos.add(tattoos);
    }

    public void addAlias(String aliases) {
        this.aliases.add(aliases);
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
