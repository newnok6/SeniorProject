package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Oxidation extends DegradationMechanism
{
Oxygen  reactant;
public Oxygen  getReactant()
{
return this.reactant;
}public void setReactant ( Oxygen reactant)
{
this.reactant = reactant;
}

}