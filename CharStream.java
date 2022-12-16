import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharStream{
  public static void main(String[] args) throws IOException {
    FileReader inp = new FileReader("input.txt");
    FileWriter out = new FileWriter("output.txt");

    int c;
    while ((c=inp.read())!=-1)
      out.write(c);

    inp.close();
    out.close();
  }
}
