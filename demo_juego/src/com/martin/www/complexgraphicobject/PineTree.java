/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.complexgraphicobject;

import com.martin.www.basicgraphicobject.Octahedron;
import com.martin.www.basicgraphicobject.Cube;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.pojos.Object;
import java.util.Random;
import javax.media.opengl.GL;
import com.martin.www.interfaz.Displayable;
import com.martin.www.main.Ona_Jativa_Proyecto;

/**
 *
 * @author Martin
 */
public class PineTree extends Object implements Displayable,Colisionable{
    
    Random rnd=new Random();
    public Cube bloque,bloque1,bloque2,bloque3,bloque4,bloque5;
    public Octahedron octahedron;

    public PineTree(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
        bloque=new Cube(0,0,0,1,1,1,0,0,0,gl,  0.250f , 0.141f , 0.054f, Ona_Jativa_Proyecto.texturas.get("farmland_dry"));
       
        bloque1=new Cube(0,1.5f,0,4,0.5f,1,0,0,0,gl,  0.054f , 0.250f , 0.141f, Ona_Jativa_Proyecto.texturas.get("cactus_top"));
        bloque2=new Cube(0,3.5f,0,3,0.5f,1,0,0,0,gl,  0.054f , 0.250f , 0.141f, Ona_Jativa_Proyecto.texturas.get("cactus_top"));
        bloque3=new Cube(0,5.5f,0,1,0.5f,1,0,0,0,gl,  0.054f , 0.250f , 0.141f, Ona_Jativa_Proyecto.texturas.get("cactus_top"));
        
        bloque4=new Cube(0,2.5f,0,4,0.5f,1,0,90,0,gl,   0.109f , 0.498f , 0.282f, Ona_Jativa_Proyecto.texturas.get("cactus_top"));
        bloque5=new Cube(0,4.5f,0,3,0.5f,1,0,90,0,gl,  0.109f , 0.498f , 0.282f, Ona_Jativa_Proyecto.texturas.get("cactus_top"));
          
        octahedron=new Octahedron(0,6.7f,0,   0.6f,0.6f,0.6f,    0,0,0,gl,rnd.nextFloat() , rnd.nextFloat() ,rnd.nextFloat(),true);
        
        
    }

    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
       Ona_Jativa_Proyecto.materiales.get("bronwpinetree").activar(); 
       bloque.display();
       Ona_Jativa_Proyecto.materiales.get("whitehouse").activar(); 
       bloque1.display();
       bloque2.display();
       bloque3.display();
       Ona_Jativa_Proyecto.materiales.get("greenpinetree1").activar(); 
       bloque4.display();
       bloque5.display();
        Ona_Jativa_Proyecto.materiales.get("greenpinerubby").activar(); 
       octahedron.display();
       octahedron.roty++;
      
       
       
    gl.glPopMatrix();
    
    }
    
}
