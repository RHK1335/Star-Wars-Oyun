/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package star.wars;

/**
 *
 * @author RHK
 */
public class Darthvader extends Karakter {
private String kapı;
public int op=0;

    
    public String getKapı() {
        return kapı;
    }

    public void setKapı(String kapı) {
        this.kapı = kapı;
    }
    public void kordinatbul()
    {
        if(this.kapı.equalsIgnoreCase("a"))
        {
            super.setX(0);
            super.setY(5);
        }
            if(this.kapı.equalsIgnoreCase("b"))
            {
                super.setX(4);
            super.setY(0);
            }
                if(this.kapı.equalsIgnoreCase("c"))
                    {
            super.setX(12);
            super.setY(0);
        }
                    if(this.kapı.equalsIgnoreCase("d"))
                        {
            super.setX(13);
            super.setY(5);
        }
                        if(this.kapı.equalsIgnoreCase("e"))
                            {
            super.setX(4);
            super.setY(10);
        }
    }
@Override
    public void enkısayol(String isim , int x1 , int y1 , int sıra)
    {
        if(op==0)
        {
           if(super.getX()<x1 ||super.getX()>x1)
        {
            if(super.getX()<x1)
            {
                super.setX(super.getX()+1);
            }else
            {
                super.setX(super.getX()-1);
            }
            
        }else if(super.getY()<y1 ||super.getY()>y1)
        {
            if(super.getY()<y1)
            {
                super.setY(super.getY()+1);
            }else
            {
                super.setY(super.getY()-1);
            }
        }
           op=1;
         
        }else
        {
            
            if(super.getY()<y1 ||super.getY()>y1)
        {
            if(super.getY()<y1)
            {
                super.setY(super.getY()+1);
            }else
            {
                super.setY(super.getY()-1);
            }
        }else if(super.getX()<x1 ||super.getX()>x1)
        {
            if(super.getX()<x1)
            {
                super.setX(super.getX()+1);
            }else
            {
                super.setX(super.getX()-1);
            }
            
        }
        
        op=0;
            
        }
        Lokasyon.kötüx[sıra]=super.getX();
        Lokasyon.kötüy[sıra]=super.getY();
        
        
    }
    public void kötüyer(int sıra)
    {
        Lokasyon.kötüx[sıra]=super.getX();
        Lokasyon.kötüy[sıra]=super.getY();
    }
    
    
}