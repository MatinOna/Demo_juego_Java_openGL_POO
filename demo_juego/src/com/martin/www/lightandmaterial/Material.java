/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.lightandmaterial;

import javax.media.opengl.GL;

/**
 *
 * @author fing.labcom
 */
public class Material {
    
    private float[] ambient,diffuse,specular;
    private float shininess;
    public GL gl;

    public Material(float[] ambient, float[] diffuse, float[] specular, float shininess,GL gl) 
    {
        this.ambient = ambient;
        this.diffuse = diffuse;
        this.specular = specular;
        this.shininess = shininess;
        this.gl=gl;
    }

    public void setAmbient(float[] ambient) {
        this.ambient = ambient;
    }

    public void setDiffuse(float[] diffuse) {
        this.diffuse = diffuse;
    }

    public void setSpecular(float[] specular) {
        this.specular = specular;
    }

    public void setShininess(float shininess) {
        this.shininess = shininess;
    }
    
    
    public void activar()
    {
        this.gl.glMaterialfv(GL.GL_FRONT,GL.GL_AMBIENT,ambient,0);
        this.gl.glMaterialfv(GL.GL_FRONT,GL.GL_DIFFUSE,diffuse,0);
        this.gl.glMaterialfv(GL.GL_FRONT,GL.GL_SPECULAR,specular,0);
        this.gl.glMaterialf(GL.GL_FRONT,GL.GL_SHININESS,shininess);
        
    }
    
   
    
}
