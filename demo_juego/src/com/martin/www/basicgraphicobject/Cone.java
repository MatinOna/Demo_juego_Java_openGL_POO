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
public class Cone extends StateDefaultFigure implements Displayable,Colisionable {
   
   
    GLUT glut = new GLUT();
    GLU glu = new GLU();

    public Cone(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl, float r, float g, float b, boolean mode) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl, r, g, b, mode);
    }
    
        
    
  
    

    public void display() {
        
       gl.glPushMatrix();
       
       super.modelMatrixColor();
       
       if(mode==true)
       {
           glut.glutSolidCone(1.0,1.0,10,10);
       }else
       {
           glut.glutWireCone(1.0,1.0,10,10);
       }
        
       
        /*
        void glutSolidCone(GLdouble base, GLdouble height,
                   GLint slices, GLint stacks);
        void glutWireCone(GLdouble base, GLdouble height,
                  GLint slices, GLint stacks);
        base
        The radius of the base of the cone.
        height
        The height of the cone.
        slices
        The number of subdivisions around the Z axis.
        stacks
        The number of subdivisions along the Z axis.
        
        */
        
        
        gl.glPopMatrix();
        
    } 

 
    
}
