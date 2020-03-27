/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.basicgraphicobject;

import com.martin.www.interfaz.Displayable;
import com.martin.www.pojos.ColorObject;
import javax.media.opengl.GL;

/**
 *
 * @author Martin
 */
public class TruncatedPrism extends ColorObject implements Displayable{

    public int trunca,resto,caso,lados;

    public TruncatedPrism(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl, float r, float g, float b,int lados,int trunca, int resto,int caso) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl, r, g, b);
        this.trunca=trunca;
        this.resto=resto;
        this.caso=caso;
        this.lados = lados;
    }

    public void display() {
        
       gl.glPushMatrix();
       
       super.modelMatrixColor();
       
       
       //altura h1 truncamiento, h2 . NOTA: LA ALTURA TOTAL DEL PRISMA ES DE H1+H2
       poligono(0f,0f,0f,1f,this.lados, this.trunca, this.resto,this.caso);
        
        
        gl.glPopMatrix();
        
    } 
    
    public void poligono(float xv,float yv,float x0,float y0,float n, float altura,float altura1, int caso){
    
     float x,y,yn,xn,x3;
     float an=360/n;
    float r1 = (float) ((altura1/(altura+altura1))*Math.sqrt(Math.pow(x0-xv, 2)+Math.pow(y0-yv, 2)));
    x3=x0;      
    
    // DIBUJA LA BASE INFERIOR
    gl.glBegin(GL.GL_POLYGON);
        
            gl.glVertex2d (x0, y0);
                for(int i=0;i<n;i++){
                    x=x0;
                    y=y0;
                    x0= (float) (xv+(x-xv)*Math.cos(Math.toRadians(an))-(y-yv)*Math.sin(Math.toRadians(an)));
                    y0= (float) (yv+(x-xv)*Math.sin(Math.toRadians(an))+(y-yv)*Math.cos(Math.toRadians(an)));
                        gl.glVertex2d (x0,y0);
                }
    gl.glEnd();
     
    
    if(caso==1){
        
        // DIBUJA EL PRISMA 
        for(int i=0;i<n;i++){
            gl.glBegin(GL.GL_POLYGON);
                
                    gl.glVertex2d (x0, y0);
                x=x0;
                y=y0;
                x0= (float) (xv+(x-xv)*Math.cos(Math.toRadians(an))-(y-yv)*Math.sin(Math.toRadians(an)));
                y0= (float) (yv+(x-xv)*Math.sin(Math.toRadians(an))+(y-yv)*Math.cos(Math.toRadians(an)));
                    gl.glVertex2d (x0,y0);
                    gl.glVertex3d (xv, yv,altura+altura1);
            gl.glEnd();
        } 
    }if(caso==2){
        
        // DIBUJA LA BASE SUPERIOR
        gl.glBegin(GL.GL_POLYGON);
            
                            gl.glVertex3d (x0, r1,altura);
                    for(int i=0;i<n;i++){
                        x=x0;
                        y=r1;
                        x0= (float) (xv+(x-xv)*Math.cos(Math.toRadians(an))-(y-yv)*Math.sin(Math.toRadians(an)));
                        r1= (float) (yv+(x-xv)*Math.sin(Math.toRadians(an))+(y-yv)*Math.cos(Math.toRadians(an)));
                            gl.glVertex3d (x0,r1,altura);
                    }
        gl.glEnd();
        
        
        //DIBUJA PRISMA TRUNCADO
        
           
    for(int i=0;i<n;i++){
       
        gl.glBegin(GL.GL_POLYGON);
            
                gl.glVertex3d (x3,r1,altura);   
                gl.glVertex2d (x0, y0);    
                
                    x=x0;
                    y=y0;
                    x0= (float) (xv+(x-xv)*Math.cos(Math.toRadians(an))-(y-yv)*Math.sin(Math.toRadians(an)));
                    y0= (float) (yv+(x-xv)*Math.sin(Math.toRadians(an))+(y-yv)*Math.cos(Math.toRadians(an)));
                    xn=x3;
                    yn=r1;
                     x3= (float) (xv+(xn-xv)*Math.cos(Math.toRadians(an))-(yn-yv)*Math.sin(Math.toRadians(an)));
                    r1= (float) (yv+(xn-xv)*Math.sin(Math.toRadians(an))+(yn-yv)*Math.cos(Math.toRadians(an)));
                    
                gl.glVertex2d (x0, y0);    
                gl.glVertex3d (x3,r1,altura);    
        gl.glEnd();
        

    }

        // DIBUJA EL PRISMA CON LINEAS
        for(int i=0;i<n;i++){
            gl.glLineWidth(1);
            gl.glBegin(GL.GL_LINES);
                gl.glColor3f(0.0f, 0.0f, 0.0f);  
                    gl.glVertex2d (x0, y0);
                    gl.glVertex3d (xv, yv,altura+altura1);
                x=x0;
                y=y0;
                x0= (float) (xv+(x-xv)*Math.cos(Math.toRadians(an))-(y-yv)*Math.sin(Math.toRadians(an)));
                y0= (float) (yv+(x-xv)*Math.sin(Math.toRadians(an))+(y-yv)*Math.cos(Math.toRadians(an)));
                    
                    
            gl.glEnd();
        } 
    }if(caso==3){
        
         // DIBUJA LA BASE SUPERIOR
        gl.glBegin(GL.GL_POLYGON);
            
                            gl.glVertex3d (x0, r1,altura);
                    for(int i=0;i<n;i++){
                        x=x0;
                        y=r1;
                        x0= (float) (xv+(x-xv)*Math.cos(Math.toRadians(an))-(y-yv)*Math.sin(Math.toRadians(an)));
                        r1= (float) (yv+(x-xv)*Math.sin(Math.toRadians(an))+(y-yv)*Math.cos(Math.toRadians(an)));
                            gl.glVertex3d (x0,r1,altura);
                    }
        gl.glEnd();
        
        
        //DIBUJA PRISMA TRUNCADO
        
           
    for(int i=0;i<n;i++){
       
        gl.glBegin(GL.GL_POLYGON);
            
                gl.glVertex3d (x3,r1,altura);   
                gl.glVertex2d (x0, y0);    
                
                    x=x0;
                    y=y0;
                    x0= (float) (xv+(x-xv)*Math.cos(Math.toRadians(an))-(y-yv)*Math.sin(Math.toRadians(an)));
                    y0= (float) (yv+(x-xv)*Math.sin(Math.toRadians(an))+(y-yv)*Math.cos(Math.toRadians(an)));
                    xn=x3;
                    yn=r1;
                     x3= (float) (xv+(xn-xv)*Math.cos(Math.toRadians(an))-(yn-yv)*Math.sin(Math.toRadians(an)));
                    r1= (float) (yv+(xn-xv)*Math.sin(Math.toRadians(an))+(yn-yv)*Math.cos(Math.toRadians(an)));
                    
                gl.glVertex2d (x0, y0);    
                gl.glVertex3d (x3,r1,altura);    
        gl.glEnd();
        

    }
}
}

}