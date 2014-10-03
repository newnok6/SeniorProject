package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class SolutionProduction extends PharmaceuticalProduction
{
SolutionProcess  solutionprocessproperty;
SolutionFormulation  solutionformulationproperty;
public SolutionProcess  getSolutionprocessproperty()
{
return this.solutionprocessproperty;
}public void setSolutionprocessproperty ( SolutionProcess solutionprocessproperty)
{
this.solutionprocessproperty = solutionprocessproperty;
}

public SolutionFormulation  getSolutionformulationproperty()
{
return this.solutionformulationproperty;
}public void setSolutionformulationproperty ( SolutionFormulation solutionformulationproperty)
{
this.solutionformulationproperty = solutionformulationproperty;
}

}