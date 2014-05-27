import java.util.Arrays;
import java.util.Collections;

public class SecretSanta
{
	/**
	 * @param participants list of individuals participating in the draw.
	 * @return the list of individuals paired with the participants where participants[0] is matched
	 * with assignments[0], participants[1] is matched with assignments[1], 
	 *	and so on.
	 */
	public String[] generateAssignments(final String[] participants) {
		String[] assignments = new String[participants.length];
		System.arraycopy(participants, 0, assignments, 0, assignments.length);

		do{		
			Collections.shuffle(Arrays.asList(assignments));
		} while(!hasSelfAssignment(participants, assignments));

		return assignments;
	}

	/**
	 * @param list of participants
	 * @param list of assignments
	 * @return false if a person is assigned to himself and the array must be reshuffled;true otherwise
	 */
	private boolean hasSelfAssignment(String[] participants, String[] assignments){
		for(int i = 0; i < participants.length; i++){
			if(participants[i].equals(assignments[i]))
				return false;
		}
		return true;
	}
}
