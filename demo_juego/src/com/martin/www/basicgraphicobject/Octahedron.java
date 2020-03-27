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
public class Octahedron extends StateDefaultFigure implements Displayable,Colisionable{
    
    GLUT glut = new GLUT();
    GLU glu = new GLU();

    public Octahedron(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl, float r, float g, float b, boolean mode) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl, r, g, b, mode);
    }

    public void display() {
        
       gl.glPushMatrix();
       
       super.modelMatrixColor();
       
       if(mode==true)
       { 
           this.roty++;
           glut.glutSolidOctahedron();
       }else
       { 
           glut.glutWireOctahedron();
       }
       
       
       
       
        /*
glutSolidOctahedron and glutWireOctahedron render a solid or wireframe octahedron respectively centered at the modeling coordinates origin with a radius of 1.0.
        
        */
        
        
        gl.glPopMatrix();
        
    } 
    
}
