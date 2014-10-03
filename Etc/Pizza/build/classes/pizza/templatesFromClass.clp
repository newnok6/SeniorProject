(import Model.*)

(deftemplate ThePizza 
    (declare (from-class ThePizza)
              (include-variables TRUE)))
(deftemplate PizzaBase  
    (declare (from-class PizzaBase)
             (include-variables TRUE)))
(deftemplate PizzaTopping 
    (declare (from-class PizzaTopping)
             (include-variables TRUE)))