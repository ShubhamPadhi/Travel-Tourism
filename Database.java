
package travel.management.system;

import java.sql.*;
public class Database {
    Connection c;
    Statement s;
    Database(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql:///travelmanagementsystem", "root", "root");
            s=c.createStatement();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
