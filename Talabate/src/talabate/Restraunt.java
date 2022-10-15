package talabate;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Restraunt extends User {
    private String name,owner;
    private float offer;
    private String location;
    private String dilverPlaces[];
    private Order orders[];
    private Meal meals[];

     public void add_dilver_place(){
     }
      public void add_location(){
      }

    public void setOffer(float offer) {
        this.offer = offer;
    }

    public float getOffer() {
        return offer;
    }
      public void display_meal_list(){}
      public void remove_meal(String meal_nme){}
      public void add_meal(){}
      @Override
       public void login(Connection c)
      {   int choice;
      
          System.out.print(" Enter user name =>");
          username = input.nextLine();
          
          System.out.print(" Enter password => ");
          password = input.nextLine();
          
          try {
          query="select * from RESTURANT";
          p_statement=c.prepareStatement(query);
          t=p_statement.executeQuery();
          while(t.next())
          {
              if(username.equals(t.getString("OWNERUSERNAME"))&&password.equals(t.getString("OWNERPASSWORD")))
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
        } catch (SQLException ex) {
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
            System.out.print("Please,Enter Restaurant name:");
            name=input.nextLine();
            System.out.print("Please,Enter your email:");           
            mail=input.nextLine();
            setE_mail(mail);          
            System.out.print("Please,Enter Restaurant's address:");
            location=input.nextLine();        
            System.out.print("Please,Enter Restaurant's offer:");
            offer=input.nextFloat();          
        try {
            query="insert into RESTURANT (OWNERUSERNAME,OWNERPASSWORD,OWNEREMAIL,RESTURANTNAME,LOCATION,OFFER)"+"values(?,?,?,?,?,?)";
            p_statement=c.prepareStatement(query);
            p_statement.setString(1,username);
            p_statement.setString(2,getPassword());
            p_statement.setString(3,mail);
            p_statement.setString(4,name);
            p_statement.setString(5,location);
            p_statement.setFloat(6, offer);
            p_statement.execute();
        } catch (SQLException ex) {
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
