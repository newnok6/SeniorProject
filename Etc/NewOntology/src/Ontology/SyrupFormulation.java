package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class SyrupFormulation extends LiquidFormulation
{
ArrayList<SweeteningAgent>  sweeteningagentfunction = new ArrayList<SweeteningAgent>();
ArrayList<ThickeningAgent>  thickeningagentfunction = new ArrayList<ThickeningAgent>();
public ArrayList<SweeteningAgent> getSweeteningagentfunction()
{
return this.sweeteningagentfunction;
}
public void setSweeteningagentfunction( ArrayList<SweeteningAgent> SweeteningAgentFunction)
{
this.sweeteningagentfunction = sweeteningagentfunction;}

public ArrayList<ThickeningAgent> getThickeningagentfunction()
{
return this.thickeningagentfunction;
}
public void setThickeningagentfunction( ArrayList<ThickeningAgent> ThickeningAgentFunction)
{
this.thickeningagentfunction = thickeningagentfunction;}

}