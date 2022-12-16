import java.sql.*;
import javax.sql.*;
public class ConnectSam{
  public static void main(String[] args) {
    try{
      Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
      String sourceURL = "jdbc:ucanaccess://D:/music.accdb";
      Connection databaseConnection = DriverManager.getConnection(sourceURL);
      System.out.println("Connection Connected");

      Statement stm = databaseConnection.createStatement();
      String queryString ="SELECT recordingtitle, listprice FROM recordings";

      ResultSet res = stm.executeQuery(queryString);

      while(res.next()){
        System.out.println(res.getString("recordingtitle")+"\t"+res.getFloat("listprice"));
      }

      databaseConnection.close();
    }

    catch(ClassNotFoundException cnfe){
      System.err.println(cnfe);
    }
    catch(SQLException sqle){
      System.err.println(sqle);
    }
  }
}
