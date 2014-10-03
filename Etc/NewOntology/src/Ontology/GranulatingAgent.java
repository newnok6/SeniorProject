package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class GranulatingAgent
{
Substance  substance;
GranulatingAgentFunction  granulatingagentfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public GranulatingAgentFunction  getGranulatingagentfunction()
{
return this.granulatingagentfunction;
}public void setGranulatingagentfunction ( GranulatingAgentFunction granulatingagentfunction)
{
this.granulatingagentfunction = granulatingagentfunction;
}

}