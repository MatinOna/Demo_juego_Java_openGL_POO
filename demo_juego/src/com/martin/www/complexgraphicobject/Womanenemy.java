/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.complexgraphicobject;

import com.martin.www.basicgraphicobject.Cone;
import com.martin.www.basicgraphicobject.Tetrahedron;
import com.martin.www.basicgraphicobject.Icosahedron;
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
public class Womanenemy extends Object implements Displayable,Colisionable{
    
    
    public Cube bloque,bloque3,bloque4;
    public Tetrahedron piramide,piramide1,piramide2,piramide3;
    public Icosahedron icosahedron;
    public Cone prismatruncado;
    
    public Womanenemy(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
        bloque=new Cube(0,0,0  ,1,1,0.5f  ,0,0,0,gl,     0.243f , 0.054f , 0.250f, Ona_Jativa_Proyecto.texturas.get("mala"));
        piramide=new Tetrahedron(1.5f,-0.5f,0f,   1.5f,0.5f,0.5f,   0,0,-60,gl,    0.898f,0.729f,0.627f,true);
        piramide1=new Tetrahedron(-1.5f,-0.5f,0f,   1.5f,0.5f,0.5f,   0,0,60,gl,    0.898f,0.729f,0.627f,true);
        icosahedron=new Icosahedron(0.0f,1.9f,0f,   1f,1f,1f,   0,0,0,gl,    0.898f,0.729f,0.627f,true);
        prismatruncado=new Cone(0.0f,-2.0f,0f,   1f,1f,1f,   -90,0,0,gl,       0.749f , 0.423f , 0.458f,true);
        piramide2=new Tetrahedron(0.4f,-2.9f,0f,   0.5f,1.5f,0.5f,   0,0,0,gl,    0.898f,0.729f,0.627f,true);
        piramide3=new Tetrahedron(-0.4f,-2.9f,0f,   0.5f,1.5f,0.5f,   0,0,0,gl,    0.898f,0.729f,0.627f,true);
        bloque3=new Cube(-0.5f,-3.8f,0  ,0.3f,0.1f,0.3f  ,0,0,0,gl,    0f , 0f , 0f, null);
        bloque4=new Cube(0.5f,-3.8f,0  ,0.3f,0.1f,0.3f  ,0,0,0,gl,    0f , 0f , 0f, null);
    }
    
    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
       
       Ona_Jativa_Proyecto.materiales.get("whitehouse").activar();
       bloque.display();
       Ona_Jativa_Proyecto.materiales.get("blackcar").activar();
       prismatruncado.display();
       Ona_Jativa_Proyecto.materiales.get("faceman").activar();
       icosahedron.display();
       piramide1.display();
       piramide.display();
       piramide2.display();
       piramide3.display();
       Ona_Jativa_Proyecto.materiales.get("blackcar").activar();
       bloque3.display();
       bloque4.display();
       
    gl.glPopMatrix();
    
    }  
    
}
