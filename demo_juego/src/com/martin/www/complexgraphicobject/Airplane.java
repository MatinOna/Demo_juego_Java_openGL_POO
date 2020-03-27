/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.complexgraphicobject;

import com.martin.www.basicgraphicobject.Cube;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.pojos.Object;
import javax.media.opengl.GL;
import com.martin.www.interfaz.Displayable;
import com.martin.www.main.Ona_Jativa_Proyecto;

/**
 *
 * @author Martin
 */
public class Airplane extends Object implements Displayable,Colisionable{
    
    
    public Cube bloque,bloque1,bloque2,bloque3,bloque4,bloque5;

    public Airplane(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
        bloque=new Cube(0,0,0,1,0.5f,3,0,0,0,gl,0.898f , 0.411f , 0.098f,   null);
        bloque1=new Cube(0,1.0f,1,0.5f,0.5f,3,0,90,0,gl,0.898f , 0.862f , 0.062f, null);
        bloque2=new Cube(0,1.0f,-2.0f,2.0f,0.5f,1,0,0,0,gl, 0.898f , 0.862f , 0.062f,  null);
        bloque4=new Cube(0,2.0f,-2.0f,1,0.5f,1,0,0,0,gl,0.898f , 0.411f , 0.098f, null);
       
        
    }
    
    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
        
       Ona_Jativa_Proyecto.materiales.get("orangleairplane").activar(); 
       bloque2.display();
       bloque1.display();
       bloque.display();
       bloque4.display();
       
       
    gl.glPopMatrix();
    
    } 
    
}
