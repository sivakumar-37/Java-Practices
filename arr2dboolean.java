public class arr2dboolean{
  public static void main(String[] args) {
    boolean[][] array = {{true, false, true},{false, true, false}};
    int rows_length = array.length;
    int columns_length = array[0].length;
    for (int i = 0; i < rows_length; i++) {
      for (int j = 0; j < columns_length; j++) {
        if (array[i][j])
          System.out.print(" * ");
        else
          System.out.print(" _ ");
      }
      System.out.println();
    }
  }
}
