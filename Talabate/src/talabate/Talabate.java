package talabate;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Talabate {
    public static void main(String[] args) throws SQLException {
        
        //variables&objects
        int choice;
        String username;
        String password;
        
        //connection with database 
        Connect c=new Connect();
        Connection con= c.Connect();
        
        //program
        Scanner input = new Scanner (System.in);
        System.out.print("\t\t\t\t\t\tTalabat clone application\n\t\t\t\t\t\t*************************\n");
        System.out.println("press 1 to login.\npress 2 to register.");
        choice=input.nextInt();
        input.nextInt();           
       //login
        if(choice==1){           
            System.out.println("press 1 to login as a customer.\npress 2 to login as a restaurant's owner.");
            choice=input.nextInt();
            input.nextLine();         
            if(choice==1){    
            Customer cust=new Customer();
            cust.login(con);           
            }            
            else if(choice==2){            
            Restraunt owner=new Restraunt();
            owner.login(con);   
            }
            else{
            System.out.println("Warning!!\nmake the correct choice or you will exit the program\npress 1 to login as a customer.\npress 2 to login as a restaurant's owner.");
            choice=input.nextInt();
            input.nextLine();         
            if(choice==1){    
            Customer cust=new Customer();
            cust.login(con);           
            }            
            else if(choice==2){            
            Restraunt owner=new Restraunt();
            owner.login(con);   
            }
            }
        }
        //register
        else if(choice==2){
            System.out.println("press 1 to register as a customer.\npress 2 to register as a restaurant's owner.");
            choice=input.nextInt();
            input.nextLine();
            if(choice==1){             
              Customer new_cust=new Customer();
              new_cust.Register(con);
            }
            else if(choice==2){
              Restraunt new_owner=new Restraunt();
              new_owner.Register(con);
            }
            else{
            System.out.println("Warning!!\nmake the correct choice or you will exit the program\npress 1 to register as a customer.\npress 2 to register as a restaurant's owner.");
            choice=input.nextInt();
            input.nextLine();         
            if(choice==1){    
            Customer new_cust=new Customer();
            new_cust.Register(con);
            }            
            else if(choice==2){            
            Restraunt new_owner=new Restraunt();
            new_owner.Register(con);   
            }            
            }
        }
        //if user choose invalid choice
        else{
        System.out.println("Warning!!\nmake the correct choice or you will exit the program\npress 1 to login.\npress 2 to register.");
        choice=input.nextInt();
        input.nextInt(); 
        //login
        if(choice==1){           
            System.out.println("press 1 to login as a customer.\npress 2 to login as a restaurant's owner.");
            choice=input.nextInt();
            input.nextLine();         
            if(choice==1){    
            Customer cust=new Customer();
            cust.login(con);           
            }            
            else if(choice==2){            
            Restraunt owner=new Restraunt();
            owner.login(con);   
            }
            else{
            System.out.println("Warning!!\nmake the correct choice or you will exit the program\npress 1 to login as a customer.\npress 2 to login as a restaurant's owner.");
            choice=input.nextInt();
            input.nextLine();         
            if(choice==1){    
            Customer cust=new Customer();
            cust.login(con);           
            }            
            else if(choice==2){            
            Restraunt owner=new Restraunt();
            owner.login(con);   
            }
            }
        }
        //register
        else if(choice==2){
            System.out.println("press 1 to register as a customer.\npress 2 to register as a restaurant's owner.");
            choice=input.nextInt();
            input.nextLine();
            if(choice==1){             
              Customer new_cust=new Customer();
              new_cust.Register(con);
            }
            else if(choice==2){
              Restraunt new_owner=new Restraunt();
              new_owner.Register(con);
            }
            else{
            System.out.println("Warning!!\nmake the correct choice or you will exit the program\npress 1 to register as a customer.\npress 2 to register as a restaurant's owner.");
            choice=input.nextInt();
            input.nextLine();         
            if(choice==1){    
            Customer new_cust=new Customer();
            new_cust.Register(con);
            }            
            else if(choice==2){            
            Restraunt new_owner=new Restraunt();
            new_owner.Register(con);   
            }            
            }
        }     
        }
    }   
}
