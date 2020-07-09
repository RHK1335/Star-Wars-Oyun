


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
public class Stormtrooper extends Karakter {
    private String kapı;

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
}



