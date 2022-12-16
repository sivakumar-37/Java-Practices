import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CharWordLine{
  public static void main(String[] args) throws IOException {
    BufferedReader inp = new BufferedReader(new FileReader("input.txt"));

    int countc=0, countw=0, countl=0;
    String c;
    while ((c=inp.readLine())!=null){
      countl++;
      String[] words = c.split(" ");
      countw = countw + words.length;
      for(String word: words){
        countc = countc + words.length;
      }
    }

    System.out.println("no of char: "+countc);
    System.out.println("no of words: "+countw);
    System.out.println("no of line: "+countl);
    inp.close();
  }
}
