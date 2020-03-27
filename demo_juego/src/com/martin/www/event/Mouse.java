/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.event;

import com.martin.www.eventobject.Player;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 *
 * @author fing.labcom
 */
public class Mouse  implements MouseListener,MouseMotionListener{
    
    public Player player;
    public float oldx, oldy;
//    public float nuevoanglex;

    public Mouse(Player player) {
        this.player = player;
        this.oldx=0;
        this.oldy=0;
    }
    

    public void mouseClicked(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mousePressed(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseEntered(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseDragged(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void mouseMoved(MouseEvent e) {
        
        this.player.angley+=(e.getX()-oldx)/180;
        this.player.anglex-=(e.getY()-oldy)/180;
        
        if( this.player.anglex>(Math.PI/2))
        {
            this.player.anglex=(float) (Math.PI/2);
        }
        if( this.player.anglex<(-Math.PI/2))
        {
            this.player.anglex=(float) -(Math.PI/2);
        }
        
//        nuevoanglex= this.player.anglex+((e.getY()-oldy)/180);
//        if(nuevoanglex<(Math.PI/2) && nuevoanglex>-(Math.PI/2))
//        {
//            this.player.anglex=nuevoanglex;
//        }
//        
        
        this.oldx=e.getX();
        this.oldy=e.getY();
    }
    
}
