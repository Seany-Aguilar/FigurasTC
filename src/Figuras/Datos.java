
package Figuras;

import java.util.Scanner;

/* @author BETTERLEE*/
 
public class Datos {
    protected float  radio, diam ,  arista, lado, b,a, area, bn, pi=(float) 3.1416;
    Scanner r=  new Scanner (System.in);
    
     public void Datos(){  
     }
      public void DatosCirculo(){
      System.out.println("Ingrese el valor del radio");
      radio = r.nextInt();
     }
  
      public void DatosCuadrado(){
      System.out.println("Ingresa el valor del lado");
      lado = r.nextInt();
     }
      public void DatosTriangulo(){
      System.out.println("Ingresa el valor de la base");
      b= r.nextInt();
      System.out.println("Ingresa el valor de la altura");
      a = r.nextInt();
     }

     public void DatosCubo(){
      System.out.println("Ingresa el valor del lado del Cubo: ");
      lado = r.nextInt();
    }  
     public void DatosEsfera(){
      System.out.println("Ingresa el valor del radio de la esfera");
      radio = r.nextInt();
    }
     public void DatosTetaedro(){
      System.out.println("Ingresa el valor del arista: ");
      arista = r.nextInt();
    }
  
     public void area(){
      System.out.println(area);
    }
}
