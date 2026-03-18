package mx.edu.itson.algoritmosordenamiento;

public class AlgoritmosOrdenamiento {

    // ---- SELECTION SORT ----
    public static void SelectionSort(int [] arr){ //O(n**2) (2 for)
        
        int n = arr.length; //tamaño del arreglo

        //recorre todo el arreglo hasta la penúltima posición (n-1)
        for(int i = 0; i < n - 1; i++){

            int indiceMinimo = i; //se toma el primer valor como minimo

            //recorre los elementos a la derecha
            for (int j = i + 1; j < n; j++){

                //compara si el elemento es menor
                if (arr[j] < arr[indiceMinimo])
                    indiceMinimo = j; //actualiza el minimo 
            }

            //intercambio de posiciones
            int aux = arr[indiceMinimo];
            arr[indiceMinimo] = arr[i];
            arr[i] = aux;
        }
    }

    
    // ---- BUBBLE SORT ----
   public static void BubbleSort(int [] arreglo2) {
        // Definición del arreglo desordenado
        int n = arreglo2.length;

        // Controla el número de pasadas a través del arreglo
        for (int i = 0; i < n - 1; i++) {
            // Compara los elementos adyacentes. 
            //(n - i - 1) evita revisar los elementos que ya están ordenados al final.
            for (int j = 0; j < n - i - 1; j++) {
                
                // Si el elemento actual es mayor al siguiente, se intercambian
                if (arreglo2[j] > arreglo2[j + 1]) {
                    // Intercambio usando una variable temporal
                    int temp = arreglo2[j];
                    arreglo2[j] = arreglo2[j + 1];
                    arreglo2[j + 1] = temp;
                }
            }
        }
       
    }
    
    //---- INSERTION SORT ----
    public static void insertionSort(int [] arr3){
        //total de elementos del arreglo
        int n = arr3.length;
        //recorre el arreglo desde indice1 (se asume que el primer elemento está ordenado)
        for (int i = 1; i<n ; i++){
        /*selecciona el elemento actual que queremos
        insertar en su posicion y se guarda en la key*/
            int key = arr3[i];
            /*se inicializa el indice j que apunta al elemento anterior a 
            la posición actual [i] para compararlos*/
            int j = i-1;
            /*ciclo interno que se ejecuta mientras que
            el elemento de la izquierda > key */
            while (j >= 0 && arr3[j] > key){
                //Si arr3[j]>key, se desplaza a la derecha para abrir espacio
                arr3[j + 1] = arr3[j];
                j = j - 1;
            }
            //Se inserta el valor de la key en el espacio vacío
            arr3[j + 1] = key;
        }
        
    }
    
    //metodo para imprimir freson
    public static void imprimirArreglo(int[] arr) {
    System.out.print("[ ");
    for (int i = 0; i < arr.length; i++) {
        
        System.out.print(arr[i] + (i == arr.length - 1 ? "" : ", "));
    }
    System.out.println(" ]");
    
    }
   
}