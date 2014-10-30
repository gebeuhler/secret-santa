import java.util.Arrays;
import java.util.Collections;

public class SecretSanta{
	/**
	 * @param participants list of individuals participating in the draw.
	 * @return the list of individuals paired with the participants where participants[0] is matched
	 * with assignments[0], participants[1] is matched with assignments[1], 
	 *	and so on.
	 */
	public String[] generateAssignments(final String[] participants){
		final String[] assignments = new String[participants.length];
		System.arraycopy(participants, 0, assignments, 0, assignments.length);

        do {
            Collections.shuffle(Arrays.asList(assignments));
        } while(Arrays.equals(participants,assignments));

		return assignments;
	}
}
