import org.graalvm.compiler.nodes.virtual.EnsureVirtualizedNode;

/**
 * @author Sarah Carlucci
 */
public class CriminalApplication {
    
    private ArrayList<Criminal> criminals;
    private ArrayList<Witness> witnesses;
    private ArrayList<Suspect> suspects;
    private ArrayList<Victim> victims;
    private ArrayList<PersonOfInterest> personOfInterest;
    private ArrayList<Evidence> evidence;
    private ArrayList<Crime> crimes;

    public CriminalApplication() {

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

    public ArrayList<Suspect suspect> getSuspects() {
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

    public ArrayList<Evidence> getEvidence() {
        return evidence;
    }

    public void addCrime(Crime crime) {
        
    }

    public ArrayList<Crime> getCrime() {
        return crime;
    }

    public int crimeLength() {
        return 1;
    }

    public void searchCrime(String keyWord, String category) {

    }

    public ArrayList<Criminal> rankCriminals() {
        return criminals;
    }

}
