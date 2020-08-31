
public class App1 {
	public static void main(String[] args) {
		double costOfItem = 4.55;
		double valueOfItem = 5.33;
		double amountInWallet = 20.52;
		double moneyInWallet = 15.00;
		double newAmountInWallet = amountInWallet - costOfItem;
		double newMoneyInWallet = moneyInWallet - valueOfItem;
		int numberOfFriends = 180;
		int quantityOfFriends = 250;
		int myAge = 28;
		int ageYear = 30;
		int numberOfFriendsEachYear = numberOfFriends / myAge;
		int totalOfFriendsEveryYear = quantityOfFriends / ageYear;
		String firstName = "Julia";
		String lastName = "Brown";
		char middleInitial = 'A';
		String givenName = "Anna";
		String surName = "White";
		char middleName = 'E';
		String fullName = firstName + " " + middleInitial + " " + lastName;
		String completeName = givenName + " " + middleName + " " + surName;

		System.out.println("Affordable price: $" + costOfItem );
		System.out.println("it's expensive: $"+ valueOfItem);
		System.out.println("Only: $" + amountInWallet + "I have.");
		System.out.println("It's small money $" + moneyInWallet);
		System.out.println("After my shopping: $" +newAmountInWallet + " left.");
		System.out.println("I spend a lot, $" + newMoneyInWallet + " in my wallet.");
		System.out.println("Not bad, " + numberOfFriends + " friends.");
		System.out.println("I think, I have more than " + quantityOfFriends + " friends.");
		System.out.println("Awesome " + myAge + " years old.");
		System.out.println("Thanks God, I'm " + ageYear + " years old.");
		System.out.println("It's great number:" + numberOfFriendsEachYear + ", friends each year.");
		System.out.println("I make plenty friends : " + totalOfFriendsEveryYear + ", new friends every year.");
		System.out.println("My first name is: " + firstName);
		System.out.println("And last name: " +lastName);
		System.out.println("My Initial middle name: " +middleInitial);
		System.out.println("It's a pretty full name : " + fullName);
		System.out.println("Great given name: " + givenName);
		System.out.println("And nice surname: " + surName);
		System.out.println("This initial middle name: "+ middleName + " is form my middle name Ella");
		System.out.println("My name is: " + completeName);
	
  }
}