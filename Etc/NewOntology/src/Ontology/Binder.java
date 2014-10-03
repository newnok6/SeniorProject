package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Binder
{
Substance  substance;
BinderFunction  binderfunction;
public Substance  getSubstance()
{
return this.substance;
}public void setSubstance ( Substance substance)
{
this.substance = substance;
}

public BinderFunction  getBinderfunction()
{
return this.binderfunction;
}public void setBinderfunction ( BinderFunction binderfunction)
{
this.binderfunction = binderfunction;
}

}