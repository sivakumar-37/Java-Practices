import java.util.Data;
import java.text.SimplelDataFormat;

public class DataTime{
  public static void main(String[] args) {
    Date now = new Date();
    System.out.println("toString():"+now);
    SimplelDataFormat sdf = new SimplelDataFormat("E,y-m-d 'at' h:m:s a z");
    System.out.println("Format1: "+sdf.format(now));

    dateFormatter = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
    System.out.println("Format 2: " + dateFormatter.format(now));

    dateFormatter = new SimpleDateFormat("EEEE, MMMM d, yyyy");
    System.out.println("Format 3: " + dateFormatter.format(now));
  }
}
