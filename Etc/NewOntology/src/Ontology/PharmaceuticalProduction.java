package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class PharmaceuticalProduction extends Any
{
ArrayList<QualityControl>  qualitycontrolproperty = new ArrayList<QualityControl>();
Process  processproperty;
Formulation  formulationproperty;
ArrayList<ManufacturingProblem>  manufacturingproblemproperty = new ArrayList<ManufacturingProblem>();
public ArrayList<QualityControl> getQualitycontrolproperty()
{
return this.qualitycontrolproperty;
}
public void getQualitycontrolproperty( ArrayList<QualityControl> qualitycontrolproperty)
{
this.qualitycontrolproperty = qualitycontrolproperty;}

public Process  getProcessproperty()
{
return this.processproperty;
}public void setProcessproperty ( Process processproperty)
{
this.processproperty = processproperty;
}

public Formulation  getFormulationproperty()
{
return this.formulationproperty;
}public void setFormulationproperty ( Formulation formulationproperty)
{
this.formulationproperty = formulationproperty;
}

public ArrayList<ManufacturingProblem> getManufacturingproblemproperty()
{
return this.manufacturingproblemproperty;
}
public void getManufacturingproblemproperty( ArrayList<ManufacturingProblem> manufacturingproblemproperty)
{
this.manufacturingproblemproperty = manufacturingproblemproperty;}

}