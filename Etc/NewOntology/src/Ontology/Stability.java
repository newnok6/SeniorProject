package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Stability extends SubstanceProperty
{
DegradationMechanism  degradationmechanismproperty;
KineticReaction  kineticreaction;
public DegradationMechanism  getDegradationmechanismproperty()
{
return this.degradationmechanismproperty;
}public void setDegradationmechanismproperty ( DegradationMechanism degradationmechanismproperty)
{
this.degradationmechanismproperty = degradationmechanismproperty;
}

public KineticReaction  getKineticreaction()
{
return this.kineticreaction;
}public void setKineticreaction ( KineticReaction kineticreaction)
{
this.kineticreaction = kineticreaction;
}

}