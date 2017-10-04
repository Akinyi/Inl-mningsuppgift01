
package inlämningsuppgift01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author AKINYI OCHOLLA
 *
 * Klass Hund extends Superklasen Djur och implementerar gränssnittet Ifoder
 * En protected Konstruktor ser till att instansvariablerna String n, double v, 
 * boolean djur inte ändras utifrån klass Hund.
 *
 */
public class Hund extends Djur implements Ifoder {
    
    protected Hund(String n, double v, boolean dj){
        super(n,v,dj);
        namn = n; vikt = v; djur = dj;
    }
       
    /**
     * Metod getName. När denna överskuggande metod anropas genom Interface 
     * Ifoder så sker Polymorfism. Dynamisk bindning sker nerifrån och uppåt
     * i arvhierarkin tills den hittar metoden.
     * @return namn på ett Hund objekt
     */
    @Override
    public String getName(){
        return namn;
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
     * När denna metod anropas genom Gränssnittet Ifoder så har den korrekta 
     * metoden hittats genom dynamisk bindning. 
     * Utförs just denna metod så är det polymorfism
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
