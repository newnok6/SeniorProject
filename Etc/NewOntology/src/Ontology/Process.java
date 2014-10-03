package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Process extends Any
{
ArrayList<UnitOperation>  unitoperationproperty = new ArrayList<UnitOperation>();
public ArrayList<UnitOperation> getUnitoperationproperty()
{
return this.unitoperationproperty;
}
public void getUnitoperationproperty( ArrayList<UnitOperation> unitoperationproperty)
{
this.unitoperationproperty = unitoperationproperty;}

}