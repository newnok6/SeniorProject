package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class CompressibilityIndex extends FlowabilityIndicator
{
Density  bulkdensityproperty;
Density  tappeddensityproperty;
float  compressiblityindexvalueproperty;
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

public float  getCompressiblityindexvalueproperty()
{
return this.compressiblityindexvalueproperty;
}public void setCompressiblityindexvalueproperty ( float compressiblityindexvalueproperty)
{
this.compressiblityindexvalueproperty = compressiblityindexvalueproperty;
}

}