import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLoaderTest {
    private CriminalApplication crapp = CriminalApplication.getInstance();
	private ArrayList<User> userList = crapp.getUsers();
	private ArrayList<Crime> crimeList = crapp.getCrimes();
	private ArrayList<Criminal> criminalList = crapp.getCriminals();
	private ArrayList<Evidence> evidenceList = crapp.getEvidence();
	private ArrayList<PersonOfInterest> poiList = crapp.getPersonsOfInterest();
	private ArrayList<Suspect> suspectList = crapp.getSuspects();
	private ArrayList<Victim> victimList = crapp.getVictims();
	private ArrayList<Witness> witnessList = crapp.getWitnesses();
	
	@BeforeEach
	public void setup() {
		userList.clear();
        crimeList.clear();
		userList.add(new User("asmith", "Amy", "Smith", 19, "803-454-3344"));
		userList.add(new User("bwhite", "Bob", "White", 23, "803-333-3544"));
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDown() {
		Users.getInstance().getUsers().clear();
		DataWriter.saveUsers();
	}
    
}
