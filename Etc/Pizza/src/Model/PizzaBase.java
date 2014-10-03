/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;
import java.io.Serializable;
/**
 *
 * @author nopphadol
 */
public class PizzaBase implements Serializable {
    private int size;
    private String type;
    
    public PizzaBase(int aSize, String aType) {
        size = aSize;
        type = aType;
    }

    public int getSize() {
        return size;
    }

    public String getType() {
        return type;
    }
    
    public String toString() {
        return "This pizza have size " + getSize() + ".";
    }
}
