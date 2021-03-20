import java.util.ArrayList;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String precinct;
    private String department;
    private String badgeNumber;
    private String rank;
    private String password;
    private ArrayList<Crime> crimesWorking;

    public User(int id, String firstName, String lastName, String email, String phoneNumber, String precinct, String department, String badgeNumber, String rank, String password, ArrayList<Crime> crimesWorking) {
        this.id = id;
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPhoneNumber(phoneNumber);
        setPrecinct(precinct);
        setDepartment(department);
        setBadgeNumber(badgeNumber);
        setRank(rank);
        setPassword(password);
    }

    /**
     * Empty User constructor
     */
    public User() {

    }
    
    public int getUuid() {
        return id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPrecinct() {
        return this.precinct;
    }

    public void setPrecinct(String precinct) {
        this.precinct = precinct;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getBadgeNumber() {
        return this.badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public String getRank() {
        return this.rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Crime> getCrimesWorking() {
        return crimesWorking;
    }

    public void addCrime(Crime crime) {
        
    }

    public String toString() {
        return id + "\n" + firstName + "\n" + lastName + "\n" + email + "\n" + phoneNumber + "\n" + precinct + "\n" + department + "\n" + badgeNumber + "\n" + rank + "\n" + password + "\n";
    }
    
}
