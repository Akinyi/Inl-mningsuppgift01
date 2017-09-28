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
 * @author ägare
 */
public class Inlämningsuppgift01 {

    public Inlämningsuppgift01(){
    
       
        List<Ifoder> ifo = new ArrayList<>();
        
//        ifo.add(new Hund.add("Sixten", 5000.0)); 
//        List<Djur> djur = new ArrayList<>();
//        djur.add(new Hund("Sixten", 5000));
//        djur.add(new Hund ("Dogge", 10000));
//        djur.add(new Katt("Venus", 5000));
//        djur.add(new Katt("Ove", 3000));
//        djur.add(new Orm("Hypno", 1000));
        
        
        boolean again = true;
        while (again){
            String s = JOptionPane.showInputDialog(" Vilket djur ska få mat? Ange ett namn.");
            
            if (s == null)
                break;
//            else if(s.equals())
            
        }
        
    }
    
    
    public static void main(String[] args) {
        
     Inlämningsuppgift01 in = new Inlämningsuppgift01();
    }
    
}
