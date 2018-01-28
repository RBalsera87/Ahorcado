package programa;

import interfaz.principal;

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

			principal.escribeTerminal("\n\nญNo se encuentra coincidencia!\n");
			principal.muestraPantalla(97);
			Thread.sleep(1000);
			principal.muestraPantalla(vidas);
			principal.borrarTerminal();
		}
		
		else if (aciertos == 1) {

			principal.escribeTerminal("\n\nญ" +aciertos+ " coincidencia encontrada!\n");
			principal.muestraPantalla(96);
			Thread.sleep(1000);
			principal.muestraPantalla(vidas);
			principal.borrarTerminal();
			
		} 
		
		else if (aciertos > 1) {
			
			principal.escribeTerminal("\n\nญ" +aciertos+ " coincidencias encontradas!\n");
			principal.muestraPantalla(96);
			Thread.sleep(1000);
			principal.muestraPantalla(vidas);
			principal.borrarTerminal();
			
		}

	}
	
	public static void finalJuego(String palabra, int aciertostotales, int vidas) throws InterruptedException {
		
		if (vidas == 0) {
			finaljuego = true;
			principal.muestraPantalla(vidas);
			Thread.sleep(1000);
			principal.escribeTerminal("ษอออออออออออออออออออออออออออออออออออออออป"
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
			
			principal.muestraPantalla(99);
			while (principal.leerLetra() != '\n') {
			
				principal.escribeTerminal("");
			}

		} if (vidas == 1) {
			
			principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n");
			principal.escribeTerminal("      Te queda solo una oportunidad\n");
			principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n\n");
			Thread.sleep(1000);
			principal.borrarTerminal();
			principal.muestraPantalla(vidas);
			
		} else {

			principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n");
			principal.escribeTerminal("        Te quedan " + vidas + " oportunidades\n");
			principal.escribeTerminal("ออออออออออออออออออออออออออออออออออออออออออ\n\n");
			Thread.sleep(1000);
			principal.borrarTerminal();
			principal.muestraPantalla(vidas);
		}
		
		if (palabra.length() == aciertostotales) {
			finaljuego = true;
			principal.escribeTerminal("ษอออออออออออออออออออออออออออออออออออออออป"
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

			principal.muestraPantalla(98);
				while (principal.leerLetra() != '\n') {
			
			principal.escribeTerminal("");
			}
			
	
		}
		
		
	}
	
}
