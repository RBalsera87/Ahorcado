	/*****
	 *	___________.__       _____   .__                                         .___        
	 *	\_   _____/|  |     /  _  \  |  |__    ____  _______   ____  _____     __| _/  ____  
	 *	 |    __)_ |  |    /  /_\  \ |  |  \  /  _ \ \_  __ \_/ ___\ \__  \   / __ |  /  _ \ 
	 *	 |        \|  |__ /    |    \|   Y  \(  <_> ) |  | \/\  \___  / __ \_/ /_/ | (  <_> )
	 *	/_______  /|____/ \____|__  /|___|  / \____/  |__|    \___  >(____  /\____ |  \____/ 2K18
	 *	        \/                \/      \/                      \/      \/      \/         
	 * 	
	 * 	Proyecto de Programación 2ºTrimestre 1ºDAM
	 * 	IES Gaspar Melchor de Jovellanos Fuenlabrada
	 * 
	 * 	Creado por:
	 * 
	 * 	Rubén Balsera de la Cuesta
	 * 	Sufián Jeniah Ben Mezuar
	 * 	Francisco Guerrero Lozano
	 * 	Román Pacheco Murillo
	 * 
	 * 	Descripción:
	 * 	
	 * 	Se trata del clásico juego del Ahorcado, pero con una vuelta de tuerca para hacerlo un
	 * 	poco más original.
	 * 
	 * 	En este caso el usuario encarna a un despiadado hacker que trata de averiguar la contraseña
	 * 	de los usuarios que trabajan en una conocida empresa de software. Para esta tarea contará
	 * 	con un sofisticado exploit llamado HackTOOL que le facilitará la tarea.
	 * 
	 * 	El juego funciona como un Ahorcado normal, se introducen caracteres y el programa responde
	 * 	si has acertado o no, si fallas pierdes una vida, de un total de 6.
	 * 
	 * 	Algunas de las mejoras introducidas en el juego son:
	 * 	
	 * 	- Una interfaz gráfica amigable, con secuencia de introducción y animaciones.
	 * 	- Entrada dual, puede usarse tanto el teclado fisico y como el de la interfaz.
	 * 	- Implementados cuatro niveles de dificultad, con 18 palabras en cada uno.
	 * 	- Las letras usadas se guardan con dos funciones, impedir que se introduzca dos veces la
	 * 	  misma letra y tambien la de mostrárselas al usuario durante el juego.
	 *  - En cualquier momento se puede salir del juego pulsando la tecla Escape.
	 *  - Huevos de pascua
	 *  
	 */

package programa;

import java.awt.AWTException;
import java.awt.FontFormatException;
import interfaz.Principal;
import programa.Dificultad;
import programa.Palabra;

public class Juego {
		
	private static String[] listaPalabras = new String[18];
	
	public static void main(String[] args) throws InterruptedException, FontFormatException, AWTException {
		
		boolean repetir = true;
		char letraElegida = ' ';
		int aciertos, aciertostotales = 0;
		
		/* 	Arranque del programa:
		 * 
		 * 	Aqui se invoca la interfaz grafica y se llama al metodo
		 * 	cargarPC para mostrar la secuencia de inicio del juego.
		 */
		
		Principal ventana = new Principal();
		ventana.setVisible(true);
		ventana.setLocationRelativeTo(null); //Centra la ventana principal
		Inicio.cargarPC();

		/* 	Núcleo del juego:
		 * 
		 * 	A partir de este punto se inicia el bloque principal
		 * 	del juego, se inician los valores necesarios y se 
		 * 	pide al usuario que introduzca la dificultad.
		 * 
		 * 	Tras esto los metodos correspondientse se encargan de 
		 * 	seleccionar la palabra, defragmentarla y cargar el 
		 * 	array. 
		 * 
		 * 	Finalmente se inicia la pantalla que muestra las vidas
		 *  en la interfaz gráfica.
		 */
		
		do {
			
			int vidas = 6;
			aciertostotales = 0;
			Vidas.resetear();
			listaPalabras = Dificultad.pedirdificultad();
			String palabra = Palabra.seleccionarPalabra(listaPalabras);
			String letrasUsadas = "";
			char[] palabraJuegoDefragmentada = palabra.toCharArray();
			Palabra.cargarArray(palabraJuegoDefragmentada);
			Principal.muestraPantalla(vidas);
			
			/* 	Juego del ahorcado:
			 * 
			 * 	En esta parte es donde se muestra el array de guiones,
			 *  aqui el usuario introduce los caracteres y el programa
			 *  visualiza el resultado.
			 */
			
			while (Vidas.getFinalJuego() == false) {
			
				Palabra.muestraLetras(palabraJuegoDefragmentada);
				Principal.escribeTerminal("\nUsadas: " + letrasUsadas);
				letraElegida = Palabra.introducirLetra(letrasUsadas);
				letrasUsadas += letraElegida+",";
				aciertos = Palabra.comprobarPalabra(palabra,letraElegida,palabraJuegoDefragmentada);
				aciertostotales += aciertos;
				vidas = Vidas.restarVidas(aciertos, vidas);
				Vidas.muestraResultado(aciertos,vidas);
				Vidas.finalJuego(palabra, aciertostotales, vidas);
			
			}
			
			/*  Final:
			 * 
			 *  Cuando el jugador gana o se le terminan las vidas se
			 *  muestra una pantalla de final y se vuelve a iniciar el
			 *  bucle, volviendo a la pantalla de seleccion de dificultad.
			 */
			
		} while (repetir);
		
	}

}