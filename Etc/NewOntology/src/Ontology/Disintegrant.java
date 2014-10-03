package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Disintegrant
{
Substance  substance;
DisintegrantFunction  disintegrantfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public DisintegrantFunction  getDisintegrantfunction()
{
return this.disintegrantfunction;
}public void setDisintegrantfunction ( DisintegrantFunction disintegrantfunction)
{
this.disintegrantfunction = disintegrantfunction;
}

}