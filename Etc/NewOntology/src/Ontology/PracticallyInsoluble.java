package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class PracticallyInsoluble extends Solubility
{
float  maximalsolubility = 0.1f;
float  minimalsolubility = 0f;
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