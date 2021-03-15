import java.util.ArrayList;
import java.util.UUID;

public class Crimes {
	private static Crimes crimes;
	private ArrayList<Crime> crimeList;
	
	private Crimes() {
		crimeList = DataLoader.getCrimes();
	}
	
	public static Crimes getInstance() {
		if(crimes == null) {
			crimes = new Crimes();
		}
		
		return crimes;
	}

	public boolean haveCrime(UUID id) {
		for(Crime crime : crimeList) {
			if(crime.getUuid().equals(id)) {
				return true;
			}
		}
		
		return false;
	}
	
	public Crime getCrime(UUID id) {
		for(Crime crime : crimeList) {
			if(crime.getUuid().equals(id)) {
				return crime;
			}
		}
		
		return null;
	}
	
	public ArrayList<Crime> getCrimes() {
		return crimeList;
	}
	
	public boolean addCrime(UUID id, String location, String date, String description, String crimeType, ArrayList<User> detectives, int severity, String jurisdiction, User enteredCrime) {
		if(haveCrime(id)) {
            return false;
        }
		crimeList.add(new Crime(id, location, date, description, crimeType, detectives, severity, jurisdiction, enteredCrime));
		return true;
	}
	
	public void saveCrimes() {
		DataWriter.saveCrimes();
	}
}