secret-santa
============

Implement the Method
Here are some basic rules:

A person must be assigned to another person; no person must be assigned to himself/herself.

All participants must have an assigned person from the passed list of participants.

Shifting the names left or right is not an acceptable solution.

Here's an example of how the method would be used:

final String[] participants = new String[] { "Kyle", "Kenny", "Eric", "Stan",
"Stewie", "Brian" };
final String[] assignments = generateAssignments(participants);
// Sample result: { "Eric", "Stewie", "Brian", "Kenny", "Kyle", "Stan" } 

Additional Instructions

The code must be compilable and produce the correct output.

Unit tests are not required but a big, big plus.

Include any build scripts, dependency management configuration files, etc.

Package everything as a complete project. Compress the package into one file then send it back

Optional: Implement at least 2 algorithms/implementations. Use your judgement on how to design it.


To compile program:

javac src/*.java -d bin

To run program:

java -cp bin RunSecretSanta

To compile tests:

javac -cp lib/*:src test/*.java -d bin

To run tests:

java -cp lib/*:bin TestRunner
