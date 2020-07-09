package star.wars;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFrame;

public class StarWars implements KeyListener {

    public static String btus;
    public static int tik = 0, tik1 = 0,bir=0;
    public static int sayac = 0, sayac2 = 0, karaktersayi = 0, i = 0, c = 0;
    public static int darth = 0, luke = 0, kylo = 0, yoda = 0, storm = 0, badguycounter = 0;
    public static ArrayList<String> girdiler = new ArrayList<String>();
    public static String[] girdilerkapı = new String[100];
    public static String[] girdilerkarakter = new String[100];
    public static String[] iyikarakter = new String[1];
    public static Lokasyon kareh = new Lokasyon();
    public static StarWars tuş = new StarWars();
    public static Darthvader[] darthlist = new Darthvader[100];
    public static Lukeskywalker[] lukelist = new Lukeskywalker[100];
    public static Masteryoda[] yodalist = new Masteryoda[100];
    public static Stormtrooper[] stormlist = new Stormtrooper[100];
    public static Kyloren[] kylolist = new Kyloren[100];
    public static Integer[][] matris = new Integer[14][11];
    public static JFrame tablo = new JFrame();
    public static String[] kötükarakter = new String[6];

    @Override
    public void keyTyped(KeyEvent ke) {

    }

    @Override
    public void keyPressed(KeyEvent ke) {
        if ("Right".equalsIgnoreCase(KeyEvent.getKeyText(ke.getKeyCode()))) {
            
            btus = "sag";
        }
        if ("Left".equalsIgnoreCase(KeyEvent.getKeyText(ke.getKeyCode()))) {
            btus = "sol";
        }
        if ("Up".equalsIgnoreCase(KeyEvent.getKeyText(ke.getKeyCode()))) {
            btus = "yukarı";
        }
        if ("Down".equalsIgnoreCase(KeyEvent.getKeyText(ke.getKeyCode()))) {
            btus = "asagı";
        }
        if ("Escape".equalsIgnoreCase(KeyEvent.getKeyText(ke.getKeyCode()))) {
            btus = "esc";
        }

       
        Lokasyon.trigger=1;
        tablo.setContentPane(kareh);
        tablo.setVisible(true);
       
        if (btus.equalsIgnoreCase("esc") != true) {
           
            if (iyikarakter[0].equalsIgnoreCase("luke")) {
                       
                if(bir!=1) 
               {
                   Lokasyon.can = 3;
               }
                if (btus.equalsIgnoreCase("sag")) {
                   
                    if (lukelist[0].getX() != 13) {
                        if (matris[(lukelist[0].getX() + 1)][lukelist[0].getY()] != 0) {
                            lukelist[0].setX(lukelist[0].getX() + 1);

                        } else {
                           
                        }
                    }

                }
                if (btus.equalsIgnoreCase("sol")) {
                    if (lukelist[0].getX() != 0) {
                        if (matris[(lukelist[0].getX() - 1)][lukelist[0].getY()] != 0) {
                            lukelist[0].setX(lukelist[0].getX() - 1);

                        } else {
                           
                        }
                    }
                }
                if (btus.equalsIgnoreCase("yukarı")) {
                    if (lukelist[0].getY() != 0) {
                        if (matris[(lukelist[0].getX())][(lukelist[0].getY() - 1)] != 0) {
                            lukelist[0].setY(lukelist[0].getY() - 1);

                        } else {
                           
                        }
                    }
                }
                if (btus.equalsIgnoreCase("asagı")) {
                    if (lukelist[0].getY() != 10) {
                        if (matris[lukelist[0].getX()][(lukelist[0].getY() + 1)] != 0) {
                            lukelist[0].setY(lukelist[0].getY() + 1);

                        } else {
                        
                        }
                    }
                }
                Lokasyon.iyiadamx = lukelist[0].getX();
                Lokasyon.iyiadamy = lukelist[0].getY();
                
                
                
                if (kötükarakter[0].equalsIgnoreCase("darth") && badguycounter==1) {
                    Lokasyon.kötüadam = badguycounter;
                    darthlist[0].enkısayol("luke", lukelist[0].getX(), lukelist[0].getY(), 0);
                }
                
                
         if   (badguycounter==1)
         {
             
         
if((Lokasyon.iyiadamx==Lokasyon.kötüx[0] && Lokasyon.iyiadamy==Lokasyon.kötüy[0]))
{
    Lokasyon.can--;
    darthlist[0].kordinatbul();
    if(iyikarakter[0].equalsIgnoreCase("luke"))
    {
        lukelist[0].setX(6);
                lukelist[0].setY(5);
    }else
    {
        yodalist[0].setX(6);
                yodalist[0].setY(5);
    }   
}
         }
if(badguycounter==2)
    {
     if (kötükarakter[0].equalsIgnoreCase("darth") && kötükarakter[1].equalsIgnoreCase("darth")) {
                    Lokasyon.kötüadam = badguycounter;
                    darthlist[0].enkısayol("luke", lukelist[0].getX(), lukelist[0].getY(), 0);
                    darthlist[1].enkısayol("luke", lukelist[0].getX(), lukelist[0].getY(), 1);
if((Lokasyon.iyiadamx==Lokasyon.kötüx[0] && Lokasyon.iyiadamy==Lokasyon.kötüy[0]) || (Lokasyon.iyiadamx==Lokasyon.kötüx[1] && Lokasyon.iyiadamy==Lokasyon.kötüy[1]) )
{
    Lokasyon.can--;
    darthlist[0].kordinatbul();
    darthlist[1].kordinatbul();
    if(iyikarakter[0].equalsIgnoreCase("luke"))
    {
        lukelist[0].setX(6);
                lukelist[0].setY(5);
    }else
    {
        yodalist[0].setX(6);
                yodalist[0].setY(5);
    }   
}   
    }}

if(badguycounter==2)
{
   if (kötükarakter[0].equalsIgnoreCase("darth") && kötükarakter[1].equalsIgnoreCase("darth"))
{
    Lokasyon.kötüadam = badguycounter;
    darthlist[0].kötüyer(0);
      darthlist[1].kötüyer(1);
} 
}
if (kötükarakter[0].equalsIgnoreCase("darth") && badguycounter==1)
{
    Lokasyon.kötüadam = badguycounter;
    darthlist[0].kötüyer(0);
}

                
              
                  
                Lokasyon.iyiadamx = lukelist[0].getX();
                Lokasyon.iyiadamy = lukelist[0].getY();
                tablo.setContentPane(kareh);
                tablo.setVisible(true);
                
            } else 
            
            {
                
               if(bir!=1) 
               {
                   Lokasyon.can = 6;
               }
                if (btus.equalsIgnoreCase("sag")) {
                   
                    if (yodalist[0].getX() != 13) {
                        if (matris[(yodalist[0].getX() + 1)][yodalist[0].getY()] != 0) {
                            yodalist[0].setX(yodalist[0].getX() + 1);

                        } else {
                         
                        }
                    }

                }
                if (btus.equalsIgnoreCase("sol")) {
                    if (yodalist[0].getX() != 0) {
                        if (matris[(yodalist[0].getX() - 1)][yodalist[0].getY()] != 0) {
                            yodalist[0].setX(yodalist[0].getX() - 1);

                        } else {
                        
                        }
                    }
                }
                if (btus.equalsIgnoreCase("yukarı")) {
                    if (yodalist[0].getY() != 0) {
                        if (matris[(yodalist[0].getX())][(yodalist[0].getY() - 1)] != 0) {
                            yodalist[0].setY(yodalist[0].getY() - 1);

                        } else {
                          
                        }
                    }
                }
                if (btus.equalsIgnoreCase("asagı")) {
                    if (yodalist[0].getY() != 10) {
                        if (matris[yodalist[0].getX()][(yodalist[0].getY() + 1)] != 0) {
                            yodalist[0].setY(yodalist[0].getY() + 1);

                        } else {
                          
                        }
                    }
                }
              
                 Lokasyon.iyiadamx = yodalist[0].getX();
                Lokasyon.iyiadamy = yodalist[0].getY();
                
                
                
                
                if (kötükarakter[0].equalsIgnoreCase("darth") && badguycounter==1) {
                    Lokasyon.kötüadam = badguycounter;
                    darthlist[0].enkısayol("yoda", yodalist[0].getX(), yodalist[0].getY(), 0);

                }
                if(Lokasyon.iyiadamx==Lokasyon.kötüx[0] && Lokasyon.iyiadamy==Lokasyon.kötüy[0]  && badguycounter==1)
{
    Lokasyon.can--;
    darthlist[0].kordinatbul();
    if(iyikarakter[0].equalsIgnoreCase("luke"))
    {
        lukelist[0].setX(6);
                lukelist[0].setY(5);
    }else
    {
        yodalist[0].setX(6);
                yodalist[0].setY(5);
    }
}
   if(badguycounter==2)
    {
     if (kötükarakter[0].equalsIgnoreCase("darth") && kötükarakter[1].equalsIgnoreCase("darth")) {
                    Lokasyon.kötüadam = badguycounter;
                    darthlist[0].enkısayol("yoda", yodalist[0].getX(), yodalist[0].getY(), 0);
                    darthlist[1].enkısayol("yoda", yodalist[0].getX(), yodalist[0].getY(), 1);
if((Lokasyon.iyiadamx==Lokasyon.kötüx[0] && Lokasyon.iyiadamy==Lokasyon.kötüy[0]) || (Lokasyon.iyiadamx==Lokasyon.kötüx[1] && Lokasyon.iyiadamy==Lokasyon.kötüy[1]) )
{
    Lokasyon.can--;
    darthlist[0].kordinatbul();
    darthlist[1].kordinatbul();
    if(iyikarakter[0].equalsIgnoreCase("luke"))
    {
        lukelist[0].setX(6);
                lukelist[0].setY(5);
    }else
    {
        yodalist[0].setX(6);
                yodalist[0].setY(5);
    }   
}   
    }}             
                
                
                
                
                
                
                if (kötükarakter[0].equalsIgnoreCase("darth") && badguycounter==1)
{
    Lokasyon.kötüadam = badguycounter;
    darthlist[0].kötüyer(0);
}
                if(badguycounter==2)
{
   if (kötükarakter[0].equalsIgnoreCase("darth") && kötükarakter[1].equalsIgnoreCase("darth"))
{
    Lokasyon.kötüadam = badguycounter;
    darthlist[0].kötüyer(0);
      darthlist[1].kötüyer(1);
} 
}
                Lokasyon.iyiadamx = yodalist[0].getX();
                Lokasyon.iyiadamy = yodalist[0].getY();
               
                tablo.setContentPane(kareh);
                tablo.setVisible(true);
            }

        } else {
            
            System.exit(0);
        }
        bir=1;
if(Lokasyon.can==0)
{ Lokasyon.kazandı=0;
    
}
if(Lokasyon.iyiadamx==13 && Lokasyon.iyiadamy==9)
{
    Lokasyon.kazandı=1;
}
    }
        

