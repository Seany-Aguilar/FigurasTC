
package Figuras;

/* @author BETTERLEE*/
 
public class Circulo extends Datos {
    public Circulo(){
        
    }
    
    public void ClaculoCirculo(){
        diam = (float)Math.pow(radio, 2);
        area = diam *pi;
        
    }
}
