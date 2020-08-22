
public class App {

	public static void main(String[] args) {
		double costOfItem = 4.25;
		double amountInWallet = 20.50;
		double newAmountInWallet = 5.55;
		int numberOfFriends = 80;
		int myAge = 28;
		int newNumberOfFriends = numberOfFriends / myAge;
		String firstName = "Julia";
		String lastName = "Smith";
		char middleInitial = 'A';
		String fullName = firstName + " " + middleInitial + " "+ lastName;
		
		System.out.println(costOfItem);
		System.out.println(amountInWallet);
		System.out.printf("%5f",newAmountInWallet);
		System.out.println(numberOfFriends);
		System.out.println(newNumberOfFriends);
		System.out.println(myAge);
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(middleInitial);
		System.out.println(fullName);
		
	}

}
