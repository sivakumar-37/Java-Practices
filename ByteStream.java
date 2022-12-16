import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStream{
  public static void main(String[] args) throws IOException {
    FileInputStream inp = new FileInputStream("input.txt");
    FileOutputStream out = new FileOutputStream("output.txt");

    int c;
    while ((c=inp.read())!=-1)
      out.write(c);

    inp.close();
    out.close();
  }
}
