import static org.junit.Assert.assertFalse;

import org.junit.*;

import java.util.Arrays;

public class TestSecretSanta{

    final String[] participants = new String[] { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian" };
    SecretSanta secretSanta = new SecretSanta();

    /**
     * Test one randomized set of participants
     */
	@Test
	public void testGeneration(){
        final String[] assignments = secretSanta.generateAssignments(participants);
        assertFalse(Arrays.equals(participants,assignments));
	}

    @Test
    public void testSelfAssignment(){

    }
}
