package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class WettingAgent
{
Substance  substance;
WettingAgentFunction  wettingagentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public WettingAgentFunction  getWettingagentfunction()
{
return this.wettingagentfunction;
}public void setWettingagentfunction ( WettingAgentFunction wettingagentfunction)
{
this.wettingagentfunction = wettingagentfunction;
}

}