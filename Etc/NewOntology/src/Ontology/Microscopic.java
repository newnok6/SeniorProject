package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class Microscopic
{
float  minimumparticlesize = 1f;
float  maximumparticlesize = 3000f;
public float  getMinimumparticlesize()
{
return this.minimumparticlesize;
}public void setMinimumparticlesize ( float minimumparticlesize)
{
this.minimumparticlesize = minimumparticlesize;
}

public float  getMaximumparticlesize()
{
return this.maximumparticlesize;
}public void setMaximumparticlesize ( float maximumparticlesize)
{
this.maximumparticlesize = maximumparticlesize;
}

}