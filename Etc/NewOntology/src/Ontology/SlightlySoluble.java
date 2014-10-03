package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class SlightlySoluble extends Solubility
{
float  maximalsolubility = 10f;
float  minimalsolubility = 1f;
public float  getMaximalsolubility()
{
return this.maximalsolubility;
}public void setMaximalsolubility ( float maximalsolubility)
{
this.maximalsolubility = maximalsolubility;
}

public float  getMinimalsolubility()
{
return this.minimalsolubility;
}public void setMinimalsolubility ( float minimalsolubility)
{
this.minimalsolubility = minimalsolubility;
}

}