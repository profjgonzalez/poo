//Nombre: Programa 2. SalidaPantalla.java
/*
	Autor: Ing. Jorge González
	Descripción: Programa que muestra en consola la salida
	utilizando print, println y printf
 */

public class SalidaPantalla
{

	//metodo que comienza la ejecución de cada aplicación en Java
	public static void main(String args[])
	{

		//Mensaje que muestra una sóla línea
		System.out.print("Este es un ");
		System.out.println("mensaje de una sola linea\n");

		//Mensaje seccionado en varias líneas a partir de una sola instrucción
		System.out.println("Este es un \nmensaje de varias lineas \ncon una sola \ninstruccion\n");

		//Mensaje utilizando secuencias de escape
		System.out.println("Mensaje de nueva linea\n - \ttabulacion\n - \rRetorno de carro - \\barra lateral - \"Comillla - \'Comilla simple\n");

		//Mensaje utilizando printf - Formato
		System.out.printf("%s%n%s%n", "Primer cadena", "Segunda cadena");
		
	}//fin del método main

}//fin de la clase SalidaPantalla
