import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    
    public static void saveUsers() {
        ArrayList<User> userList = DataLoader.getUsers();
        JSONArray jsonUsers = new JSONArray();
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
