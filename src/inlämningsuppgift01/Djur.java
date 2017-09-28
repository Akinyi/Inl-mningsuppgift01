/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inlämningsuppgift01;



/**
 *
 * @author ägare
 */
    public class Djur implements Ifoder, IDjur {
    protected String namn;
    protected double vikt;
    protected boolean djur;
    
    protected Djur(){}
    public Djur(String n, double v, boolean dj){
        namn = n; vikt = v; djur = dj;
    }
   
    public String getName(){
        return namn;
    }
    public double getVikt(){
        return vikt;
    }
    public void gefoder(){
    
    }
    public boolean ärDjur(){
        return djur;
    }
    
    
    
}
