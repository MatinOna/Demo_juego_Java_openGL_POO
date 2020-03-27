/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.scene;

import com.martin.www.basicgraphicobject.Octahedron;
import com.martin.www.basicgraphicobject.SphereGlu;
import com.martin.www.complexgraphicobject.Car;
import com.martin.www.complexgraphicobject.Man;
import com.martin.www.complexgraphicobject.Moon;
import com.martin.www.complexgraphicobject.Postcyan;
import com.martin.www.complexgraphicobject.Postmagenta;
import com.martin.www.complexgraphicobject.Postwhite;
import com.martin.www.complexgraphicobject.Sun;
import com.martin.www.complexgraphicobject.Woman;
import com.martin.www.eventobject.Enemy;
import com.martin.www.eventobject.Player;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.interfaz.Displayable;
import com.martin.www.lightandmaterial.Lantern;
import com.martin.www.lightandmaterial.Light;
import com.martin.www.main.Ona_Jativa_Proyecto;
import com.martin.www.world.World1;
import com.martin.www.world.World2;
import com.martin.www.world.World3;
import com.martin.www.world.World4;
import java.util.ArrayList;
import javax.media.opengl.GL;

/**
 *
 * @author Martin
 */
public class Scene extends com.martin.www.pojos.Object implements Displayable{
    
   
    public SphereGlu skysphere;
    
   public static World1 mundo1;
   public static World2 mundo2;
   public static World3 mundo3;
   public static World4 mundo4;
    
   
    public Sun sol;
    public float n=1440;
    public float xv=35.0f;
    public float yv=0.0f;
    public float x0=-35.0f;
    public float y0=0.0f;
    public float xsol,ysol;
    public float angle=360/n;
    
    public Moon luna;
    public float nl=1440;
    public float xvl=35.0f;
    public float yvl=0.0f;
    public float x0l=105.0f;
    public float y0l=0.0f;
    public float xluna,yluna;
    public float anglel=360/nl;
    
    public Player martin;
   public Enemy martininfectado,martininfectado1,martininfectado2,martininfectado3;
    
    public Light luzsol,luzluna;
    
    public Lantern martinlinterna,linternafaropersonas,linternacoche,linternafaropersonasverde,luzmundod,luzmundoi;
    
    public static ArrayList<Colisionable> graphic;
    
     public static ArrayList<Colisionable> diamantes;
     public static ArrayList<Colisionable> diamantesborrar=new ArrayList<Colisionable>(); 
    
    public static ArrayList<Colisionable> proyectil=new ArrayList<Colisionable>(); 
     public static ArrayList<Colisionable> proyectilborrar=new ArrayList<Colisionable>(); 
    
//    public static ArrayList<Colisionable> enemigos;
//     public static ArrayList<Colisionable> enemigosaborrar=new ArrayList<Colisionable>(); 
     
     
    public Car coche; private float inccohe=0.25f; 
    

