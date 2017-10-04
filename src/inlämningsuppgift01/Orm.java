
package inlämningsuppgift01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Akinyi Ocholla
 * En subklass till klassen Djur skapas som heter Orm. Den implementerar Interface 
 * Ifoder.
 * Dess konstruktor är protected för att skydda instansvariablerna
 */
public class Orm extends Djur implements Ifoder {
    
    Orm (String n, double v, boolean dj){
        super(n,v, dj);
       
    }


    /**
     * överskuggande metod getName returnerar namn på ett Orm objekt
     * @return namn
     * Polymorfism sker om ormens namn 'Hypno' skrivs ut när denna metod anropas.
     * Dynamisk bindning sker genom en sökning nerifrån och uppåt genom arvshierarkin.
     */
//    @Override
//    public String getName(){
//        return namn;
//    }
//   
    /**
     * överskuggande metod getVikt för subklassen Orm. Anropas denna metod
     * så sker polymorfism. Metoden nås genom Dynamisk bindning.
     * @return vikt
     */
//    @Override
//    public double getVikt(){
//        return vikt;
//    }
    /**
     * Metod gefoder som överskuggar Klassen Djurs metod gefoder. Anropas 
     * gefoder metod för Klassen Orm och ett respektive objekt så sker dynamisk bindning 
     * och när denna metod utförs så har polymorfism hänt.
     */
    @Override
    public void gefoder(){
        JOptionPane.showMessageDialog(null, 20 + " gm ormpellets för " + getName());
    }
    
    /**
     * boolean metod ärDjur som returnerar djur om det är true
     * @return 
     */
//    @Override
//    public boolean ärDjur(){
//        return djur;
//    }
}
