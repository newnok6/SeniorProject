package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class ViscosityInducingAgent
{
Substance  substance;
ViscosityInducingAgentFunction  viscosityinducingagentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public ViscosityInducingAgentFunction  getViscosityinducingagentfunction()
{
return this.viscosityinducingagentfunction;
}public void setViscosityinducingagentfunction ( ViscosityInducingAgentFunction viscosityinducingagentfunction)
{
this.viscosityinducingagentfunction = viscosityinducingagentfunction;
}

}