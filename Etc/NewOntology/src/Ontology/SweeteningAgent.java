package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class SweeteningAgent
{
Substance  substance;
SweeteningAgentFunction  sweeteningagentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public SweeteningAgentFunction  getSweeteningagentfunction()
{
return this.sweeteningagentfunction;
}public void setSweeteningagentfunction ( SweeteningAgentFunction sweeteningagentfunction)
{
this.sweeteningagentfunction = sweeteningagentfunction;
}

}