import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.*;

public class TestSecretSanta{

    String[] participants;
    SecretSanta secretSanta;

    /**
     * Initialize testing variables
     */
    @Before
    public void initialize(){
       participants = new String[] { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian" };
       secretSanta = new SecretSanta();
    }

    /**
     * Test one randomized set of participants
     */
	@Test
	public void testSelfAssignment(){
        final String[] assignments = secretSanta.generateAssignments(participants);
        boolean hasSelfAssignment = false;
        for(int i = 0; i < participants.length; i++){
            if(participants[i].equals(assignments[i])) {
                hasSelfAssignment = true;
            }
        }
        assertFalse(hasSelfAssignment);
	}

    /**
     * Test that every person has an assignment. This is done by
     * verifying the input and output arrays have equal length.
     */
   @Test
   public void testEqualLength(){
       final String[] assignments = secretSanta.generateAssignments(participants);
       assertTrue(assignments.length == participants.length);
    }
}
