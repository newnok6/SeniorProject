package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class ManufacturingProblem extends Any
{
boolean  valueproperty;
String  characteristicproperty;
public boolean  getValue()
{
return this.valueproperty;
}public void setValue ( boolean valueproperty)
{
this.valueproperty = valueproperty;
}

public String  getCharacteristicproperty()
{
return this.characteristicproperty;
}public void setCharacteristicproperty ( String characteristicproperty)
{
this.characteristicproperty = characteristicproperty;
}

}