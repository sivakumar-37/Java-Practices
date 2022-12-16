import java.util.Scanner;
class a2d{
    public a2d(boolean a[][]){
        int m = a.length;
        for(int i=0;i<m;i++){
            for(int j=1;j<m;j++){
                if(i%j==0)
                    a[i][j]= false;
                else
                    a[i][j]= true;
            }
        }
    }

    public void show(boolean a[][]){
        int m = a.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                System.out.println(i+","+j+":"+a[i][j]);
            }
            System.out.println();
        }
    }
}

public class arr2dRelativePrime{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int m;
        System.out.println("enter the size:");
        m= sc.nextInt();
        boolean a[][] = new boolean [m][m];

        a2d c = new a2d(a);
        c.show(a);

    }
}
