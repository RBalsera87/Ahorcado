package programa;

import interfaz.Principal;

/**
 * 	Clase con los m้todos usados para el control
 *  de las vidas y los finales del juego.
 */

public class Vidas {
	
	private static boolean finaljuego = false;
	
	public static void resetear() {
		
		finaljuego = false;
		
	}
	
	public static boolean getFinalJuego() {
		
		return finaljuego;
	}
	
	public static int restarVidas(int aciertos, int vidas){
		
		if (aciertos == 0) {
			vidas--;
		}
		return vidas;
	}
	
	public static void muestraResultado(int aciertos, int vidas) throws InterruptedException {
		
		if (aciertos == 0) {

			Principal.escribeTerminal("\n\nญNo se encuentra coincidencia!\n");
			Principal.muestraPantalla(97);
			Thread.sleep(1000);
			Principal.muestraPantalla(vidas);
			Principal.borrarTerminal();
		}
		
		else if (aciertos == 1) {

			Principal.escribeTerminal("\n\nญ" +aciertos+ " coincidencia encontrada!\n");
			Principal.muestraPantalla(96);
			Thread.sleep(1000);
			Principal.muestraPantalla(vidas);
			Principal.borrarTerminal();
			
		} 
		
		else if (aciertos > 1) {
			
			Principal.escribeTerminal("\n\nญ" +aciertos+ " coincidencias encontradas!\n");
			Principal.muestraPantalla(96);
			Thread.sleep(1000);
			Principal.muestraPantalla(vidas);
			Principal.borrarTerminal();
			
		}

	}
	
	public static void finalJuego(String palabra, int aciertostotales, int vidas) throws InterruptedException {
		
		if (vidas == 0) {
			finaljuego = true;
			Principal.muestraPantalla(vidas);
			Thread.sleep(1000);
			Principal.escribeTerminal("ษอออออออออออออออออออออออออออออออออออออออป"
								  + "\nบ                                       บ" 
								  + "\nบ     ____ ____ ____ ____ ____ ____     บ" 
								  + "\nบ     |__| |    |    |___ [__  [__      บ" 
								  + "\nบ     |  | |___ |___ |___ ___] ___]     บ" 
								  + "\nบ      ___  ____ _   _ _ ____ ___       บ"
								  + "\nบ      |  \\ |___ |\\  | | |___ |  \\      บ" 
								  + "\nบ      |__/ |___ |  \\| | |___ |__/      บ"
								  + "\nบ                                       บ" 
								  + "\nบ  ญALERTA! Intruso detectado ญALERTA!  บ"  
								  + "\nบ         BLOQUEANDO SISTEMAS...        บ" 
								  + "\nบ      Pulsa Intro para continuar.      บ"
								  + "\nบ                                       บ"
								  + "\nศอออออออออออออออออออออออออออออออออออออออผ\n");
			
			Principal.muestraPantalla(99);
			while (Principal.leerLetra() != '\n') {
			
				Principal.escribeTerminal("");
			}

		} if (vidas == 1) {
			
			Principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n");
			Principal.escribeTerminal("      Te queda solo una oportunidad\n");
			Principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n\n");
			Thread.sleep(1000);
			Principal.borrarTerminal();
			Principal.muestraPantalla(vidas);
			
		} else {

			Principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n");
			Principal.escribeTerminal("        Te quedan " + vidas + " oportunidades\n");
			Principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n\n");
			Thread.sleep(1000);
			Principal.borrarTerminal();
			Principal.muestraPantalla(vidas);
		}
		
		if (palabra.length() == aciertostotales) {
			finaljuego = true;
			Principal.escribeTerminal("ษอออออออออออออออออออออออออออออออออออออออป"
								  + "\nบ                                       บ" 
								  + "\nบ     ____ ____ ____ ____ ____ ____     บ" 
								  + "\nบ     |__| |    |    |___ [__  [__      บ" 
								  + "\nบ     |  | |___ |___ |___ ___] ___]     บ" 
								  + "\nบ   ____ ____ ____ _   _ ___ ____ ___   บ"
								  + "\nบ   | __ |__/ |__| |\\  |  |  |___ |  \\  บ" 
								  + "\nบ   |__] |  \\ |  | |  \\|  |  |___ |__/  บ"
								  + "\nบ                                       บ" 
								  + "\nบ   ญEnhorabuena! El password ha sido   บ"  
								  + "\nบ   sido hackeado satisfactoriamente.   บ" 
								  + "\nบ      Pulsa Intro para continuar.      บ"
								  + "\nบ                                       บ"
								  + "\nศอออออออออออออออออออออออออออออออออออออออผ\n");

			Principal.muestraPantalla(98);
				while (Principal.leerLetra() != '\n') {
			
			Principal.escribeTerminal("");
			}
			
	
		}
		
		
	}
	
}
