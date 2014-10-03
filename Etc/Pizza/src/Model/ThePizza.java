/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.util.*;
import java.io.Serializable;

/**
 *
 * @author nopphadol
 */
public class ThePizza implements Serializable {
    private PizzaTopping pizzaToppings;
    private  PizzaBase pizzaBase;
    
    public ThePizza(PizzaTopping pT, PizzaBase pB) {
        pizzaToppings = pT;
	pizzaBase = pB;
    }

    public PizzaTopping getPizzaToppings() {
        return pizzaToppings;
    }

    public void setPizzaToppings(PizzaTopping pizzaToppings) {
        this.pizzaToppings = pizzaToppings;
    }

    public PizzaBase getPizzaBase() {
        return pizzaBase;
    }

    public void setPizzaBase(PizzaBase pizzaBase) {
        this.pizzaBase = pizzaBase;
    }
    
    
}