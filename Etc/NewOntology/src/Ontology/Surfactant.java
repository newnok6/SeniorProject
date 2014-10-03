package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Surfactant
{
Substance  substance;
SurfactantFunction  surfactantfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public SurfactantFunction  getSurfactantfunction()
{
return this.surfactantfunction;
}public void setSurfactantfunction ( SurfactantFunction surfactantfunction)
{
this.surfactantfunction = surfactantfunction;
}

}