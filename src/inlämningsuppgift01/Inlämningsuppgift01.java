
package inlämningsuppgift01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * Skapar en klass Inlämningsuppgift01 som inte är statisk som main metoden längre ner
 */
public class Inlämningsuppgift01  {
/**
 * En protected Konstruktor är ett exempel på inkapsling
 */
    protected Inlämningsuppgift01(){
    
      
      /**
       * List<Ifoder> skapas som i sin tur får nya referensvariabler till objekterna 
       * i subklasserna Hund, Katt och Orm. Dessa läggs in i Listan med metoden 
       * add(new klass(namn, vikt, boolean)); I while loopen så får Dietcoached en 
       * Dialogruta där hen får skriva in djurets namn. Namnet jämförs nerifrån
       * och uppåt i arvshierarkin med varje djur i varje subklass med metoden
       * getName. Detta är Dynamisk Bindning. Skrivs namnet fel (null) får coachen 
       * skriva om det.När det rätta namnet har hittats (oavsett om det är i gemener 
       * eller versaler så anropar gränssnittet ifo den respektiva metoden 
       * gefoder i subklassen som utförs. 
       * Resultatet är en polymorfism. När den utförs för klass Hund sker polymorfism.
       * När det utförs för subklassen Katt så sker Polymorfism. Händer det för
       * subklassen Orm så sker också polymorfism.Dietcoachen får en Dialogruta
       * som visar Djurets namn, antal gram foder och typ av djurfoder.
       * Om ett sjätte djur läggs in i Listan t.ex.ifo.add(new Orm("Sixten", 2500, true)); 
       * skulle två djur ha samma namn. Utskriften blir då antal gram foder 
       * och typ foder för varje djur. 
       */
       List<Ifoder> ifo = new ArrayList<>();   
       ifo.add(new Hund("Sixten", 5000, true));
       ifo.add(new Hund("Dogge", 10000.0, true));
       ifo.add(new Katt("Venus", 5000.0, true));
       ifo.add(new Katt("Ove", 3000.0, true));
       ifo.add(new Orm("Hypno", 1000.0, true));
      
        boolean again = true;
        while (again){
            String s = JOptionPane.showInputDialog(" Vilket djur ska få mat? \nAnge ett namn.");
            if (s == null)
                break;
           for(Ifoder a: ifo)
           if(s.equalsIgnoreCase(a.getName())) // Polymorfism - samma metod anropas men för en separat klass och annat objekt i varje loop
               a.gefoder(); // Polymorfism - samma metod anropas men utförs bara på aktuellt object som hittas
           
           
        }
       
    }
    /**
     * Main metoden som är public static void
     * @param args 
     */
    
    public static void main(String[] args) {
     /**
      * Skapar ett objekt av klassen Inlämingsuppgift01
      */   
     Inlämningsuppgift01 in = new Inlämningsuppgift01();
    }
    
}
