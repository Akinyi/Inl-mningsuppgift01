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
public class Hund extends Djur implements Ifoder, IDjur {
    
    public Hund(String n, double v, boolean djur){
        super(n,v,djur);
        namn = n; vikt = v; djur = true;
    }
    
    //List<Hund> hund  = new ArrayList<>();
//    protected IDjur Sixten = new Djur ("Sixten", 5000.0, true);
//    protected Djur Dogge = new Djur ("Dogge", 10000.0, true);
//    
//    public void getAllDjur(){
//        
//       
//        return allDjur;
//    }
    // POLYMORFISM GENOM ATT SKAPA LIKNANDE INSTANSMETODER I SUBKLASSEN SOM ÖVERSKUGGAR METODEN I SUPERKLASSEN
    // geFODER METODEN SÖKS NERIFRÅN OCH UPPÅT I KLASSHIERARKIN
    @Override
    public String getName(){
        return namn;
    }
    
    @Override
    public double getVikt(){
        return vikt;
    }
    
    @Override
    public void gefoder(){
        JOptionPane.showMessageDialog(null, (int)vikt/100 +  " gm hundfoder");
    }
    @Override
    public boolean ärDjur(){
        return djur;
    }
}
