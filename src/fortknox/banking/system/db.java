package fortknox.banking.system;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Arnob
 */
public class db {
    public static Connection mycon(){
       Connection con = null ;
       
       try {
          Class.forName("com.mysql.jdbc.Driver");
          con = DriverManager.getConnection("jdbc:mysql://localhost:3306/pos?zeroDateTimeBehavior=convertToNull","root","");
          return con;
       } catch (Exception e) {
           System.err.println(e);
           return null;
       }
   } 
}