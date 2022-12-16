import java.util.Scanner;
public class Perfect{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number:");
    int x=s.nextInt();
    int factor=0;

    int i=1;
    while(i<=x/2){
       if(x%i==0){
         factor+=i;
       }
      i++;
    }

    if(x==factor)
      System.out.println("It's a Perfect");
    else
      System.out.println("It's not a Perfect");
  }
}
