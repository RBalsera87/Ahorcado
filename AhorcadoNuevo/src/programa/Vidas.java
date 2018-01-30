package programa;

import interfaz.Principal;

/**
 * 	Clase con los m�todos usados para el control
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

			Principal.escribeTerminal("\n\n�No se encuentra coincidencia!\n");
			Principal.muestraPantalla(97);
			Thread.sleep(1000);
			Principal.muestraPantalla(vidas);
			Principal.borrarTerminal();
		}
		
		else if (aciertos == 1) {

			Principal.escribeTerminal("\n\n�" +aciertos+ " coincidencia encontrada!\n");
			Principal.muestraPantalla(96);
			Thread.sleep(1000);
			Principal.muestraPantalla(vidas);
			Principal.borrarTerminal();
			
		} 
		
		else if (aciertos > 1) {
			
			Principal.escribeTerminal("\n\n�" +aciertos+ " coincidencias encontradas!\n");
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
			Principal.escribeTerminal("���������������������������������������ͻ"
								  + "\n�                                       �" 
								  + "\n�     ____ ____ ____ ____ ____ ____     �" 
								  + "\n�     |__| |    |    |___ [__  [__      �" 
								  + "\n�     |  | |___ |___ |___ ___] ___]     �" 
								  + "\n�      ___  ____ _   _ _ ____ ___       �"
								  + "\n�      |  \\ |___ |\\  | | |___ |  \\      �" 
								  + "\n�      |__/ |___ |  \\| | |___ |__/      �"
								  + "\n�                                       �" 
								  + "\n�  �ALERTA! Intruso detectado �ALERTA!  �"  
								  + "\n�         BLOQUEANDO SISTEMAS...        �" 
								  + "\n�      Pulsa Intro para continuar.      �"
								  + "\n�                                       �"
								  + "\n���������������������������������������ͼ\n");
			
			Principal.muestraPantalla(99);
			while (Principal.leerLetra() != '\n') {
			
				Principal.escribeTerminal("");
			}

		} if (vidas == 1) {
			
			Principal.escribeTerminal("������������������������������������������\n");
			Principal.escribeTerminal("      Te queda solo una oportunidad\n");
			Principal.escribeTerminal("������������������������������������������\n\n");
			Thread.sleep(1000);
			Principal.borrarTerminal();
			Principal.muestraPantalla(vidas);
			
		} else {

			Principal.escribeTerminal("������������������������������������������\n");
			Principal.escribeTerminal("        Te quedan " + vidas + " oportunidades\n");
			Principal.escribeTerminal("������������������������������������������\n\n");
			Thread.sleep(1000);
			Principal.borrarTerminal();
			Principal.muestraPantalla(vidas);
		}
		
		if (palabra.length() == aciertostotales) {
			finaljuego = true;
			Principal.escribeTerminal("���������������������������������������ͻ"
								  + "\n�                                       �" 
								  + "\n�     ____ ____ ____ ____ ____ ____     �" 
								  + "\n�     |__| |    |    |___ [__  [__      �" 
								  + "\n�     |  | |___ |___ |___ ___] ___]     �" 
								  + "\n�   ____ ____ ____ _   _ ___ ____ ___   �"
								  + "\n�   | __ |__/ |__| |\\  |  |  |___ |  \\  �" 
								  + "\n�   |__] |  \\ |  | |  \\|  |  |___ |__/  �"
								  + "\n�                                       �" 
								  + "\n�   �Enhorabuena! El password ha sido   �"  
								  + "\n�   sido hackeado satisfactoriamente.   �" 
								  + "\n�      Pulsa Intro para continuar.      �"
								  + "\n�                                       �"
								  + "\n���������������������������������������ͼ\n");

			Principal.muestraPantalla(98);
				while (Principal.leerLetra() != '\n') {
			
			Principal.escribeTerminal("");
			}
			
	
		}
		
		
	}
	
}
