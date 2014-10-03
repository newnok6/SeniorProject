package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class SaltForm extends Any
{
float  molecularweightproperty;
pKa  pkaproperty;
public float  getMolecularweightproperty()
{
return this.molecularweightproperty;
}public void setMolecularweightproperty ( float molecularweightproperty)
{
this.molecularweightproperty = molecularweightproperty;
}

public pKa  getPkaproperty()
{
return this.pkaproperty;
}public void setPkaproperty ( pKa pkaproperty)
{
this.pkaproperty = pkaproperty;
}

}