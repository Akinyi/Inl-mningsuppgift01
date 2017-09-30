/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
    
      // LIST<Ifoder> ifo SKAPAS SOM I SIN TUR FÅR
      // NYA REFERENSVARIABLER TILL SUBKLASSERNA HUND, KATT OCH ORM. DESSA LÄGGS
      // IN I LISTAN MED METODEN add(new klass(namn, vikt, boolean));
      // I WHILE LOOPEN SÅ FÅR DIETCOACHEN EN DIALOGRUTA DÄR HEN FÅR SKRIVA IN 
      // DJURETS NAMN. NAMNET JÄMFÖRS NERIFRÅN OCH UPPÅT I ARVSHIERARKIN MED 
      // VARJE DJUR I VARJE SUBKLASS MED METODEN getName.  DETTA ÄR POLYMORFISM. 
      // SKRIVS NAMNET FEL SÅ FÅR COACHEN SKRIVA OM DET. NÄR DET RÄTTA 
      // NAMNET HAR HITTATS SÅ ANROPAR GRÄNSSNITTET ifo DEN RESPEKTIVA METODEN 
      // gefoder I SUBKLASS.HÄR SKER DYNAMISK BINDNING.
      // DYNAMISK BINDNING - VARJE GÅNG METOD gefoder ANROPAS SÅ SÖKER DEN NERIFRÅN 
      // OCH UPPÅT I SUBKLASSERNA TILLS DEN HITTAR DEN RÄTTA METODEN SOM DÅ UTFÖRS.
      // DIETCOACHEN FÅR EN DIALOGRUTA DÄR DET STÅR NAMNET PÅ DJURET, ANTAL GRAM
      // FODER OCH TYP AV DJURFODER.
       List<Ifoder> ifo = new ArrayList<>();   
       ifo.add(new Hund("Sixten", 5000, true));
       ifo.add(new Hund("Dogge", 10000.0, true));
       ifo.add(new Katt("Venus", 5000.0, true));
       ifo.add(new Katt("Ove", 3000.0, true));
       ifo.add(new Orm("Hypno", 1000.0, true));
      // Om ett sjätte djur läggs in i Listan t.ex.ifo.add(new Orm("Sixten", 2500, true)); 
      // skulle två djur ha samma namn. Utskriften blir då foder för varje djur. 
      // Dietcoachen behöver då bekräfta vilket djur som ska matas.
       
        boolean again = true;
        while (again){
            String s = JOptionPane.showInputDialog(" Vilket djur ska få mat? \nAnge ett namn.");
            if (s == null)
                break;
           for(Ifoder a: ifo)
           if(s.equalsIgnoreCase(a.getName())) // Polymorfism - En ny variant av samma metod anropas
               a.gefoder(); // Polymorfism - En ny variant av samma metod anropas beroende på object som hittas
        }
       
/*
       //===================================================================
        // ALTERNATIVT JÄMFÖRELSE 
         Ifoder i1 = new Hund("Sixten", 5000.0, true);
         Ifoder i2 = new Hund("Dogge", 10000.0, true);
         Ifoder i3 = new Katt("Venus", 5000.0, true);
         Ifoder i4 = new Katt("Ove", 3000.0, true);
         Ifoder i5 = new Orm("Hypno", 1000.0, true);
         //DYNAMISK BINDNING GENOM ATT INTERFACE IFODER ANROPAR METODER FRÅN SUBKLASSERNA OCH SUPERKLASSEN
         // POLYMORFISM GENOM ATT SKAPA LIKNANDE INSTANSMETODER I SUBKLASSEN SOM ÖVERSKUGGAR METODEN I SUPERKLASSEN
        // geFODER METODEN SÖKS NERIFRÅN OCH UPPÅT I KLASSHIERARKIN
        boolean again = true;
        while (again){
            String s = JOptionPane.showInputDialog(" Vilket djur ska få mat? \nAnge ett namn.");
            if (s == null)
                break;
            switch(s){
                case "Sixten":
                    i1.gefoder();
                    break;
                case "Dogge":
                    i2.gefoder();
                    break;
                case "Venus":
                    i3.gefoder();
                    break;
                case "Ove":
                    i4.gefoder();
                    break;
                case "Hypno":
                    i5.gefoder();
                    break;
                default:
                    System.exit(0);
            }

           
        }
       */ 
    //==============================================================
    }
    /**
     * Main metoden som är public
     * @param args 
     */
    
    public static void main(String[] args) {
     /**
      * Skapar ett objekt av klassen Inlämingsuppgift01
      */   
     Inlämningsuppgift01 in = new Inlämningsuppgift01();
    }
    
}
