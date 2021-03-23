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
        //register or login (maybe make a new method to return the correct next page)
        //home page after login w/ multiple options
            //new method with switch statement
            //1. add a crime
            //2. add a criminal
            //3. 
    }

    /**
     * Displays the main menu
     */
    public void mainMenu() {
        System.out.println("******** MAIN MENU ********");
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
