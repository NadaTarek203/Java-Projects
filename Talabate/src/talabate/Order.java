/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabate;

/**
 *
 * @author NADA
 */
public class Order {
    private static int code=0;
    private String date;
    private boolean IsOffered=false;
     private boolean IsDone=false; ///customer
     private boolean IsCreated=false;//restruant
     private float total_price; //order
     public Order(int code,Meal m){}

    public void setIsOffered(boolean IsOffered) {
        this.IsOffered = IsOffered;
    }

    public void setIsDone(boolean IsDone) {
        this.IsDone = IsDone;
    }

    public void setIsCreated(boolean IsCreated) {
        this.IsCreated = IsCreated;
    }

    public void setTotal_price(float total_price) {
        
    }
     
    
}
