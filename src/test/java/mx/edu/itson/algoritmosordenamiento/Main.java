package mx.edu.itson.algoritmosordenamiento;

public class Main {

    public static void main(String[] args) {

        
        // - - - - - Selection Sort - - - - -
int[] miArreglo = {8, 3, 1};

System.out.println("========================================");
System.out.println("           ALGORITMO: SELECTION SORT    ");

System.out.print("Estado Inicial:  ");
AlgoritmosOrdenamiento.imprimirArreglo(miArreglo);

// Ejecución del algoritmo
AlgoritmosOrdenamiento.SelectionSort(miArreglo);

System.out.print("Estado Final:    ");
AlgoritmosOrdenamiento.imprimirArreglo(miArreglo);

        
// ------------------ BUBBLE SORT ------------------
int[] miArreglo2 = {10, 4, 3};

System.out.println("========================================");
System.out.println("            ALGORITMO: BUBBLE SORT      ");

System.out.print("Estado Inicial:  ");
// Usamos el método estandarizado para que todo se vea igual
AlgoritmosOrdenamiento.imprimirArreglo(miArreglo2);

// Ejecución del algoritmo
AlgoritmosOrdenamiento.BubbleSort(miArreglo2);

System.out.print("Estado Final:    ");
AlgoritmosOrdenamiento.imprimirArreglo(miArreglo2);
    

        
// ----------------- INSERTION SORT -----------------
int[] arr3 = {9, 5, 12};

System.out.println("========================================");
System.out.println("          ALGORITMO: INSERTION SORT     ");

System.out.print("Estado Inicial:  ");
AlgoritmosOrdenamiento.imprimirArreglo(arr3);
AlgoritmosOrdenamiento.insertionSort(arr3);

System.out.print("Estado Final:    ");
AlgoritmosOrdenamiento.imprimirArreglo(arr3);

// -------------- QUICK SORT ---------------
int[] arr4 = {8,3,2,5,6};

System.out.println("========================================");
System.out.println("          ALGORITMO: QUICKSORT     ");

System.out.print("Estado Inicial:  ");
AlgoritmosOrdenamiento.imprimirArreglo(arr4);
AlgoritmosOrdenamiento.quickSort(arr4);

System.out.print("Estado Final:    ");
AlgoritmosOrdenamiento.imprimirArreglo(arr4);
        
    }
    
}
