// import org.graalvm.compiler.nodes.virtual.EnsureVirtualizedNode;
import java.util.ArrayList;
import java.util.UUID;

/**
 * @author Sarah Carlucci
 */
public class CriminalApplication {
    
    private static CriminalApplication crapp;
    private ArrayList<Criminal> criminals;
    private ArrayList<Witness> witnesses;
    private ArrayList<Suspect> suspects;
    private ArrayList<Victim> victims;
    private ArrayList<PersonOfInterest> personOfInterest;
    private ArrayList<Evidence> evidence;
    private ArrayList<Crime> crimes;
    private ArrayList<User> users;

    public CriminalApplication() {
        crimes = DataLoader.getCrimes();
        users = DataLoader.getUsers();
    }

    public static CriminalApplication getInstance() {
        if(crapp == null) {
            crapp = new CriminalApplication();
        }

        return crapp;
    }

    public void addCriminal(Criminal criminal) {

    }

    public ArrayList<Criminal> getCriminals() {
        return criminals;
    }

    public boolean removeCriminal(Criminal criminal) {
        return true;
    }

    public int criminalLength() {
        return 1;
    }

    public void searchCriminal(String keyWord, String category) {
       
    }

    public void addWitness(Witness witness) {

    }

    public ArrayList<Witness> getWitness() {
        return witnesses;
    }

    public void addSuspect(Suspect suspect) {

    }

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    public void addVictim(Victim victim) {

    }

    public ArrayList<Victim> getVictim() {
        return victims;
    }

    public void addPersonOfInterest(PersonOfInterest personOfInterest) {

    }

    public ArrayList<PersonOfInterest> getPersonOfInterest() {
        return personOfInterest;
    }

    public void addEvidence(Evidence evidence) {

    }

    public ArrayList<Evidence> getEvidences() {
        return evidence;
    }

    public void addCrime(Crime crime) {
        
    }

    public ArrayList<Crime> getCrimes() {
        return crimes;
    }

    public Crime getCrime(int id) {
        for(Crime crime: crimes) {
            if(crime.getUuid() == id) {
                return crime;
            }
        }
        return null;
    }

    public int crimeLength() {
        return 1;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public User getUser(int id) {
        for(User user: users) {
            if(user.getUuid() == id) {
                return user;
            }
        }
        return null;
    }

    public void searchCrime(String keyWord, String category) {

    }

    public ArrayList<Criminal> rankCriminals() {
        return criminals;
    }

}
