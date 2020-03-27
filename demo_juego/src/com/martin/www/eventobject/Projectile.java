/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.eventobject;

import com.martin.www.basicgraphicobject.SphereGlu;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.interfaz.Displayable;
import com.martin.www.library.Library;
import com.martin.www.main.Ona_Jativa_Proyecto;
import com.martin.www.scene.Scene;
import javax.media.opengl.GL;

/**
 *
 * @author Martin
 */
public class Projectile implements Displayable,Colisionable {
    
    public float x,y,z,vel,angley,alcance,r,width,depth;
    public SphereGlu cuerpo;
    public GL gl;

    public Projectile(float x, float y, float z, float vel, float angley, float alcance, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.vel = vel;
        this.angley = angley;
        this.alcance = alcance;
        this.gl = gl;
        this.cuerpo=new SphereGlu(0,0,0,0.3f,0.3f,0.3f,90,0,0,gl,1,1,1,true,  Ona_Jativa_Proyecto.texturas.get("tnt_side"));
        this.width=cuerpo.width;
        this.depth=cuerpo.depth;
        
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
    
   
    public void display()
    {
        gl.glPushMatrix();
         
            gl.glTranslatef(x, y, z);
            
                
                this.cuerpo.display();
                actuar();
        
        gl.glPopMatrix();
    }
    
    public void actuar()
    {
        this.z+=Math.cos(this.angley-(Math.PI/2))*this.vel;
        this.x-=Math.sin(this.angley-(Math.PI/2))*this.vel;
        this.alcance--;
        if(this.alcance<0)
        {
            Scene.proyectilborrar.add(this);
        }
    }

     public boolean Colision(Colisionable ob)
    {
        return  Library.distanciEuclideana(this, ob)< (this.getR()/2+ob.getR());
       
    }
    
   
    
    
}
