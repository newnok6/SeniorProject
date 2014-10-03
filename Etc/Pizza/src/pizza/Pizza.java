/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza;
import Model.PizzaBase;
import Model.PizzaTopping;
import Model.ThePizza;
import java.util.List;
import jess.*;
/**
 *
 * @author nopphadol
 */
public class Pizza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JessException {
        // TODO code application logic here
        
        Rete engine = new Rete();
        engine.batch("pizza/templatesFromClass.clp");
        // create base and Topping
        PizzaBase pb = new PizzaBase(9, "Deep Pan");
        PizzaTopping tp1 = new PizzaTopping("name1", false);
//        PizzaTopping tp2 = new PizzaTopping("name2", true);
        // create ThePizza
        ThePizza pZ = new ThePizza(tp1, pb);
        
        engine.add(pb);
        engine.add(tp1);
        engine.add(pZ);
        
        engine.eval("(facts)");
        engine.batch("pizza/rule.clp");
        engine.reset();
        engine.run();
        engine.eval("(facts)");
        
               
        
    }
    
}
