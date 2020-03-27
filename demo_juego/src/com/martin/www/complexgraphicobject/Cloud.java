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
public class Cloud extends Object implements Displayable,Colisionable{
    
    public Cube bloque,bloque1,bloque2,bloque3,bloque4;

    public Cloud(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
        bloque=new Cube(0,1f,0   ,2,0.5f,1,0,0,0,gl,  0.219f , 0.364f , 0.8f,  Ona_Jativa_Proyecto.texturas.get("lapis_block"));
        bloque1=new Cube(0,2f,0    ,3,0.5f,1,0,0,0,gl,  0.137f , 0.227f , 0.498f,   Ona_Jativa_Proyecto.texturas.get("lapis_block"));
        bloque2=new Cube(0,3.0f,0    ,4,0.5f,1,0,0,0,gl,   0.066f , 0.113f , 0.250f,  Ona_Jativa_Proyecto.texturas.get("lapis_block"));
        bloque3=new Cube(0,4f,0   ,3,0.5f,1,0,0,0,gl,  0.137f , 0.227f , 0.498f,  Ona_Jativa_Proyecto.texturas.get("lapis_block"));
        bloque4=new Cube(0,5f,0   ,2,0.5f,1,0,0,0,gl,  0.219f , 0.364f , 0.8f,  Ona_Jativa_Proyecto.texturas.get("lapis_block"));
        
    }

    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
        Ona_Jativa_Proyecto.materiales.get("blueclound1").activar(); 
        bloque.display();
        bloque4.display();
        Ona_Jativa_Proyecto.materiales.get("whitehouse").activar(); 
        bloque1.display();
        bloque3.display();
        Ona_Jativa_Proyecto.materiales.get("blueclound").activar(); 
        bloque2.display();
       
       
//       
    gl.glPopMatrix();
    
    }
    
}
