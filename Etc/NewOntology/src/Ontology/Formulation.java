package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Formulation extends Any
{
ArrayList<ActiveIngredient>  activeingredientfunction = new ArrayList<ActiveIngredient>();
ArrayList<Preservative>  preservativefunction = new ArrayList<Preservative>();
ArrayList<Buffering>  bufferingfunction = new ArrayList<Buffering>();
ArrayList<Surfactant>  surfactantfunction = new ArrayList<Surfactant>();
ArrayList<Solubilizer>  solubilizerfunction = new ArrayList<Solubilizer>();
ArrayList<ColoringAgent>  coloringagentfunction = new ArrayList<ColoringAgent>();
ArrayList<FlavoringAgent>  flavoringagentfunction = new ArrayList<FlavoringAgent>();
ArrayList<Antioxidant>  antioxidantfunction = new ArrayList<Antioxidant>();
public ArrayList<ActiveIngredient> getActiveingredientfunction()
{
return this.activeingredientfunction;
}
public void setActiveingredientfunction( ArrayList<ActiveIngredient> ActiveIngredientFunction)
{
this.activeingredientfunction = activeingredientfunction;}

public ArrayList<Preservative> getPreservativefunction()
{
return this.preservativefunction;
}
public void setPreservativefunction( ArrayList<Preservative> PreservativeFunction)
{
this.preservativefunction = preservativefunction;}

public ArrayList<Buffering> getBufferingfunction()
{
return this.bufferingfunction;
}
public void setBufferingfunction( ArrayList<Buffering> BufferingFunction)
{
this.bufferingfunction = bufferingfunction;}

public ArrayList<Surfactant> getSurfactantfunction()
{
return this.surfactantfunction;
}
public void setSurfactantfunction( ArrayList<Surfactant> SurfactantFunction)
{
this.surfactantfunction = surfactantfunction;}

public ArrayList<Solubilizer> getSolubilizerfunction()
{
return this.solubilizerfunction;
}
public void setSolubilizerfunction( ArrayList<Solubilizer> SolubilizerFunction)
{
this.solubilizerfunction = solubilizerfunction;}

public ArrayList<ColoringAgent> getColoringagentfunction()
{
return this.coloringagentfunction;
}
public void setColoringagentfunction( ArrayList<ColoringAgent> ColoringAgentFunction)
{
this.coloringagentfunction = coloringagentfunction;}

public ArrayList<FlavoringAgent> getFlavoringagentfunction()
{
return this.flavoringagentfunction;
}
public void setFlavoringagentfunction( ArrayList<FlavoringAgent> FlavoringAgentFunction)
{
this.flavoringagentfunction = flavoringagentfunction;}

public ArrayList<Antioxidant> getAntioxidantfunction()
{
return this.antioxidantfunction;
}
public void setAntioxidantfunction( ArrayList<Antioxidant> AntioxidantFunction)
{
this.antioxidantfunction = antioxidantfunction;}

}