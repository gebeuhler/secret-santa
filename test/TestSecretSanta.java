import static org.junit.Assert.assertFalse;

import org.junit.*;

import java.util.Arrays;

public class TestSecretSanta{

    final String[] participants = new String[] { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian" };
    SecretSanta secretSanta = new SecretSanta();

    //Verify input and output arrays are different
	@Test
	public void testSorting(){
        String[] assignments = secretSanta.generateAssignments(participants);
        assertFalse(Arrays.equals(participants,assignments));
	}
}
