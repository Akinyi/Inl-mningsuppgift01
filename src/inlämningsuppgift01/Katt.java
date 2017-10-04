
package inlämningsuppgift01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Klass Katt extends Superklasen Djur och implementerar gränssnittet Ifoder
 * En protected Konstruktor ser till att instansvariablerna String n, double v, 
 * boolean djur inte ändras utifrån klass Katt.
 * @author ägare
 */
public class Katt extends Djur implements Ifoder {
   
    /**
     * Inkapslade protected klass Katt
     * @param n
     * @param v
     * @param dj
     */
    protected Katt(String n, double v, boolean dj){
        super(n,v, dj);
        namn = n; vikt = v; djur = dj;
    }
 
    /**
     * 
     * Metod getName. När denna överskuggande metod anropas genom Interface 
     * Ifoder så sker Polymorfism. Dynamisk bindning sker nerifrån och uppåt
     * i arvhierarkin. När en metod getName anropas så söker Virtuella Java Maskin
     * igenom arvhierarkin tills den hittar just denna metod för respektive objekt.
     * Om namnet som söks är samma som Ove eller Venus så hämtas de härifrån
     * @return namn 
     */
    @Override
    public String getName(){
        return namn;
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
