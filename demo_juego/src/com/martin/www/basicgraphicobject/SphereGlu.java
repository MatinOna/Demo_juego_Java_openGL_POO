/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.basicgraphicobject;

import com.martin.www.interfaz.Colisionable;
import com.martin.www.interfaz.Displayable;
import com.martin.www.pojos.StateDefaultFigure;
import com.sun.opengl.util.texture.Texture;
import javax.media.opengl.GL;
import javax.media.opengl.glu.GLU;
import javax.media.opengl.glu.GLUquadric;

/**
 *
 * @author Martin
 */
public class SphereGlu extends StateDefaultFigure implements Displayable,Colisionable{

    GLU glu = new GLU();
    public Texture textura;
    
    public SphereGlu(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl, float r, float g, float b, boolean mode,Texture textura) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl, r, g, b, mode);
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
       
        GLUquadric q=glu.gluNewQuadric();
        glu.gluQuadricDrawStyle(q, GLU.GLU_FILL);
        glu.gluQuadricTexture(q, true);
       glu.gluQuadricNormals(q, GLU.GLU_SMOOTH);
       glu.gluSphere(q, 1, 20, 20);
       
       
        
        
         if(this.textura!=null)
         {
              this.textura.disable();
            
         }
        gl.glPopMatrix();
        
    }
    
}
