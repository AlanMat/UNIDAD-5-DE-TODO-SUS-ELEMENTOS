
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alan
 */
public class Unidad5AlgoritmosDeOrdenmiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AlgoritmoDeOrdenamiento ordenar= new AlgoritmoDeOrdenamiento();
        int vector1 [] = {5,6,3,44,22,1};
        int vector2 [] = {55,4,43,44,2,10,4567,3,0,-5,-9};
        int vector3 [] = {5,2,1,8,3,9,7};
       /* System.out.println("Arreglo de original");
        ordenar.mostrarArreglos(vector1);
        System.out.println("Arreglo ordenado con burbuja 1");
        ordenar.burbuja(vector1);
        ordenar.mostrarArreglos(vector1);
        
        
        System.out.println("Arreglo de ordenamiento");
        ordenar.mostrarArreglos(vector2);
        System.out.println("Arreglo ordenado con burbuja 2");
        ordenar.burbuja(vector2);
        ordenar.mostrarArreglos(vector2);*/
      // System.out.println ("Arreglo  original");
       //ordenar.mostrarArreglos(vector2);
       //ordenar.radix(vector2);
       //ordenar.mostrarArreglos (vector3);
        //System.out.println("Arreglo ordenado con quick");
        //ordenar.quick(vector3, 0, vector3.length -1 );
       
      /* int tam;
       tam=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa el tamaño del arreglo"));
       int vectorcito[]= new int[tam];
       for(int i=0;i<tam;i++){
          vectorcito[i]=Integer.parseInt(JOptionPane.showInputDialog(null,
                  "Ingresa el elemento del indice"+i));
           ordenar.insrcion(vectorcito, i+1);
           
           
       }*/
        
         //System.out.println ("Arreglo  original");
        // ordenar.mostrarArreglos(vector3);
         //ordenar.shell(vector3);
         
        /* System.out.println (" \n  Arreglo  vector 1 original");
         ordenar.mostrarArreglos(vector1);
         System.out.println (" \n  Arreglo  vector 2 original ");
         ordenar.mostrarArreglos(vector2);
         ordenar.burbuja(vector1);
          ordenar.burbuja(vector3);
          
          ordenar.intercalacion(vector1, vector2);
          
         */
        
       /* System.out.println (" \n  Arreglo  vector 2 original");
        ordenar.mostrarArreglos(vector2);
        System.out.println (" \n  Arreglo  vector 2 ordenado por mezclaDirecta");
        vector2=ordenar.mezcladirecta(vector2);
        ordenar.mostrarArreglos(vector2);*/
        
        
       System.out.println (" \n  Arreglo  vector 2 original");
       ordenar.mostrarArreglos(vector2);
        System.out.println (" \n  Arreglo  vector 2 ordenado por mezclantural");
        ordenar.mezclanatural(vector2);
        ordenar.mostrarArreglos(vector2);   
    }
    
}
