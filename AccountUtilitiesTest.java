package ver2;

public class AccountUtilitiesTest {
	public static void main(String[] args) {
		testGetLargestBalance();
		testGetLargestAccounts();
	}
	
	public static void testGetLargestBalance() {
		System.out.println("testGetLargestBalance(accounts)");
		
		// Create an array of accounts
		account[] accounts = new account[3];
		account a1 = new account("Mia", 1000.0);
		account a2 = new account(3000.0);
		account a3 = new account("Zeke", 200.0);
		accounts[0] = a1;
		accounts[1] = a2;
		accounts[2] = a3;

		// Create AccountUtilities
		AccountUtilities util = new AccountUtilities();
	    
		// Test the method
		double maxBalance = util.getLargestBalance(accounts);

		System.out.println("largest balance should be $3000, maxBalance=$" + maxBalance);
	}

	public static void testGetLargestAccounts() {
		System.out.println("\ntestGetLargestAccounts(accounts1, accounts2)");
		
		// Create an array of accounts
		account[] accounts1 = new account[3];
		account a1 = new account("Mia", 1000.0);
		account a2 = new account(3000.0);
		account a3 = new account("Zeke", 200.0);
		accounts1[0] = a1;
		accounts1[1] = a2;
		accounts1[2] = a3;

		// Create another array of accounts
		account[] accounts2 = new account[3];
		account a4 = new account("Pike", 2000.0);
		account a5 = new account("Ann", 500.0);
		account a6 = new account("Ivy", 500.0);
		accounts2[0] = a4;
		accounts2[1] = a5;
		accounts2[2] = a6;

		// Create AccountUtilities
		AccountUtilities util = new AccountUtilities();
	    
		// Test the method
		account[] largest = util.getLargestAccounts(accounts1,accounts2);

		System.out.println("Should be: Pike, Unknown, Ivy");
		System.out.println("Actual results:");
		for(int i=0; i<largest.length; i++) {
			System.out.println(largest[i]);
		}
	}

}

