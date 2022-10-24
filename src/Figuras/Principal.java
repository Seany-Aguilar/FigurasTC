
package Figuras;

import java.util.Scanner;

/* @author BETTERLEE */

public class Principal {
     @SuppressWarnings("empty-statement")
     public void Menu(){
         Scanner r = new Scanner (System.in);
         int opcion;
         String respuesta;
         System.out.println("-------------------------------------Figuras geometricas----------------------------------------");
         System.out.println("\n\n¿Desea ingresar una figura? " +  " Si- s / No -n\n");
         respuesta = r.next();
         
         if(respuesta.equals("s")|| respuesta.equals("s")){
              System.out.println("Elige la opcion que deseas conocer el area de la figura\n");
              System.out.println(" 1)Circulo\n 2)Cuadrado\n 3)Triangulo\n 4)Cubo\n 5)Esfera\n 6)Tetaedro\n 7)Salir\n");
              System.out.println("\nIngresa la opcion que deseas:");
              opcion = r.nextInt();
        switch(opcion){
            case 1:
                Circulo c = new Circulo();
                c.DatosCirculo();
                c.ClaculoCirculo();
                System.out.println("El area del circulo es: ");
                c.area();              
                break;
                
            case 2:
                Cuadrado cu =  new Cuadrado();
                cu.DatosCuadrado();
                cu.CalculoCuadrado();
                System.out.println("El area del Cuadrado es: ");
                cu.area();
                break;
                
            case 3:
                Triangulo t = new Triangulo();
                t.DatosTriangulo();
                t.CalculoTriangulo();
                System.out.println("El area del Triangulo es: ");
                t.area();
                break;
            case 4:
                Cubo cub = new Cubo();
                cub.DatosCubo();
                cub.CalculoCubo();
                System.out.println("El area del cubo es:");
                cub.area();
                break;
            case 5:
                Esfera es = new Esfera();
                es.DatosEsfera();
                es.CalcularEsfera();
                System.out.println("El area de la esfera es: ");
                es.area();
                break;
            case 6:
                Tetaedro tt =  new Tetaedro();
                tt.DatosTetaedro();
                tt.CalculoTetaedro();
                System.out.println("El area del tetaedro es:");
                tt.area();
                break;
               default:
                System.out.println("Intenta de nuevo");
                break;     
        }while(opcion!=7);
         
     }else {
             System.out.println("Ingrese alguna opcion");
         }    
     }
    
    
    public static void main(String[] args) {
      try{
        Principal imprimir = new Principal ();
        imprimir.Menu();
        }catch(Exception a){
            System.out.println("\tCapturar el error " + a);
        }
    }
    
}
