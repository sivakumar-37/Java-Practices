class Prime extends Thread{
  public void display(){
    int count;
    for (int i=2;i<=100;i++){
      count = 0;
      for(int j=1;j<=i;j++){
        if(i%j == 0)
          count++;
        }
        if(count == 2)
          System.out.println(i);
      }
  }
}

class Palindrome extends Thread{
  public void display(){
    int i=10,n,a,sum;
    while(i<100){
      n=i;
      sum=0;
      while(n>0){
        a=n%10;
        sum=(sum*10)+a;
        n/=10;
      }

      if(sum == i)
        System.out.println(i);

      i++;
    }
  }
}

class Armstrong extends Thread{
  public void display(){
    int i=1,n,a,sum;
    while(i<100){
      n=i;
      sum=0;
      while(n>0){
        a=n%10;
        sum+=sum+(i*i*i);
        n/=10;
      }

      if(sum == i)
        System.out.println(i);

      i++;
    }
  }
}

public class ThreadPriPaliArm {
  public static void main(String[] args) {
    Prime o1 = new Prime();
    Palindrome o2 = new Palindrome();
    Armstrong o3 = new Armstrong();

    System.out.println("Prime:");
    o1.display();
    System.out.println(" ");
    System.out.println("Palindrome:");
    o2.display();
    System.out.println(" ");
    System.out.println("Armstrong:");
    o3.display();
  }
}
