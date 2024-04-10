import java.util.Scanner;


public class MetodosOrdenamiento {
    Scanner leer = new Scanner(System.in);
    int i = leer.nextInt();
    //1. Metodo que devuelve 
    //
    public int[] sortByBubble (int[] arreglo, boolean logs){



        int tamano = arreglo.length;

        if (i== 1){
            
            for (int i = 0; i < tamano; i++){
                if (logs) {
    
                    System.out.println("\nPasado numero " + i);
                }
                for (int j = i+1;j < tamano; j++){
                    if (logs) {
    
                        System.out.println("i=" + arreglo[i]+ " j="+ arreglo[j]);
                    }
                    if (arreglo[i] > arreglo[j]){
                        if (logs) {
    
                            System.out.println("- Si es mayor asi que cambio ");
                        }
                        //Intercambiamos los elementos 
                        int temporal= arreglo[i];
                        arreglo[i] = arreglo[j];
                        arreglo[j]= temporal;
                        System.out.println( " ");
                        imprime(arreglo);
                    }
                }
            }
        }
        

        return arreglo;
    }



    

    //4. Metodo que imprime 
    public void imprime (int[] arreglo){
        for( int i=0; i< arreglo.length; i++){
            System.out.print(arreglo[i]+ " ");
        }
        System.out.println();
    }

}
