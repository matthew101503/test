package ver2;

public class AccountUtilities {
public AccountUtilities() {}
	
	public double getLargestBalance (account[] accounts) {
		double maxBal = Double.MIN_VALUE;
		
		for(int i=0; i<accounts.length; i++) {
			double currentBal = accounts[i].getBalance();
			if(currentBal>maxBal) {
				maxBal = currentBal;
			}
		}
		return maxBal;
	}
	
	public account[] getLargestAccounts (account[] accounts1, account[] accounts2) {
		account[] biggest = new account[accounts1.length];
		for(int i=0; i<accounts1.length; i++) {
			account a1 = accounts1[i];
			account a2 = accounts2[i];
			if(a1.getBalance()>a2.getBalance()) {
				biggest[i] = a1;
			}
			else {
				biggest[i] = a2;
			}
		}
		return biggest;
	}
}

