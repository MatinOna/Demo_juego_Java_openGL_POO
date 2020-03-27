/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.lightandmaterial;

import com.martin.www.basicgraphicobject.Cube;
import com.martin.www.main.Ona_Jativa_Proyecto;
import javax.media.opengl.GL;

/**
 *
 * @author fing.labcom
 */
public class Lantern {
    
    public float x,y,z,exponent;
    public int id;
    public boolean encendida,linternaVisible;
    public float dx,dy,dz;
    public float [] ambient,specular,difusse;
    public float cutoff;
    public GL gl;
    public Cube linterna;

    public Lantern(float x, float y, float z, float exponent, int id, boolean encendida, boolean linternaVisible, float dx, float dy, float dz, float[] ambient, float[] specular, float[] difusse, float cutoff, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.exponent = exponent;
        this.id = id;
        this.encendida = encendida;
        this.linternaVisible = linternaVisible;
        this.dx = dx;
        this.dy = dy;
        this.dz = dz;
        this.ambient = ambient;
        this.specular = specular;
        this.difusse = difusse;
        this.cutoff = cutoff;
        this.gl = gl;
        linterna= new Cube(0,0.0f,0,  1f,1f,1f,   0,0,0,gl,1,1,1, null);
    }
    
    public void display()
    {
        this.gl.glLightfv(id, GL.GL_POSITION, new float[]{this.x,this.y,this.z,1},0);
        this.gl.glLightfv(id, GL.GL_AMBIENT, ambient,0);
        this.gl.glLightfv(id, GL.GL_SPECULAR, specular,0);
        this.gl.glLightfv(id, GL.GL_DIFFUSE, difusse,0);
        this.gl.glLightf(this.id,GL.GL_SPOT_CUTOFF,this.cutoff);
        float[] spot_direction= {this.dx,this.dy,this.dz,1};
        this.gl.glLightfv(this.id,GL.GL_SPOT_DIRECTION,spot_direction,0);
        this.gl.glLightf(this.id, GL.GL_SPOT_EXPONENT, this.exponent);
        if (this.linternaVisible)
        { 

            Ona_Jativa_Proyecto.materiales.get("blackcar").activar();
            linterna.x=this.x;
            linterna.y=this.y;
            linterna.z=this.z;
        
            linterna.display();
        

        }
        if (this.encendida==true)
        {
            this.gl.glEnable(this.id);
        }else
        {
            this.gl.glDisable(this.id);
        }
    }
}
