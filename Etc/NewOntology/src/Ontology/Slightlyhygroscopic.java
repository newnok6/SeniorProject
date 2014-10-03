package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Slightlyhygroscopic extends Hygroscopicity
{
String  weightincrease;
float  maximumweight = 2f;
float  minimalweight = 0.2f;
public String  getWeightincrease()
{
return this.weightincrease;
}public void setWeightincrease ( String weightincrease)
{
this.weightincrease = weightincrease;
}

public float  getMaximumweight()
{
return this.maximumweight;
}public void setMaximumweight ( float maximumweight)
{
this.maximumweight = maximumweight;
}

public float  getMinimalweight()
{
return this.minimalweight;
}public void setMinimalweight ( float minimalweight)
{
this.minimalweight = minimalweight;
}

}