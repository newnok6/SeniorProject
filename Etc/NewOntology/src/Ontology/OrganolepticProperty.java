package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class OrganolepticProperty extends PhysicalProperty
{
String  valueproperty;
public String  getValue()
{
return this.valueproperty;
}public void setValue ( String valueproperty)
{
this.valueproperty = valueproperty;
}

}