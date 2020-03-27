/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.eventobject;

import com.martin.www.complexgraphicobject.Man;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.interfaz.Displayable;
import com.martin.www.library.Library;
import javax.media.opengl.GL;

/**
 *
 * @author Martin
 */
public class Player implements Displayable   {
    
    public float x,y,z,vel,anglex, angley,r,width,depth;
    public Man hombre;
    public boolean camera1,camera2,camera3,linterna4,linterna5;
    public GL gl;
    public float life=100;

     public Player(float x, float y, float z, float vel, float anglex, float angley, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.vel = vel;
        this.anglex = anglex;
        this.angley = angley;
        this.gl = gl;
       hombre =new Man(0,0.0f,0,   0.4f,0.4f,0.4f,   0,0,0,gl);
       this.width=hombre.width;
       this.depth=hombre.depth;
    }
     
    public void display()
    {
        gl.glPushMatrix();
        
        
        gl.glTranslatef(x, y, z);
        
//        gl.glRotatef((float) Math.toDegrees(anglex),1,0,0);
        gl.glRotatef((float) Math.toDegrees(angley),0,1,0);
        
//        hombre.dodecahedron.rotx=anglex;
//        hombre.dodecahedron.roty=angley;
        
        hombre.display();
        
        gl.glPopMatrix();
    }
    
    
    

    public float getX() {
        return x;
    }

   

    public float getZ() {
        return z;
    }



 
    
     public float getR() {
        
        if(this.width>this.depth)
        {
             this.r=(this.width/2);
        }else
        {
            this.r=(this.depth/2);
        }
        
        return this.r;
    }
    
    public boolean Colision(Colisionable ob)
    {
        return  Library.distanciEuclideana(this, ob)< (this.getR()/2+ob.getR());
       
    }

  

    

    
}
