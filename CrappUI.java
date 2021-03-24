import java.util.Scanner;
/**
 * A CrappUI
 * @author Connor Downey, Alex Santoro, Austin Stipo, and Sarah Carlucci
 */
public class CrappUI {

    private static final String WELCOME_MESSAGE = "Welcome to CRAPP";
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
    }

    public void mainMenu() {
        menuOptions(mainMenuOptions);
			
        int input = promptUser(mainMenuOptions.length-1);
        
        if(input == -1) {
            System.out.println("Not a valid command");
        }

        if(input == mainMenuOptions.length-2) {
            System.out.println("Good bye, and have a nice day");
            loggedOut = true;
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

    public void addition() {
        menuOptions(additionOptions);
    }

    public void removal() {
        menuOptions(removalOptions);
    }

    public void search() {
        menuOptions(searchOptions);
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
        String email = scanner.nextLine();
        System.out.println("Enter your Email: ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Enter your Phone Number: ");
        String precinct = scanner.nextLine();
        System.out.println("Enter your Precinct: ");
        String department = scanner.nextLine();
        System.out.println("Enter your Department: ");
        String badgeNumber = scanner.nextLine();
        System.out.println("Enter your Badge Number: ");
        String rank = scanner.nextLine();
        System.out.println("Enter your Rank: ");
        String password = scanner.nextLine();
        int size = crapp.getUsers().size();
        int id = crapp.getUsers().get(size).getUuid()+1;
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
            }
        }
        loginAttempt = false;
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
     * Main method for the front end of the application
     * @param args Any arguments passed through the compiler
     */
    public static void main(String[] args) {
        CrappUI crappui = new CrappUI();
        crappui.run();
    }
}
