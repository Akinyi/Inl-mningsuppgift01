
package inlämningsuppgift01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ägare
 */
public class Katt extends Djur implements Ifoder {
   
    /**
     * PROTECTED KONSTRUCTOR KATT
     * @param n
     * @param v
     * @param djur
     */
    protected Katt(String n, double v, boolean djur){
        super(n,v, djur);
        namn = n; vikt = v; djur = true;
    }
 
    /**
     * Metod getName. När en metod getName anropas så söker Virtuella Java Maskin
     * igenom arvhierarkin tills den hittar just denna metod för respektive objekt.
     * Om namnet som söks är samma som Ove eller Venus så hämtas de härifrån
     * @return namn på ett Katt objekt
     */
    @Override
    public String getName(){
        return namn;
    }
    /**
     * En void metod printName som kan användas för att skriva ut respektiva namn
     */
    @Override
    public void printName(){
        JOptionPane.showMessageDialog(null, namn);
    }
    
    /**
     * metod getVikt
     * @return vikt
     */
    @Override
    public double getVikt(){
        return vikt;
    }
    
    /**
     * metod gefoder som anger namnet på katten och vikten kattfoder. Denna metod
     * överskuggar superklassen Djurs metod gefoder. När Interface Ifoder anropar 
     * metoden gefoder så sker en JVM sökning nerifrån och uppåt tills just denna 
     * metod hittas och genomförs. Detta är Dynamisk Bindning.
     * Genomförs denna metod så har polymorfism hänt.
     * 
     */
    @Override
    public void gefoder(){
        JOptionPane.showMessageDialog(null, namn + " : " + (int)vikt/150 +  " gm kattfoder.");
    }
    
    /**
     * boolean metod ärDjur
     * @return djur om djurets egenskap är true.
     */
    @Override
    public boolean ärDjur(){
        return djur;
    }
}
