import java.util.ArrayList;

public class Suspect extends Person{
    private ArrayList<String> tattoos;
    private ArrayList<String> aliases;
    private ArrayList<Person> associates;
    private ArrayList<Crime> pastCrimes;
    private ArrayList<evidence> evidence;
    private String alibi;

    public Suspect(String firstName, String lastName, int age, int height, int weight, String skinColor,
            String hairColor, String eyeColor, String address, String alibi) {
        super(firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address);
        setAlibi(alibi);
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

    public void addEvidence(evidence evidence) {
        
    }

    public String getAlibi() {
        return this.alibi;
    }

    public void setAlibi(String alibi) {
        this.alibi = alibi;
    }
    
}