/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.complexgraphicobject;

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
public class Postcyan extends Object implements Displayable,Colisionable{
    
    
    public Cube cubo,cuerpo ;
    public Icosahedron foco;

    public Postcyan(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
        cubo =new Cube(0.0f,6.5f,3f,   1f,0.5f,2f,  0,0,0,gl,          0.901f , 0.956f ,  1.0f, Ona_Jativa_Proyecto.texturas.get("cobblestone"));
        foco=new Icosahedron(0.0f,5.2f,4f,  1.5f,1f,1.5f,  0,0,0,gl,          0.890f , 0.847f , 0.137f,true);
        cuerpo=new Cube(0.0f,0f,0f,   1f,7f,1f,  0,0,0,gl,          0.901f , 0.956f ,  1.0f, Ona_Jativa_Proyecto.texturas.get("cobblestone"));
        
    }

    public void display() {
    gl.glPushMatrix();
    
       super.modelMatrix();
       
       
       Ona_Jativa_Proyecto.materiales.get("piso2").activar();
       cubo.display();
       cuerpo.display();
       Ona_Jativa_Proyecto.materiales.get("fcyan").activar();
       foco.display();
       
       
    gl.glPopMatrix();
    
    }
    
    
}
