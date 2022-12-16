class Account {
    private double bal;
    private int accno;

    public Account(int accno) {
        bal=0.0;
        this.accno=accno;
    }

    public void deposit(double sum) {
        if(sum>0) {
            bal=bal+sum;
        }
        else {
            System.err.println("Cannot Deposit Negative Amount.");
        }
    }

    public void withdraw(double sum) {
        if(sum>0) {
            bal=bal-sum;
        }
        else {
            System.err.println("Cannot Withdraw Negative Amount.");
        }
    }

    public double getBalance() {
        return bal;
    }

    public int getAccountNumber() {
        return accno;
    }

    public String toString() {
        return "Account Number: " + accno + "; Balance: " + bal;
    }
    public final void print() {
        //Don't override
        //Override toString method
        System.out.println(toString());
    }
}

class savingsAccount extends Account {
    private double interest;

    public savingsAccount(int accno, double interest){
        super(accno);
        this.interest=interest;
    }

    public void setInterest(double interest) {
        super.deposit(getBalance()*interest);
    }

    public double getInterest() {
        return getBalance()+(getBalance()*interest);
    }

    public String toString() {
        return super.toString()+ "; Interest Rate: " + interest;
    }
}

class currentAccount extends Account {
    private float overdraft;

    public currentAccount(int accno, float overdraft) {
        super(accno);
        this.overdraft=overdraft;
    }

    public void withdraw(double sum) {
        if(sum>0&&sum<overdraft) {
            withdraw(sum);
        }
        else {
            System.err.println("Cannot Withdraw Negative Amount/Withdrawal Amount over Stipulated Limit");
        }
    }

    public String toString() {
        return super.toString()+ "; Limit: " + overdraft;
    }
}

public class inheriBank {
    public static void main(String[] args)
    {
        Account a[]=new Account[2];
        a[0] = new savingsAccount(0001,0.1);
        a[1] = new currentAccount(0002,500);
        update(a);
    }

    public static void update(Account a[]) {
        int i;
        for(i=0;i<a.length;i++) {
            if(a[i] instanceof savingsAccount) {
                savingsAccount s=(savingsAccount)a[i];
                s.deposit(700);
                System.out.println(s.getInterest());
            }
            if(a[i] instanceof currentAccount) {
                currentAccount c=(currentAccount)a[i];
                c.withdraw(501);
            }

        }
    }
}
