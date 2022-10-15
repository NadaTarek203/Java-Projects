package talabate;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Customer extends User {    
    private int mobile;
    private String address,region;
    private Order o[];    
    
    public void display_offers(){}

    public void setAddress(String address) {
        this.address = address;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    
    @Override
     public void login(Connection c){                     
            System.out.print(" Enter user name => ");
            username = input.nextLine();
            System.out.print(" Enter password =>");
            password = input.nextLine();
            
        try {
            query="select * from CUSTOMER";
            p_statement=c.prepareStatement(query);
            result=p_statement.executeQuery();
            while(result.next())
            {
                if(username.equals(result.getString("CUSTUSERNAME"))&&password.equals(result.getString("CUSTPASS")))
                {
                    System.out.println("exist");
                    exist=true;
                }
            }
            if(exist==false){
                System.out.println("You entered invalid data\npress 1 to login\npress 2 to register");
                choice=input.nextInt();
                input.nextLine();
              if(choice==1)
                login(c);
              else
                Register(c); 
            }
        } 
        catch (SQLException ex) {
            System.out.println("You entered invalid data\npress 1 to login\npress 2 to register");
            choice=input.nextInt();
            if(choice==1)
                login(c);
            else
                Register(c);    
        }
        }
     
     
     
    @Override
    public void Register(Connection c){
            String mail;
            
            System.out.println("Please,Enter your name:");
            username=input.nextLine();      
            System.out.println("Enter password:");
            password=input.nextLine();
            if(password.contains(" ")){
                System.out.println("password\n**please enter valid password**");
                System.out.println("Enter password:");
                password=input.nextLine();
            }
            System.out.print("Please,Enter your phone number:");
            mobile=input.nextInt();
            input.nextLine();
            System.out.print("Please,Enter your region:");
            region=input.nextLine();
            System.out.print("Please,Enter your address:");
            address=input.nextLine(); 
            System.out.print("Please,Enter your email:");           
            mail=input.nextLine();
            setE_mail(mail);            
            try{
            query="insert into CUSTOMER (CUSTUSERNAME,CUSTPASS,PHONENUMBER,CREGION,ADDRESS,CEMAIL)"+"values(?,?,?,?,?,?)";
            p_statement=c.prepareStatement(query);
            p_statement.setString(1,username);
            p_statement.setString(2,password);
            p_statement.setInt(3,mobile);
            p_statement.setString(4,region);
            p_statement.setString(5,address);
            p_statement.setString(6,mail);
            p_statement.execute();
            } 
            catch (SQLException ex){
            System.out.println("This name already exists\n**press 1 to register again\n**press 1 to login");
            choice=input.nextInt();
            input.nextLine();
            if(choice==1)
                login(c);
            else
                Register(c); 
            }
    }

    @Override
    public void Disblay_order() {  
    }  
}
