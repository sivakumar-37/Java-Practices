import java.util.Scanner;
public class Occur{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter :");
    String str=sc.next();
    int [] freq=new int[256];
    char maxChar =str.charAt(0);
    int i,j,max;

    char string[] = str.toCharArray();

    for(i = 0; i < string.length; i++) {
        freq[i] = 1;
        for(j = i+1; j < string.length; j++) {
          if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                freq[i]++;
                string[j] = '0';
            }
        }
    }

    max = freq[0];
    for(i = 0; i <freq.length; i++) {
          if(max < freq[i]) {
              max = freq[i];
              maxChar = string[i];
          }
      }
      System.out.println("Maximum occurring character: " + maxChar);

  }
}
