package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class ThickeningAgent
{
Substance  substance;
ThickeningAgentFunction  thickeningagentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public ThickeningAgentFunction  getThickeningagentfunction()
{
return this.thickeningagentfunction;
}public void setThickeningagentfunction ( ThickeningAgentFunction thickeningagentfunction)
{
this.thickeningagentfunction = thickeningagentfunction;
}

}