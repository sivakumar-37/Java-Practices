import java.util.Scanner;
public class arraySumdigit {
static int sumDigits(String str) {
int len = str.length();
int sum = 0;
for (int i = 0; i < len; i++) {
if (Character.isDigit(str.charAt(i))) {
String tmp = str.substring(i,i+1);
sum += Integer.parseInt(tmp);
}
}
return sum;
}
public static void main (String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the string:");
String s;
s=sc.next();
System.out.println(sumDigits(s));
}
}
