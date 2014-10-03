package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class SolutionProcess extends Process
{
ArrayList<WetMixing>  mixingunitoperationproperty = new ArrayList<WetMixing>();
public ArrayList<WetMixing> getMixingunitoperationproperty()
{
return this.mixingunitoperationproperty;
}
public void getMixingunitoperationproperty( ArrayList<WetMixing> mixingunitoperationproperty)
{
this.mixingunitoperationproperty = mixingunitoperationproperty;}

}