
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/**
 * @author Sarah Carlucci
 */

public class SuspectTest {
	
	private CriminalApplication crapp = CriminalApplication.getInstance();
    // private Suspect suspects = Suspect.getInstance();
    private ArrayList<Suspect> suspectList = crapp.getSuspects();
    
    @BeforeEach
	public void setup() {
		suspectList.clear();
		suspectList.add(new Suspect(1));
		suspectList.add(new Suspect(2));
		DataWriter.saveSuspects();
	}
	
	@AfterEach
	public void tearDown() {
		crapp.getSuspects().clear();
		DataWriter.saveUsers();
	}
    
    @Test
	void testHaveSuspectValidFirstItem() {
		int has1 = suspectList.get(0).getUuid();
		assertEquals(1, has1);
	}

	@Test
	void testHaveSuspectValidLastItem() {
		int has2 = suspectList.get(1).getUuid();
		assertEquals(2, has2);
	}
}
