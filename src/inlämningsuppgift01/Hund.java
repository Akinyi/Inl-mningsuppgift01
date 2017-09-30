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
 * @author AKINYI OCHOLLA
 * KLASS HUND EXTENDS SUPERKLASSEN DJUR OCH IMPLEMENTERAR GRÄNSSNITTET Ifoder
 * EN PROTECTED KONSTRUKTOR SER TILL ATT INSTANSVARIABLERNA INTE ÄNDRAS UTIFRÅN 
 * 
 *
 */
public class Hund extends Djur implements Ifoder {
    
    protected Hund(String n, double v, boolean djur){
        super(n,v,djur);
        namn = n; vikt = v; djur = true;
    }
    

    // POLYMORFISM GENOM ATT ANROPA LIKNANDE INSTANSMETODER I SUBKLASSEN SOM
    // ÖVERSKUGGAR METODEN I SUPERKLASSEN OCH SOM TILLHÖR DETTA OBJEKT
    // DYNAMISK BINDNING - geFODER METODEN SÖKS NERIFRÅN OCH UPPÅT I KLASSHIERARKIN 
    
    
    /**
     * Metod getName. När denna metod anropas genom Interface Ifoder så sker
     * Polymorfism. Dynamisk bindning sker nerifrån och uppåt i arvhierarkin
     * @return namn på ett Hund objekt
     */
    @Override
    public String getName(){
        return namn;
    }
    /**
     * void metod printName 
     */
    @Override
    public void printName(){
        JOptionPane.showMessageDialog(null, namn);
    }
    /**
     * Metod getVikt
     * @return vikt
     */
    @Override
    public double getVikt(){
        return vikt;
    }
    /**
     * void Metod gefoder
     * När denna metod anropas genom Gränssnittet Ifoder så söks korrekta metoden 
     * genom dynamisk bindning. Utförs just denna metod så är det polymorfism
     */
    @Override
    public void gefoder(){
        JOptionPane.showMessageDialog(null, namn + " : " + (int)vikt/100 +  " gm hundfoder");
    }
    /**
     * boolean metod ärDjur
     * @return djur
     */
    @Override
    public boolean ärDjur(){
        return djur;
    }
}
