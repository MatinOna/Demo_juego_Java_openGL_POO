/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.event;

import com.martin.www.basicgraphicobject.Cube;
import com.martin.www.eventobject.Player;
import com.martin.www.eventobject.Projectile;
import com.martin.www.interfaz.Colisionable;
import com.martin.www.main.Ona_Jativa_Proyecto;
import com.martin.www.scene.Scene;
import com.martin.www.world.World1;
import com.martin.www.world.World2;
import com.martin.www.world.World3;
import com.martin.www.world.World4;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.opengl.GL;

/**
 *
 * @author Martin
 */
public class Keyboard implements KeyListener {
    
    public Player player;
    public GL gl;
    public float cont=0;
   
    

    
    public Keyboard(Player player,GL gl)
    {
        this.player=player;
        this.gl=gl;
        
       
                
    }

    public void keyTyped(KeyEvent ke)
    {
       
        if(ke.getKeyChar()=='e')
        {
            this.player.linterna4=true;
            this.player.linterna5=false;
           
            
        }
        if(ke.getKeyChar()=='r')
        {
            this.player.linterna5=true;
           
           this.player.linterna4=false;
            
        }
        if(ke.getKeyChar()=='1')
        {
            this.player.camera1=true;
            this.player.camera2=false;
            this.player.camera3=false;
            
        }
        if(ke.getKeyChar()=='2')
        {
            this.player.camera2=true;
            this.player.camera1=false;
            this.player.camera3=false;
            
        }
         if(ke.getKeyChar()=='3')
        {
            this.player.camera3=true;
            this.player.camera2=false;
            this.player.camera1=false;
            
        }
        
        if(ke.getKeyChar()=='w')
        {
           
            
            this.player.z+=(player.vel*Math.cos(player.angley-(Math.PI/2)));
            this.player.x-=(player.vel*Math.sin(player.angley-(Math.PI/2)));
            
            boolean colision = false;
            
            
            for(Colisionable ob: Scene.diamantes)
            {
                
                if(player.Colision(ob))
                {
                    Ona_Jativa_Proyecto.audios.get("audio_diamantes").Play();
                    Scene.diamantesborrar.add(ob);
                    cont++;
                    System.out.println("diamantes:"+cont);
                }

            }
            
         
            
            for(Colisionable ob: Scene.graphic)
            {
                colision=colision ||  player.Colision(ob);
                
            }
             for(Colisionable ob: World1.graphic)
            {
                colision=colision ||  player.Colision(ob);
                
            }
             
             for(Colisionable ob: World2.graphic)
            {
                Cube ob_c = new Cube(Scene.mundo2.x+ob.getX(), 0, Scene.mundo2.z+ob.getZ(), ob.getR(), ob.getR(), ob.getR(), 0, 0, 0, gl, 0, 0, 0,null);
                   
                colision=colision ||  player.Colision(ob_c);
                
            }
             
              for(Colisionable ob: World3.graphic)
            {
                Cube ob_c = new Cube(Scene.mundo3.x+ob.getX(), 0,Scene.mundo3.z-ob.getZ(), ob.getR(), ob.getR(), ob.getR(), Scene.mundo3.rotx, Scene.mundo3.roty, Scene.mundo3.rotz, gl, 0, 0, 0,null);
               
                colision=colision ||  player.Colision(ob_c);
                
            }
              
               for(Colisionable ob: World4.graphic4)
            {
                Cube ob_c = new Cube(Scene.mundo4.x+ob.getX(), 0, Scene.mundo4.z-ob.getZ(), ob.getR(), ob.getR(), ob.getR(), Scene.mundo4.rotx, Scene.mundo4.roty, Scene.mundo4.rotz, gl, 0, 0, 0,null);
                   
                colision=colision ||  player.Colision(ob_c);
                
            }
            
            if(colision)
            {
                
                this.player.z-=(player.vel*Math.cos(player.angley-(Math.PI/2)));
                this.player.x+=(player.vel*Math.sin(player.angley-(Math.PI/2)));
                
                
            }
            
        }
        if(ke.getKeyChar()=='s')
        {
           
            this.player.z-=(player.vel*Math.cos(player.angley-(Math.PI/2)));
            this.player.x+=(player.vel*Math.sin(player.angley-(Math.PI/2)));
            
            boolean colision = false;
            
            
            for(Colisionable ob: Scene.diamantes)
            {
                
                if(player.Colision(ob))
                {
                    Ona_Jativa_Proyecto.audios.get("audio_diamantes").Play();
                    Scene.diamantesborrar.add(ob);
                    cont++;
                    System.out.println("diamantes:"+cont);
                }

            }
            
            for(Colisionable ob: Scene.graphic)
            {
                colision=colision ||  player.Colision(ob);
                
            }
             for(Colisionable ob: World1.graphic)
            {
                colision=colision ||  player.Colision(ob);
                
            }
             
             for(Colisionable ob: World2.graphic)
            {
                Cube ob_c = new Cube(Scene.mundo2.x+ob.getX(), 0, Scene.mundo2.z+ob.getZ(), ob.getR(), ob.getR(), ob.getR(), 0, 0, 0, gl, 0, 0, 0,null);
                   
                colision=colision ||  player.Colision(ob_c);
                
            }
             
              for(Colisionable ob: World3.graphic)
            {
                Cube ob_c = new Cube(Scene.mundo3.x+ob.getX(), 0,Scene.mundo3.z-ob.getZ(), ob.getR(), ob.getR(), ob.getR(), Scene.mundo3.rotx, Scene.mundo3.roty, Scene.mundo3.rotz, gl, 0, 0, 0,null);
               
                colision=colision ||  player.Colision(ob_c);
                
            }
              
               for(Colisionable ob: World4.graphic4)
            {
                Cube ob_c = new Cube(Scene.mundo4.x+ob.getX(), 0, Scene.mundo4.z-ob.getZ(), ob.getR(), ob.getR(), ob.getR(), Scene.mundo4.rotx, Scene.mundo4.roty, Scene.mundo4.rotz, gl, 0, 0, 0,null);
                   
                colision=colision ||  player.Colision(ob_c);
                
            }
            
            if(colision)
            {
                
                this.player.z+=(player.vel*Math.cos(player.angley-(Math.PI/2)));
                this.player.x-=(player.vel*Math.sin(player.angley-(Math.PI/2)));
                
                
            }
        }
        if(ke.getKeyChar()=='a')
        {
            
            this.player.z-=(player.vel*Math.cos(player.angley));
            this.player.x+=(player.vel*Math.sin(player.angley));
            boolean colision = false;
            
            
            for(Colisionable ob: Scene.diamantes)
            {
                
                if(player.Colision(ob))
                {
                    Ona_Jativa_Proyecto.audios.get("audio_diamantes").Play();
                    Scene.diamantesborrar.add(ob);
                    cont++;
                    System.out.println("diamantes:"+cont);
                }

            }
            
            for(Colisionable ob: Scene.graphic)
            {
                colision=colision ||  player.Colision(ob);
                
            }
             for(Colisionable ob: World1.graphic)
            {
                colision=colision ||  player.Colision(ob);
                
            }
             
             for(Colisionable ob: World2.graphic)
            {
                Cube ob_c = new Cube(Scene.mundo2.x+ob.getX(), 0, Scene.mundo2.z+ob.getZ(), ob.getR(), ob.getR(), ob.getR(), 0, 0, 0, gl, 0, 0, 0,null);
                   
                colision=colision ||  player.Colision(ob_c);
                
            }
             
              for(Colisionable ob: World3.graphic)
            {
                Cube ob_c = new Cube(Scene.mundo3.x+ob.getX(), 0,Scene.mundo3.z-ob.getZ(), ob.getR(), ob.getR(), ob.getR(), Scene.mundo3.rotx, Scene.mundo3.roty, Scene.mundo3.rotz, gl, 0, 0, 0,null);
               
                colision=colision ||  player.Colision(ob_c);
                
            }
              
               for(Colisionable ob: World4.graphic4)
            {
                Cube ob_c = new Cube(Scene.mundo4.x+ob.getX(), 0, Scene.mundo4.z-ob.getZ(), ob.getR(), ob.getR(), ob.getR(), Scene.mundo4.rotx, Scene.mundo4.roty, Scene.mundo4.rotz, gl, 0, 0, 0,null);
                   
                colision=colision ||  player.Colision(ob_c);
                
            }
            if(colision)
            {
                
                this.player.z+=(player.vel*Math.cos(player.angley));
                this.player.x-=(player.vel*Math.sin(player.angley));
                
                
            }
            
        }
        if(ke.getKeyChar()=='d')
        {
            
            this.player.z+=(player.vel*Math.cos(player.angley));
            this.player.x-=(player.vel*Math.sin(player.angley));
            
            boolean colision = false;
            
            
            for(Colisionable ob: Scene.diamantes)
            {
                
                if(player.Colision(ob))
                {
                    Ona_Jativa_Proyecto.audios.get("audio_diamantes").Play();
                    Scene.diamantesborrar.add(ob);
                    cont++;
                    System.out.println("diamantes:"+cont);
                }

            }
            
            for(Colisionable ob: Scene.graphic)
            {
                colision=colision ||  player.Colision(ob);
                
            }
             for(Colisionable ob: World1.graphic)
            {
                colision=colision ||  player.Colision(ob);
                
            }
             
             for(Colisionable ob: World2.graphic)
            {
                Cube ob_c = new Cube(Scene.mundo2.x+ob.getX(), 0, Scene.mundo2.z+ob.getZ(), ob.getR(), ob.getR(), ob.getR(), 0, 0, 0, gl, 0, 0, 0,null);
                   
                colision=colision ||  player.Colision(ob_c);
                
            }
             
              for(Colisionable ob: World3.graphic)
            {
                Cube ob_c = new Cube(Scene.mundo3.x+ob.getX(), 0,Scene.mundo3.z-ob.getZ(), ob.getR(), ob.getR(), ob.getR(), Scene.mundo3.rotx, Scene.mundo3.roty, Scene.mundo3.rotz, gl, 0, 0, 0,null);
               
                colision=colision ||  player.Colision(ob_c);
                
            }
              
               for(Colisionable ob: World4.graphic4)
            {
                Cube ob_c = new Cube(Scene.mundo4.x+ob.getX(), 0, Scene.mundo4.z-ob.getZ(), ob.getR(), ob.getR(), ob.getR(), Scene.mundo4.rotx, Scene.mundo4.roty, Scene.mundo4.rotz, gl, 0, 0, 0,null);
                   
                colision=colision ||  player.Colision(ob_c);
                
            }
            
            if(colision)
            {
                
                this.player.z-=(player.vel*Math.cos(player.angley));
                this.player.x+=(player.vel*Math.sin(player.angley));
                
            }
            
        }
        
        
           if(ke.getKeyChar()=='q')
        {
            Ona_Jativa_Proyecto.audios.get("disparo").Play();
            Scene.proyectil.add(new Projectile(this.player.x,this.player.y-1,this.player.z,1,this.player.angley,15,gl));
            
        }
    


}

    public void keyPressed(KeyEvent e) {

    }

    public void keyReleased(KeyEvent e) {

    }
}