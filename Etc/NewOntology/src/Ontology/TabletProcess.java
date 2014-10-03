package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class TabletProcess extends Process
{
ArrayList<Mixing>  mixingunitoperationproperty = new ArrayList<Mixing>();
PharmaceuticalDosageForm  processdosageform;
String  tabletprocesstypeproperty;
Compression  compressunitoperationproperty;
public ArrayList<Mixing> getMixingunitoperationproperty()
{
return this.mixingunitoperationproperty;
}
public void getMixingunitoperationproperty( ArrayList<Mixing> mixingunitoperationproperty)
{
this.mixingunitoperationproperty = mixingunitoperationproperty;}

public PharmaceuticalDosageForm  getProcessdosageform()
{
return this.processdosageform;
}public void setProcessdosageform ( PharmaceuticalDosageForm processdosageform)
{
this.processdosageform = processdosageform;
}

public String  getTabletprocesstypeproperty()
{
return this.tabletprocesstypeproperty;
}public void setTabletprocesstypeproperty ( String tabletprocesstypeproperty)
{
this.tabletprocesstypeproperty = tabletprocesstypeproperty;
}

public Compression  getCompressunitoperationproperty()
{
return this.compressunitoperationproperty;
}public void setCompressunitoperationproperty ( Compression compressunitoperationproperty)
{
this.compressunitoperationproperty = compressunitoperationproperty;
}

}