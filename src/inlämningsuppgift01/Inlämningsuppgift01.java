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

    protected Inlämningsuppgift01(){
        /*
    Hund h1 = new Hund("Sixten", 5000.0, true);
    Hund h2 = new Hund("Dogge", 10000.0, true);
    Katt k1 = new Katt("Venus", 5000.0, true);
    Katt k2 = new Katt("Ove", 3000.0, true);
    Orm o1 = new Orm("Hypno", 1000.0, true);
    
    System.out.println("Hunden " + h1.getName());

    */
      // DYNAMISK BINDNING GENOM ATT DEN SKAPAR NYA REFERENSVARIABLER TILL SUBKLASSERNA
       List<Ifoder> ifo = new ArrayList<>();   
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
            // DYNAMIST BINDNING SORT THIS OUT.
//            for(int i =0; i<6; i++)
//           if(s.equalsIgnoreCase(i(i).getName()))
//               i(i).gefoder();
           
        }
        
    
    }
    
    
    public static void main(String[] args) {
     /**
      * Skapar en instansvariabel av klassen Inlämingsuppgift01
      */   
     Inlämningsuppgift01 in = new Inlämningsuppgift01();
    }
    
}
