/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.basicgraphicobject;

import com.martin.www.interfaz.Displayable;
import com.martin.www.pojos.StateDefaultFigure;
import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;

/**
 *
 * @author Martin
 */
public class Toru extends StateDefaultFigure implements Displayable{
    
    GLUT glut = new GLUT();
    GLU glu = new GLU();

    public Toru(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl, float r, float g, float b, boolean mode) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl, r, g, b, mode);
    }

    public void display() {
        
       gl.glPushMatrix();
       
       super.modelMatrixColor();
       
       if(mode==true)
       {
           glut.glutSolidTorus(0.5,0.9,10,10);
       }else
       {
           glut.glutWireTorus(0.5,0.9,10,10);
       }
       
       
        /*
innerRadius
Inner radius of the torus.
outerRadius
Outer radius of the torus.
nsides
Number of sides for each radial section.
rings
Number of radial divisions for the torus.
        
        */
        
        
        gl.glPopMatrix();
        
    } 
    
    
}
