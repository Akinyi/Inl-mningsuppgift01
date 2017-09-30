
package inlämningsuppgift01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Akinyi
 * En subklass till Djur skapas som heter Orm. Den implementerar Ifoder
 * Dess konstruktor är protected för att skydda instansvariablerna
 */
public class Orm extends Djur implements Ifoder {
    
    protected Orm (String n, double v, boolean djur){
        super(n,v, djur);
        namn = n; vikt = v; djur = true;
    }


    /**
     * överskuggande metod getName returnerar namn på ett Orm objekt
     * @return namn
     * Polymorfism sker om ormens namn skrivs ut när denna metod anropas.
     * Dynamisk bindning sker genom en sökning nerifrån och uppåt genom arvshierarkin.
     */
    @Override
    public String getName(){
        return namn;
    }
    /**
     * överskuggande metoden printName
     */
    @Override
    public void printName(){
        JOptionPane.showMessageDialog(null, namn);
    }
    /**
     * överskuggande metod getVikt för subklassen Orm
     * @return vikt
     */
    @Override
    public double getVikt(){
        return vikt;
    }
    /**
     * Metod gefoder som överskuggar Klassen Djurs metod gefoder. Anropas 
     * gefoder metod för Klassen Orm och ett respektive objekt så sker dynamisk bindning 
     * och när denna metod utförs så har polymorfism hänt.
     */
    @Override
    public void gefoder(){
        JOptionPane.showMessageDialog(null, namn + " : " +  20 +  " gm ormpellets");
    }
    
    /**
     * boolean metod ärDjur som returnerar djur om det är true
     * @return 
     */
    @Override
    public boolean ärDjur(){
        return djur;
    }
}
