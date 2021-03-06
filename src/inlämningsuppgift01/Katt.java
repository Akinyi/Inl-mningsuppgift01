
package inlämningsuppgift01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * Klass Katt extends Superklasen Djur och implementerar gränssnittet Ifoder
 * @author Akinyi Ocholla
 */
public class Katt extends Djur implements Ifoder {
   
    /**
     * klass Katt
     * @param n
     * @param v
     * @param dj
     */
    Katt(String n, double v, boolean dj){
        super(n,v, dj);
        
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
//    @Override
//    public String getName(){
//        return namn;
//    }
        
    /**
     * metod getVikt. När den anropas så sker polymorfism. Metoden nås genom 
     * dynamisk bindning.
     * @return vikt
     */
//    @Override
//    public double getVikt(){
//        return vikt;
//    }
    
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
        JOptionPane.showMessageDialog(null, (int)getVikt()/150 + 
                " gm kattfoder för " + getName());
    }
    
    /**
     * boolean metod ärDjur
     * @return djur om djurets egenskap är true.
     */
//    @Override
//    public boolean ärDjur(){
//        return djur;
//    }
}
