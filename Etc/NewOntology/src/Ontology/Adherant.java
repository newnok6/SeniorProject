package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Adherant
{
Substance  substance;
AdherantFunction  adherantfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public AdherantFunction  getAdherantfunction()
{
return this.adherantfunction;
}public void setAdherantfunction ( AdherantFunction adherantfunction)
{
this.adherantfunction = adherantfunction;
}

}