import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;


public class CrimeTest {

    @Test
    public void paramConstructorTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        ArrayList<User> addedInfo = new ArrayList<User>();
        ArrayList<Victim> victims = new ArrayList<Victim>();
        ArrayList<Witness> witnesses = new ArrayList<Witness>();
        ArrayList<Suspect> suspects = new ArrayList<Suspect>();
        ArrayList<Criminal> criminals = new ArrayList<Criminal>();
        ArrayList<PersonOfInterest> personOfInterests = new ArrayList<PersonOfInterest>();
        ArrayList<Evidence> evidences = new ArrayList<Evidence>();
        ArrayList<User> users = new ArrayList<user>();
        boolean solved = false;   
        User enteredCrime;
        Suspect suspectAssociatedTo = new Suspect();
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        assertEquals(id, c.getUuid());
        assertEquals(location, c.getLocation());
        assertEquals(date, c.getDate());
        assertEquals(description, c.getDescription());
        assertEquals(crimeType, c.getCrimeType());
        assertEquals(severity, c.getSeverity());
        assertEquals(jurisdiction, c.getJurisdiction());
        assertEquals(enteredCrime, c.getEnteredCrime());
    }

    @Test
    public void addVictimTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        Victim victim = new Victim();
        Object victims;
        victims.add(victim);
        c.addVictim(victim);
        assertEquals(victims, c.getVictims());
    }
    
    @Test
    public void addWitnessTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        Witness witness = new Witness();
        witness.add(witness);
        c.addWitness(witness);
        assertEquals(witness, c.getVictims());
    }
    
    @Test
    public void addPersonOfInterestTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        PersonOfInterest personOfInterest = new PersonOfInterest();
        personOfInterest.add(personOfInterest);
        c.addPersonOfInterest(personOfInterest);
        assertEquals(personOfInterest, c.getPersonOfInterest());
    }
    
    @Test
    public void addWitnessTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        Witness witness = new Witness();
        witness.add(witness);
        c.addWitness(witness);
        assertEquals(witness, c.getVictims());
    }
    
    @Test
    public void addUserTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        User user = new User();
        user.add(user);
        c.addUser(user);
        assertEquals(user, c.getUsers());
    }
    
    @Test
    public void addEvidenceTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        Evidence evidence = new Evidence();
        evidence.add(evidence);
        c.addEvidence(evidence);
        assertEquals(evidence, c.getEvidence());
    }
    
    @Test
    public void addCriminalTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        Criminal criminal = new Criminal();
        criminal.add(criminal);
        c.addCriminal(criminal);
        assertEquals(criminal, c.getCriminals());
    }
    
    @Test
    public void toStringTest() {
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        assertEquals("ID: " + id + "\n\tLocation: " + location + "\n\tDate: " + date + "\n\tDescription: " + description +
        "\n\tCrime Type: " + crimeType + "\n\tSeverity:" + severity + "\n\tJurisdiction:" + jurisdiction + 
        "\n\tEntered Crime:" + enteredCrime, c.toString());
    }

    @Test
    public void addingInfoTest() {
        String extraInfo = "test";
        int id = 0, severity = 0;
        String location ="0", date ="0", description ="0", crimeType ="0", jurisdiction ="0", extraInfo ="0";
        User enteredCrime;
        Crime crime = new Crime();
        Crime c = new Crime(id, location, date, description, crimeType, severity, jurisdiction, enteredCrime);
        c.addingInfo(extraInfo);
        assertEquals(extraInfo, c.getInfo());
    }
}
