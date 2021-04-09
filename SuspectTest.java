import org.junit.jupiter.api.BeforeEach;

/**
 * @author Sarah Carlucci
 */

public class SuspectTest {
    
    private Suspect suspects = Suspect.getInstance();
    private ArrayList<Suspect> suspectList = suspects.getFirstName();
    
    @BeforeEach
	public void setup() {
		suspectList.clear();
		suspectList.add(new Suspect(2));
		suspectList.add(new Suspect(3));
		DataWriter.saveSuspects();
    }
    
    @Test
	void testHaveSuspectValidFirstItem() {
		boolean has1 = suspects.getInstance(1);
		assertTrue(has1);
	}
}
