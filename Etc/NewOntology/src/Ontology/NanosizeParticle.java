package Ontology;
import java.util.ArrayList;

import java.sql.Time;
public class NanosizeParticle extends ParticleSize
{
float  maximumparticlesize = 100f;
float  minimalparticlesize = 1f;
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