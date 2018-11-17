import java.util.Arrays;
import java.util.Random;

class SeleccionEInsercion{
	
	public void ordenamientoPorSeleccion(int[] numeros) {
		int recorridos = 0, intercambios = 0;
		long tInicio, tFin;
		tInicio = System.currentTimeMillis();
		for(int i = 0; i < numeros.length; i++) {
			int minimo = i;
			for(int j = i+1; j < numeros.length; j++) {
				if(numeros[j] < numeros[minimo]) {
					minimo = j;
				}
				
				int aux = numeros[i];
				numeros[i] = numeros[minimo];
				numeros[minimo] = aux;
				intercambios ++;
			}
			recorridos ++;
		}
		tFin = System.currentTimeMillis();
		System.out.println("Tiempo: " + (tFin - tInicio));
		System.out.println("Recorridos: " + recorridos);
		System.out.println("Intercambios: " + intercambios);
		
		
	}//MetodoSeleccion
	
	
	public static void mostrar(int numeros[]) {
		System.out.println(Arrays.toString(numeros));
	}
	
}//ClaseSeleccionEInsercion




public class MetodoSeleccion {

	public static void main(String[] args) {
		
		SeleccionEInsercion si = new  SeleccionEInsercion();
		 /*int edades[] = {34, 25, 12, 87, 9, 10, 34, 37, 24, 2};
		SeleccionEInsercion.mostrar(edades);
		
		
		System.out.println("\n === Ordenamiento con seleccion ===");
		si.mostrar(edades);
		System.out.println();
		System.out.println("Datos de eficiencia del algoritmo:");
		si.ordenamientoPorSeleccion(edades);
		si.mostrar(edades);
		*/
		
		Random random = new Random();
		int[] numerox = {6,5,3,1,8,7,2,4};
		si.mostrar(numerox);
		si.ordenamientoPorSeleccion(numerox);
		si.mostrar(numerox);
		System.out.println();
		System.out.println();
		int[] numeros= new int[10];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=random.nextInt(100);
		}
		si.mostrar(numeros);
		si.ordenamientoPorSeleccion(numeros);
		si.mostrar(numerox);
		
		System.out.println("====================================================================");
		System.out.println();
		
		int[] numeros2= new int[100];
		
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i]=random.nextInt(100);
		}
		si.mostrar(numeros2);
		si.ordenamientoPorSeleccion(numeros2);
		si.mostrar(numeros2);
		
		System.out.println("====================================================");
		System.out.println();
		
		int[] numeros3= new int[1000];
		for (int i = 0; i < numeros3.length; i++) {
			numeros3[i]=random.nextInt(100);
		}
		si.mostrar(numeros3);
		si.ordenamientoPorSeleccion(numeros3);
		si.mostrar(numeros3);
		
		System.out.println("===========================================================");
		System.out.println();
		
		int[] numeros4= new int[10000];
		for (int i = 0; i < numeros4.length; i++) {
			numeros4[i]=random.nextInt(100);
		}
		si.mostrar(numeros4);
		si.ordenamientoPorSeleccion(numeros4);
		si.mostrar(numeros4);
		
		System.out.println("================================================================");
		System.out.println();
		
		int[] numeros5= new int[100000];
		for (int i = 0; i < numeros5.length; i++) {
			numeros5[i]=random.nextInt(100);
		}
		si.mostrar(numeros5);
		si.ordenamientoPorSeleccion(numeros5);
		si.mostrar(numeros5);
		

	}//main

}//Clase
