
package inlämningsuppgift01;

/**
 *
 * @author Akinyi Ocholla
 * 
 * Superklassen Djur skapas. Den implementerar Interface Ifoder 
 * De instansvariablerna String namn, double vikt och boolean djur är inkapslade
 * med ordet 'private' vilket skyddar dem från att ändras utifrån klassen & package. 
 * Konstruktorn Djur inkapslas med protected.
 * Initiering av instansvariablerna behöver vara public så att subklasserna kan 
 * komma åt dem. Metoderna getName, getVikt, gefoder, ärDjur behöver 
 * också vara åtkomliga av subklasserna.
 */
    public class Djur implements Ifoder {
    private String namn;
    private double vikt;
    private boolean djur;
    
    protected Djur(){}
    public Djur(String n, double v, boolean dj){
        namn = n; vikt = v; djur = dj;
    }
   /**
    * Metod getName
    * @return namn
    */
    public String getName(){
        return namn;
    }
   
    /**
     * Metod getVikt
     * @return vikt
     */
    protected double getVikt(){
        return vikt;
    }
    /**
     * void metod gefoder()
     */
    public void gefoder(){
    
    }
    /**
     * Boolean metod ärDjur
     * @return djur
     */
    private boolean ärDjur(){
        return djur;
    }
    
    
    
}
