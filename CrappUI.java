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
     * Prints the welcome message to the console
     */
    public void run() {
        System.out.println(WELCOME_MESSAGE);
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
