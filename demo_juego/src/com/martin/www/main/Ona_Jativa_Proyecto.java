package com.martin.www.main;

import com.martin.www.audio.Audio;
import com.martin.www.event.Keyboard;
import com.martin.www.event.Mouse;
import com.martin.www.lightandmaterial.Material;
import com.martin.www.scene.Scene;
import com.sun.opengl.util.Animator;
import com.sun.opengl.util.texture.Texture;
import com.sun.opengl.util.texture.TextureIO;
import java.awt.Cursor;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.sound.sampled.LineUnavailableException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;



/**
 * Ona_Jativa_Proyecto.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel) <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Ona_Jativa_Proyecto  implements GLEventListener {
    
   
   
   public Scene escena;
   
   public Keyboard keyboard;
   public Mouse mouse;
   
   public static HashMap<String,Material> materiales=new  HashMap<String,Material>();
   public static HashMap<String,Texture> texturas=new  HashMap<String,Texture>();
   public static HashMap<String,Audio> audios=new  HashMap<String,Audio>();

   
   public static float timer=2880;
  
  
   
    public static void main(String[] args) throws LineUnavailableException, IOException {
        
       
         
       
       
        final Frame frame1 = new Frame("!!!!!!!! MEMENTO MORI !!!!!!!!!!");

        frame1.setLayout(null);
        frame1.setSize(500, 500);
        
        
        Icon fondo = new ImageIcon("fondo.png");
        
        Icon fboton = new ImageIcon("play.png");
        
        Icon fbotone = new ImageIcon("exit.jpg");
        
        JButton button = new JButton(fboton);
        button.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        button.setBounds(100, 200, 100, 50);
        frame1.add(button);
        
        JButton buttonexit = new JButton(fbotone);
        buttonexit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        buttonexit.setBounds(300, 200, 100, 50);
        frame1.add(buttonexit);
       
        JLabel playLABEL=new JLabel("<HTML><FONT FACE=\"courier new\" SIZE=6 COLOR=\"white\">PLAY GAME</FONT></HTML>");
        playLABEL.setBounds(120,235, 100, 100);
        frame1.add(playLABEL);
        
        JLabel EXITLABEL=new JLabel("<HTML><FONT FACE=\"courier new\" SIZE=6 COLOR=\"white\">EXIT GAME</FONT></HTML>");
        EXITLABEL.setBounds(320,235, 100, 100);
        frame1.add(EXITLABEL);
      
        JLabel label=new JLabel(fondo);
        label.setBounds(0, 0, 500,500);
        frame1.add(label);
        
        
        
        
       
        
        frame1.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                    // Run this on another thread than the AWT event queue to
                    // make sure the call to Animator.stop() completes before
                    // exiting
                    new Thread(new Runnable() {
                        public void run() {
                        System.exit(0);
                        }
                    }).start();
                    }
        });
        
         buttonexit.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame1.dispose();
            }
        });
        
        button.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent e){
                
                
                frame1.dispose();
                
    
                
                final Frame frame = new Frame("Martin Oña Jativa   mp.onajativa@gmail.com");
                GLCanvas canvas = new GLCanvas();

                canvas.addGLEventListener(new Ona_Jativa_Proyecto());
                frame.add(canvas);
                frame.setSize(1280, 720);
                final Animator animator = new Animator(canvas);
                
                
                
                
                frame.addWindowListener(new WindowAdapter() {

                    @Override
                    public void windowClosing(WindowEvent e) {
                    // Run this on another thread than the AWT event queue to
                    // make sure the call to Animator.stop() completes before
                    // exiting
                    new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                        }
                    }).start();
                    }
                });
                // Center frame
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                animator.start();  
               
            }
        });
        
        
        
       
       
       
       frame1.setLocationRelativeTo(null);
       frame1.setVisible(true);
        
       
       
        
    }
    
    
   

    

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());
        
        //gl.glEnable(GL.GL_CULL_FACE);
        gl.glEnable(GL.GL_DEPTH_TEST);
        gl.glEnable(GL.GL_LIGHTING);
        gl.glEnable(GL.GL_TEXTURE_2D);
        
        gl.glTexParameterf(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_MIN_FILTER, GL.GL_LINEAR);
        gl.glTexParameterf(GL.GL_TEXTURE_2D, GL.GL_TEXTURE_WRAP_S, GL.GL_REPEAT);
        
        //house
        this.materiales.put("whitehouse", new Material(new float []{1,1,1},new float []{1,1,1},new float []{0.00f,0.0f,0.0f,1.0f},0f,gl));
        this.materiales.put("gold", new Material(new float []{0.24725f,0.1995f,0.0745f},new float []{0.75164f,0.60648f,0.22648f},new float []{0.628284f,0.555802f,0.366065f},0.4f,gl));
        this.materiales.put("blackrubber", new Material(new float []{0.02f, 0.02f, 0.02f, 1.0f },new float []{0.01f, 0.01f, 0.01f, 1.0f},new float []{0.00f,0.0f,0.0f,1.0f},0.0f,gl));
        
        //tree
        this.materiales.put("greentree", new Material(new float []{0.0f,0.3f,0.0f,1.0f},new float []{0.0f,0.33f,0.0f,1.0f},new float []{0.00f,0.0f,0.0f,1.0f},0f,gl));
        this.materiales.put("bronwtree", new Material(new float []{0.18f,0.11f,0.0f,1.0f},new float []{0.14f,0.13f,0.0f,1.0f},new float []{0.00f,0.0f,0.0f,1.0f},0f,gl));
        this.materiales.put("greentree1", new Material(new float []{0.01f,0.27f,0.0f,1.0f},new float []{0.0f,0.16f,0.0f,1.0f},new float []{0.00f,0.0f,0.0f,1.0f},0f,gl));
        
        //pinetree
        
        this.materiales.put("greenpinetree", new Material(new float []{0.01f,0.14f,0.0f,1.0f},new float []{0.0f,0.16f,0.0f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0,gl));
        this.materiales.put("bronwpinetree", new Material(new float []{0.14f,0.11f,0.0215f,1.0f},new float []{0.25f,0.24f,0.07568f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0f,gl));
        this.materiales.put("greenpinetree1", new Material(new float []{0.04f,0.19f,0.0215f,1.0f},new float []{0.26f,0.34f,0.07568f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0f,gl));
        this.materiales.put("greenpinerubby", new Material(new float []{0.1745f, 0.01175f, 0.01175f, 0.55f},new float []{0.61424f, 0.04136f, 0.04136f, 0.55f },new float []{0.0f,0.0f,0.0f },76.8f,gl));
        
        
        //clound
        this.materiales.put("blueclound", new Material(new float []{0.0f,0.17f,0.52f,1.0f},new float []{0.15f,0.25f,0.59f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        this.materiales.put("blueclound1", new Material(new float []{0.0f,0.48f,0.52f,1.0f},new float []{0.05f,0.3f,0.59f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        this.materiales.put("blueclound2", new Material(new float []{0.0f,0.25f,0.52f,1.0f},new float []{0.15f,0.3f,0.59f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        
        //sun
        
        this.materiales.put("yellowsun", new Material(new float []{0.92f,0.87f,0.18f,1.0f},new float []{0.93f,0.71f,0.09f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        
        //airplane
        this.materiales.put("orangleairplane", new Material(new float []{0.78f,0.23f,0.0f,1.0f},new float []{0.77f,0.32f,0.09f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        
        //car
        this.materiales.put("bluecar", new Material(new float []{0.0f,0.02f,0.53f},new float []{0.14f,0.11f,0.96f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        this.materiales.put("redcar", new Material(new float []{0.93f,0.05f,0.06f,1.0f},new float []{0.66f,0.12f,0.11f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        this.materiales.put("yellowcar", new Material(new float []{0.91f,0.84f,0.0f,1.0f},new float []{0.83f,0.82f,0.0f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        this.materiales.put("blackcar", new Material(new float []{0.0f,0.0f,0.0f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));	
        
        
        //man
        
        this.materiales.put("faceman", new Material(new float []{0.86f,0.7f,0.53f,1.0f},new float []{0.77f,0.31f,0.47f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        this.materiales.put("jeanman", new Material(new float []{0.0f,0.07f,0.78f,1.0f},new float []{0.0f,0.07f,0.78f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        this.materiales.put("tman", new Material(new float []{0.39f,0.0f,0.0f,1.0f},new float []{0.53f,0.0f,0.0f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));

        //woman
        this.materiales.put("twoman", new Material(new float []{0.46f,0.0f,0.35f,1.0f},new float []{0.53f,0.0f,0.24f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));
        this.materiales.put("ttwoman", new Material(new float []{0.48f,0.03f,0.94f,1.0f},new float []{0.19f,0.01f,1.0f,1.0f},new float []{0f,0f,0f,1.0f},0f,gl));
        
        //piso
          
        this.materiales.put("piso", new Material(new float []{0.14f,0.1f,0.0215f,1.0f},new float []{0.3f,0.17f,0.07568f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));	
        this.materiales.put("piso1", new Material(new float []{0.09f,0.1f,0.1f,1.0f},new float []{0.22f,0.23f,0.25f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));	
        this.materiales.put("piso2", new Material(new float []{0.09f,0.1f,0.1f,1.0f},new float []{0.06f,0.05f,0.05f,1.0f},new float []{0.0f,0.0f,0.0f,1.0f},0.0f,gl));	
        
        //faromagenta
        this.materiales.put("fmagenta", new Material(new float []{0.69f,0.0f,0.75f,1.0f},new float []{0.74f,0.0f,0.71f,1.0f},new float []{0.72f,0.0f,0.74f,1.0f},128f,gl));	
        
        this.materiales.put("fcyan", new Material(new float []{0.0f,0.61f,0.6f,1.0f},new float []{0.0f,0.78f,0.79f,1.0f},new float []{0.0f,0.82f,0.82f,1.0f},128f,gl));	
        
         this.materiales.put("fwhite", new Material(new float []{0.89f,0.91f,0.91f,1.0f},new float []{0.91f,0.94f,0.86f,1.0f},new float []{0.91f,0.89f,0.95f,1.0f},76f,gl));	
         
          
         try
        {
            Texture arbol=TextureIO.newTexture(new File("arbol.png"),false);
            this.texturas.put("arbol", arbol);
            arbol.disable();
            
            Texture stone_slab_side=TextureIO.newTexture(new File("stone_slab_side.png"),false);
            this.texturas.put("stone_slab_side", stone_slab_side);
            stone_slab_side.disable();
            
            Texture cobblestone_mossy=TextureIO.newTexture(new File("cobblestone_mossy.png"),false);
            this.texturas.put("cobblestone_mossy", cobblestone_mossy);
            cobblestone_mossy.disable();
            
            Texture farmland_dry=TextureIO.newTexture(new File("farmland_dry.png"),false);
            this.texturas.put("farmland_dry", farmland_dry);
            farmland_dry.disable();
            
            Texture stone_diorite_smooth=TextureIO.newTexture(new File("stone_diorite_smooth.png"),false);
            this.texturas.put("stone_diorite_smooth", stone_diorite_smooth);
            stone_diorite_smooth.disable();
           
            Texture glass_magenta=TextureIO.newTexture(new File("glass_magenta.png"),false);
            this.texturas.put("glass_magenta", glass_magenta);
            glass_magenta.disable();
            
            Texture cobblestone=TextureIO.newTexture(new File("cobblestone.png"),false);
            this.texturas.put("cobblestone", cobblestone);
            cobblestone.disable();
             
            Texture cactus_top=TextureIO.newTexture(new File("cactus_top.png"),false);
            this.texturas.put("cactus_top", cactus_top);
            cactus_top.disable();
            
            
             Texture wool_colored_red=TextureIO.newTexture(new File("wool_colored_red.png"),false);
            this.texturas.put("wool_colored_red", wool_colored_red);
            wool_colored_red.disable();
            
            
            Texture stone_granite_smooth=TextureIO.newTexture(new File("stone_granite_smooth.png"),false);
            this.texturas.put("stone_granite_smooth", stone_granite_smooth);
            stone_granite_smooth.disable();
            
                    
                    
            Texture wool_colored_blue=TextureIO.newTexture(new File("wool_colored_blue.png"),false);
            this.texturas.put("wool_colored_blue", wool_colored_blue);
            wool_colored_blue.disable();
            
            
            
            Texture wool_colored_magenta=TextureIO.newTexture(new File("wool_colored_magenta.png"),false);
            this.texturas.put("wool_colored_magenta", wool_colored_magenta);
            wool_colored_magenta.disable();
            
             Texture flower_pot=TextureIO.newTexture(new File("flower_pot.png"),false);
            this.texturas.put("flower_pot", flower_pot);
            flower_pot.disable();
            
            
            
            Texture lapis_block=TextureIO.newTexture(new File("lapis_block.png"),false);
            this.texturas.put("lapis_block", lapis_block);
            lapis_block.disable();
            
             Texture bed_feet_top=TextureIO.newTexture(new File("bed_feet_top.png"),false);
            this.texturas.put("bed_feet_top", bed_feet_top);
            bed_feet_top.disable();
            
            
            
             Texture gold_block=TextureIO.newTexture(new File("gold_block.png"),false);
            this.texturas.put("gold_block", gold_block);
            gold_block.disable();
            
//            
             Texture ashcanyon_bk=TextureIO.newTexture(new File("ashcanyon_bk.jpg"),false);
            this.texturas.put("ashcanyon_bk", ashcanyon_bk);
            ashcanyon_bk.disable();
            
            
            
             Texture sakyboxday=TextureIO.newTexture(new File("sakyboxday.jpg"),false);
            this.texturas.put("sakyboxday", sakyboxday);
            sakyboxday.disable();
            
             
             Texture tnt_side=TextureIO.newTexture(new File("tnt_side.png"),false);
            this.texturas.put("tnt_side", tnt_side);
            tnt_side.disable();
            
            
             Texture mala=TextureIO.newTexture(new File("mala.jpg"),false);
            this.texturas.put("mala", mala);
            mala.disable();
            
            
        }catch(IOException e)
        {
            System.out.println("error al cargar el fichero de textura");
        }
         
         
        try{ 
             this.audios.put("audio_pasos", new Audio("C:\\Users\\Martin\\Desktop\\Ona_Jativa_Proyecto\\material_extra\\pasos.wav"));
             this.audios.put("audio_diamantes", new Audio("C:\\Users\\Martin\\Desktop\\Ona_Jativa_Proyecto\\material_extra\\diamantes.wav"));
             this.audios.put("winner", new Audio("C:\\Users\\Martin\\Desktop\\Ona_Jativa_Proyecto\\material_extra\\winner.wav"));
             this.audios.put("over", new Audio("C:\\Users\\Martin\\Desktop\\Ona_Jativa_Proyecto\\material_extra\\over.wav"));
             this.audios.put("disparo", new Audio("C:\\Users\\Martin\\Desktop\\Ona_Jativa_Proyecto\\material_extra\\disparo.wav"));
             this.audios.put("espacio", new Audio("C:\\Users\\Martin\\Desktop\\Ona_Jativa_Proyecto\\material_extra\\espacio.wav"));
             
            
        }catch(Exception ex){
         
              System.err.println("error al cargar sonido");
        }
        
        escena=new Scene(0.0f,0.0f,0.0f,       1, 1,1,                  0.0f, 0.0f, 0.0f, gl);
         
         
       
        
        keyboard=new Keyboard(escena.martin,gl);
        mouse=new Mouse(escena.martin);
        
        drawable.addKeyListener(keyboard);
        drawable.addMouseMotionListener(mouse);
        
        // Enable VSync
        gl.setSwapInterval(1);

        // Setup the drawing area and shading mode
         
       
         gl.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
        //ojooooooooooooooooooooooooooooooooooooooooooooooooooooooooo
       
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        //gl.glOrtho(-10, 10, -10, 10, -10, 10);
        glu.gluPerspective(45.0f, h, 1.0, 300.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }

    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
        
//        if(escena.sol.x>0 & escena.sol.y>0   || escena.sol.x<0 & escena.sol.y>0)
//         {
//             gl.glClearColor(   0.137f , 0.764f ,  1.0f,0);
//         }
//       
//         if(escena.sol.x>0 & escena.sol.y<0   || escena.sol.x<0 & escena.sol.y<0)
//         {
//              gl.glClearColor(   0.0f ,  0.0f  , 0.0f, 0.0f);
//         }

 
        

        
        if(escena.martin.camera1==true)
        {
            glu.gluLookAt(escena.martin.x,escena.martin.y,escena.martin.z,(escena.martin.x+Math.cos(escena.martin.angley)),(escena.martin.y+Math.sin(escena.martin.anglex)),(escena.martin.z+Math.sin(escena.martin.angley)), 0, 1, 0);
        }
          if(escena.martin.camera2==true)
        {
            glu.gluLookAt(escena.martin.x,50,escena.martin.z,(escena.martin.x+Math.cos(escena.martin.angley)),(escena.martin.y+Math.sin(escena.martin.anglex)),(escena.martin.z+Math.sin(escena.martin.angley)), 0, 1, 0);
        }
           if(escena.martin.camera3==true)
        {
            glu.gluLookAt(escena.martin.x,30,escena.martin.z+30,escena.martin.x,(escena.martin.y),(escena.martin.z), 0, 1, 0);
        }
          
        
         escena.display();
        
         
       
         timer--;
      
         if(timer==0)
         {
             resultado(false);
         }
       

        // Flush all drawing operations to the graphics card
        gl.glFlush();
       
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    
    
    public static void resultado(boolean estado)
   {
        
        Icon fondo = new ImageIcon("winner.jpg");
        Icon over = new ImageIcon("over.jpg");
        final Frame frame_winner = new Frame("!!!!!!!! MEMENTO MORI !!!!!!!!!!");
        frame_winner.setLayout(null);
        frame_winner.setSize(500, 500);
        
       
        
        if(estado==true)
        {
            Ona_Jativa_Proyecto.audios.get("espacio").Stop();
             Ona_Jativa_Proyecto.audios.get("winner").Play();
            
            JLabel label_winner=new JLabel(fondo);
            label_winner.setBounds(0, 0, 500,500);
            JLabel label_winner_exit=new JLabel("<HTML><FONT FACE=\"courier new\" SIZE=6 COLOR=\"black\">¡WINNERRRRRRRRRRRRRRRRRRRRRRRR!</FONT></HTML>");
            label_winner_exit.setBounds(20,0, 500, 500);
            frame_winner.add(label_winner_exit);
            frame_winner.add(label_winner);
            
        
        }else
        {
            Ona_Jativa_Proyecto.audios.get("espacio").Stop();
             Ona_Jativa_Proyecto.audios.get("over").Play();
            JLabel label_winner=new JLabel(over);
            label_winner.setBounds(0, 0, 500,500);
            frame_winner.add(label_winner);
        
        }
 
        
         frame_winner.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                    // Run this on another thread than the AWT event queue to
                    // make sure the call to Animator.stop() completes before
                    // exiting
                    new Thread(new Runnable() {
                        public void run() {
                        System.exit(0);
                        }
                    }).start();
                    }
        });
        
 
        frame_winner.setLocationRelativeTo(null);
        frame_winner.setVisible(true);
        
   }
    


   
}

