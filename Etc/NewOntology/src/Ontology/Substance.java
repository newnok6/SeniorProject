package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Substance extends Any
{
Solubility  watersolubilityproperty;
ArrayList<Stability>  stabilityproperty = new ArrayList<Stability>();
pKa  dissolutionproperty;
PartitionCoefficient  partitioncoefficientproperty;
Solidstate  physicalformproperty;
Hygroscopicity  hygroscopicityproperty;
ParticleSize  particleproperty;
Solubility  alcoholsolubilityproperty;
Flowability  flowabilityproperty;
Density  powderdensityproperty;
SaltForm  saltproperty;
float  weightproperty;
String  ionicity;
public Solubility  getWatersolubilityproperty()
{
return this.watersolubilityproperty;
}public void setWatersolubilityproperty ( Solubility watersolubilityproperty)
{
this.watersolubilityproperty = watersolubilityproperty;
}

public ArrayList<Stability> getStabilityproperty()
{
return this.stabilityproperty;
}
public void getStabilityproperty( ArrayList<Stability> stabilityproperty)
{
this.stabilityproperty = stabilityproperty;}

public pKa  getDissolutionproperty()
{
return this.dissolutionproperty;
}public void setDissolutionproperty ( pKa dissolutionproperty)
{
this.dissolutionproperty = dissolutionproperty;
}

public PartitionCoefficient  getPartitioncoefficientproperty()
{
return this.partitioncoefficientproperty;
}public void setPartitioncoefficientproperty ( PartitionCoefficient partitioncoefficientproperty)
{
this.partitioncoefficientproperty = partitioncoefficientproperty;
}

public Solidstate  getPhysicalformproperty()
{
return this.physicalformproperty;
}public void setPhysicalformproperty ( Solidstate physicalformproperty)
{
this.physicalformproperty = physicalformproperty;
}

public Hygroscopicity  getHygroscopicityproperty()
{
return this.hygroscopicityproperty;
}public void setHygroscopicityproperty ( Hygroscopicity hygroscopicityproperty)
{
this.hygroscopicityproperty = hygroscopicityproperty;
}

public ParticleSize  getParticleproperty()
{
return this.particleproperty;
}public void setParticleproperty ( ParticleSize particleproperty)
{
this.particleproperty = particleproperty;
}

public Solubility  getAlcoholsolubilityproperty()
{
return this.alcoholsolubilityproperty;
}public void setAlcoholsolubilityproperty ( Solubility alcoholsolubilityproperty)
{
this.alcoholsolubilityproperty = alcoholsolubilityproperty;
}

public Flowability  getFlowabilityproperty()
{
return this.flowabilityproperty;
}public void setFlowabilityproperty ( Flowability flowabilityproperty)
{
this.flowabilityproperty = flowabilityproperty;
}

public Density  getPowderdensityproperty()
{
return this.powderdensityproperty;
}public void setPowderdensityproperty ( Density powderdensityproperty)
{
this.powderdensityproperty = powderdensityproperty;
}

public SaltForm  getSaltproperty()
{
return this.saltproperty;
}public void setSaltproperty ( SaltForm saltproperty)
{
this.saltproperty = saltproperty;
}

public float  getWeightproperty()
{
return this.weightproperty;
}public void setWeightproperty ( float weightproperty)
{
this.weightproperty = weightproperty;
}

public String  getIonicity()
{
return this.ionicity;
}public void setIonicity ( String ionicity)
{
this.ionicity = ionicity;
}

}