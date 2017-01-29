class InsufficientFundsException extends Exception {
	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return this.amount;
	}
}

class SavingsAccount {
	private double balance;
	private int number;

	public SavingsAccount(int number) {
		this.number = number;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) throws InsufficientFundsException {
		if (amount <= balance) {
			balance -= amount;
		} else {
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}

	public double getBalance() {
		return balance;
	}
}

class Bank {
	public static void main(String[] args) {
		SavingsAccount s = new SavingsAccount(101);
		System.out.println("Depositing 500 Rs");
		s.deposit(500.00);

		try {
			System.out.println("Withdrawing 100 Rs");
			s.withdraw(100.00);
			System.out.println("Withdrawing 600 Rs");
			s.withdraw(600.00);
		} catch(InsufficientFundsException e) {
			System.out.println("Sorry you are short of " + e.getAmount() + " Rs");
			e.printStackTrace();
		}
	}
}