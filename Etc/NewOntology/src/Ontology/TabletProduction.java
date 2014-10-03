package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class TabletProduction extends PharmaceuticalProduction
{
TabletProcess  tabletprocessproeprty;
TabletFormulation  tabletformulationproperty;
public TabletProcess  getTabletprocessproeprty()
{
return this.tabletprocessproeprty;
}public void setTabletprocessproeprty ( TabletProcess tabletprocessproeprty)
{
this.tabletprocessproeprty = tabletprocessproeprty;
}

public TabletFormulation  getTabletformulationproperty()
{
return this.tabletformulationproperty;
}public void setTabletformulationproperty ( TabletFormulation tabletformulationproperty)
{
this.tabletformulationproperty = tabletformulationproperty;
}

}