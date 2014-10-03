package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class VeryFineParticle extends ParticleSize
{
float  maximumparticlesize = 125f;
float  minimalparticlesize = 90f;
public float  getMaximumparticlesize()
{
return this.maximumparticlesize;
}public void setMaximumparticlesize ( float maximumparticlesize)
{
this.maximumparticlesize = maximumparticlesize;
}

public float  getMinimalparticlesize()
{
return this.minimalparticlesize;
}public void setMinimalparticlesize ( float minimalparticlesize)
{
this.minimalparticlesize = minimalparticlesize;
}

}