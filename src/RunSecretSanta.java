public class RunSecretSanta
{
	public static void main(String[] args){
		SecretSanta secretSanta = new SecretSanta();
		final String[] participants = new String[] { "Kyle", "Kenny", "Eric", 				"Stan", "Stewie", "Brian" };
		String[] assignments = secretSanta.generateAssignments(participants);

		System.out.println("Assignments\n=============");

		for(String person : assignments){
			System.out.println(person);
		}
	}
}
