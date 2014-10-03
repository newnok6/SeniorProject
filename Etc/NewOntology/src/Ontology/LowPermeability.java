package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class LowPermeability extends logP
{
String  logp;
float  maximum = 6f;
float  minimal = 3f;
public String  getLogp()
{
return this.logp;
}public void setLogp ( String logp)
{
this.logp = logp;
}

public float  getMaximum()
{
return this.maximum;
}public void setMaximum ( float maximum)
{
this.maximum = maximum;
}

public float  getMinimal()
{
return this.minimal;
}public void setMinimal ( float minimal)
{
this.minimal = minimal;
}

}