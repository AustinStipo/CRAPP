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
            FileReader reader = new FileReader(USER_FILE_NAME);
			JSONParser parser = new JSONParser();	
			JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
            ArrayList<Crime> crimesWorking = new ArrayList<Crime>();

            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
				UUID id = UUID.fromString((String)personJSON.get(USER_ID));
				String firstName = (String)personJSON.get(USER_FIRST_NAME);
				String lastName = (String)personJSON.get(USER_LAST_NAME);
				String email = (String)personJSON.get(USER_EMAIL);
				String phoneNumber = (String)personJSON.get(USER_PHONE_NUMBER);
				String precinct = (String)personJSON.get(USER_PRECINCT);
				String department = (String)personJSON.get(USER_DEPARTMENT);
				String badgeNumber = (String)personJSON.get(USER_BADGE_NUMBER);
				String rank = (String)personJSON.get(USER_RANK);
				String password = (String)personJSON.get(USER_PASSWORD);
                JSONArray crimes = (JSONArray)new JSONParser().parse(USER_CRIME);
                for(int j = 0; j < crimes.size(); j++) {
                    JSONObject crime = (JSONObject)crimes.get(i);
                    UUID cid = UUID.fromString((String)crime.get(CRIME_ID));
                    crimesWorking.add(); // I think I need to create a new Crimes class
                }

                users.add(new User(id, firstName, lastName, email, phoneNumber, precinct, department, badgeNumber, rank, password, crimesWorking));
            }
            return users;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Crime> getCrimes() {
        ArrayList<Crime> crimes = new ArrayList<Crime>();
        
        try {
            FileReader reader = new FileReader(CRIME_FILE_NAME);
            JSONParser parser = new JSONParser();	
            JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
            ArrayList<User> detectives = new ArrayList<User>();
    
            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                UUID id = UUID.fromString((String)personJSON.get(CRIME_ID));
                String location = (String)personJSON.get(CRIME_LOCATION);
                String date = (String)personJSON.get(CRIME_DATE);
                String description = (String)personJSON.get(CRIME_DESCRIPTION);
                String crimeType = (String)personJSON.get(CRIME_TYPE);
                JSONArray users = (JSONArray)new JSONParser().parse(CRIME_USERS);
                for(int j = 0; j < crimes.size(); j++) {
                    JSONObject user = (JSONObject)users.get(i);
                    UUID cid = UUID.fromString((String)user.get(CRIME_ID));
                    detectives.add(); // I think I need to create a new Users class
                }
                int severity = ((Long)personJSON.get(CRIME_SEVERITY)).intValue();
                String jurisdiction = (String)personJSON.get(CRIME_JURISDICTION);
                UUID enteredCrimeID = UUID.fromString((String)personJSON.get(CRIME_ENTERED_ID));
                User enteredCrime = Users.get(enteredCrimeID);

                Crime crime = new Crime(id, location, date, description, crimeType, detectives, severity, jurisdiction, enteredCrime);

                JSONArray vics = (JSONArray)new JSONParser().parse(CRIME_VICTIMS);
                for(int j = 0; j < vics.size(); j++) {
                    JSONObject vic = (JSONObject)vics.get(i);
                    UUID vid = UUID.fromString((String)vic.get(VICTIM_ID));
                    crime.addVictim(); // I think I need to create a new Victims class
                }
                
                JSONArray wits = (JSONArray)new JSONParser().parse(CRIME_WITNESSSES);
                for(int j = 0; j < wits.size(); j++) {
                    JSONObject wit = (JSONObject)wits.get(i);
                    UUID wid = UUID.fromString((String)wit.get(WITNESS_ID));
                    crime.addWitness(); // I think I need to create a new Victims class
                }
                
                JSONArray pers = (JSONArray)new JSONParser().parse(CRIME_POI);
                for(int j = 0; j < pers.size(); j++) {
                    JSONObject per = (JSONObject)pers.get(i);
                    UUID pid = UUID.fromString((String)per.get(POI_ID));
                    crime.addPersonOfInterest(); // I think I need to create a new Victims class
                }

                JSONArray susps = (JSONArray)new JSONParser().parse(CRIME_SUSPECTS);
                for(int j = 0; j < susps.size(); j++) {
                    JSONObject susp = (JSONObject)susps.get(i);
                    UUID sid = UUID.fromString((String)susp.get(SUSPECT_ID));
                    crime.addSuspect(); // I think I need to create a new Victims class
                }

                JSONArray evids = (JSONArray)new JSONParser().parse(CRIME_EVIDENCE);
                for(int j = 0; j < evids.size(); j++) {
                    JSONObject evid = (JSONObject)evids.get(i);
                    UUID eid = UUID.fromString((String)evid.get(EVIDENCE_ID));
                    crime.addEvidence(); // I think I need to create a new Victims class
                }

                JSONArray crims = (JSONArray)new JSONParser().parse(CRIME_CRIMINALS);
                for(int j = 0; j < crims.size(); j++) {
                    JSONObject crim = (JSONObject)crims.get(i);
                    UUID cid = UUID.fromString((String)crim.get(CRIMINAL_ID));
                    crime.addCriminal(); // I think I need to create a new Victims class
                }
                
                boolean solved = ((Boolean)personJSON.get(CRIME_SEVERITY)).booleanValue();
                crime.setSolved(solved);

                String extraInfo = (String)personJSON.get(CRIME_EXTRA_INFO);
                UUID addedInfoID = UUID.fromString((String)personJSON.get(CRIME_ADDED_INFO));
                User addedInfo = Users.get(enteredCrimeID);
                crime.addingInfo(extraInfo, addedInfo);
                
                String image = (String)personJSON.get(CRIME_IMAGE);
                crime.setImage(image);

                crimes.add(crime);
    
            }
            return crimes;

        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Criminal> getCriminals() {
        ArrayList<Criminal> criminals = new ArrayList<Criminal>();

        try {
            FileReader reader = new FileReader(CRIMINAL_FILE);
            JSONParser parser = new JSONParser();	
            JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
            ArrayList<User> detectives = new ArrayList<User>();
    
            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                UUID id = UUID.fromString((String)personJSON.get(CRIMINAL_ID));
                String firstName = (String)personJSON.get(CRIMINAL_FIRST_NAME);
                String lastName = (String)personJSON.get(CRIMINAL_LAST_NAME);
                int age = ((Long)personJSON.get(CRIMINAL_AGE)).intValue();
                int weight = ((Long)personJSON.get(CRIMINAL_WEIGHT)).intValue();
                int height = ((Long)personJSON.get(CRIMINAL_HEIGHT)).intValue();
                String skinColor = (String)personJSON.get(CRIMINAL_SKIN);
                String hairColor = (String)personJSON.get(CRIMINAL_HAIR);
                String eyeColor = (String)personJSON.get(CRIMINAL_EYE);
                String address = (String)personJSON.get(CRIMINAL_ADDRESS);
                String image = (String)personJSON.get(CRIMINAL_IMAGE);
                boolean hasTattoos = ((Boolean)personJSON.get(CRIMINAL_HAS_TATTOOS)).booleanValue();
                String tattoos = (String)personJSON.get(CRIMINAL_TATTOOS);
                String aliases = (String)personJSON.get(CRIMINAL_ALIASES);
                String associates = (String)personJSON.get(CRIMINAL_ASSOCIATES); //Need to point to other criminals
                String pastCrimes = (String)personJSON.get(CRIMINAL_PAST_CRIMES); //Need to point to crimes
                boolean jail = ((Boolean)personJSON.get(CRIMINAL_JAIL)).booleanValue();
                boolean alive = ((Boolean)personJSON.get(CRIMINAL_ALIVE)).booleanValue();
                boolean chargesDropped = ((Boolean)personJSON.get(CRIMINAL_CHARGES_DROPPED)).booleanValue();
                int severity = ((Long)personJSON.get(CRIMINAL_SEVERITY)).intValue();
                String enteredCriminal = (String)personJSON.get(CRIMINAL_ENTERED_CRIMINAL); //Needs to point to user that entered it
                String addedInfo = (String)personJSON.get(CRIMINAL_ADDED_INFO);

                Criminal criminal = new Criminal(firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, enteredCriminal);
                criminal.setImage(image);
                if(hasTattoos) {
                    criminal.addTattoo(tattoos);                    
                }
                criminal.addAlias(aliases);
                criminal.addAssociate(associates); // need to point to other criminals
                criminal.addPastCrime(pastCrimes);
                criminal.setJail(jail);
                criminal.setAlive(alive);
                criminal.setChargesDropped(chargesDropped);
                criminal.setSeverity(severity);
                criminal.addingInfo(info, addedInfo); //Need info and person that added it
                
                criminals.add(criminal);
            }
            
            return criminals;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Evidence> getEvidences() {
        ArrayList<Evidence> evidences = new ArrayList<Evidence>();

        try {
            FileReader reader = new FileReader(EVIDENCE_FILE);
            JSONParser parser = new JSONParser();	
            JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
    
            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                UUID id = UUID.fromString((String)personJSON.get(EVIDENCE_ID));
                String evidenceType = (String)personJSON.get(EVIDENCE_TYPE);
                String location = (String)personJSON.get(EVIDENCE_LOCATIONS);
                String time = (String)personJSON.get(EVIDENCE_TIMES);
                String enteredEvidence = (String)personJSON.get(EVIDENCE_ENTERED);
                String handled = (String)personJSON.get(EVIDENCE_HANDLED);//Might need to get rid of this
                String comments = (String)personJSON.get(EVIDENCE_COMMENTS);

                evidences.add(new Evidence(evidenceType, location, time, enteredEvidence, comments));
            }
            return evidences;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<PersonOfInterest> getPOIs() {
        ArrayList<PersonOfInterest> personsofinterest = new ArrayList<PersonOfInterest>();

        try {
            FileReader reader = new FileReader(POI_FILE);
            JSONParser parser = new JSONParser();	
            JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
    
            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                UUID id = UUID.fromString((String)personJSON.get(POI_ID));
                String firstName = (String)personJSON.get(POI_FIRST_NAME);
                String lastName = (String)personJSON.get(POI_LAST_NAME);
                int age = ((Long)personJSON.get(POI_AGE)).intValue();
                String address = (String)personJSON.get(POI_ADDRESS);
                String image = (String)personJSON.get(POI_IMAGE);
                String phoneNumber = (String)personJSON.get(POI_PHONE_NUMBER);
                String email = (String)personJSON.get(POI_EMAIL);
                String suspectAssociationTo = (String)personJSON.get(POI_SUSPECT_ASSOCIATION_TO); //NEEDS to be a suspect
                String associationToSuspect = (String)personJSON.get(POI_ASSOCIATION_TO_SUSPECT);
                String stories = (String)personJSON.get(POI_STORIES);

                personsofinterest.add(new PersonOfInterest(name, age, height, weight, skinColor, hairColor, eyeColor, address, phoneNumber, email, associationToCase, associationToSuspect))
            }
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
