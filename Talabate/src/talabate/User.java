package talabate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public abstract class User {
    String username;
    int choice;
    protected String password;
    private String e_mail;
    static PreparedStatement p_statement;
    static ResultSet t;
    static String query;
    boolean exist=false;    
    Scanner input = new Scanner (System.in);
   
    
    
    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
    
    public abstract void login(Connection c);
    public abstract void Register(Connection c);
    public abstract void Disblay_order();
}
