package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class HausnerRatio extends FlowabilityIndicator
{
Density  bulkdensityproperty;
Density  tappeddensityproperty;
float  hausnerratiovalueproperty;
public Density  getBulkdensityproperty()
{
return this.bulkdensityproperty;
}public void setBulkdensityproperty ( Density bulkdensityproperty)
{
this.bulkdensityproperty = bulkdensityproperty;
}

public Density  getTappeddensityproperty()
{
return this.tappeddensityproperty;
}public void setTappeddensityproperty ( Density tappeddensityproperty)
{
this.tappeddensityproperty = tappeddensityproperty;
}

public float  getHausnerratiovalueproperty()
{
return this.hausnerratiovalueproperty;
}public void setHausnerratiovalueproperty ( float hausnerratiovalueproperty)
{
this.hausnerratiovalueproperty = hausnerratiovalueproperty;
}

}