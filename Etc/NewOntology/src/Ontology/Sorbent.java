package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Sorbent
{
Substance  substance;
SorbentFunction  sorbentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public SorbentFunction  getSorbentfunction()
{
return this.sorbentfunction;
}public void setSorbentfunction ( SorbentFunction sorbentfunction)
{
this.sorbentfunction = sorbentfunction;
}

}