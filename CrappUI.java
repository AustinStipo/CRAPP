import java.util.ArrayList;
import java.util.Scanner;
/**
 * A CrappUI
 * @author Connor Downey, Alex Santoro, Austin Stipo, and Sarah Carlucci
 */
public class CrappUI {

    private static final String WELCOME_MESSAGE = "Welcome to CRAPP";
    private static final String ACTION = "The action was successful!";
	private String[] mainMenuOptions = {"MAIN MENU", "Make an Addition", "Make a Removal", "Search the Database", "Logout"};
    private String[] loginOptions = {"LOGIN OR REGISTER", "Login", "Register"};
    private String[] additionOptions = {"ADD TO THE DATABASE", "Add Crime", "Add Criminal", "Add Suspect", "Add Witness", "Add Person of Interest", "Add Victim"};
    private String[] removalOptions = {"REMOVE FROM THE DATABASE", "Remove Crime", "Remove Criminal", "Remove Suspect", "Remove Witness", "Remove Person of Interest", "Remove Victim"};
    private String[] searchOptions = {"SEARCH", "Search for a Crime", "Search for a Criminal"};
	private Scanner scanner;
	private CriminalApplication crapp;
    private boolean loginAttempt = false;
    private boolean loggedOut = false;

    /**
     * Creates a CrappUI
     */
    public CrappUI(){
		scanner = new Scanner(System.in);
		crapp = CriminalApplication.getInstance();
	}
    
    /**
     * Runs the front end of the application
     */
    public void run() {
        System.out.println(WELCOME_MESSAGE);

        while(!loginAttempt) {
            loginScreen();
        }

        while(!loggedOut) {
			mainMenu();
		}

        logOut();
    }

    /**
     * Displays and performs main menu operators for user
     */
    public void mainMenu() {
        menuOptions(mainMenuOptions);
			
        int input = promptUser(mainMenuOptions.length-1);
        
        if(input == -1) {
            System.out.println("Not a valid command");
        }

        if(input == mainMenuOptions.length-1) {
            System.out.println("Good bye, and have a nice day");
            loggedOut = true; //I think we need to create a logout method to save whatever is inputted
        }

        switch(input) {
            case(1):
                addition();
            case(2):
                removal();
            case(3):
                search();
        }
    }

    /**
     * Displays and performs addition operators for user
     */
    public void addition() {
        menuOptions(additionOptions);
        int input = promptUser(additionOptions.length-1);
        
        if(input == -1) {
            System.out.println("Not a valid command");
        }

        switch(input) {
            case(1):
                addCrime();
            case(2):
                addCriminal();
            case(3):
                addSuspect();
            case(4):
                addWitness();
            case(5):
                addPersonOfInterest();
            case(6):
                addVictim();
        }
    }
    
    public void addCrime() {
        System.out.println("Enter the Location: ");
        String location = scanner.nextLine();
        System.out.println("Enter the Date: ");
        String date = scanner.nextLine();
        System.out.println("Enter the Description: ");
        String description = scanner.nextLine();
        System.out.println("Enter the Type of Crime: ");
        String crimeType = scanner.nextLine();
        System.out.println("Enter the Severity: ");
        String severityInput = scanner.nextLine();
        int severity = Integer.parseInt(severityInput);
        System.out.println("Enter the Jurisdiction: ");
        String jurisdiction = scanner.nextLine();
        System.out.println("Enter your ID: ");
        String userIDString = scanner.nextLine();
        int userID = Integer.parseInt(userIDString);
        User userTemp= new User();
        ArrayList<User> detectives = new ArrayList<User>();
        for(User user : crapp.getUsers())
        {
            if(user.getUuid()==userID){
                userTemp = user;
                detectives.add(user);
            }
        }    
        int size = crapp.getCrimes().size();
        int id = crapp.getCrimes().get(size-1).getUuid()+1;
        Crime temp = new Crime(id, location, date, description, crimeType, detectives, severity, jurisdiction, userTemp);
        crapp.addCrime(temp);
        System.out.println(ACTION);
    }

