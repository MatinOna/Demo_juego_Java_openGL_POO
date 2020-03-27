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
 * @author fing.labcom
 */
public class House extends Object implements Displayable,Colisionable{
    
    
    public Cube bloque,ventana1,ventana2,puerta;

    public House(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        bloque=new Cube(0,0,0,1,2,1,0,0,0,gl,1,1,1,  Ona_Jativa_Proyecto.texturas.get("stone_diorite_smooth"));
        puerta=new Cube(0,-0.9f,0.6f,0.5f,1f,0.5f,0,0,0,gl,0,0,0, null);
        ventana1= new Cube(-0.5f,1,0.6f,0.4f,0.4f,0.5f,0,0,0,gl,0.60f,0.40f,0.12f, Ona_Jativa_Proyecto.texturas.get("glass_magenta"));
        ventana2= new Cube(0.5f,1,0.6f,0.4f,0.4f,0.5f,0,0,0,gl,0.60f,0.40f,0.12f, Ona_Jativa_Proyecto.texturas.get("glass_magenta"));
    }
    
    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
       Ona_Jativa_Proyecto.materiales.get("whitehouse").activar();
       bloque.display();
//       
       Ona_Jativa_Proyecto.materiales.get("whitehouse").activar(); 
       ventana1.display();
       ventana2.display();
       Ona_Jativa_Proyecto.materiales.get("blackrubber").activar();
       puerta.display();
       
    gl.glPopMatrix();
    
    }
    
}
