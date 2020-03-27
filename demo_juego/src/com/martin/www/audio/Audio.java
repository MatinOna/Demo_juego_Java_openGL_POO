/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.martin.www.audio;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.net.MalformedURLException;

/**
 *
 * @author Martin
 */
public class Audio {
    
    
    
    public AudioClip clip;
    public File Url;
    public Audio(String ruta) throws MalformedURLException 
    {
            Url=new File(ruta);
            clip= Applet.newAudioClip(Url.toURI().toURL());
    }
    
    
    public void Play()
    {
        clip.play();
    }
    public void Loop()
    {
        clip.loop();
    }
    public void Stop()
    {
        clip.stop();
    }
   
   
    
}
