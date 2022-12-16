import java.util.Scanner;
class GoldbackChecker{
  public static boolean isPrime(int n){
    int f = 0;
    for(int i = 1; i <= n; i++){
      if(n % i == 0)
        f++;
    }
    return f == 2;
  }

  public int[] checkGoldbach(int n){
    int[] a = new int[2];
    int q=0;
    if(n % 2 != 0){
      System.out.println("Invalid input. Number is odd.");
    }
    else if(n < 4){
      System.out.println("Invalid input. Number not in range.");
    }
    else{
      System.out.println("Prime pairs are:");
      for(int p=0;p<n;p++){
        q = n - p;
        if(isPrime(p) && isPrime(q) && p <= q){
          a[0]=p;
          a[1]=q;
        }
      }
    }
    return a;
  }
}

public class applicGoldCheck{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int x= sc.nextInt();
    GoldbackChecker gc= new GoldbackChecker();
    int b[]=gc.checkGoldbach(x);
    for(int i=0;i<b.length;i++){
      System.out.print(b[i]+" ");
    }
  }
}
