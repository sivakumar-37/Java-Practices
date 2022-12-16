import java.util.Scanner;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.BufferedWriter;

public class StudentInp{
  public static void main(String[] args) throws IOException {
    FileOutputStream out = new FileOutputStream("output.txt");
    //BufferedWriter buf = new BufferedWriter(out);
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of students:");
    int c = sc.nextInt();
    byte[] strtoByte;
    for (int i=0;i<c ;i++ ) {
      System.out.println("enter the name:");
      String name= sc.next();
      System.out.println("enter the regno:");
      int regno= sc.nextInt();
      System.out.println("enter the address:");
      String add= sc.next();
      System.out.println("enter the branch:");
      String branch= sc.next();
      System.out.println("enter the phone:");
      int phone= sc.nextInt();
      /*
      buf.write(name+" ");
      buf.write(regno+" ");
      buf.write(add+" ");
      buf.write(branch+" ");
      buf.write(phone+" ");
      buf.write("\n");
      */
      out.write(("Name:"+name).getBytes());
      out.write(("regno:"+(String.valueOf(regno))).getBytes());
      out.write(("address:"+add.getBytes()));
      out.write("branch:"+branch.getBytes());
      out.write("phone:"+(String.valueOf(phone)+"\n").getBytes());

    }
    //out.write(strtoByte);
    //buf.close();
    out.close();
  }
}
