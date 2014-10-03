package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Solubilizer
{
Substance  substance;
SolubilizerFunction  solubilizerfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public SolubilizerFunction  getSolubilizerfunction()
{
return this.solubilizerfunction;
}public void setSolubilizerfunction ( SolubilizerFunction solubilizerfunction)
{
this.solubilizerfunction = solubilizerfunction;
}

}