    public Scene(float x, float y, float z, float width, float height, float depth, float rotx, float roty, float rotz, GL gl) {
        super(x, y, z, width, height, depth, rotx, roty, rotz, gl);
        

       skysphere=new SphereGlu(35,0,-35,110,110,110,0,0,180,gl,1,1,1,true,  Ona_Jativa_Proyecto.texturas.get("sakyboxday"));

        mundo1=new World1(0.0f,0.0f,0.0f,       1, 1,1,                  0.0f, 0.0f, 0.0f, gl);
        mundo2=new World2(70.0f,0.0f,0.0f,       1, 1,1,                  0.0f, 0.0f, 0.0f, gl);
        mundo3=new World3(70.0f,0.0f,-70.0f,       1, 1,1,                  0.0f, 180.0f, 0.0f, gl);
        mundo4=new World4(0.0f,0.0f,-70.0f,       1, 1,1,                  0.0f, 180.0f, 0.0f, gl);
        
        coche=new Car(2.5f,2.0f,30,    0.8f,0.8f,0.8f,               0,0,0,           gl);
        
        graphic=new ArrayList<Colisionable> ();
        

        diamantes=new ArrayList<Colisionable> ();
        
        diamantes.add(new Octahedron(35,3f,-35,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(0,3f,0,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(1,3f,-35,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(28,3f,-35,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(20,3f,-35,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(5,3f,0,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(0,3f,15,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(9,3f,7,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(-2,3f,10,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(0,3f,-5,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(2,3f,-7,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(-2,3f,-10,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        
         diamantes.add(new Octahedron(9,3f,-70,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(-2,3f,-75,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(0,3f,-50,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(2,3f,-30,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(-2,3f,-10,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        
          diamantes.add(new Octahedron(70,3f,-70,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(68,3f,-75,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(70,3f,-50,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(75,3f,-30,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(78,3f,-10,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        
        diamantes.add(new Octahedron(70,3f,-17,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(68,3f,-90,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(70,3f,-46,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(75,3f,-23,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(78,3f,10,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        
        
        diamantes.add(new Octahedron(2,3f,-35,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(-6,3f,-35,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(-8,3f,-35,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(4,3f,-38,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        diamantes.add(new Octahedron(0,3f,-35,  1f,1f,1f,    0,0,0,gl,0, 0 ,0,true));
        
        
        
        
         for(int i=30;i>=-30;i-=7){
               
                diamantes.add(new Octahedron( -33+135.0f,3.0f,i-70,       0.8f, 1f,0.8f,                  0.0f, 0.0f, 0.0f, gl,0,0,0,true));
                diamantes.add(new Octahedron( -33.0f,3.0f,i-70,       0.8f, 1f,0.8f,                  0.0f, 0.0f, 0.0f, gl,0,0,0,true));


        }
       

        
        graphic.add( new Man(35f,3.0f,10.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(38f,3.0f,5.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(35f,3.0f,8.0f,   0.4f,0.4f,0.4f,   0,0,0,gl));
        graphic.add( new Woman(36f,3.0f,10.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(32f,3.0f,10.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(34f,3.0f,8.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));

        graphic.add( new Man(35f,3.0f,-80.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(38f,3.0f,-85.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(35f,3.0f,-88.0f,   0.4f,0.4f,0.4f,   0,0,0,gl));
        graphic.add( new Woman(36f,3.0f,-80.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(32f,3.0f,-80.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(34f,3.0f,-88.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        
         graphic.add( new Man(35f,3.0f,-70.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(38f,3.0f,-60.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(35f,3.0f,-65.0f,   0.4f,0.4f,0.4f,   0,0,0,gl));
        graphic.add( new Woman(36f,3.0f,-0.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(32f,3.0f,-10.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(34f,3.0f,-20.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        
         graphic.add( new Man(35f,3.0f,-82.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(38f,3.0f,-56.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(35f,3.0f,3.0f,   0.4f,0.4f,0.4f,   0,0,0,gl));
        graphic.add( new Woman(36f,3.0f,0.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(32f,3.0f,10.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(34f,3.0f,20.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        
        graphic.add( new Man(40f,3.0f,-35.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add(new Man(30f,3.0f,-33.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(20f,3.0f,-37f,   0.4f,0.4f,0.4f,   0,0,0,gl));
        graphic.add( new Woman(-10f,3.0f,-35f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(-15f,3.0f,-33.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add(new Woman(-20f,3.0f,-37.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(-12f,3.0f,-35.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(-18f,3.0f,-33.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(-8f,3.0f,-37f,   0.4f,0.4f,0.4f,   0,0,0,gl));
        
        graphic.add( new Man(50f,3.0f,-35.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(45f,3.0f,-33.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Man(90f,3.0f,-37f,   0.4f,0.4f,0.4f,   0,0,0,gl));
        graphic.add( new Woman(100f,3.0f,-35f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(85f,3.0f,-33.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        graphic.add( new Woman(96f,3.0f,-37.0f,   0.4f,0.4f,0.4f,   0,45,0,gl));
        
        graphic.add( new Postmagenta(35,3,13,0.5f,0.6f,0.5f,0,180,0,gl));
        graphic.add( new Postcyan(35,3,-90,0.5f,0.6f,0.5f,0,0,0,gl));
        graphic.add( new Postwhite(60,3,-35,0.5f,0.6f,0.5f,0,90,0,gl));
        graphic.add( new Postwhite(80,3,-35,0.5f,0.6f,0.5f,0,-90,0,gl));
        graphic.add( new Postwhite(-15,3,-35,0.5f,0.6f,0.5f,0,90,0,gl));
        graphic.add( new Postwhite(15,3,-35,0.5f,0.6f,0.5f,0,-90,0,gl));
        
        sol=new Sun(35 ,20,-35.0f,   2.5f,2.5f,2.5f,   0,0,0,gl);
        luna=new Moon(35 ,20,-35.0f,   2.5f,2.5f,2.5f,   0,0,0,gl);
        
        //float px, float py, float pz, float[] ambient, float[] diffuse, float[] specular, boolean puntual, boolean bombillavisible, boolean encendida, int id, GL gl
        luzsol=new Light(35,20.0f,-35.0f,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},true,false,false,GL.GL_LIGHT0,gl);
        martinlinterna=new Lantern(0,5,0,  0,GL.GL_LIGHT1,false,false,0,0,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.f,1.f,1.0f},new float []{1.0f,1.f,1.0f,1.0f},10,gl);  
        linternafaropersonas=new Lantern(34,30,10,  0,GL.GL_LIGHT2,false,false,0,-1,0,new float []{1.0f,0.0f,0.0f,1.0f},new float []{1.0f,0.0f,0.0f,1.0f},new float []{1.0f,0.0f,0.0f,1.0f},20,gl);  
        linternacoche=new Lantern(0,3,0,  0,GL.GL_LIGHT3,false,false,0,0,-1,new float []{0.5f,0.5f,0.5f,1.0f},new float []{0.0f,1.0f,0.0f,1.0f},new float []{0.0f,1.0f,0.0f,1.0f},5,gl);  
        luzluna=new Light(35,20.0f,-35.0f,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},true,false,false,GL.GL_LIGHT4,gl);
        linternafaropersonasverde=new Lantern(34,30,-80,  0,GL.GL_LIGHT5,false,false,0,-1,0,new float []{0.0f,0.9f,0.9f,1.0f},new float []{0.03f,0.84f,0.84f,1.0f},new float []{0.03f,0.84f,0.84f,1.0f},20,gl);         
        luzmundod=new Lantern(70,50,-35,  0,GL.GL_LIGHT6,false,false,0,-1,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.0f,0.0f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},27,gl); 
        luzmundoi=new Lantern(0,50,-35,  0,GL.GL_LIGHT7,false,false,0,-1,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.0f,0.0f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},27,gl);         
        
        martin=new Player(0,5.0f,0,1,0,0,gl);
        
        martininfectado=new Enemy(0.1f,0,3.5f,10,0,0,0,martin,gl);
        martininfectado1=new Enemy(0.1f,70,3.5f,0,0,0,0,martin,gl);
        martininfectado2=new Enemy(0.1f,0,3.5f,-70,0,0,0,martin,gl);
        martininfectado3=new Enemy(0.1f,70,3.5f,-70,0,0,0,martin,gl);

        
         Ona_Jativa_Proyecto.audios.get("espacio").Play();
 
      
      
    }

    public void display() 
    {
        gl.glPushMatrix();
    
        super.modelMatrix();
        
        
         for(float i=1;i<nl;i+=1f)
       {
            xluna=x0l;
            yluna=y0l;
            x0l= (float) (xvl+(xluna-xvl)*Math.cos(Math.toRadians(anglel))-(yluna-yvl)*Math.sin(Math.toRadians(anglel)));
            y0l= (float) (yvl+(xluna-xvl)*Math.sin(Math.toRadians(anglel))+(yluna-yvl)*Math.cos(Math.toRadians(anglel)));
            luna.x=x0l;
            luna.y=y0l;
            
           
        }  
       luna.display();
        for(float i=1;i<n;i+=1f)
       {
            xsol=x0;
            ysol=y0;
            x0= (float) (xv+(xsol-xv)*Math.cos(Math.toRadians(angle))-(ysol-yv)*Math.sin(Math.toRadians(angle)));
            y0= (float) (yv+(xsol-xv)*Math.sin(Math.toRadians(angle))+(ysol-yv)*Math.cos(Math.toRadians(angle)));
            sol.x=x0;
            sol.y=y0;
            
           
        }  
       sol.display();
       
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
       
       if(sol.x>0 & sol.y>0   || sol.x<0 & sol.y>0)
       {
          
           
          skysphere.textura=Ona_Jativa_Proyecto.texturas.get("sakyboxday");
          

            luzsol=new Light(sol.x,sol.y,sol.z,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.f,1.f,1.0f},new float []{1.0f,1.f,1.0f,1.0f},true,true,true,GL.GL_LIGHT0,gl);
            luzluna=new Light(luna.x,luna.y,luna.z,new float []{0.1f,0.1f,0.1f,1.0f},new float []{0.0f,0.0f,0.45f,1.0f},new float []{0.0f,0.0f,0.45f,1.0f},false,true,false,GL.GL_LIGHT4,gl);
            
                    luzmundod=new Lantern(70,50,-35,  0,GL.GL_LIGHT6,false,false,0,-1,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},25,gl);
                    luzmundoi=new Lantern(0,50,-35,  0,GL.GL_LIGHT7,false,false,0,-1,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.0f,0.0f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},27,gl);   
                    
                linternafaropersonas=new Lantern(34,30,10,  0,GL.GL_LIGHT2,false,false,0,-1,0,new float []{0.89f,0.0f,0.89f,1.0f},new float []{0.89f,0.0f,0.89f,1.0f},new float []{0.89f,0.0f,0.89f,1.0f},25,gl); 
                linternafaropersonasverde=new Lantern(34,30,-80,  0,GL.GL_LIGHT5,false,false,0,-1,0,new float []{0.0f,0.9f,0.9f,1.0f},new float []{0.03f,0.84f,0.84f,1.0f},new float []{0.03f,0.84f,0.84f,1.0f},20,gl);      
                
                    linternacoche=new Lantern(coche.x,coche.y,coche.z,  0,GL.GL_LIGHT3,false,false,0,0,-1,new float []{0.92f,0.89f,0.16f,1.0f},new float []{0.88f,0.87f,0.14f,1.0f},new float []{0.85f,0.83f,0.35f,1.0f},5f,gl); 
       }
       if(sol.x>0 & sol.y<0   || sol.x<0 & sol.y<0)
       {
          
           
         
      skysphere.textura= Ona_Jativa_Proyecto.texturas.get("ashcanyon_bk");
      
            luzsol=new Light(sol.x,sol.y,sol.z,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.f,1.f,1.0f},new float []{1.0f,1.f,1.0f,1.0f},true,true,false,GL.GL_LIGHT0,gl);
           luzluna=new Light(luna.x,luna.y,luna.z,new float []{0.1f,0.1f,0.1f,1.0f},new float []{0.0f,0.0f,0.45f,1.0f},new float []{0.0f,0.0f,0.45f,1.0f},false,true,true,GL.GL_LIGHT4,gl);
                        
                    luzmundod.encendida=true;
//                     luzmundod=new Lantern(70,50,-35,  0,GL.GL_LIGHT6,true,false,0,-1,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},25,gl);    
                     luzmundoi=new Lantern(0,50,-35,  0,GL.GL_LIGHT7,true,false,0,-1,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.0f,0.0f,1.0f},new float []{1.0f,1.0f,1.0f,1.0f},27,gl);   
                     
                linternafaropersonas=new Lantern(34,30,10,  0,GL.GL_LIGHT2,true,false,0,-1,0,new float []{0.89f,0.0f,0.89f,1.0f},new float []{0.89f,0.0f,0.89f,1.0f},new float []{0.89f,0.0f,0.89f,1.0f},25,gl);
                linternafaropersonasverde=new Lantern(34,30,-80,  0,GL.GL_LIGHT5,true,false,0,-1,0,new float []{0.0f,0.9f,0.9f,1.0f},new float []{0.03f,0.84f,0.84f,1.0f},new float []{0.03f,0.84f,0.84f,1.0f},20,gl);         
           
                    if( inccohe>0)
                     {
                
                        linternacoche=new Lantern(coche.x,coche.y,coche.z,  0,GL.GL_LIGHT3,true,false,0,0,1,new float []{0.92f,0.89f,0.16f,1.0f},new float []{0.88f,0.87f,0.14f,1.0f},new float []{0.85f,0.83f,0.35f,1.0f},5f,gl); 
                    }
                     if(inccohe<0)
                    {
                          linternacoche=new Lantern(coche.x,coche.y,coche.z,  0,GL.GL_LIGHT3,true,false,0,0,-1,new float []{0.92f,0.89f,0.16f,1.0f},new float []{0.88f,0.87f,0.14f,1.0f},new float []{0.85f,0.83f,0.35f,1.0f},5f,gl); 
                    }
            
       }
       
            
         if(martin.linterna4==true)
        {
            martinlinterna=new Lantern(0,5,0,  0,GL.GL_LIGHT1,true,false,0,0,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.f,1.f,1.0f},new float []{1.0f,1.f,1.0f,1.0f},10,gl);
           
            
        }
        if(martin.linterna5==true)
        {
             martinlinterna=new Lantern(0,5,0,  0,GL.GL_LIGHT1,false,false,0,0,0,new float []{0.5f,0.5f,0.5f,1.0f},new float []{1.0f,1.f,1.f,1.0f},new float []{1.0f,1.f,1.0f,1.0f},10,gl);
             
        }
       
      
       martininfectado.display();
       martininfectado.actuar();
       martininfectado1.display();
       martininfectado1.actuar();
       martininfectado2.display();
       martininfectado2.actuar();
       martininfectado3.display();
       martininfectado3.actuar();
       martin.display();
       martinlinterna.x=martin.x;
       martinlinterna.y=martin.y;
       martinlinterna.z=martin.z;
       martinlinterna.dx=(float)Math.cos(martin.angley);
       martinlinterna.dy= (float)Math.sin(martin.anglex);
       martinlinterna.dz=(float)Math.sin(martin.angley);
       martinlinterna.display();
       
        luzmundod.display();
        luzmundoi.display();
        luzluna.display();
        luzsol.display();
        linternafaropersonasverde.display();
        linternafaropersonas.display();
        linternacoche.display();
        mundo1.display();
        mundo2.display();
        mundo3.display();
        mundo4.display();
        
 

        skysphere.display();
        skysphere.roty+=0.5f;
        
        
        for(Colisionable p : proyectil) 
        {
            
            p.display();
             if(martininfectado.Colision(p) )
                {
                   martininfectado.morir();
                }
             if(martininfectado1.Colision(p) )
                {
                   martininfectado1.morir();
                }
             if(martininfectado2.Colision(p) )
                {
                   martininfectado2.morir();
                }
             if(martininfectado3.Colision(p) )
                {
                   martininfectado3.morir();
                }
        }
        for(Colisionable pb : proyectilborrar) 
        {
            proyectil.remove(pb);
        }
        proyectilborrar=new ArrayList<Colisionable>(); 
        
       
        
        for(Colisionable diamantesacoger : diamantes) {
            Ona_Jativa_Proyecto.materiales.get("gold").activar(); 
            diamantesacoger.display();
           
            
        }
        for(Colisionable db : diamantesborrar) 
        {
           diamantes.remove(db);
           if(diamantes.isEmpty())
           {
             
               Ona_Jativa_Proyecto.resultado(true);
                Ona_Jativa_Proyecto.timer=-1;
           }
            
        }
        diamantesborrar=new ArrayList<Colisionable>(); 
       
        
        
        for(Colisionable objetosc : graphic) {

            objetosc.display();
        }
        System.out.println(martin.life);
        if(martin.life<0)
        {
               
               Ona_Jativa_Proyecto.resultado(false);
               martin.life=1000000000;
               Ona_Jativa_Proyecto.timer=-1;
        }
       

        gl.glPopMatrix();
        
    }

    
    
    
}
