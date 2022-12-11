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
public class UserRepo implements Serializable {
    private String name;

    public UserRepo(){}

    public UserRepo(String name) {
            this.name = name;
    }

    public String getUserName() {
            return name;
    }
    public void setUserName(String name) {
            this.name = name;
    }
    
    @Override
    public String toString() {	
            return this.name + " " ;
    }
    
    
}
