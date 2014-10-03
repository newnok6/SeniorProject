/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pizza;

import jess.*;

/**
 *
 * @author nopphadol
 */
public class Pizza2 {
    
    public static void main(String[] args) throws JessException {
        Rete engine = new Rete();
        engine.batch("pizza/templatesFromWriting.clp");
        
       Fact f = new Fact("PizzaBase", engine);
       f.setSlotValue("size", new Value(9, RU.INTEGER));
       f.setSlotValue("type", new Value("type1", RU.STRING));
       engine.assertFact(f);
       
       Fact f2 = new Fact("PizzaTopping", engine);
       f2.setSlotValue("name", new Value("name1", RU.STRING));
       f2.setSlotValue("isVegetarian", new Value("YES", RU.STRING));
       
       engine.assertFact(f2);
       
       engine.eval("(facts)");
    
    }
    
    
}
