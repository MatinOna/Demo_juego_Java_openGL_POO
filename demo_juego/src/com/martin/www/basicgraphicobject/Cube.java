/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.basicgraphicobject;

import com.martin.www.interfaz.Colisionable;
import javax.media.opengl.GL;
import com.martin.www.interfaz.Displayable;
import com.martin.www.pojos.ColorObject;
import com.sun.opengl.util.texture.Texture;

/**
 *
 * @author Martin
 */
public class Cube extends ColorObject implements Displayable,Colisionable  {
    
    public Texture textura;

    public Cube(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl, float r, float g, float b,Texture textura) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl, r, g, b);
        this.textura=textura;
    }

    public void display() {
        
       gl.glPushMatrix();
       
       super.modelMatrixColor();
       
       
       if(this.textura!=null)
         {
            this.textura.enable();
            this.textura.bind();
            
         }
       
           //lado A horario
       gl.glBegin(GL.GL_QUADS);
           gl.glNormal3f(0, 0, -1);
            
            gl.glTexCoord2f(0,1);
            gl.glVertex3f(-1.0f, -1.0f, -1.0f); 
            gl.glTexCoord2f(1,1);
            gl.glVertex3f(-1.0f, 1.0f, -1.0f); 
             gl.glTexCoord2f(1,0);
            gl.glVertex3f(1.0f, 1.0f, -1.0f);  
            gl.glTexCoord2f(0,0);
            gl.glVertex3f(1.0f, -1.0f, -1.0f); 
            
        gl.glEnd();
        
        // lado B horario
        
        gl.glBegin(GL.GL_QUADS);
            //gl.glColor3f(1.0f, 1.0f, 0.0f);   
            
            gl.glNormal3f(-1, 0, 0);
            gl.glTexCoord2f(0,0);
            gl.glVertex3f(-1.0f, -1.0f, -1.0f); 
            gl.glTexCoord2f(0,1);
            gl.glVertex3f(-1.0f, -1.0f, 1.0f);   
            gl.glTexCoord2f(1,1);
            gl.glVertex3f(-1.0f, 1.0f, 1.0f);  
            gl.glTexCoord2f(1,0);
            gl.glVertex3f(-1.0f, 1.0f, -1.0f); 
        gl.glEnd();
        
//        // lado C horario
        
        gl.glBegin(GL.GL_QUADS);
//            gl.glColor3f(0.0f, 1.0f, 1.0f);  
            gl.glNormal3f(0, -1, 0);
             gl.glTexCoord2f(1,0);
            gl.glVertex3f(-1.0f, -1.0f, -1.0f); 
             gl.glTexCoord2f(0,0);
            gl.glVertex3f(1.0f, -1.0f, -1.0f);
             gl.glTexCoord2f(0,1);
            gl.glVertex3f(1.0f, -1.0f, 1.0f); 
             gl.glTexCoord2f(1,1);
            gl.glVertex3f(-1.0f, -1.0f, 1.0f); 
        gl.glEnd();
        
//        //lado A' antihorario
        
        gl.glBegin(GL.GL_QUADS);
//            gl.glColor3f(1.0f, 0.0f, 1.0f); 
            gl.glNormal3f(0, 0, 1);
            
            gl.glTexCoord2f(0,0);
            gl.glVertex3f(-1.0f, -1.0f, 1.0f); 
            
            gl.glTexCoord2f(0,1);
            gl.glVertex3f(1.0f, -1.0f, 1.0f);
            
            gl.glTexCoord2f(1,1);
            gl.glVertex3f(1.0f, 1.0f, 1.0f);
            
            gl.glTexCoord2f(1,0);
            gl.glVertex3f(-1.0f, 1.0f, 1.0f);
            
           
            
        gl.glEnd();
          
        //lado B' antihorario
        
        gl.glBegin(GL.GL_QUADS);
//            gl.glColor3f(0.0f, 1.0f, 0.0f); 
           gl.glNormal3f(1, 0, 0);
           gl.glTexCoord2f(0,1);
            gl.glVertex3f(1.0f, -1.0f, -1.0f); 
            gl.glTexCoord2f(1,1);
            gl.glVertex3f(1.0f, 1.0f, -1.0f);  
            gl.glTexCoord2f(1,0);
            gl.glVertex3f(1.0f, 1.0f, 1.0f);  
            gl.glTexCoord2f(0,0);
            gl.glVertex3f(1.0f, -1.0f, 1.0f); 
        gl.glEnd();
        
        //lado C' antihorario
        
        gl.glBegin(GL.GL_QUADS);
           // gl.glColor3f(1.0f, 1.0f, 1.0f); 
           gl.glNormal3f(0, 1, 0);
            gl.glTexCoord2f(1,1);
            gl.glVertex3f(-1.0f, 1.0f, -1.0f); 
            gl.glTexCoord2f(1,0);
            gl.glVertex3f(-1.0f, 1.0f, 1.0f);   
            gl.glTexCoord2f(0,0);
            gl.glVertex3f(1.0f, 1.0f, 1.0f);  
             gl.glTexCoord2f(0,1);
            gl.glVertex3f(1.0f, 1.0f, -1.0f); 
        gl.glEnd();
        
        
        
         if(this.textura!=null)
         {
              this.textura.disable();
            
         }
         
        gl.glPopMatrix();
        
    } 
    
}
