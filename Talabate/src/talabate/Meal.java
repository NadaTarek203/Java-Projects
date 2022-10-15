/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package talabate;

/**
 *
 * @author Home
 */
public class Meal {
    private String name,discription,note;
    private int quantity;
    private float price,total_price;

    public Meal(String name, String discription, String note, int quantity, float price) {
        this.name = name;
        this.discription = discription;
        this.note = note;
        this.quantity = quantity;
        this.price = price;
    }

    public void setTotal_price(float total_price) {
        this.total_price = price*quantity;
    }
    public void display_info_meal(){}
    public void edit_meal(){}
    
}
