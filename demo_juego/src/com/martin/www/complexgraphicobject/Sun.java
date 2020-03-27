/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.complexgraphicobject;


import com.martin.www.basicgraphicobject.Icosahedron;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.interfaz.Displayable;
import com.martin.www.main.Ona_Jativa_Proyecto;
import com.martin.www.pojos.Object;
import javax.media.opengl.GL;

/**
 *
 * @author Martin
 */
public class Sun extends Object implements Displayable,Colisionable{
    
    public Icosahedron soll;
    
    public Sun(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
        soll=new Icosahedron(0.0f,0f,0f,   1.5f,1.5f,1.5f,   0,0,0,gl,      1f , 1f , 0.1f,true);
        
    }
    
    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
       Ona_Jativa_Proyecto.materiales.get("yellowsun").activar(); 
       
       soll.rotz++;
       soll.roty++;
       soll.rotx++;
       soll.display();
        
        
    gl.glPopMatrix();
    
    }
    
}