    @Override
    public void keyReleased(KeyEvent ke) {

    }

    public static void main(String[] args) {

        tablo.setSize(1920, 1080);
        tablo.add(kareh);
        tablo.addKeyListener(tuş);
        tablo.setContentPane(kareh);
        tablo.setVisible(true);
       

        btus = "hakan";

        try {

            FileReader fr = new FileReader("Harita.txt");
            BufferedReader br = new BufferedReader(fr);
            String anlıksatır;

            while ((anlıksatır = br.readLine()) != null) {
                girdiler.add(anlıksatır);
               

                i++;

            }

        } catch (IOException e) {

            e.printStackTrace();

        }
        for (i = 0; i < girdiler.size(); i++) {
            if (Character.isDigit(girdiler.get(i).charAt(0)) == false) {
                String[] girdilerh = girdiler.get(i).split(",");

                String[] girdilerh1 = girdilerh[0].split(":");
                if (girdilerh[0].equalsIgnoreCase("Karakter:LukeSkywalker") == false && girdilerh[0].equalsIgnoreCase("Karakter:MasterYoda") == false) {
                    String[] girdilerh12 = girdilerh[1].split(":");
                    girdilerkapı[i] = girdilerh12[1];
                }
                girdilerkarakter[i] = girdilerh1[1];

                karaktersayi++;

            }
            if (Character.isDigit(girdiler.get(i).charAt(0)) == true) {
                String[] girdilerh = girdiler.get(i).split("\t");
                for (sayac = 0; sayac < 14; sayac++) {

                    matris[sayac][sayac2] = Integer.parseInt(girdilerh[sayac]);
                }
                sayac2++;
            }

        }
        

       

        for (i = 0; i < karaktersayi; i++) {
           
            if (girdilerkarakter[i].equalsIgnoreCase("DarthVader")) {
                kötükarakter[badguycounter] = "darth";
                darth++;
                badguycounter++;
            }
            if (girdilerkarakter[i].equalsIgnoreCase("KyloRen")) {
                kötükarakter[badguycounter] = "kylo";
                kylo++;
                badguycounter++;
            }
            if (girdilerkarakter[i].equalsIgnoreCase("Stormtrooper")) {
                kötükarakter[badguycounter] = "storm";
                storm++;
                badguycounter++;
            }
            if (girdilerkarakter[i].equalsIgnoreCase("MasterYoda")) {
                yoda++;
            }
            if (girdilerkarakter[i].equalsIgnoreCase("LukeSkywalker")) {
                luke++;
            }
        }

        darth = 0;
        luke = 0;
        kylo = 0;
        yoda = 0;

        storm = 0;

        for (i = 0; i < karaktersayi; i++) {

            if (girdilerkarakter[i].equalsIgnoreCase("DarthVader")) {
                darthlist[darth] = new Darthvader();

                darthlist[darth].setKapı(girdilerkapı[i]);
                darthlist[darth].kordinatbul();
                darth++;
            }
            if (girdilerkarakter[i].equalsIgnoreCase("KyloRen")) {
                kylolist[kylo] = new Kyloren();

                kylolist[kylo].setKapı(girdilerkapı[i]);
                kylolist[kylo].kordinatbul();
                kylo++;

            }
            if (girdilerkarakter[i].equalsIgnoreCase("Stormtrooper")) {
                stormlist[storm] = new Stormtrooper();
                stormlist[storm].setKapı(girdilerkapı[i]);
                stormlist[storm].kordinatbul();
                storm++;

            }
            if (girdilerkarakter[i].equalsIgnoreCase("MasterYoda")) {
                yodalist[yoda] = new Masteryoda();
                iyikarakter[0] = "yoda";
                yodalist[0].setX(6);
                yodalist[0].setY(5);
                yoda++;

            }
            if (girdilerkarakter[i].equalsIgnoreCase("LukeSkywalker")) {
                lukelist[luke] = new Lukeskywalker();
                iyikarakter[0] = "luke";
                lukelist[0].setX(6);
                lukelist[0].setY(5);
                luke++;
            }
            Lokasyon.matris = matris;

            if (darth != 0) {

            }
            

        }
if (kötükarakter[0].equalsIgnoreCase("darth"))
{
    Lokasyon.kötüadam = badguycounter;
    darthlist[0].kötüyer(0);
}
if(badguycounter==2)
{
   if (kötükarakter[0].equalsIgnoreCase("darth") && kötükarakter[1].equalsIgnoreCase("darth"))
{
    Lokasyon.kötüadam = badguycounter;
    darthlist[0].kötüyer(0);
      darthlist[1].kötüyer(1);
} 
}
if(luke==0)
{
    Lokasyon.can=6;
                Lokasyon.iyiisim="yoda";
}
else{
    Lokasyon.can=3;
    Lokasyon.iyiisim="luke";
}
       
tablo.setContentPane(kareh);
        tablo.setVisible(true);
    }
}


