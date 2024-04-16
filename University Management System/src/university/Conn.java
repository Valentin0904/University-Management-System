package university;
import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Conn {

    Connection c;
    Statement s;

    Conn() {
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        c= DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem","root","C@stravete123");
        s=c.createStatement();

    }catch (Exception e) {
        e.printStackTrace();
    }
    }

}