    public void addCriminal() {
        System.out.println("Enter the criminals first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the criminals last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter the criminals age: ");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);
        System.out.println("Enter the criminals height (in inches): ");
        String heightInput = scanner.nextLine();
        int height = Integer.parseInt(heightInput);
        System.out.println("Enter the criminals weight (in pounds): ");
        String weightInput = scanner.nextLine();
        int weight = Integer.parseInt(weightInput);
        System.out.println("Enter the criminals skin color: ");
        String skinColor = scanner.nextLine();
        System.out.println("Enter the criminals hair color: ");
        String hairColor = scanner.nextLine();
        System.out.println("Enter the criminals eye color: ");
        String eyeColor = scanner.nextLine();
        System.out.println("Enter the criminals address: ");
        String address = scanner.nextLine();
        System.out.println("Enter your ID: ");
        String userIDString = scanner.nextLine();
        int userID = Integer.parseInt(userIDString);
        User userTemp= new User();
        for(User user : crapp.getUsers())
        {
            if(user.getUuid()==userID){
                userTemp = user;
                // add(user);
            }
        }    
        int size = crapp.getCrimes().size();
        int id = crapp.getCrimes().get(size-1).getUuid()+1;
        Criminal temp = new Criminal(id, firstName, lastName, age, height, weight, skinColor, hairColor, eyeColor, address, userTemp);
        crapp.addCriminal(temp);
        System.out.println(ACTION);
    }

    public void addSuspect() {
        System.out.println("Enter the suspects first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the suspects last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter suspects the age: ");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);
        System.out.println("Enter the suspects height (in inches): ");
        String heightInput = scanner.nextLine();
        int height = Integer.parseInt(heightInput);
        System.out.println("Enter the suspects weight (in pounds): ");
        String weightInput = scanner.nextLine();
        int weight = Integer.parseInt(weightInput);
        System.out.println("Enter the suspects skin color: ");
        String skinColor = scanner.nextLine();
        System.out.println("Enter the suspects hair color: ");
        String hairColor = scanner.nextLine();
        System.out.println("Enter the suspects eye color: ");
        String eyeColor = scanner.nextLine();
        System.out.println("Enter the suspects address: ");
        String address = scanner.nextLine();
        System.out.println("Enter the suspects alibi: ");
        String alibi = scanner.nextLine();
        System.out.println(ACTION);
    }

    public void addWitness() {
        System.out.println("Enter the witnesses first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the witnesses last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter witnesses the age: ");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);
        System.out.println("Enter the witnesses height (in inches): ");
        String heightInput = scanner.nextLine();
        int height = Integer.parseInt(heightInput);
        System.out.println("Enter the witnesses weight (in pounds): ");
        String weightInput = scanner.nextLine();
        int weight = Integer.parseInt(weightInput);
        System.out.println("Enter the witnesses skin color: ");
        String skinColor = scanner.nextLine();
        System.out.println("Enter the witnesses hair color: ");
        String hairColor = scanner.nextLine();
        System.out.println("Enter the witnesses eye color: ");
        String eyeColor = scanner.nextLine();
        System.out.println("Enter the witnesses address: ");
        String address = scanner.nextLine();
        System.out.println("Enter the witnesses phone number");
        String phoneNumberInput = scanner.nextLine();
        int phoneNumber = Integer.parseInt(phoneNumberInput);
        System.out.println("Enter the witnesses email: ");
        String email = scanner.nextLine();
        System.out.println(ACTION);
    }

    public void addPersonOfInterest() {
        System.out.println("Enter the person of interests first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the person of interests last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter person of interests the age: ");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);
        System.out.println("Enter the person of interests height (in inches): ");
        String heightInput = scanner.nextLine();
        int height = Integer.parseInt(heightInput);
        System.out.println("Enter the person of interests weight (in pounds): ");
        String weightInput = scanner.nextLine();
        int weight = Integer.parseInt(weightInput);
        System.out.println("Enter the person of interests skin color: ");
        String skinColor = scanner.nextLine();
        System.out.println("Enter the person of interests hair color: ");
        String hairColor = scanner.nextLine();
        System.out.println("Enter the person of interests eye color: ");
        String eyeColor = scanner.nextLine();
        System.out.println("Enter the person of interests address: ");
        String address = scanner.nextLine();
        System.out.println("Enter the person of interests phone number");
        String phoneNumberInput = scanner.nextLine();
        int phoneNumber = Integer.parseInt(phoneNumberInput);
        System.out.println("Enter the person of interests email: ");
        String email = scanner.nextLine();
        System.out.println("Enter the person of interests personal associations: ");
        String suspectAssociatedTo = scanner.nextLine();
        System.out.println("Enter the person of interests association to the case: ");
        String associationToCase = scanner.nextLine();
        System.out.println("Enter the person of interests association to suspect: ");
        String associationToSuspect = scanner.nextLine();
        System.out.println(ACTION);
    }

    public void addVictim() {
        System.out.println("Enter the victims first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter the victims last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter victims the age: ");
        String ageInput = scanner.nextLine();
        int age = Integer.parseInt(ageInput);
        System.out.println("Enter the victims height (in inches): ");
        String heightInput = scanner.nextLine();
        int height = Integer.parseInt(heightInput);
        System.out.println("Enter the victims weight (in pounds): ");
        String weightInput = scanner.nextLine();
        int weight = Integer.parseInt(weightInput);
        System.out.println("Enter the victims skin color: ");
        String skinColor = scanner.nextLine();
        System.out.println("Enter the victims hair color: ");
        String hairColor = scanner.nextLine();
        System.out.println("Enter the victims eye color: ");
        String eyeColor = scanner.nextLine();
        System.out.println("Enter the victims address: ");
        String address = scanner.nextLine();
        System.out.println("Enter the victims phone number");
        String phoneNumberInput = scanner.nextLine();
        int phoneNumber = Integer.parseInt(phoneNumberInput);
        System.out.println("Enter the victims email: ");
        String email = scanner.nextLine();
        System.out.println("Enter the victims association to suspect: ");
        String associationToSuspect = scanner.nextLine();
        System.out.println(ACTION);
    }

    /**
     * Displays and performs removal operators for user
     */
    public void removal() {
        menuOptions(removalOptions);
        int input = promptUser(removalOptions.length-1);
        
        if(input == -1) {
            System.out.println("Not a valid command");
        }

        switch(input) {
            case(1):
                removeCrime();
            case(2):
                removeCriminal();
            case(3):
                removeSuspect();
            case(4):
                removeWitness();
            case(5):
                removePersonOfInterest();
            case(6):
                removeVictim();
        }
    }

    public void removeCrime() {
        int id = idPrompt("crime");
        Crime temp = crapp.getCrime(id);
        crapp.getCrimes().remove(temp);
        System.out.println(ACTION);
    }

    public void removeCriminal() {
        int id = idPrompt("criminal");
        Criminal temp = crapp.getCriminal(id);
        crapp.removeCriminal(temp);
        System.out.println(ACTION);
    }

    public void removeSuspect() {
        int id = idPrompt("suspect");
        Suspect temp = crapp.getSuspect(id);
        crapp.getSuspects().remove(temp);
        System.out.println(ACTION);
    }

    public void removeWitness() {
        int id = idPrompt("witness");
        Witness temp = crapp.getWitness(id);
        crapp.getWitnesses().remove(temp);
        System.out.println(ACTION);
    }

    public void removePersonOfInterest() {
        int id = idPrompt("person of interest");
        PersonOfInterest temp = crapp.getPersonOfInterest(id);
        crapp.getPersonsOfInterest().remove(temp);
        System.out.println(ACTION);
    }

    public void removeVictim() {
        int id = idPrompt("victim");
        Victim temp = crapp.getVictim(id);
        crapp.getVictims().remove(temp);
        System.out.println(ACTION);
    }

    /**
     * Displays and performs search operators for user
     */
    public void search() {
        menuOptions(searchOptions);
        int input = promptUser(searchOptions.length-1);
        
        if(input == -1) {
            System.out.println("Not a valid command");
        }

        switch(input) {
            case(1):
                searchCrime();
            case(2):
                searchCriminal();
        }
    }

    public int idPrompt(String name) {
        System.out.println("Enter the ID for the " + name);
        String input = scanner.nextLine();
        int id = Integer.parseInt(input);
        return id;
    }

    public void searchCrime() {
        int id = idPrompt("crime");
        Crime temp = crapp.searchCrime(id);
        System.out.println(temp);
        System.out.println(ACTION);
    }

    public void searchCriminal() {
        int id = idPrompt("criminal");
        Criminal temp = crapp.searchCriminal(id);
        System.out.println(temp);
        System.out.println(ACTION);
    }

    /**
     * Prints the login/register screen
     * @return 
     */
    public void loginScreen() {
        menuOptions(loginOptions);
        int logOrReg = promptUser(2);
        if(logOrReg == 1)
        {
            login();
        }
        else if(logOrReg == 2)
        {
            register();
            login();
        }
        else {
            loginScreen();
        }
    }

    /**
     * Registers the user
     */
    public void register() {
        System.out.println("Enter your First Name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("Enter your Badge Number: ");
        String badgeNumber = scanner.nextLine();
        System.out.println("Enter your Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter your Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter your Precinct: ");
        String precinct = scanner.nextLine();
        System.out.println("Enter your Department: ");
        String department = scanner.nextLine();
        System.out.println("Enter your Rank: ");
        String rank = scanner.nextLine();
        System.out.println("Enter your Password: ");
        String password = scanner.nextLine();
        int size = crapp.getUsers().size();
        int id = crapp.getUsers().get(size-1).getUuid()+1;
        User user = new User(id, firstName, lastName, email, phoneNumber, precinct, department, badgeNumber, rank, password, null);
        crapp.addUser(user);
    }

    /**
     * The login for the user
     * @return Returns true if the login is successful and false otherwise
     */
    public void login() {
        System.out.println("Enter your Badge Number: ");
        String badgeNumber = scanner.nextLine();
        System.out.println("Enter your Password: ");
        String password = scanner.nextLine();
        for(User user : crapp.getUsers()) {
            if(user.getBadgeNumber().equals(badgeNumber) && user.getPassword().equals(password)) {
                loginAttempt = true;
                break;
            }
        }
        // loginAttempt = false;
    }

    /**
     * Displays the given menu
     */
    public void menuOptions(String[] arr) {
        System.out.println("******** "+arr[0]+" ********");
        for(int i=1;i<arr.length;i++) {
            System.out.println((i) + ". " + arr[i]);
        }
        System.out.println("\n");
    }

    /**
     * Asks the user to choose between a list of options
     * @param numOfCommands The size of the list of options
     * @return The choice if it is valid and -1 otherwise
     */
    public int promptUser(int numOfCommands) {
        System.out.println("Choose an option: ");
        String input = scanner.nextLine();
        int choice = Integer.parseInt(input);
        if(choice > 0 && choice <= numOfCommands) {
            return choice;
        }
        return -1;
    }

    /**
     * Will save the what ever was done to the json files
     */
    public void logOut() {
        DataWriter.saveUsers();
        DataWriter.saveCrimes();
        DataWriter.saveCriminals();
        DataWriter.saveEvidences();
        DataWriter.saveSuspects();
        DataWriter.saveVictims();
        DataWriter.saveWitnesses();
        DataWriter.savePOIs();
    }

    /**
     * Main method for the front end of the application
     * @param args Any arguments passed through the compiler
     */
    public static void main(String[] args) {
        CrappUI crappui = new CrappUI();
        crappui.run();
    }
}
