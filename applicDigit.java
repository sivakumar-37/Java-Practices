import java.util.Scanner;
class DigitExtrctor{

    public void whole(int x){
       int result= x;
       System.out.println("whole number:"+result);
    }

    public void one(int x){
       int result= x%10;
       System.out.println("one's place:"+result);
    }

    public void ten(int x){
       int result= (x%100)/10;
       System.out.println("one's place:"+result);
    }

    public void hundred(int x){
       int result= x/100;
       System.out.println("hundred's place:"+result);
    }
}
public class applicDigit{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer:");
    int x = sc.nextInt();

    System.out.print("show (w)hole number \n show (o)nes place number \n show (t)ens place number \n show (h)undreds place number \n (q)uit\n");

    DigitExtrctor de = new DigitExtrctor();

    while(true){
      System.out.println("Enter your choice:");
      String y= sc.next();
      switch(y){
        case "w": de.whole(x);
        break;
        case "o": de.one(x);
        break;
        case "t": de.ten(x);
        break;
        case "h": de.hundred(x);
        break;
        case "q":
        return;
        default : System.out.println("Invaild Input");
      }
    }
  }
}
