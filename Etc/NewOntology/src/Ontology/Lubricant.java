package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Lubricant
{
Substance  substance;
LubricantFunction  lubricantfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public LubricantFunction  getLubricantfunction()
{
return this.lubricantfunction;
}public void setLubricantfunction ( LubricantFunction lubricantfunction)
{
this.lubricantfunction = lubricantfunction;
}

}