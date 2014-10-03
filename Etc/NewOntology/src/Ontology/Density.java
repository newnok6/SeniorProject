package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Density extends SubstanceProperty
{
String  densitytypeproperty;
float  densityvalueproperty;
public String  getDensitytypeproperty()
{
return this.densitytypeproperty;
}public void setDensitytypeproperty ( String densitytypeproperty)
{
this.densitytypeproperty = densitytypeproperty;
}

public float  getDensityvalueproperty()
{
return this.densityvalueproperty;
}public void setDensityvalueproperty ( float densityvalueproperty)
{
this.densityvalueproperty = densityvalueproperty;
}

}