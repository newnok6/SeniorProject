package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Vehicle
{
Substance  substance;
VehicleFunction  vehiclefunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public VehicleFunction  getVehiclefunction()
{
return this.vehiclefunction;
}public void setVehiclefunction ( VehicleFunction vehiclefunction)
{
this.vehiclefunction = vehiclefunction;
}

}