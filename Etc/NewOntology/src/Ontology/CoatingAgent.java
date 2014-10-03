package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class CoatingAgent
{
Substance  substance;
CoatingAgentFunction  coatingagentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public CoatingAgentFunction  getCoatingagentfunction()
{
return this.coatingagentfunction;
}public void setCoatingagentfunction ( CoatingAgentFunction coatingagentfunction)
{
this.coatingagentfunction = coatingagentfunction;
}

}