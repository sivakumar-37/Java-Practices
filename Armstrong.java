import java.util.Scanner;
public class Armstrong{
  public static void main(String[] args) {
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the number:");
    int z=s.nextInt();
    int count=0,r,y=0;
    int x=z;
    while(z!=0){
      z/=10;
      count++;
    }
    System.out.println("No of digits:"+count);

    for (;z!=0 ;z/=10 ) {
      r=z%10;
      y+=Math.pow(r,count);
    }

    if(x==y)
      System.out.println("It's a Armstrong");
    else
      System.out.println("It's not a Armstrong");
  }
}
