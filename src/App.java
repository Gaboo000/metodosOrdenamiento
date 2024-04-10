public class App {
    public static void main(String[] args) throws Exception {
        MetodosOrdenamiento metodosOrdenamiento = new MetodosOrdenamiento();

        int[] numeros= {30,7,12,5};

        metodosOrdenamiento.imprime(numeros);

        int[] arreglOrdenado = metodosOrdenamiento.sortByBubble(numeros);
        metodosOrdenamiento.imprime(arreglOrdenado);
        
    }
    
}
