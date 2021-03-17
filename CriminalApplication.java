// import org.graalvm.compiler.nodes.virtual.EnsureVirtualizedNode;
import java.util.ArrayList;
import java.util.UUID;

/**
 * A Criminal Application
 * @author Connor Downey, Alex Santoro, Austin Stipo, and Sarah Carlucci
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

    /**
     * Creates a Criminal Application
     */
    public CriminalApplication() {
        crimes = DataLoader.getCrimes();
        users = DataLoader.getUsers();
    }

    /**
     * Returns an instance of the static Criminal Application
     * @return The Criminal Application
     */
    public static CriminalApplication getInstance() {
        if(crapp == null) {
            crapp = new CriminalApplication();
        }

        return crapp;
    }

    /**
     * Adds a criminal to the list of criminals
     * @param criminal Criminal for a crime
     */
    public void addCriminal(Criminal criminal) {

    }

    /**
     * Returns the criminals associated with a crime
     * @return The criminals
     */
    public ArrayList<Criminal> getCriminals() {
        return criminals;
    }

    /**
     * Removes a criminal from the list of criminals
     * @param criminal Criminal for a crime
     * @return Returns true if the criminal is succesfully removed and false otherwise
     */
    public boolean removeCriminal(Criminal criminal) {
        return true;
    }

    /**
     * Returns the length of the criminal list
     * @return Length of the list
     */
    public int criminalLength() {
        return 1;
    }

    /**
     * Searches for criminals
     * @param keyWord Keyword for search
     * @param category Category of search
     */
    public void searchCriminal(String keyWord, String category) {
       
    }

    /**
     * Adds a witness to the list of witnesses
     * @param witness Witness for a crime
     */
    public void addWitness(Witness witness) {

    }

    /**
     * Returns the witnesses of a crime
     * @return The witnesses
     */
    public ArrayList<Witness> getWitness() {
        return witnesses;
    }

    /**
     * Adds a suspect to the list of suspect
     * @param suspect suspect for a crime
     */
    public void addSuspect(Suspect suspect) {

    }

    /**
     * Returns the suspects of a crime
     * @return The suspects
     */
    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    /**
     * Adds a victim to the list of victims
     * @param victim Victim for a crime
     */
    public void addVictim(Victim victim) {

    }

    /**
     * Returns the victims of a crime
     * @return The victims
     */
    public ArrayList<Victim> getVictim() {
        return victims;
    }

    /**
     * Adds a person of interest to the list of people of interest
     * @param personOfInterest Person of interest for a crime
     */
    public void addPersonOfInterest(PersonOfInterest personOfInterest) {

    }

    /**
     * Returns the people of interest for a crime
     * @return The people of interest
     */
    public ArrayList<PersonOfInterest> getPersonOfInterest() {
        return personOfInterest;
    }

    /**
     * Adds a piece of evidence to the list of evidence
     * @param evidence Evidence for a crime
     */
    public void addEvidence(Evidence evidence) {

    }

    /**
     * Returns the evidence for a crime
     * @return The evidence
     */
    public ArrayList<Evidence> getEvidences() {
        return evidence;
    }

    /**
     * Adds a crime to the list of crimes
     * @param crime A crime
     */
    public void addCrime(Crime crime) {
        
    }

    /**
     * Returns a list of crimes
     * @return The crimes
     */
    public ArrayList<Crime> getCrimes() {
        return crimes;
    }

    /**
     * Returns a crime given an id
     * @param id Identifier for the crime
     * @return The crime
     */
    public Crime getCrime(int id) {
        for(Crime crime: crimes) {
            if(crime.getUuid() == id) {
                return crime;
            }
        }
        return null;
    }

    /**
     * Returns the length of the crime
     * @return The length of the crime
     */
    public int crimeLength() {
        return 1;
    }

    /**
     * Adds a user to the list of users
     * @param user A user
     */
    public void addUser(User user) {
        users.add(user);
    }

    /**
     * Returns a list of users
     * @return The users
     */
    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * Returns a user given an id
     * @param id Identifier for the user
     * @return The user
     */
    public User getUser(int id) {
        for(User user: users) {
            if(user.getUuid() == id) {
                return user;
            }
        }
        return null;
    }

    /**
     * Searches for crime
     * @param keyWord Keyword for search
     * @param category Category of search
     */
    public void searchCrime(String keyWord, String category) {

    }

    /**
     * Returns a list of criminals ranked
     * @return The list of criminals
     */
    public ArrayList<Criminal> rankCriminals() {
        return criminals;
    }

}
