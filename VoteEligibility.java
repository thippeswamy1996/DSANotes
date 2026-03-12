// Step 1: Define custom exception
class UnderAgeException extends Exception {
    public UnderAgeException(String message) {
        super(message);
    }
}

// Step 2: Main class with age check logic
public class VoteEligibility {
    public static void main(String[] args) {
        int age = 16;  // Change this value to test

        try {
            checkVotingAge(age);
            System.out.println("Eligible to vote.");
        } catch (UnderAgeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }

    // Step 3: Method that throws custom exception
    public static void checkVotingAge(int age) throws UnderAgeException {
        if (age < 18) {
            throw new UnderAgeException("Age " + age + " is below 18. Not eligible to vote.");
        }
    }
}
