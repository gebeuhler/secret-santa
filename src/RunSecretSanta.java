public class RunSecretSanta{
	public static void main(String[] args){
		SecretSanta secretSanta = new SecretSanta();
		final String[] participants = new String[] { "Kyle", "Kenny", "Eric", "Stan", "Stewie", "Brian" };
		String[] assignments = secretSanta.generateAssignments(participants);

		System.out.println("\nAssignments\n=============================");

		for(int i = 0; i < participants.length;i++){
			System.out.println(participants[i] + " is assigned to " + assignments[i] + "!");
		}
	}
}
