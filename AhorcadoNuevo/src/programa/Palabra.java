package programa;

import java.util.Random;

import interfaz.principal;

/**
 * 	Clase con los m้todos para el control de
 *  las palabras que utiliza el juego
 */

public class Palabra {
		
	/**
	 * 	Carga el Array para mostrar los guiones
	 */
	
	public static void cargarArray(char[] palabraDefragmentada) {
		
		for (int i = 0; i < palabraDefragmentada.length; i++) {
			
					palabraDefragmentada[i] = '_';	
		}
		
	}

	/**
	 * 	Se muestran las letras acertadas junto
	 * 	con los guiones de las restantes.
	 */
	
	public static void muestraLetras(char[] palabraDefragmentada) {
		
		principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n");
		principal.escribeTerminal("      Este password tiene " + palabraDefragmentada.length + " letras\n");
		principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n\n");
		
		for (int i = 0; i < palabraDefragmentada.length; i++) {
			
			principal.escribeTerminal(palabraDefragmentada[i] + " ");
			
		}
		
		principal.escribeTerminal("\n");
		
	}
	
	/**
	 * 	Escoge una palabra aleatoria del array.
	 */
	
	public static String seleccionarPalabra( String[] listaPalabras) {
		
		int PosicionAleatoria = new Random().nextInt(listaPalabras.length);
		String palabraEscogida = listaPalabras[PosicionAleatoria];
		
		return palabraEscogida;
	}

	/**
	 * 	Comprueba los aciertos en la palabra.
	 */
	
	public static int comprobarPalabra(String palabraEscogida,char letraPulsada,char[] palabraDefragmentada) {
		
		int aciertos = 0;
		for (int k = 0; k < palabraEscogida.length(); k++) {

				if (palabraEscogida.charAt(k) == letraPulsada) {
					palabraDefragmentada[k] = letraPulsada;
					aciertos++;
				}
		}
		
		return aciertos;
	}
	
	/**
	 * 	Comprueba si el jugador ha completado la palabra.
	 */
	
	public boolean palabraCompleta(int aciertos, String palabra) {
		boolean acertado = false;
		if (aciertos == palabra.length()) {
			acertado = true;
		}
		return acertado;
	}
	
	/**
	 * 	Lee las letras introducidas por el usuario y
	 *  se encarga de comprobar si la letra esta repetida.
	 */
	
	public static char introducirLetra(String letrasUsadas) {
		
		principal.escribeTerminal("\nIntroduce una letra: ");
		boolean ejecutar = false;
		char letraElegidaPorUsuario = principal.leerLetra();
		do {
			letraElegidaPorUsuario = principal.leerLetra();
			
			for (int i=0; i<letrasUsadas.length();i++) {
				
				if (letraElegidaPorUsuario == letrasUsadas.charAt(i)) {
					
					principal.escribeTerminal("\nYa has usado esta letra, \nescoge otra por favor: ");
					letraElegidaPorUsuario = ' ';
				}
			}			
			
			if (letraElegidaPorUsuario != ' ') {

				ejecutar = true;

			}

		} while (ejecutar == false);
		
		return letraElegidaPorUsuario;
	}
	
	
}
