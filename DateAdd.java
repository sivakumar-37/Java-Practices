import java.util.Scanner;
public class DateAdd{
  public static void main(String[] args){
    Scanner s= new Scanner(System.in);
    System.out.println("Enter the date:");
    int date=s.nextInt();
    System.out.println("Enter the month:");
    int month=s.nextInt();
    System.out.println("Enter the year:");
    int year=s.nextInt();

    int sum;
    sum=date+45;

    if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10){
      date=sum-31;
      month+=1;
    }
    else if (month==12){
      date=sum-31;
      month=1;
      year+=1;
    }
    else if(month==2){
      month+=1;
      date=sum-28;
    }
    else{
      date=sum-30;
      month+=1;
    }


    System.out.println("Date:"+date);
    System.out.println("Month:"+month);
    System.out.println("Year:"+year);
  }
}
