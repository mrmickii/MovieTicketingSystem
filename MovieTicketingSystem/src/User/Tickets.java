/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package User;
import java.io.Serializable;

/**
 *
 * @author HJD
 */
public class Tickets implements Serializable{
    private int ticket;
    
    public Tickets(){}
    
    public Tickets(int ticket){
        this.ticket = ticket;
    }
    
    public int getNumTicket(int ticket){
        return ticket;
    }
     public void setUserName(int ticket) {
            this.ticket = ticket;
    }
     
}
