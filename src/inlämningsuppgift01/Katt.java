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
public class Katt extends Djur implements Ifoder {
   
    public Katt(String n, double v, boolean djur){
        super(n,v, djur);
        namn = n; vikt = v; djur = true;
    }
    protected Djur Venus = new Djur("Venus", 5000.0, true);
    protected Djur Ove = new Djur("Ove", 3000.0, true);
    
    public List<Djur> getAllDjur(){
        
        List<Djur> allDjur = new ArrayList<>();
        allDjur.add(Venus);
        allDjur.add(Ove);
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
        JOptionPane.showMessageDialog(null, (int)vikt/150 +  " gm kattfoder.");
    }
    @Override
    public boolean ärDjur(){
        return djur;
    }
}
