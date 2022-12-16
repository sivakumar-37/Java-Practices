import java.util.Scanner;
import java.util.Random;
public class applicHiLo{
  public static void main(String[] args) {
    int score =1000;
    System.out.print("RULES: \n Number 1 to 6 :- Low\t Number 8 to 13 :- High\t Number 7 :- neither High or Low\n ");
    System.out.println("Your Score:"+score);
    Scanner sc = new Scanner(System.in);
    String n="y";
    do {
      System.out.println("Enter the point you risk:");
      int x= sc.nextInt();

      System.out.println("Predict <1=High; 0=Low>");
      int y= sc.nextInt();

      Random rand= new Random();
      int uplim=13;

      int ranm= rand.nextInt(uplim);
      System.out.println("Number is "+ranm);

      if(y==0){
        if(ranm<=6){
          System.out.println("-You won-");
          x = x*2;
          score = score+x;
        }

        else{
          System.out.println("-You Lost-");
          score=score-x;
        }
      }

      else if(y==1){
        if(ranm>=8){
          System.out.println("-You won-");
          x = x*2;
          score = score+x;
        }

        else{
          System.out.println("-You Lost-");
          score=score-x;
        }
      }
      else if(ranm==7)
        System.out.println("No change in your score");

      System.out.println("Your Score:"+score);

      System.out.println("Play again(y:0/n:1):");
 		  int i = sc.nextInt();
 		  if(i==1){
 		   System.out.println("Terminating your program");
 		   System.exit(1); //exit program
 		  }
    }while(n=="y");
  }
}
