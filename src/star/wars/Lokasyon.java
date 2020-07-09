/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.wars;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.*;

/**
 *
 * @author RHK
 */
public class Lokasyon extends JPanel{
    
    public static Integer[][] matris = new Integer[11][14];
    public static Integer[] kötüx = new Integer[10];
    public static Integer[] kötüy = new Integer[10];
    public static int kötüadam ;
    public static int iyiadamx=6;
    public static int iyiadamy=5, trigger=0;
    public static int can=0;
     public static int kazandı=2;
    public BufferedImage img,img1,img2,img3,img4,img5,img6,img7,img8;
    public static String iyiisim;
    public File konum =new File("darth.png");
    public File konum1 =new File("luke.png");
    public File konum2 =new File("yoda.png");
    public File konum3 =new File("bg.png");
    public File konum4 =new File("gg.png");
    public File konum5 =new File("kalp.png");
    public File konum6 =new File("duvar.jpg");
    public File konum7 =new File("yol.jpg");
    public File konum8 =new File("kupa.png");
   
    
   

    public static Integer[] getKötüx() {
        return kötüx;
    }

    public static void setKötüx(Integer[] kötüx) {
        Lokasyon.kötüx = kötüx;
    }

    public static Integer[] getKötüy() {
        return kötüy;
    }

    public static void setKötüy(Integer[] kötüy) {
        Lokasyon.kötüy = kötüy;
    }

    public static int getKötüadam() {
        return kötüadam;
    }

    public static void setKötüadam(int kötüadam) {
        Lokasyon.kötüadam = kötüadam;
    }

    public static int getIyiadamx() {
        return iyiadamx;
    }

    public static void setIyiadamx(int iyiadamx) {
        Lokasyon.iyiadamx = iyiadamx;
    }

    public static int getIyiadamy() {
        return iyiadamy;
    }

    public static void setIyiadamy(int iyiadamy) {
        Lokasyon.iyiadamy = iyiadamy;
    }
    
    @Override
    public void paintComponent(Graphics kare)
    {
        if(kazandı==2)
        {
            
        
          int i, j, sayy = 0;
        super.paintComponent(kare);
        
        
        JLabel label = new JLabel();  
         
        try {
            img = ImageIO.read(konum);
            img1 = ImageIO.read(konum1);
            img2 = ImageIO.read(konum2);
            img3 = ImageIO.read(konum3);
            img4 = ImageIO.read(konum4);
            img5 = ImageIO.read(konum5);
            img6 = ImageIO.read(konum6);
            img7 = ImageIO.read(konum7);
            img8 = ImageIO.read(konum8);
        } catch (IOException ex) {
           
        }
        
          
          kare.setColor(Color.BLACK);
          for(i=0;i<14;i++)
          {
              for(j=0;j<11;j++)
              {
                  if(matris[i][j]==0)
                  {
                      kare.drawImage( img6 ,i*90,j*90,90,90,null);
                  }else
                  {
                      kare.drawImage( img7 ,i*90,j*90,90,90,null);
                  }
                 
              }
          }
          if(iyiisim.equalsIgnoreCase("luke"))
          {
              kare.drawImage( img1 ,iyiadamx*90,iyiadamy*90,90,90,null);
          }
           if(iyiisim.equalsIgnoreCase("yoda"))
          {
              kare.drawImage( img2 ,iyiadamx*90,iyiadamy*90,90,90,null);
          }
            
            if (kötüadam==1)
            {
               kare.setColor(Color.GREEN); 
               kare.drawImage( img ,kötüx[0]*90,kötüy[0]*90,90,90,null);
            }
            if(kötüadam==2)
            {
               kare.setColor(Color.GREEN); 
               kare.drawImage( img ,kötüx[0]*90,kötüy[0]*90,90,90,null);
               kare.setColor(Color.GREEN); 
               kare.drawImage( img ,kötüx[1]*90,kötüy[1]*90,90,90,null);
            }
            
            
            
            
            kare.setColor(Color.RED);
            if(can==1)
            {
                kare.drawImage(img5, 1400, 200,100,100,null);
                
               
                
            }
            if(can==2)
            {
                kare.drawImage(img5, 1400, 200,100,100,null);
                kare.drawImage(img5, 1500, 200,100,100,null);
                
            }
            if(can==3)
            {
                kare.drawImage(img5, 1400, 200,100,100,null);
                kare.drawImage(img5, 1500, 200,100,100,null);
                kare.drawImage(img5, 1600, 200,100,100,null);
            }
            if(can==4)
            {
                kare.drawImage(img5, 1400, 200,100,100,null);
                kare.drawImage(img5, 1500, 200,100,100,null);
                kare.drawImage(img5, 1600, 200,100,100,null);
                kare.drawImage(img5, 1400, 300,100,100,null);
                
                
            }
             if(can==5)
            {
                kare.drawImage(img5, 1400, 200,100,100,null);
                kare.drawImage(img5, 1500, 200,100,100,null);
                kare.drawImage(img5, 1600, 200,100,100,null);
                kare.drawImage(img5, 1400, 300,100,100,null);
                kare.drawImage(img5, 1500, 300,100,100,null);
                
            }
            if(can==6)
            {
                kare.drawImage(img5, 1400, 200,100,100,null);
                kare.drawImage(img5, 1500, 200,100,100,null);
                kare.drawImage(img5, 1600, 200,100,100,null);
                kare.drawImage(img5, 1400, 300,100,100,null);
                kare.drawImage(img5, 1500, 300,100,100,null);
                kare.drawImage(img5, 1600, 300,100,100,null);
            }
            kare.drawImage(img8, 13*90,9*90,90,90,null);
            
   }else if(kazandı==0)
   {
       kare.drawImage(img3, 460, 20,950,1000,null);
       
   }else{
       kare.drawImage(img4, 300, 50,1239,1019,null);
   }
    
    
    
    
    
    
    }

  
    
}
