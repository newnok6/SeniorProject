package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class ColoringAgent
{
Substance  substance;
ColoringAgentFunction  coloringagentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public ColoringAgentFunction  getColoringagentfunction()
{
return this.coloringagentfunction;
}public void setColoringagentfunction ( ColoringAgentFunction coloringagentfunction)
{
this.coloringagentfunction = coloringagentfunction;
}

}