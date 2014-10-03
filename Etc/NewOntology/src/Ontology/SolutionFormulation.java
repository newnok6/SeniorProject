package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class SolutionFormulation extends LiquidFormulation
{
ArrayList<Vehicle>  vehiclefunction = new ArrayList<Vehicle>();
ArrayList<ViscosityInducingAgent>  viscosityinducingagentfunction = new ArrayList<ViscosityInducingAgent>();
ArrayList<Solvent>  solventfunction = new ArrayList<Solvent>();
public ArrayList<Vehicle> getVehiclefunction()
{
return this.vehiclefunction;
}
public void setVehiclefunction( ArrayList<Vehicle> VehicleFunction)
{
this.vehiclefunction = vehiclefunction;}

public ArrayList<ViscosityInducingAgent> getViscosityinducingagentfunction()
{
return this.viscosityinducingagentfunction;
}
public void setViscosityinducingagentfunction( ArrayList<ViscosityInducingAgent> ViscosityInducingAgentFunction)
{
this.viscosityinducingagentfunction = viscosityinducingagentfunction;}

public ArrayList<Solvent> getSolventfunction()
{
return this.solventfunction;
}
public void setSolventfunction( ArrayList<Solvent> SolventFunction)
{
this.solventfunction = solventfunction;}

}