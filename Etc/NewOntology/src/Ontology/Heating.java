package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Heating extends UnitOperation
{
float  maxtempvalueproperty;
HeatingMethod  methodproperty;
public float  getMaxtempvalueproperty()
{
return this.maxtempvalueproperty;
}public void setMaxtempvalueproperty ( float maxtempvalueproperty)
{
this.maxtempvalueproperty = maxtempvalueproperty;
}

public HeatingMethod  getMethodproperty()
{
return this.methodproperty;
}public void setMethodproperty ( HeatingMethod methodproperty)
{
this.methodproperty = methodproperty;
}

}