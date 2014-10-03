package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class API
{
Substance  substance;
ActiveIngredientFunction  activeingredientfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public ActiveIngredientFunction  getActiveingredientfunction()
{
return this.activeingredientfunction;
}public void setActiveingredientfunction ( ActiveIngredientFunction activeingredientfunction)
{
this.activeingredientfunction = activeingredientfunction;
}

}