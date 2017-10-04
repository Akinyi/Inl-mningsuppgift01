
package inlämningsuppgift01;

/**
 *
 * @author Akinyi
 * 
 * Superklassen Djur skapas. Den implementerar Interface Ifoder 
 * De instansvariablerna String namn, double vikt och boolean djur är inkapslade
 * med ordet 'protected' vilket skyddar dem från att ändras utifrån klassen. 
 * Konstruktorn Djur inkapslas också med protected.
 * Initiering av instansvariablerna behöver vara public så att subklasserna kan 
 * komma åt dem. Metoderna getName, printName, getVikt, gefoder, ärDjur behöver 
 * också vara åtkomliga av subklasserna.
 */
    public class Djur implements Ifoder {
    protected String namn;
    protected double vikt;
    protected boolean djur;
    
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
    public double getVikt(){
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
    public boolean ärDjur(){
        return djur;
    }
    
    
    
}
