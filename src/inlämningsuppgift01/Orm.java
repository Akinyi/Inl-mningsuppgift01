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
public class Orm extends Djur implements Ifoder {
    
    public Orm (String n, double v, boolean djur){
        super(n,v, djur);
        namn = n; vikt = v; djur = true;
    }
    protected Djur Hypno = new Djur("Hypno", 1000.0, true);
    
    public List<Djur> getAllDjur(){
        
        List<Djur> allDjur = new ArrayList<>();
        allDjur.add(Hypno);
       
        return allDjur;
    }
    
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
        JOptionPane.showMessageDialog(null,  20*vikt/vikt +  " gm ormpellets");
    }
    @Override
    public boolean ärDjur(){
        return djur;
    }
}
