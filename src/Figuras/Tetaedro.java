
package Figuras;

/*@author BETTERLEE*/
 
public class Tetaedro extends Datos{
    public Tetaedro(){
        
    }
    public void CalculoTetaedro(){
        diam = (float)Math.pow(arista,2);
        area = (float)(diam *  Math.sqrt(3));
    }
}
