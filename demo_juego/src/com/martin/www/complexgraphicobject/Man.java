/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.complexgraphicobject;

import com.martin.www.basicgraphicobject.Tetrahedron;
import com.martin.www.basicgraphicobject.Dodecahedron;
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
public class Man extends Object implements Displayable,Colisionable{
    
    
    public Cube bloque,bloque1,bloque2,bloque3,bloque4;
    public Tetrahedron piramide,piramide1,piramide2,piramide3;
    public Dodecahedron dodecahedron;
    
    
    
    public Man(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
        bloque=new Cube(0,0,0  ,1,1,0.5f  ,0,0,0,gl,   1f , 1f , 1f     ,Ona_Jativa_Proyecto.texturas.get("wool_colored_red"));
        piramide=new Tetrahedron(1.3f,-0.5f,0f,   1.5f,0.5f,0.5f,   0,0,-85,gl,    0.8f , 0.603f , 0.415f,true);
        piramide1=new Tetrahedron(-1.3f,-0.5f,0f,   1.5f,0.5f,0.5f,   0,0,85,gl,    0.8f , 0.603f , 0.415f,true);
        dodecahedron=new Dodecahedron(0.0f,1.8f,0f,   0.5f,0.5f,0.5f,   0,0,0,gl,     0.8f , 0.603f , 0.415f,true);
        bloque1=new Cube(0.5f,-2.0f,0  ,0.4f,1,0.5f  ,0,0,0,gl,    0.090f , 0.141f , 0.8f, Ona_Jativa_Proyecto.texturas.get("wool_colored_blue"));
        bloque2=new Cube(-0.5f,-2.0f,0  ,0.4f,1,0.5f  ,0,0,0,gl,    0.090f , 0.141f , 0.8f, Ona_Jativa_Proyecto.texturas.get("wool_colored_blue"));
        bloque3=new Cube(-0.5f,-3.0f,0  ,0.3f,0.3f,0.3f  ,0,0,0,gl,    0f , 0f , 0f, null);
        bloque4=new Cube(0.5f,-3.0f,0  ,0.3f,0.3f,0.3f  ,0,0,0,gl,    0f , 0f , 0f, null);
        
        
    }
    
    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
       
       
       Ona_Jativa_Proyecto.materiales.get("tman").activar();
       bloque.display();
       Ona_Jativa_Proyecto.materiales.get("jeanman").activar();
       bloque1.display();
       bloque2.display();
       Ona_Jativa_Proyecto.materiales.get("blackcar").activar();
       bloque4.display();
       bloque3.display();
       Ona_Jativa_Proyecto.materiales.get("faceman").activar();
       dodecahedron.display();
       piramide1.display();
       piramide.display();
       
    gl.glPopMatrix();
    
    }  
    
}
