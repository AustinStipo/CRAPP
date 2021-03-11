import java.util.Scanner;

public class CrappUI {

    private static final String WELCOME_MESSAGE = "Welcome to CRAPP";
	private String[] mainMenuOptions = {};
	private Scanner scanner;
	private CriminalApplication crapp;

    public CrappUI(){
		scanner = new Scanner(System.in);
		crapp = new CriminalApplication());
	}
    
    public void run() {
        System.out.println(WELCOME_MESSAGE);
    }

    public static void main(String[] args) {
        CrappUI crappui = new CrappUI();
        crappui.run();
    }
}
