import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

class SeleccionEInsercion{
	
	public void ordenamientoPorSeleccion(long[] numeros) {
		int recorridos = 0, intercambios = 0;
		long tInicio, tFin;
		tInicio = System.currentTimeMillis();
		for(int i = 0; i < numeros.length; i++) {
			int minimo = i;
			for(int j = i+1; j < numeros.length; j++) {
				if(numeros[j] < numeros[minimo]) {
					minimo = j;
				}
				
				long aux = numeros[i];
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
	
	
	public static void mostrar(long numeros[]) {
		System.out.println(Arrays.toString(numeros));
	}
	
	public void insercionDirecta(long numeros[]) {
		long tfin,tini, aux;
		int recorrido=0, j, intercambio=0, comparacion=0;
		tini=System.currentTimeMillis();
		for (int i = 1; i < numeros.length; i++) { // desde el segundo elemento hasta
			aux = numeros[i]; // el final, guardamos el elemento y
			j = i - 1; // empezamos a comprobar con el anterior
			comparacion++;
			while ((j >= 0) && (aux < numeros[j])) { // mientras queden posiciones y el
												// valor de aux sea menor que los
				numeros[j + 1] = numeros[j]; // de la izquierda, se desplaza a
				j--; 
				comparacion++;// la derecha
				
			}
			numeros[j + 1] = aux; // colocamos aux en su sitio
			intercambio++;
			recorrido++;
		}

		tfin=System.currentTimeMillis();
		System.out.println("Tiempo procesamiento: "+(tfin-tini));
		System.out.println("Recorrido: "+recorrido);
		System.out.println("Intercambio: "+intercambio);
		System.out.println("Comparacion: "+comparacion);
	}

	public void mostrarVector(long[] numeros) {
		System.out.println(Arrays.toString(numeros));
	}
	
}//ClaseSeleccionEInsercion




public class Metodos {

	public static void main(String[] args) {
		
		SeleccionEInsercion si = new  SeleccionEInsercion();
		
		Random random = new Random();
		Scanner sc = new Scanner(System.in);
		System.out.println("Seleccion del metodo: ");
		System.out.println("1) Seleccion.");
		System.out.println("2) Insercion.");
		byte op = sc.nextByte();
		
		long [] numeros= new long[100];
		for (int i = 0; i < numeros.length; i++) {
			numeros[i]=random.nextInt(100);
		}
		
		long[] numeros2= new long[1000];
		for (int i = 0; i < numeros2.length; i++) {
			numeros2[i]=random.nextInt(100);
		}
		
		long[] numeros3= new long[10000];
		for (int i = 0; i < numeros3.length; i++) {
			numeros3[i]=random.nextInt(100);
		}
		
		long[] numeros4= new long[100000];
		for (int i = 0; i < numeros4.length; i++) {
			numeros4[i]=random.nextInt(100);
		}
		
		long [] numeros5= new long[1000000];
		for (int i = 0; i < numeros5.length; i++) {
			numeros5[i]=random.nextInt(100);
		}
		
		switch (op) {
		case 1: 
			System.out.println("~~~~~~~~~~~~~~~~ Metodo Seleccion~~~~~~~~~~~~~~~~~~");
			System.out.println("Prueba 100 numeros");
			si.mostrarVector(numeros);
			si.ordenamientoPorSeleccion(numeros);
			si.mostrarVector(numeros);
			System.out.println();
			System.out.println("Prueba 1000 numeros");
			si.mostrarVector(numeros2);
			si.ordenamientoPorSeleccion(numeros2);
			si.mostrarVector(numeros2);
			System.out.println();
			System.out.println("Prueba 10000 numeros");
			si.mostrarVector(numeros3);
			si.ordenamientoPorSeleccion(numeros3);
			si.mostrarVector(numeros3);
			System.out.println();
			System.out.println("Prueba 100000 numeros");
			si.mostrarVector(numeros4);
			si.ordenamientoPorSeleccion(numeros4);
			si.mostrarVector(numeros4);
			System.out.println();
			System.out.println("Prueba 1000000 numeros");
			si.mostrarVector(numeros5);
			si.ordenamientoPorSeleccion(numeros5);
			si.mostrarVector(numeros5);
			break;
		case 2:	
			System.out.println("~~~~~~~~~~~~~~~~~~~ Metodo Insercion~~~~~~~~~~~~~~~~~~");
			System.out.println("Prueba 100 numeros");
			si.mostrarVector(numeros);
			si.insercionDirecta(numeros);
			si.mostrarVector(numeros);
			System.out.println();
			System.out.println("Prueba 1000 numeros");
			si.mostrarVector(numeros2);
			si.insercionDirecta(numeros2);
			si.mostrarVector(numeros2);
			System.out.println();
			System.out.println("Prueba 10000 numeros");
			si.mostrarVector(numeros3);
			si.insercionDirecta(numeros3);
			si.mostrarVector(numeros3);
			System.out.println();
			System.out.println("Prueba 100000 numeros");
			si.mostrarVector(numeros4);
			si.insercionDirecta(numeros4);
			si.mostrarVector(numeros4);
			System.out.println();
			System.out.println("Prueba 1000000 numeros");
			si.mostrarVector(numeros5);
			si.insercionDirecta(numeros5);
			si.mostrarVector(numeros5);
			break;
		default: System.out.println("Opcion incorrecta.");break;
		}
		

	}//main

}//Clase
