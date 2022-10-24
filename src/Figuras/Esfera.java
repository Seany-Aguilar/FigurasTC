
package Figuras;

/*@author BETTERLEE*/
 
public class Esfera extends Datos {
    public Esfera(){
        
    }
    public void CalcularEsfera(){
        diam = (float)Math.pow(radio, 2);
        
        area = (float)(4 * (diam * Math.PI));
    }
}
