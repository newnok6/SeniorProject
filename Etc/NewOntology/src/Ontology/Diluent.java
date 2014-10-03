package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Diluent
{
Substance  substance;
DiluentFunction  diluentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public DiluentFunction  getDiluentfunction()
{
return this.diluentfunction;
}public void setDiluentfunction ( DiluentFunction diluentfunction)
{
this.diluentfunction = diluentfunction;
}

}