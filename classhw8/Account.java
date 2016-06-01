package classhw8;

public class Account
{
  private double balance;
  private String name;
  private long acctNum;
  

    private static int numDeposits;
    private static int numWithdrawals;
    private static int amtDeposits;
    private static int amtWithdrawals;
    
    public static int getNumDeposits(){
    	return numDeposits;
    }
    public static int getNumWithdrawals(){
    	return numWithdrawals;
    }
    public static int getamtDeposits(){
    	return amtDeposits;
    }
    public static int getamtWithdrawals(){
    	return amtWithdrawals;
    }

  //----------------------------------------------
  //Constructor -- initializes balance, owner, and account number
  //----------------------------------------------
  public Account(double initBal, String owner, long number)
  {
	  balance = initBal;
	  name = owner;
	  acctNum = number;
  }
  
  public void transfer(Account acct, double amount){
	  if(balance < amount){
		  System.out.println("not enough money. ");
		  
	  }
	  else{
		  balance -= amount;
		  acct.balance += amount;
	  }
	  
  }
  //----------------------------------------------
  // Checks to see if balance is sufficient for withdrawal.
  // If so, decrements balance by amount; if not, prints message.
  //----------------------------------------------
  public void withdraw(double amount)
  {
    if (balance >= amount)
	{
       balance -= amount;
       numWithdrawals++;
       amtWithdrawals += amount;
	}
    else
       System.out.println("Insufficient funds");

  }

  //----------------------------------------------
  // Adds deposit amount to balance.
  //----------------------------------------------
  public void deposit(double amount)
  {
    balance += amount;
    numDeposits++;
    amtDeposits += amount;
  }

  //----------------------------------------------
  // Returns balance.
  //----------------------------------------------
  public double getBalance()
  {
    return balance;
  }

  //----------------------------------------------
  // Returns account number
  //----------------------------------------------
  public double getAcctNumber()
  {
    return acctNum;
  }


  //----------------------------------------------
  // Prints account number, name, and balance
  //----------------------------------------------
  public void printSummary()
  {
      System.out.println("Account number: " + acctNum);
      System.out.println("Account owner: " + name);
      System.out.println("Account balance: " + balance);
  }



}
