import java.util.Scanner;
/**
 * A CrappUI
 * @author Connor Downey, Alex Santoro, Austin Stipo, and Sarah Carlucci
 */
public class CrappUI {

    private static final String WELCOME_MESSAGE = "Welcome to CRAPP";
	private String[] mainMenuOptions = {};
	private Scanner scanner;
	private CriminalApplication crapp;

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

        loginScreen();
        
    }

    /**
     * Prints the login/register screen
     * @return 
     */
    public boolean loginScreen() {
        System.out.println("1. Login");
        System.out.println("2. Register");
        int logOrReg = promptUser(2);
        if(logOrReg == 1)
        {
            return login();
        }
        else if(logOrReg == 2)
        {
            register();
            return login();
        }
        else
        {
            return false;
        }
    }

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
    public boolean login() {
        System.out.println("Enter your Badge Number: ");
        String badgeNumber = scanner.nextLine();
        System.out.println("Enter your Password: ");
        String password = scanner.nextLine();
        for(User user : crapp.getUsers()) {
            if(user.getBadgeNumber().equals(badgeNumber) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Displays the main menu
     */
    public void mainMenu() {
        System.out.println("******** MAIN MENU ********");
        for(int i=0;i<mainMenuOptions.length;i++) {
            System.out.println((i+1) + ". " + mainMenuOptions[i]);
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
