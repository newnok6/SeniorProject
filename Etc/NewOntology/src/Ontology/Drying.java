package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Drying extends UnitOperation
{
float  heattemperature;
float  moisturecontent;
DryingMethod  methodproperty;
public float  getHeattemperature()
{
return this.heattemperature;
}public void setHeattemperature ( float heattemperature)
{
this.heattemperature = heattemperature;
}

public float  getMoisturecontent()
{
return this.moisturecontent;
}public void setMoisturecontent ( float moisturecontent)
{
this.moisturecontent = moisturecontent;
}

public DryingMethod  getMethodproperty()
{
return this.methodproperty;
}public void setMethodproperty ( DryingMethod methodproperty)
{
this.methodproperty = methodproperty;
}

}