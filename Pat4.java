import java.io.*;
import java.util.Scanner;

class Thread1 extends Thread {
  public void write(int n)throws IOException{
    FileWriter inp = new FileWriter("inp.txt");
    Scanner sc = new Scanner(System.in);
    try{
      for (int i=0;i<n;i++){
        String m = sc.next();
        inp.write(m+"\n");
      }

      inp.close();
    }
    catch (IOException e){
      System.out.println("Error");
    }
  }
}

class Thread2 extends Thread{
  public void display(){
    try{
      FileReader in = new FileReader("inp.txt");
      int c;
      while((c=in.read())!=-1){
        System.out.println((char)c);
      }
      in.close();
    }
    catch (IOException e){
      System.out.println("Error");
    }
  }
}

class Thread3 extends Thread{
  public void copy(){
    try{
      FileReader inp = new FileReader("inp.txt");
      FileWriter out = new FileWriter("output.txt");

      int c;
      while ((c=inp.read())!=-1)
        out.write(c);

      inp.close();
      out.close();
    }
    catch (IOException e){
        System.out.println("Error");
    }
  }
}

public class Pat4{
  public static void main(String[] args) {
    Thread1 obj1 = new Thread1();
    Thread2 obj2 = new Thread2();
    Thread3 obj3 = new Thread3();

    Scanner sc = new Scanner(System.in);
    System.out.println("enter the no of string:");
    int n = sc.nextInt();
    try{
      obj1.setPriority(10);
      obj2.setPriority(5);
      obj3.setPriority(1);

      obj1.write(n);
      System.out.println("result:");
      obj2.display();
      System.out.println("copied");
      obj3.copy();
    }
    catch (IOException e){
      System.out.println("Error");
    }
  }
}
