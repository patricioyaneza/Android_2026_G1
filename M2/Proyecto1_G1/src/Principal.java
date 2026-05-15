
public class Principal { 

	// metodo main, es el punto de entrada del programa, 
	// es donde se inicia la ejecución del programa
	public static void main(String[] args) { // metodo (funcion)
		// TODO Auto-generated method stub
		// imprime en la consola el mensaje "Hola Mundo"
		
		System.out.print("Hola Mundo");
		System.out.println("Hola Mundo");
		
		// creación de variables		
		int numero = 100;
		String nombre = "Juan";
		
		int numero2; // se crea la variable pero no se le asigna un valor
		numero2 = 200; // se asigna un valor a la variable numero2
		
		// error de compilación, no se puede asignar un valor de tipo String a una variable de tipo int
		// numero2 = "dfasdf"; 
		
		// mostrar al usuario el valor de la variable
		System.out.println(numero);
		System.out.println(nombre);
		System.out.println(numero2);
		
	}


}
