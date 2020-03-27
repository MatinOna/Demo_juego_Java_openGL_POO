/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.lightandmaterial;

import com.martin.www.basicgraphicobject.Cube;
import com.martin.www.main.Ona_Jativa_Proyecto;
import javax.media.opengl.GL;

/**
 *
 * @author fing.labcom
 */
public class Light {
    
    public float px,py,pz;
    public float[] position,ambient,diffuse,specular;
    public boolean puntual,bombillavisible,encendida;
    public int id;
    public Cube foco;
    public GL gl;
  
    
    public Light(float px, float py, float pz, float[] ambient, float[] diffuse, float[] specular, boolean puntual, boolean bombillavisible, boolean encendida, int id, GL gl) {
        this.px = px;
        this.py = py;
        this.pz = pz;
        this.ambient = ambient;
        this.diffuse = diffuse;
        this.specular = specular;
        this.puntual = puntual;
        this.bombillavisible = bombillavisible;
        this.encendida = encendida;
        this.id = id;
        this.gl = gl;
        foco=new Cube(this.px,this.py,this.pz,       0.5f,0.5f,0.5f,               0,0,0,gl,            0f , 0f , 0f, null);
        

    }

    
    public void display()
    {
         
        
        if(this.puntual==true)
        {
           position =new float []{this.px,this.py,this.pz,1.0f};
         
        }
        else
        {
            position =new float []{this.px,this.py,this.pz,0.0f};
            
        }
        gl.glLightfv(this.id,GL.GL_POSITION,position,0);
        gl.glLightfv(this.id,GL.GL_AMBIENT,ambient,0);
        gl.glLightfv(this.id,GL.GL_DIFFUSE,diffuse,0);
        gl.glLightfv(this.id,GL.GL_SPECULAR,specular,0);
        
        if(this.bombillavisible==true && this.puntual==true)
        {
            
            Ona_Jativa_Proyecto.materiales.get("yellowsun").activar(); 
            foco.display();
        }
        
        if(this.encendida==true)
        {
           gl.glEnable(this.id);

        }
        else
        {
           gl.glDisable(this.id);
        }
       
    }
    
    
    
    
}
