package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Photolysis extends DegradationMechanism
{
Light  reactant;
public Light  getReactant()
{
return this.reactant;
}public void setReactant ( Light reactant)
{
this.reactant = reactant;
}

}