(deftemplate ThePizza 
    (slot pizzaBase (type OBJECT))
    (slot pizzaToppiing (type OBJECT))
)
(deftemplate PizzaBase  
    (slot size)
    (slot type)
)
(deftemplate PizzaTopping 
    (slot name)
    (slot isVegetarian)
)