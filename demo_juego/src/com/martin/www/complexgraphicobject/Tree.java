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
public class Tree extends Object implements Displayable,Colisionable{
    
    public Cube bloque,bloque1,bloque2,bloque3,bloque4;

    public Tree(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        bloque=new Cube(0,0,0,1,1,1,0,0,0,gl,  0.250f , 0.058f ,  0.0f, Ona_Jativa_Proyecto.texturas.get("farmland_dry"));
        bloque1=new Cube(0,1.5f,0,2,0.5f,1,0,0,0,gl,  0.490f , 0.749f , 0.172f, Ona_Jativa_Proyecto.texturas.get("arbol"));
        bloque2=new Cube(0,3.0f,0,3,1f,1,0,0,0,gl,   0.211f , 0.498f , 0.117f, Ona_Jativa_Proyecto.texturas.get("arbol"));
        bloque3=new Cube(0,4.5f,0,2,0.5f,1,0,0,0,gl,  0.490f , 0.749f , 0.172f, Ona_Jativa_Proyecto.texturas.get("arbol"));
        bloque4=new Cube(0,5.5f,0,1,0.5f,1,0,0,0,gl,  0.211f , 0.498f , 0.117f, Ona_Jativa_Proyecto.texturas.get("arbol"));
        
    }

  
    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
      Ona_Jativa_Proyecto.materiales.get("bronwtree").activar(); 
      bloque.display();
      Ona_Jativa_Proyecto.materiales.get("greentree").activar();
      bloque4.display();
      bloque2.display();
      Ona_Jativa_Proyecto.materiales.get("whitehouse").activar();
      bloque1.display();
      bloque2.display();
      bloque3.display();
        
       
       
    gl.glPopMatrix();
    
    }
    
}
