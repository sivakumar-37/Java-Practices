abstract class Bank{
  public abstract int getBalance();
}

class BankA extends Bank{
  int bal=100;
  public int getBalance(){
    return bal;
  }
}

class BankB extends Bank{
  int bal=200;
  public int getBalance(){
    return bal;
  }
}

class BankC extends Bank{
  int bal=300;
  public int getBalance(){
    return bal;
  }
}

public class abstBank{
  public static void main(String[] args){
    int p1,p2,p3;
    BankA o1 = new BankA();
    p1=o1.getBalance();
    System.out.println(p1);
    BankB o2 = new BankB();
    p2=o2.getBalance();
    System.out.println(p2);
    BankC o3 = new BankC();
    p3=o3.getBalance();
    System.out.println(p3);
  }
}
