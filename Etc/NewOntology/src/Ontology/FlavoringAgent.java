package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class FlavoringAgent
{
Substance  substance;
FlavoringAgentFunction  flavoringagentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public FlavoringAgentFunction  getFlavoringagentfunction()
{
return this.flavoringagentfunction;
}public void setFlavoringagentfunction ( FlavoringAgentFunction flavoringagentfunction)
{
this.flavoringagentfunction = flavoringagentfunction;
}

}