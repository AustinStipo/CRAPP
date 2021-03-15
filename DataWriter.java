import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    
    public static void saveUsers() {
        Users users = Users.getInstance();
		ArrayList<User> userList = users.getUsers();
		JSONArray jsonUsers = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< userList.size(); i++) {
			jsonUsers.add(getUserJSON(userList.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
 
            file.write(jsonUsers.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveCrimes() {
        ArrayList<Crime> crimeList = DataLoader.getCrimes();
        JSONArray jsonCrimes = new JSONArray();
    }

    public static void saveCriminals() {
        ArrayList<Criminal> criminalList = DataLoader.getCriminals();
        JSONArray jsonCriminals = new JSONArray();
    }

    public static void saveEvidences() {
        ArrayList<Evidence> evidenceList = DataLoader.getEvidences();
        JSONArray jsonEvidences = new JSONArray();
    }

    public static void savePOIs() {
        ArrayList<PersonOfInterest> poiList = DataLoader.getPOIs();
        JSONArray jsonPOIs = new JSONArray();
    }

    public static void saveSuspects() {
        ArrayList<Suspect> suspectsList = DataLoader.getSuspects();
        JSONArray jsonSuspects = new JSONArray();
    }

    public static void saveVictims() {
        ArrayList<Victim> victimList = DataLoader.getVictims();
        JSONArray jsonVictims = new JSONArray();
    }

    public static void saveWitnesses() {
        ArrayList<Witness> witnessList = DataLoader.getWitnesses();
        JSONArray jsonWitnesss = new JSONArray();
    }

    public static JSONObject getUserJSON(User user) {
        JSONObject userDetails = new JSONObject();
        userDetails.put(ID, user.getUuid().toString());
		userDetails.put(FIRST_NAME, user.getFirstName());
		userDetails.put(LAST_NAME, user.getLastName());
		userDetails.put(EMAIL, user.getEmail());
		userDetails.put(PHONE_NUMBER, user.getPhoneNumber());
		userDetails.put(USER_PRECINCT, user.getPrecinct());
		userDetails.put(USER_DEPARTMENT, user.getDepartment());
		userDetails.put(USER_BADGE_NUMBER, user.getBadgeNumber());
		userDetails.put(USER_RANK, user.getRank());
		userDetails.put(USER_PASSWORD, user.getPassword());

        JSONArray crimes = new JSONArray();
        for(int j = 0; j < user.getCrimesWorking().size(); j++) {
            JSONObject crime = new JSONObject();
            crime.put(ID,user.getCrimesWorking().get(j).getUuid().toString();)
            crimes.add(crime);
        }
        userDetails.put(USER_CRIME, crimes);

        return userDetails;
    }

    public static JSONObject getCrimeJSON(Crime crime) {
        JSONObject crimeDetails = new JSONObject();
        return crimeDetails;
    }

    public static JSONObject getCriminalJSON(Criminal criminal) {
        JSONObject criminalDetails = new JSONObject();
        return criminalDetails;
    }

    public static JSONObject getEvidenceJSON(Evidence evidence) {
        JSONObject evidenceDetails = new JSONObject();
        return evidenceDetails;
    }

    public static JSONObject getPOIJSON(PersonOfInterest poi) {
        JSONObject poiDetails = new JSONObject();
        return poiDetails;
    }

    public static JSONObject getSuspectJSON(Suspect suspect) {
        JSONObject suspectDetails = new JSONObject();
        return suspectDetails;
    }

    public static JSONObject getVictimJSON(Victim victim) {
        JSONObject victimDetails = new JSONObject();
        return victimDetails;
    }

    public static JSONObject getWitnessJSON(Witness witness) {
        JSONObject witnessDetails = new JSONObject();
        return witnessDetails;
    }

}
