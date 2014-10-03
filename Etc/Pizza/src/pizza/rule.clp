(defrule test1
    (bind ?pb (PizzaBase (size 9)))
    
    (ThePizza (pizzaBase ?pb)
    )
    =>
    (assert 
        (PizzaBase (size 10))
    )

)

(defrule test2
    (PizzaBase (size 9))
=>
    (assert 
        (PizzaBase (size 10))
    )
    (add (new PizzaBase 11 "typetest"))
)