import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class UserTest {
    
    @Test
    public void paramConstructorTest() {
        int id = 0;
        String firstName ="0", lastName ="0", phoneNumber ="0", email = "0", precinct = "0", department = "0", badgeNumber = "0", rank = "0", password = "0";
        ArrayList<Crime> crimesWorking = new ArrayList<Crime>();
        User u = new User(id, firstName, lastName, email, phoneNumber, precinct, department, badgeNumber, rank, password, crimesWorking);
        assertEquals(0, u.getUuid());
    }

    @Test
    public void addCrimeTest() {
        int id = 0;
        String firstName ="0", lastName ="0", phoneNumber ="0", email = "0", precinct = "0", department = "0", badgeNumber = "0", rank = "0", password = "0";
        ArrayList<Crime> crimesWorking = new ArrayList<Crime>();
        User u = new User(id, firstName, lastName, email, phoneNumber, precinct, department, badgeNumber, rank, password, crimesWorking);
        Crime crime = new Crime();
        crimesWorking.add(crime);
        u.addCrime(crime);
        assertEquals(crimesWorking, u.getCrimesWorking());
    }

    @Test
    public void toStringTest() {
        int id = 0;
        String firstName ="0", lastName ="0", phoneNumber ="0", email = "0", precinct = "0", department = "0", badgeNumber = "0", rank = "0", password = "0";
        ArrayList<Crime> crimesWorking = new ArrayList<Crime>();
        User u = new User(id, firstName, lastName, email, phoneNumber, precinct, department, badgeNumber, rank, password, crimesWorking);
        assertEquals(id + "\n" + firstName + "\n" + lastName + "\n" + email + "\n" + phoneNumber + "\n" + precinct + "\n" + department + "\n" + badgeNumber + "\n" + rank + "\n" + password + "\n", u.toString());
    }
}
