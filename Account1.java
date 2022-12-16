improve java.util.Scanner;
class Account
{
    private double bal;  //The current balance
    private int accnum;  //The account number


    public Account(int a)
    {
      bal=0.0;
	    accnum=a;
    }

    public void deposit(double sum)
    {
	    if (sum>0)
	      bal+=sum;
	    else
	      System.err.println("Account.deposit(...): "
			       +"cannot deposit negative amount.");
    }

    public void withdraw(double sum)
    {
    	if (sum>0)
    	    bal-=sum;
    	else
    	    System.err.println("Account.withdraw(...): "
    			       +"cannot withdraw negative amount.");
    }

    public double getBalance()
    {
	     return bal;
    }

    public double getAccountNumber()
    {
	     return accnum;
    }

    public String toString()
    {
	     return "Acc " + accnum + ": " + "balance = " + bal;
    }

    public final void print()
    {
	//Don't override this,
	//override the toString method
      System.out.println( toString() );
    }
}

class savingAcc extends Account{
  double interest;

  public savingsAcc(int accnum, double interest){
      super(accnum);
      this.interest=interest;
  }

  public void setInterest(double interest){
      super.deposit(getBalance()*interest)
  }

  public double getInterest(){
    return getBalance()+(getBalance()*interest);
  }

  public String toString() {
      return super.toString()+ "Interest Rate: " + interest;
  }
}

class currentAcc extends Account{
  double overdraft;

  public currentAccount(int accnum, float overdraft) {
      super(accno);
      this.overdraft=overdraft;
  }

  public void withdraw(double sum){
    if (sum>=overdraft){
      System.out.println("You have exsized the limit");
    }
    else{
      super.withdraw(l)
    }
  }

  public String toString(){
    return super.toString()+"limit:"+limit;
  }
}

public class Account1{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Account a[2]= new Account(2);
    a[0]= new savingAcc(1001,0.5);
    a[1]= new currentAcc(1002,1.0);
    update(a);

    public static void update(Account a[]) {
        int i;
        for(i=0;i<a.length;i++) {
            if(a[i] instanceof savingsAccount) { //Account is Savings Account Type
                savingsAccount s=(savingsAccount)a[i]; //Class Type Casting
                s.deposit(500);
                System.out.println(s.getInterest());
            }
            if(a[i] instanceof currentAccount) {
                currentAccount c=(currentAccount)a[i];
                c.withdraw(501);
                //Whatever it means to send a letter if you are "in Overdraft"
            }

        }
    }

  }
}
