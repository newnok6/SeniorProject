package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Solvent
{
Substance  substance;
SolventFunction  solventfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public SolventFunction  getSolventfunction()
{
return this.solventfunction;
}public void setSolventfunction ( SolventFunction solventfunction)
{
this.solventfunction = solventfunction;
}

}