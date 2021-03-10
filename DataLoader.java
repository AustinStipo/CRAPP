import java.io.FileReader;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
    
    public static ArrayList<User> getUsers() {
        ArrayList<User> users = new ArrayList<User>();

        try {
            return users;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Crime> getCrimes() {
        ArrayList<Crime> crimes = new ArrayList<Crime>();

        try {
            return crimes;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Criminal> getCriminals() {
        ArrayList<Criminal> criminals = new ArrayList<Criminal>();

        try {
            return criminals;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Evidence> getEvidences() {
        ArrayList<Evidence> evidences = new ArrayList<Evidence>();

        try {
            return evidences;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<PersonOfInterest> getPOIs() {
        ArrayList<PersonOfInterest> personsofinterest = new ArrayList<PersonOfInterest>();

        try {
            return personsofinterest;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Suspect> getSuspects() {
        ArrayList<Suspect> suspects = new ArrayList<Suspect>();

        try {
            return suspects;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Victim> getVictims() {
        ArrayList<Victim> victims = new ArrayList<Victim>();

        try {
            return victims;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Witness> getWitnesses() {
        ArrayList<Witness> witnesses = new ArrayList<Witness>();

        try {
            return witnesses;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
}
