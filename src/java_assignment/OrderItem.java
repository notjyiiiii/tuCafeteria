/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_assignment;

public class OrderItem {

    private String orderItemID;
    private String foodID;
    private int quantity;
    
    private Menu menuItem = null;
    
    public OrderItem(String orderItemID, String foodID, int quantity) {
        this.orderItemID = orderItemID;
        this.foodID = foodID;
        this.quantity = quantity;
    }
    
    public OrderItem(String orderItemID, String foodID, int quantity, Menu menuItem) {
        this.orderItemID = orderItemID;
        this.foodID = foodID;
        this.quantity = quantity;
        this.menuItem = menuItem;
    }
}
