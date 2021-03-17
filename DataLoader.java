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
                User enteredCrime = Users.getInstance().getUser(enteredCrimeID);

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
                    crime.addPersonOfInterest(CriminalApplication.getInstance().getPOI(pid)); // I think I need to create a new Victims class
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
                
                boolean solved = ((Boolean)personJSON.get(CRIME_SEVERITY)).booleanValue();
                crime.setSolved(solved);

                String extraInfo = (String)personJSON.get(EXTRA_INFO);
                int addedInfoID = ((Long)personJSON.get(ADDED_INFO)).intValue();
                User addedInfo = CriminalApplication.getInstance().getUser(enteredCrimeID);
                crime.addingInfo(extraInfo, addedInfo);
                
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
            ArrayList<User> detectives = new ArrayList<User>();
    
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
                String associates = (String)personJSON.get(ASSOCIATES); //Need to point to other criminals
                boolean jail = ((Boolean)personJSON.get(JAIL)).booleanValue();
                boolean alive = ((Boolean)personJSON.get(ALIVE)).booleanValue();
                boolean chargesDropped = ((Boolean)personJSON.get(CHARGES_DROPPED)).booleanValue();
                int severity = ((Long)personJSON.get(SEVERITY)).intValue();
                int enteredCriminalID = ((Long)personJSON.get(ENTERED_CRIMINAL)).intValue();
                User enteredCriminal = CriminalApplication.getInstance().getUser(enteredCriminalID);
                String addedInfo = (String)personJSON.get(ADDED_INFO);

                Criminal criminal = new Criminal(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, enteredCriminal);
                criminal.setImage(image);
                if(hasTattoos) {
                    criminal.addTattoo(tattoos);                    
                }
                criminal.addAlias(aliases);
                criminal.addAssociate(associates); 
                ArrayList<Crime> crimes = CriminalApplication.getInstance().getCrimes();
                for(Crime crime: crimes) {
                    for(Criminal crim: crime.getCriminals()) {
                        if(crim.getUuid() == criminal.getUuid()) {
                            criminal.addPastCrime(crime);
                        }
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
                UUID id = UUID.fromString((String)personJSON.get(ID));
                String evidenceType = (String)personJSON.get(EVIDENCE_TYPE);
                String location = (String)personJSON.get(LOCATION);
                String time = (String)personJSON.get(TIMES);
                String enteredEvidence = (String)personJSON.get(ENTERED_EVIDENCE);
                String handled = (String)personJSON.get(EVIDENCE_HANDLED);//Might need to get rid of this
                String comments = (String)personJSON.get(COMMENTS);

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
                UUID id = UUID.fromString((String)personJSON.get(ID));
                String firstName = (String)personJSON.get(FIRST_NAME);
                String lastName = (String)personJSON.get(LAST_NAME);
                int age = ((Long)personJSON.get(AGE)).intValue();
                String height = (String)personJSON.get(HEIGHT);
                String weight = (String)personJSON.get(WEIGHT);
                String skinColor = (String)personJSON.get(SKIN);
                String hairColor = (String)personJSON.get(HAIR);
                String eyeColor = (String)personJSON.get(EYE);
                String address = (String)personJSON.get(ADDRESS);
                String image = (String)personJSON.get(IMAGE);
                String phoneNumber = (String)personJSON.get(PHONE_NUMBER);
                String email = (String)personJSON.get(EMAIL);
                String suspectAssociationTo = (String)personJSON.get(SUSPECT_ASSOCIATION_TO); //NEEDS to be a suspect
                String associationToSuspect = (String)personJSON.get(ASSOCIATION_TO_SUSPECT);
                String stories = (String)personJSON.get(STORIES);

                personsofinterest.add(new PersonOfInterest(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, phoneNumber, email, associationToCase, associationToSuspect));
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
                UUID id = UUID.fromString((String)personJSON.get(ID));
                String firstName = (String)personJSON.get(FIRST_NAME);
                String lastName = (String)personJSON.get(LAST_NAME);
                int age = ((Long)personJSON.get(AGE)).intValue();
                String height = (String)personJSON.get(HEIGHT);
                String weight = (String)personJSON.get(WEIGHT);
                String skinColor = (String)personJSON.get(SKIN);
                String hairColor = (String)personJSON.get(HAIR);
                String eyeColor = (String)personJSON.get(EYE);
                String address = (String)personJSON.get(ADDRESS);
                String image = (String)personJSON.get(IMAGE);
                boolean hasTattoos = ((Boolean)personJSON.get(HAS_TATTOOS)).booleanValue();
                String tattoos = (String)personJSON.get(TATTOOS);
                String aliases = (String)personJSON.get(ALIASES);
                String associates = (String)personJSON.get(ASSOCIATES); //Need to point to other persons
                String pastCrimes = (String)personJSON.get(PAST_CRIMES); //Need to point to crimes
                String evidence = (String)personJSON.get(EVIDENCE); //Needs to point to evidence
                String alibi = (String)personJSON.get(ALIBI);

                Suspect suspect = new Suspect(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, alibi);

                suspect.setImage(image);
                if(hasTattoos) {
                    suspect.addTattoo(tattoos);
                }
                suspect.addAlias(aliases);
                suspect.addAssociate(associates);
                suspect.addCrime(pastCrimes);
                suspect.addEvidence(evidence);

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
        ArrayList<Witness> users =  DataLoader.getWitnesses();
        for(Witness user: users) {
            System.out.println(user);
        }
    }
    
}
