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
                int id = ((Long)personJSON.get(ID)).intValue();
				String firstName = (String)personJSON.get(FIRST_NAME);
				String lastName = (String)personJSON.get(LAST_NAME);
				String email = (String)personJSON.get(EMAIL);
				String phoneNumber = (String)personJSON.get(PHONE_NUMBER);
				String precinct = (String)personJSON.get(USER_PRECINCT);
				String department = (String)personJSON.get(USER_DEPARTMENT);
				String badgeNumber = (String)personJSON.get(USER_BADGE_NUMBER);
				String rank = (String)personJSON.get(USER_RANK);
				String password = (String)personJSON.get(USER_PASSWORD);

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
                int id = ((Long)personJSON.get(ID)).intValue();
                String location = (String)personJSON.get(LOCATION);
                String date = (String)personJSON.get(DATE);
                String description = (String)personJSON.get(DESCRIPTION);
                String crimeType = (String)personJSON.get(CRIME_TYPE);
                JSONArray users = (JSONArray)new JSONParser().parse(USERS);
                for(int j = 0; j < users.size(); j++) {
                    int uid = ((Long)personJSON.get(ID)).intValue();
                    detectives.add(CriminalApplication.getInstance().getUser(uid));
                }
                int severity = ((Long)personJSON.get(CRIME_SEVERITY)).intValue();
                String jurisdiction = (String)personJSON.get(CRIME_JURISDICTION);
                int enteredCrimeID = ((Long)personJSON.get(CRIME_ENTERED_ID)).intValue();
                User enteredCrime = CriminalApplication.getInstance().getUser(enteredCrimeID);

                Crime crime = new Crime(id, location, date, description, crimeType, detectives, severity, jurisdiction, enteredCrime);

                JSONArray vics = (JSONArray)new JSONParser().parse(VICTIMS);
                for(int j = 0; j < vics.size(); j++) {
                    JSONObject vic = (JSONObject)vics.get(i);
                    int vid = ((Long)personJSON.get(ID)).intValue();
                    crime.addVictim(CriminalApplication.getInstance().getVictim(vid)); // I think I need to create a new Victims class
                }
                
                JSONArray wits = (JSONArray)new JSONParser().parse(WITNESSSES);
                for(int j = 0; j < wits.size(); j++) {
                    JSONObject wit = (JSONObject)wits.get(i);
                    int wid = ((Long)personJSON.get(ID)).intValue();
                    crime.addWitness(CriminalApplication.getInstance().getWitness(wid)); // I think I need to create a new Victims class
                }
                
                JSONArray pers = (JSONArray)new JSONParser().parse(POI);
                for(int j = 0; j < pers.size(); j++) {
                    JSONObject per = (JSONObject)pers.get(i);
                    int pid = ((Long)personJSON.get(ID)).intValue();
                    crime.addPersonOfInterest(CriminalApplication.getInstance().getPersonOfInterest(pid)); // I think I need to create a new Victims class
                }

                JSONArray susps = (JSONArray)new JSONParser().parse(SUSPECTS);
                for(int j = 0; j < susps.size(); j++) {
                    JSONObject susp = (JSONObject)susps.get(i);
                    int sid = ((Long)personJSON.get(ID)).intValue();
                    crime.addSuspect(CriminalApplication.getInstance().getSuspect(sid)); // I think I need to create a new Victims class
                }

                JSONArray evids = (JSONArray)new JSONParser().parse(EVIDENCE);
                for(int j = 0; j < evids.size(); j++) {
                    JSONObject evid = (JSONObject)evids.get(i);
                    int eid = ((Long)personJSON.get(ID)).intValue();
                    crime.addEvidence(CriminalApplication.getInstance().getEvidence(eid)); // I think I need to create a new Victims class
                }

                JSONArray crims = (JSONArray)new JSONParser().parse(CRIMINALS);
                for(int j = 0; j < crims.size(); j++) {
                    JSONObject crim = (JSONObject)crims.get(i);
                    int cid = ((Long)personJSON.get(ID)).intValue();
                    crime.addCriminal(CriminalApplication.getInstance().getCriminal(cid)); // I think I need to create a new Victims class
                }
                
                boolean solved = ((Boolean)personJSON.get(CRIME_SOVLED)).booleanValue();
                crime.setSolved(solved);

                String extraInfo = (String)personJSON.get(EXTRA_INFO);
                crime.addInfo(extraInfo);
                
                String image = (String)personJSON.get(IMAGE);
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
    
            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                int id = ((Long)personJSON.get(ID)).intValue();
                String firstName = (String)personJSON.get(FIRST_NAME);
                String lastName = (String)personJSON.get(LAST_NAME);
                int age = ((Long)personJSON.get(AGE)).intValue();
                int weight = ((Long)personJSON.get(WEIGHT)).intValue();
                int height = ((Long)personJSON.get(HEIGHT)).intValue();
                String skinColor = (String)personJSON.get(SKIN);
                String hairColor = (String)personJSON.get(HAIR);
                String eyeColor = (String)personJSON.get(EYE);
                String address = (String)personJSON.get(ADDRESS);
                String image = (String)personJSON.get(IMAGE);
                boolean hasTattoos = ((Boolean)personJSON.get(HAS_TATTOOS)).booleanValue();
                String tattoos = (String)personJSON.get(TATTOOS);
                String aliases = (String)personJSON.get(ALIASES);
                boolean jail = ((Boolean)personJSON.get(JAIL)).booleanValue();
                boolean alive = ((Boolean)personJSON.get(ALIVE)).booleanValue();
                boolean chargesDropped = ((Boolean)personJSON.get(CHARGES_DROPPED)).booleanValue();
                int severity = ((Long)personJSON.get(SEVERITY)).intValue();
                int enteredCriminalID = ((Long)personJSON.get(ENTERED_CRIMINAL)).intValue();
                User enteredCriminal = CriminalApplication.getInstance().getUser(enteredCriminalID);
                // String addedInfo = (String)personJSON.get(ADDED_INFO);

                Criminal criminal = new Criminal(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, enteredCriminal);
                criminal.setImage(image);
                if(hasTattoos) {
                    criminal.addTattoo(tattoos);                    
                }
                criminal.addAlias(aliases);
                for(Crime crime: CriminalApplication.getInstance().getCrimes()) {
                    for(Criminal crim: crime.getCriminals()) {
                        if(crim.getUuid() == id) {
                            criminal.addPastCrime(crime);
                        }
                    }
                }
                for(Crime crime: criminal.getPastCrimes()) {
                    for(Criminal crim: crime.getCriminals()) {
                        criminal.addAssociate(crim);
                    }
                }
                criminal.setJail(jail);
                criminal.setAlive(alive);
                criminal.setChargesDropped(chargesDropped);
                criminal.setSeverity(severity);
                //criminal.addingInfo(info, addedInfo); //Need info and person that added it
                
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
                int id = ((Long)personJSON.get(ID)).intValue();
                String evidenceType = (String)personJSON.get(EVIDENCE_TYPE);
                String location = (String)personJSON.get(LOCATION);
                String time = (String)personJSON.get(TIMES);
                int enteredEvidenceID = ((Long)personJSON.get(ENTERED_EVIDENCE)).intValue();
                // int handleEvidence = ((Long)personJSON.get(EVIDENCE_HANDLED)).intValue();
                User enteredEvidence = CriminalApplication.getInstance().getUser(enteredEvidenceID);
                String comment = (String)personJSON.get(COMMENTS);
                ArrayList<String> comments = new ArrayList<String>();
                comments.add(comment);

                evidences.add(new Evidence(id, evidenceType, location, time, enteredEvidence, comments));
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
                int id = ((Long)personJSON.get(ID)).intValue();
                String firstName = (String)personJSON.get(FIRST_NAME);
                String lastName = (String)personJSON.get(LAST_NAME);
                int age = ((Long)personJSON.get(AGE)).intValue();
                int height = ((Long)personJSON.get(HEIGHT)).intValue();
                int weight = ((Long)personJSON.get(WEIGHT)).intValue();
                String skinColor = (String)personJSON.get(SKIN);
                String hairColor = (String)personJSON.get(HAIR);
                String eyeColor = (String)personJSON.get(EYE);
                String address = (String)personJSON.get(ADDRESS);
                String image = (String)personJSON.get(IMAGE);
                String phoneNumber = (String)personJSON.get(PHONE_NUMBER);
                String email = (String)personJSON.get(EMAIL);
                int suspectAssociationToID = ((Long)personJSON.get(SUSPECT_ASSOCIATION_TO)).intValue();
                Suspect suspectAssociatedTo = CriminalApplication.getInstance().getSuspect(suspectAssociationToID);
                String associationToCase = (String)personJSON.get(ASSOCIATION_TO_CASE);
                String associationToSuspect = (String)personJSON.get(ASSOCIATION_TO_SUSPECT);
                String story = (String)personJSON.get(STORIES);
                PersonOfInterest poi = new PersonOfInterest(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, phoneNumber, email, suspectAssociatedTo, associationToCase, associationToSuspect);
                poi.addStory(story);
                personsofinterest.add(poi);
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
            FileReader reader = new FileReader(SUSPECT_FILE);
            JSONParser parser = new JSONParser();	
            JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
    
            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                int id = ((Long)personJSON.get(ID)).intValue();
                String firstName = (String)personJSON.get(FIRST_NAME);
                String lastName = (String)personJSON.get(LAST_NAME);
                int age = ((Long)personJSON.get(AGE)).intValue();
                int height = ((Long)personJSON.get(HEIGHT)).intValue();
                int weight = ((Long)personJSON.get(WEIGHT)).intValue();
                String skinColor = (String)personJSON.get(SKIN);
                String hairColor = (String)personJSON.get(HAIR);
                String eyeColor = (String)personJSON.get(EYE);
                String address = (String)personJSON.get(ADDRESS);
                String image = (String)personJSON.get(IMAGE);
                boolean hasTattoos = ((Boolean)personJSON.get(HAS_TATTOOS)).booleanValue();
                String tattoos = (String)personJSON.get(TATTOOS);
                String aliases = (String)personJSON.get(ALIASES);
                String alibi = (String)personJSON.get(ALIBI);

                Suspect suspect = new Suspect(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, alibi);

                for(Crime crime: CriminalApplication.getInstance().getCrimes()) {
                    for(Criminal criminal: crime.getCriminals()) {
                        if(criminal.getUuid() == id) {
                            suspect.addCrime(crime);
                        }
                    }
                }
                for(Crime crime: suspect.getCrimes()) {
                    for(Criminal criminal: crime.getCriminals()) {
                        suspect.addAssociate(criminal);
                    }
                    for(Evidence evidence: crime.getEvidence()) {
                        suspect.addEvidence(evidence);
                    }
                }
                if(hasTattoos) {
                    suspect.addTattoo(tattoos);
                }

                suspect.addAlias(aliases);
                suspect.setImage(image);

                suspects.add(suspect);
            }
            return suspects;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Victim> getVictims() {
        ArrayList<Victim> victims = new ArrayList<Victim>();

        try {
            FileReader reader = new FileReader(VICTIM_FILE);
            JSONParser parser = new JSONParser();	
            JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
    
            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                int id = ((Long)personJSON.get(ID)).intValue();
                String firstName = (String)personJSON.get(FIRST_NAME);
                String lastName = (String)personJSON.get(LAST_NAME);
                int age = ((Long)personJSON.get(AGE)).intValue();
                int height = ((Long)personJSON.get(HEIGHT)).intValue();
                int weight = ((Long)personJSON.get(WEIGHT)).intValue();
                String skinColor = (String)personJSON.get(SKIN);
                String hairColor = (String)personJSON.get(HAIR);
                String eyeColor = (String)personJSON.get(EYE);
                String email = (String)personJSON.get(EMAIL);
                String address = (String)personJSON.get(ADDRESS);
                String image = (String)personJSON.get(IMAGE);
                String phoneNumber = (String)personJSON.get(PHONE_NUMBER);
                boolean hospitalized = ((Boolean)personJSON.get(HOSPITALIZED)).booleanValue();
                boolean alive = ((Boolean)personJSON.get(ALIVE)).booleanValue();
                String associationToSuspect = (String)personJSON.get(ASSOCIATION_TO_SUSPECT);

                Victim victim = new Victim(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, phoneNumber, email, associationToSuspect);
                
                victim.setAlive(alive);
                victim.setHospitalized(hospitalized);
                victim.setImage(image);

                victims.add(victim);
            }
            return victims;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static ArrayList<Witness> getWitnesses() {
        ArrayList<Witness> witnesses = new ArrayList<Witness>();

        try {
            FileReader reader = new FileReader(WITNESS_FILE);
            JSONParser parser = new JSONParser();	
            JSONArray peopleJSON = (JSONArray)new JSONParser().parse(reader);
    
            for(int i = 0; i < peopleJSON.size(); i++) {
                JSONObject personJSON = (JSONObject)peopleJSON.get(i);
                int id = ((Long)personJSON.get(ID)).intValue();
                String firstName = (String)personJSON.get(FIRST_NAME);
                String lastName = (String)personJSON.get(LAST_NAME);
                int age = ((Long)personJSON.get(AGE)).intValue();
                int height = ((Long)personJSON.get(HEIGHT)).intValue();
                int weight = ((Long)personJSON.get(WEIGHT)).intValue();
                String skinColor = (String)personJSON.get(SKIN);
                String hairColor = (String)personJSON.get(HAIR);
                String eyeColor = (String)personJSON.get(EYE);
                String email = (String)personJSON.get(EMAIL);
                String address = (String)personJSON.get(ADDRESS);
                String image = (String)personJSON.get(IMAGE);
                String phoneNumber = (String)personJSON.get(PHONE_NUMBER);
                String stories = (String)personJSON.get(STORIES);

                Witness witness = new Witness(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, phoneNumber, email);
                witness.setImage(image);
                witness.addStory(stories);

                witnesses.add(witness);
            }
            return witnesses;
        } catch(Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        ArrayList<Evidence> users =  DataLoader.getEvidences();
        for(Evidence user: users) {
            System.out.println(user);
        }
    }
    
}
