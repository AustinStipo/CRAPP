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
    private ArrayList<PersonOfInterest> personsOfInterest;
    private ArrayList<Evidence> evidences;
    private ArrayList<Crime> crimes;
    private ArrayList<User> users;

    public CriminalApplication() {
        // crimes = DataLoader.getCrimes();
        users = DataLoader.getUsers();
        // criminals = DataLoader.getCriminals();
        // witnesses = DataLoader.getWitnesses();
        // suspects = DataLoader.getSuspects();
        // victims = DataLoader.getVictims();
        // personsOfInterest = DataLoader.getPOIs();
        evidences = DataLoader.getEvidences();
    }

    public static CriminalApplication getInstance() {
        if(crapp == null) {
            crapp = new CriminalApplication();
        }

        return crapp;
    }

    public void addCriminal(Criminal criminal) {
        criminals.add(criminal);
    }

    public ArrayList<Criminal> getCriminals() {
        return criminals;
    }

    public Criminal getCriminal(int id) {
        for(Criminal criminal: criminals) {
            if(criminal.getUuid() == id) {
                return criminal;
            }
        }
        return null;
    }

    public boolean removeCriminal(Criminal criminal) {
       return criminals.remove(criminal);
    }

    public int getCriminalLength() {
        return criminals.size();
    }

    /**
     * not sure how to search by keyword and category
     * gonna try something else we can always fix this later 
     */
    public void searchCriminal(String keyWord, String category) {
       
    }

    public Criminal searchCriminal(String firstName) {
        for(Criminal criminal: criminals) {
            if(criminal.getFirstName().equals(firstName)) {
                return criminal;
            }
        }
        return null;
    }

    public void addWitness(Witness witness) {
        witnesses.add(witness);
    }

    public ArrayList<Witness> getWitnesses() {
        return witnesses;
    }

    public Witness getWitness(int id) {
        for(Witness witness: witnesses) {
            if(witness.getUuid() == id) {
                return witness;
            }
        }
        return null;
    }

    public void addSuspect(Suspect suspect) {
        suspects.add(suspect);
    }

    public ArrayList<Suspect> getSuspects() {
        return suspects;
    }

    public Suspect getSuspect(int id) {
        for(Suspect suspect: suspects) {
            if(suspect.getUuid() == id) {
                return suspect;
            }
        }
        return null;
    }

    public void addVictim(Victim victim) {
        victims.add(victim);
    }   

    public ArrayList<Victim> getVictims() {
        return victims;
    }

    public Victim getVictim(int id) {
        for(Victim victim: victims) {
            if(victim.getUuid() == id) {
                return victim;
            }
        }
        return null;
    }

    public void addPersonOfInterest(PersonOfInterest personOfInterest) {
        this.personsOfInterest.add(personOfInterest);
    }

    public ArrayList<PersonOfInterest> getPersonsOfInterest() {
        return personsOfInterest;
    }

    public PersonOfInterest getPersonOfInterest(int id) {
        for(PersonOfInterest personOfInterest: personsOfInterest) {
            if(personOfInterest.getUuid() == id) {
                return personOfInterest;
            }
        }
        return null;
    }

    public void addEvidence(Evidence evidence) {
        evidences.add(evidence);
    }

    public ArrayList<Evidence> getEvidences() {
        return evidences;
    }

    public Evidence getEvidence(int id) {
        for(Evidence evidence: evidences) {
            if(evidence.getUuid() == id) {
                return evidence;
            }
        }
        return null;
    }

    public void addCrime(Crime crime) {
        crimes.add(crime);
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
        return crimes.size();
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

    /**
     * same thing as searchCriminal
     */
    public void searchCrime(String keyWord, String category) {
        
    }

    public Crime searchCrime(String crimeType) {
        for(Crime crime: crimes) {
            if(crime.getCrimeType().equals(crimeType)) {
                return crime;
            }
        }
        return null;
    }

    
    public ArrayList<Criminal> rankCriminals() {
        return criminals;
    }

}
