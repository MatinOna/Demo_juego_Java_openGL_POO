/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.world;

import com.martin.www.basicgraphicobject.Cube;
import com.martin.www.complexgraphicobject.Airplane;
import com.martin.www.complexgraphicobject.Car;
import com.martin.www.complexgraphicobject.Cloud;
import com.martin.www.complexgraphicobject.House;
import com.martin.www.complexgraphicobject.Man;
import com.martin.www.complexgraphicobject.PineTree;
import com.martin.www.complexgraphicobject.Tree;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.pojos.Object;
import java.util.ArrayList;
import javax.media.opengl.GL;
import com.martin.www.interfaz.Displayable;
import com.martin.www.main.Ona_Jativa_Proyecto;

/**
 *
 * @author Martin
 */
public class World3 extends Object implements Displayable{
    
    public Cube bloque,bloque1,bloque2,bloque3,bloque31,bloque4,calle,linea1,linea2,linea3;
    
    public Car coche; private float inccohe=0.25f; 
    Man hombre;  private float inchombre=0.05f;
    
    Cloud nube,nube1;
    private float incnube=0.05f; private float incnube1=0.05f;
    Airplane avion; private float inc=0.4f;
  
    public static ArrayList<Colisionable> graphic;
    
  
    

    public World3(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        
     
         
        bloque=new Cube(  0,0,0,       35,0.5f,35f,               0,0,0,gl,            0.474f , 0.482f , 0.549f, Ona_Jativa_Proyecto.texturas.get("cobblestone_mossy"));
        bloque1=new Cube(  -30,1,0,       5,0.5f,25f,               0,0,0,gl,           0.549f , 0.250f , 0.070f, Ona_Jativa_Proyecto.texturas.get("farmland_dry"));
        bloque2=new Cube(  30,1,0,       5,0.5f,25f,               0,0,0,gl,           0.549f , 0.250f , 0.070f, Ona_Jativa_Proyecto.texturas.get("farmland_dry"));
        bloque3=new Cube(  20,1,-30,       5,0.5f,15f,               0,90,0,gl,           0.549f , 0.250f , 0.070f,Ona_Jativa_Proyecto.texturas.get("farmland_dry"));
        bloque31=new Cube(  -20,1,-30,       5,0.5f,15f,               0,90,0,gl,           0.549f , 0.250f , 0.070f,Ona_Jativa_Proyecto.texturas.get("farmland_dry"));
        bloque4=new Cube(  0,1,30,       5,0.5f,35f,               0,90,0,gl,           0.549f , 0.250f , 0.070f,Ona_Jativa_Proyecto.texturas.get("farmland_dry"));
        calle=new Cube(  0,0.5f,-5,       5,0.5f,30f,               0,0,0,gl,             0f , 0f , 0f,Ona_Jativa_Proyecto.texturas.get("cobblestone"));
        linea1=new Cube(  0,1f,0,       0.2f,0.1f,5f,               0,0,0,gl,             1f , 1f , 1f,null);
        linea2=new Cube(  0,1f,20,       0.2f,0.1f,5f,               0,0,0,gl,             1f , 1f , 1f,null);
        linea3=new Cube(  0,1f,-20,       0.2f,0.1f,5f,               0,0,0,gl,             1f , 1f , 1f,null);
        
        graphic=new ArrayList<Colisionable> ();
        
        
        
        
        for(int i=33;i>=-33;i-=4){
                //pinos grnades
//                graphic.add(new PineTree(     -33.0f,2.0f,i,       0.8f, 1f,0.8f,                  0.0f, 0.0f, 0.0f, gl));
//                graphic.add(new PineTree(     -33.0f,2.0f,i,       0.8f, 1f,0.8f,                  0.0f, 45.0f, 0.0f, gl));

                graphic.add(new PineTree(     i,2.0f,33,       0.8f, 1f,0.8f,                  0.0f, 90.0f, 0.0f, gl));
                graphic.add(new PineTree(     i,2.0f,33,       0.8f, 1f,0.8f,                  0.0f, 45.0f, 0.0f, gl));
        }
        for(int i=27;i>=-27;i-=8)
        {
                graphic.add(new Tree(     -27f,2.0f,i,       0.8f, 0.8f,0.8f,                  0.0f, 90.0f, 0.0f, gl));
                graphic.add(new Tree(     -27f,2.0f,i,       0.8f, 0.8f,0.8f,                  0.0f, 0.0f, 0.0f, gl));
                
                graphic.add(new Tree(     27f,2.0f,i,       0.8f, 0.8f,0.8f,                  0.0f, 90.0f, 0.0f, gl));
                graphic.add(new Tree(     27f,2.0f,i,       0.8f, 0.8f,0.8f,                  0.0f, 0.0f, 0.0f, gl));
                
//                graphic.add(new Tree(     i,2.0f,-27f,       0.8f, 0.8f,0.8f,                  0.0f, 00.0f, 0.0f, gl));
//                graphic.add(new Tree(     i,2.0f,-27f,       0.8f, 0.8f,0.8f,                  0.0f, 90.0f, 0.0f, gl));
         
                graphic.add(new Tree(     i,2.0f,27f,       0.8f, 0.8f,0.8f,                  0.0f, 00.0f, 0.0f, gl));
                graphic.add(new Tree(     i,2.0f,27f,       0.8f, 0.8f,0.8f,                  0.0f, 90.0f, 0.0f, gl));
                
        }
        
         for(int j=27;j>=8;j-=8)
        {
            graphic.add(new Tree(     j,2.0f,-27f,       0.8f, 0.8f,0.8f,                  0.0f, 00.0f, 0.0f, gl));
            graphic.add(new Tree(     j,2.0f,-27f,       0.8f, 0.8f,0.8f,                  0.0f, 90.0f, 0.0f, gl));
            
            graphic.add(new Tree(     -j,2.0f,-27f,       0.8f, 0.8f,0.8f,                  0.0f, 00.0f, 0.0f, gl));
            graphic.add(new Tree(     -j,2.0f,-27f,       0.8f, 0.8f,0.8f,                  0.0f, 90.0f, 0.0f, gl));
        }
        
        
        
        graphic.add(new Tree(    10 ,2.0f,0f,       0.4f, 0.4f,0.4f,                  0.0f, 00.0f, 0.0f, gl));
        graphic.add(new Tree(    10 ,2.0f,0f,       0.4f, 0.4f,0.4f,                  0.0f, 90.0f, 0.0f, gl));
        
        graphic.add(new Tree(    -10 ,2.0f,0f,       0.4f, 0.4f,0.4f,                  0.0f, 00.0f, 0.0f, gl));
        graphic.add(new Tree(    -10 ,2.0f,0f,       0.4f, 0.4f,0.4f,                  0.0f, 90.0f, 0.0f, gl));
         
        graphic.add(new Tree(    10 ,2.0f,15f,       0.4f, 0.4f,0.4f,                  0.0f, 00.0f, 0.0f, gl));
        graphic.add(new Tree(    10 ,2.0f,15f,       0.4f, 0.4f,0.4f,                  0.0f, 90.0f, 0.0f, gl));
        
        graphic.add(new Tree(    -10 ,2.0f,15f,       0.4f, 0.4f,0.4f,                  0.0f, 00.0f, 0.0f, gl));
        graphic.add(new Tree(    -10 ,2.0f,15f,       0.4f, 0.4f,0.4f,                  0.0f, 90.0f, 0.0f, gl));
        
        graphic.add(new Tree(    10 ,2.0f,-15f,       0.4f, 0.4f,0.4f,                  0.0f, 00.0f, 0.0f, gl));
        graphic.add(new Tree(    10 ,2.0f,-15f,       0.4f, 0.4f,0.4f,                  0.0f, 90.0f, 0.0f, gl));
        
        graphic.add(new Tree(    -10 ,2.0f,-15f,       0.4f, 0.4f,0.4f,                  0.0f, 00.0f, 0.0f, gl));
        graphic.add(new Tree(    -10 ,2.0f,-15f,       0.4f, 0.4f,0.4f,                  0.0f, 90.0f, 0.0f, gl));
        
        for(int i=-20;i<=22;i+=4)
        {
            graphic.add(new House(-22,3f,i,       1.5f,1.0f,1.5f,               0,90,0,           gl));   
            graphic.add(new House(22,3f,i,       1.5f,1.0f,1.5f,               0,-90,0,           gl));   
                
        }
        for(int i=-20;i<=22;i+=8)
        {
                 
            graphic.add(new Car(17,2.0f,i,    0.8f,0.8f,0.8f,               0,-90,0,           gl));
            graphic.add(new Car(-17,2.0f,i,  0.8f,0.8f,0.8f,            0,90,0,           gl));
        }
//        graphic.add(new Woman(10,3.0f,-5,    0.4f,0.4f,0.4f,               0,0,0,           gl));   
//        graphic.add(new Man(8.5f,3.0f,-5,    0.4f,0.5f,0.4f,               0,0,0,           gl));
//        graphic.add(new Woman(-6,3.0f,0,    0.4f,0.4f,0.4f,               0,0,0,           gl));   
//        graphic.add(new Man(-7.5f,3.0f,0,    0.4f,0.5f,0.4f,               0,0,0,           gl));
//        graphic.add(new Woman(-9,3.0f,20,    0.4f,0.4f,0.4f,               0,0,0,           gl));   
//        graphic.add(new Man(-7.5f,3.0f,20,    0.4f,0.5f,0.4f,               0,0,0,           gl));
//        graphic.add(new Woman(11,3.0f,20,    0.4f,0.4f,0.4f,               0,0,0,           gl));   
//        graphic.add(new Man(-12.5f,3.0f,-12,    0.4f,0.5f,0.4f,               0,0,0,           gl));
//        graphic.add(new Woman(-9,3.0f,13,    0.4f,0.4f,0.4f,               0,0,0,           gl));   
        graphic.add(new Cloud(1.0f,15f,5f,   0.7f,0.5f,0.5f,   0,0,0,gl));
        graphic.add(new Cloud(-20.0f,15f,10f,   0.7f,0.5f,0.5f,   0,0,0,gl));
        graphic.add(new Cloud(30.0f,20f,-20f,   0.7f,0.5f,0.5f,   0,0,0,gl));
        graphic.add(new Cloud(-30.0f,25f,-20f,   0.7f,0.5f,0.5f,   0,0,0,gl));
        graphic.add(new Cloud(-25.0f,15f,-30f,   0.7f,0.5f,0.5f,   0,0,0,gl));
        graphic.add(new Cloud(25.0f,15f,12f,   0.7f,0.5f,0.5f,   0,0,0,gl));
        graphic.add(new Cloud(25.0f,15f,-25f,   0.7f,0.5f,0.5f,   0,0,0,gl));
//        for(int i=24;i>-26;i-=15)
//        {
//            graphic.add(new Postmagenta(-6.5f,1,i,0.5f,0.6f,0.5f,0,0,0,gl));
//            graphic.add(new Postmagenta(6.5f,1,i,0.5f,0.6f,0.5f,0,0,0,gl));
//        }              
//           
        avion= new Airplane(-70,13,0,    0.5f,0.5f,0.5f,               0,90,0,           gl);
        coche=new Car(2.5f,2.0f,30,    0.8f,0.8f,0.8f,               0,0,0,           gl);
        nube = new Cloud(-85.0f,20f,-30f,   0.7f,0.5f,0.5f,   0,0,0,gl);
        nube1 = new Cloud(85.0f,20f,-35f,   0.7f,0.5f,0.5f,   0,0,0,gl);
        hombre=new Man(9f,3.0f,10,    0.4f,0.5f,0.4f,               0,90,0,           gl);
        
    }     
    public void display() {
        
        
    gl.glPushMatrix();
    
       super.modelMatrix();


       
       for(Colisionable objetos : graphic) {
            
            objetos.display();
        }
       

  
       
           avion.x+=inc;
           if(avion.x>70)
            {
            avion.roty=-90; 
            inc=-0.4f;
            
            }
           if(avion.x<-70)
            {
            avion.roty=90; 
            inc=0.4f;
            }
            avion.display();
       
       
       coche.z+=inccohe;
           if(coche.z>30)
            {
            coche.x=2.5f;
            coche.roty=180; 
            inccohe=-0.25f;
            
            }
           if(coche.z<-100)
            {
            coche.x=-2.5f;
            coche.roty=0; 
            inccohe=0.25f;
            }
       coche.display();
       
       hombre.x+=inchombre;
           if(hombre.x>25)
            {
                hombre.roty=90;
            inchombre=-0.05f;
            
            }
           if(hombre.x<-25)
            {
              inchombre=0.05f;
            }
       hombre.display();
      

     
       nube.x+=incnube;
           if(nube.x>0)
            {
            
            incnube=-0.05f;
            
            }
           if(nube.x<-85)
            {
            
            incnube=0.05f;
            }
       nube.display();
    
       nube1.x-=incnube1;
           if(nube1.x<0)
            {
            
            incnube1=-0.05f;
            
            }
           if(nube1.x>85)
            {
            
            incnube1=0.05f;
            }
       nube1.display();
       
       
    Ona_Jativa_Proyecto.materiales.get("piso").activar();
    bloque1.display();
    bloque2.display();
    bloque3.display();
    bloque31.display();
    bloque4.display();
    
    Ona_Jativa_Proyecto.materiales.get("piso1").activar();
    bloque.display();
    Ona_Jativa_Proyecto.materiales.get("piso2").activar();
    calle.display();
    Ona_Jativa_Proyecto.materiales.get("whitehouse").activar();
    linea1.display();
    linea2.display();
    linea3.display();
 
    gl.glPopMatrix();
    
    }
    
}
