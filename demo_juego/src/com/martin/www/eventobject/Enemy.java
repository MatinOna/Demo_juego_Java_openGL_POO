/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.eventobject;

import com.martin.www.complexgraphicobject.Womanenemy;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.interfaz.Displayable;
import com.martin.www.library.Library;
import javax.media.opengl.GL;


/**
 *
 * @author fing.labcom
 */
public class Enemy implements Displayable,Colisionable{
    
    public float velocidad,width,depth,r;
    public float x,y,z;
    public float rx,ry,rz;
    public Player persigueamartin;
    public GL gl;
    public Womanenemy hombremalo;
    
    

    public Enemy(float velocidad, float x, float y, float z, float rx, float ry, float rz, Player persigueamartin, GL gl) {
        this.velocidad = velocidad;
        this.x = x;
        this.y = y;
        this.z = z;
        this.rx = rx;
        this.ry = ry;
        this.rz = rz;
        this.persigueamartin = persigueamartin;
        this.gl = gl;
        hombremalo=new Womanenemy(0,0.0f,0,   0.4f,0.4f,0.4f,   0,0,0,gl);
        this.width=hombremalo.width;
        this.depth=hombremalo.depth;
        
    }
    
    public void display()
    {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
        gl.glRotatef(rx,1,0,0);
        gl.glRotatef(90+(float) Math.toDegrees(hombremalo.roty),0,1,0);
        gl.glRotatef(rz,0,0,1);
        
            hombremalo.display();
            hombremalo.roty=persigueamartin.angley;
            
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
    public void actuar()
    {
        if( Library.distanciEuclideana(this, persigueamartin)<3)
        {
           persigueamartin.life-=0.5f;

        }
        if( Library.distanciEuclideana(this, persigueamartin)>2)
        {
            
            if(persigueamartin.x<this.x)
        {
            this.x-=velocidad;
        }else
        {
            this.x+=velocidad;
        }
        if(persigueamartin.z<this.z)
        {
            this.z-=velocidad;
        }else
        {
            this.z+=velocidad;
        }
        }
        
    }
    
    public void morir()
    {
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z);
       
       hombremalo.display();
          this.x=35;
           this.z=-70;
            
        gl.glPopMatrix();
    }

   
    
}
