import java.util.Scanner;
class Romannum{

  public int num;

  private static int[] numbers={1000,900,500,400,100,90,50,40,10,9,5,4,1};
  private static String[] letters ={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

  public Romannum(int x){
    if(x<1)
      System.out.println("enter the postive number");
    if(x>3999)
      System.out.println("enter the number less than 4000");
    num= x;
  }

  public Romannum(String roman){
    roman= roman.toUpperCase();

    int i=0, result=0;

    while(i<roman.length()){
      char l = roman.charAt(i);
      int n = letterToNumber(l);

      i++;

      if(i==roman.length())
        result+=n;

      else{
        int nextNum= letterToNumber(roman.charAt(i));
        if(nextNum > n){
          result+= (nextNum - n);
          i++;
        }
        else
          result += n;
      }
    }

    if(result > 3999)
      System.out.println("roman numeral must be less than 4000");

      num = result;
  }

  private int letterToNumber(char l){
    switch (l) {
      case 'I' : return 1;
      case 'V' : return 5;
      case 'X' : return 10;
      case 'L' : return 50;
      case 'C' : return 100;
      case 'D' : return 500;
      case 'M' : return 1000;
      default: return -1;
    }
  }

  public String toString(){
    String roman = "";
    int N= num;

    for (int i=0;i<numbers.length; i++){
      while (N>= numbers[i]){
        roman += letters[i];
        N-= numbers[i];
      }
    }
    return roman;
  }

  public int toInt(){
    return num;
  }
}

public class Roman{
  public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);

      System.out.println("Enter the roman number:");
      String s=sc.next();

      System.out.println("Enter the number:");
      int i=sc.nextInt();

      Romannum rom1 = new Romannum (s);
      Romannum rom2 = new Romannum (i);

      System.out.println(rom1.toString()+":"+rom1.toInt());
      System.out.println(rom2.toInt()+":"+rom2.toString());
  }
}
