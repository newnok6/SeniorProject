package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Solubility extends SubstanceProperty
{
float  maximumvalueproperty;
float  minimumvalueproperty;
String  solubilitytypeproperty;
float  solubilityvalueproperty;
public float  getMaximumvalueproperty()
{
return this.maximumvalueproperty;
}public void setMaximumvalueproperty ( float maximumvalueproperty)
{
this.maximumvalueproperty = maximumvalueproperty;
}

public float  getMinimumvalueproperty()
{
return this.minimumvalueproperty;
}public void setMinimumvalueproperty ( float minimumvalueproperty)
{
this.minimumvalueproperty = minimumvalueproperty;
}

public String  getSolubilitytypeproperty()
{
return this.solubilitytypeproperty;
}public void setSolubilitytypeproperty ( String solubilitytypeproperty)
{
this.solubilitytypeproperty = solubilitytypeproperty;
}

public float  getSolubilityvalueproperty()
{
return this.solubilityvalueproperty;
}public void setSolubilityvalueproperty ( float solubilityvalueproperty)
{
this.solubilityvalueproperty = solubilityvalueproperty;
}

}