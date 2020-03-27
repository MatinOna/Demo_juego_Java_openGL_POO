/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.basicgraphicobject;

import com.martin.www.interfaz.Colisionable;
import com.martin.www.interfaz.Displayable;
import com.martin.www.pojos.StateDefaultFigure;
import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

/**
 *
 * @author Martin
 */
public class Sphere extends StateDefaultFigure implements Displayable,Colisionable{
    
    GLUT glut = new GLUT();
    GLU glu = new GLU();

    public Sphere(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl, float r, float g, float b, boolean mode) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl, r, g, b, mode);
    }

    public void display() {
        
       gl.glPushMatrix();
       
       super.modelMatrixColor();
       
       if(mode==true)
       {
           glut.glutSolidSphere(1.0,10,10);
       }else{
           glut.glutWireSphere(1.0,10,10);
       }
       
       
        /*
radius
The radius of the sphere.
slices
The number of subdivisions around the Z axis (similar to lines of longitude).
stacks
The number of subdivisions along the Z axis (similar to lines of latitude).
        
        */
        
        
        gl.glPopMatrix();
        
    } 
    
}
