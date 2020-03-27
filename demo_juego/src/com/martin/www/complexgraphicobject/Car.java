/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.complexgraphicobject;

import com.martin.www.basicgraphicobject.Sphere;
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
public class Car extends Object implements Displayable,Colisionable{
    public Cube bloque,bloque1,bloque2,bloque3;
    public Sphere rueda1,rueda2,rueda3,rueda4;
  
    
    public Car(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
        bloque=new Cube(0,0,0,1,0.5f,2,0,0,0,gl,1,0,0,      Ona_Jativa_Proyecto.texturas.get("bed_feet_top"));
        bloque1=new Cube(0,1.0f,-1,1,0.5f,1,0,0,0,gl,0,0,1,  null);
        bloque2=new Cube(-0.5f,0.0f,2,0.3f,0.3f,0.2f,0,0,0,gl,1.0f  , 0.972f , 0.509f,  Ona_Jativa_Proyecto.texturas.get("gold_block"));
        bloque3=new Cube(0.5f,0.0f,2,0.3f,0.3f,0.2f,0,0,0,gl,1.0f  , 0.972f , 0.509f,  Ona_Jativa_Proyecto.texturas.get("gold_block"));
        rueda1=new Sphere(1.5f,-0.5f ,2f,0.5f,0.5f,0.5f,0.0f, 0.0f, 0.0f, gl, 0.8f , 0.752f , 0.603f,true);
        rueda2=new Sphere(-1.5f,-0.5f ,2f,0.5f,0.5f,0.5f,0.0f, 0.0f, 0.0f, gl, 0.8f , 0.752f , 0.603f,true);
        rueda3=new Sphere(1.5f,-0.5f ,-2f,0.5f,0.5f,0.5f,0.0f, 0.0f, 0.0f, gl, 0.8f , 0.752f , 0.603f,true);
        rueda4=new Sphere(-1.5f,-0.5f ,-2f,0.5f,0.5f,0.5f,0.0f, 0.0f, 0.0f, gl,  0.8f , 0.752f , 0.603f,true);
        
       
    }
    
    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
       Ona_Jativa_Proyecto.materiales.get("whitehouse").activar();
       bloque.display();
       Ona_Jativa_Proyecto.materiales.get("bluecar").activar();
       bloque1.display();
       Ona_Jativa_Proyecto.materiales.get("whitehouse").activar();
       bloque2.display();
       bloque3.display();
       Ona_Jativa_Proyecto.materiales.get("blackcar").activar();
       rueda1.display();
       rueda2.display();
       rueda3.display();
       rueda4.display();
       
    gl.glPopMatrix();
    
    }
    
    
    
}
