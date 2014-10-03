package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class UnitOperation extends Any
{
ArrayList<Substance>  substanceproperty = new ArrayList<Substance>();
Method  methodproperty;
public ArrayList<Substance> getSubstanceproperty()
{
return this.substanceproperty;
}
public void getSubstanceproperty( ArrayList<Substance> substanceproperty)
{
this.substanceproperty = substanceproperty;}

public Method  getMethodproperty()
{
return this.methodproperty;
}public void setMethodproperty ( Method methodproperty)
{
this.methodproperty = methodproperty;
}

}