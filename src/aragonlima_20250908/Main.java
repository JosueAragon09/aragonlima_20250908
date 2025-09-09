/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aragonlima_20250908;

/**
 *
 * @author UFG
 */

import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //CREANDO LA CANTIDAD DE ELEMENTOS DEL ARREGLO
        int cantidad_elementos = 5;
        //CREANDO ARREGLO DE NUMEROS DESORDENADOS
        int[] numeros_desordenados = new int [cantidad_elementos];
        
        //CREANDO ARREGLO DE NUMEROS ORDENADOS
        int[] numeros_ordenados = new int [cantidad_elementos];
        
        
        //CREACION E INSTANCIA DEL OBJETO SCANNER
        Scanner scanner = new Scanner(System.in);
        
        
        //INDICACION AL USUARIO QUE DEBE DE INGRESAR NUMEROS DESORDENADOS
        System.out.println("Por favor ingrese "+cantidad_elementos+" números enteros de manera desordenada");
        
        
        //SE RECORRE EL ARREGLO DE ENTEROS DESORDENADOS
        for( int i = 0; i < numeros_desordenados.length; i++){
        
        System.out.print("Digite el elemento "+ (i+1)+": ");
        
        
        //SE LEE EL NUMERO ENTERO INGRESADO POR EL USUARIO
        numeros_desordenados[i] = scanner.nextInt();
                            
        }
        
        
        //SE HACE UNA SALIDA PARA MOSTRAR LOS NÚMEROS
        System.out.println("Usted digito los siguientes números");
        
        
        //SE RECORRE EL ARREGLO PARA MOSTRAR LOS NÚMEROS DESORDENADOS        
        for( int j = 0; j<numeros_desordenados.length; j++){
            System.out.print(numeros_desordenados[j]+" ");
        
        }        
        
       
        
        
        //INVOCAMOS LA FUNCION PARA ORDENAR EL ARREGLO
        numeros_ordenados = ordenar(numeros_desordenados);
        
        
        //IMPRIMIMOS LA SALIDA AL USUARIO
        System.out.print("Los numeros ordenados son: ");
        
        
        //RECORREMOS EL ARREGLO PARA OBTENER CADA VAOR ORDENADO
        for(int k=0;k<numeros_ordenados.length; k++){
            
            System.out.print(numeros_ordenados[k]+" ");
            
        }
        
        
    }
    //CREAMOS UNA FUNCION PARA EVALUAR Y ORDENAR LOS ENTEROS INGRESADOS
    public static int[] ordenar (int[] arreglo){
        
        
        //SE RECORRE EL ARREGLO PARA EVALUAR CADA POSICIÓN
        for(int i=0; i<arreglo.length - 1; i++){
            

            //SE HACE UN SEGUNDO RECORRIDO PARA COMPARAR CON LA POSICIÓN SIGUIENTE
            for(int j = 0; j<arreglo.length -1; j++){
            
            
            //SE EVALUA EL VALOR DE CADA ELEMENTO EN EL ARREGLO
            if(arreglo[j]> arreglo[j+1]){
                
                
                //SI ES MAYOR, SE CREA UNA VARIABLE PATA ALMACENAR
                //EL VALOR DEL ELEMENTO MAYOR
                int mayor = arreglo[j];
                
                
                //SE CAMBIA LA POSICIÓN DEL ELEMENTO ACTUAL
                arreglo[j] = arreglo[j+1];
                
                
                //SE INTERCAMBIA LA POSICIÓN DEL SIGUIENTE ELEMENTO
                //ASIGNADO AL VALOR MAYOR
                arreglo[j+1] = mayor;
            }
                
            
            }
            
            
            
        }
        
        
        System.out.println();
        return arreglo;
    }
    
}
