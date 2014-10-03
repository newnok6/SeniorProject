package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Antioxidant
{
Substance  substance;
AntioxidantFunction  antioxidantfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public AntioxidantFunction  getAntioxidantfunction()
{
return this.antioxidantfunction;
}public void setAntioxidantfunction ( AntioxidantFunction antioxidantfunction)
{
this.antioxidantfunction = antioxidantfunction;
}

}