package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Precipitation extends QualityControl
{
boolean  valueproperty;
public boolean  getValue()
{
return this.valueproperty;
}public void setValue ( boolean valueproperty)
{
this.valueproperty = valueproperty;
}

}