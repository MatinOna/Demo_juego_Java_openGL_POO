/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.pojos;

import javax.media.opengl.GL;

/**
 *
 * @author Martin
 */
public class Object {
    
    public float x,y,z,width,height,depth,rotx,roty,rotz,r;
    public GL gl;

    public Object(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        this.x = x;
        this.y = y;
        this.z = z;
        
        this.width = width;
        this.height = height;
        this.depth = depth;
        
        this.rotx = rotx;
        this.roty = roty;
        this.rotz = rotz;
        
        this.gl = gl;
        
//        this.radio=radio;
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
             this.r=(this.width/2)+1f;
        }else
        {
            this.r=(this.depth/2)+1f;
        }
        
        return this.r;
    }
    
    
    
    
    
    
    public void  modelMatrix()
    {
       gl.glTranslatef(x, y, z);
       
       gl.glRotatef(rotx, 1, 0, 0);
       gl.glRotatef(roty, 0, 1, 0);
       gl.glRotatef(rotz, 0, 0, 1);
       
       gl.glScalef(width, height, depth);
       
       
    }
    
    
    
    
}
