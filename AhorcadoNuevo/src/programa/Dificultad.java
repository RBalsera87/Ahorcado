package programa;

import interfaz.principal;

/**
 * 	Clase donde se define el array de palabras
 * 	correspondiente a la dificultad que el
 *  jugador elija.
 */

public class Dificultad {
	
	public static String[] pedirdificultad() {
		
		String[] listaPalabras = new String[18];
		
		principal.borrarTerminal();
		principal.escribeTerminal(  "ษอออออออออออออออออออออออออออออออออออออออป"
								+ "\nบ                                       บ" 
								+ "\nบ          Elige la dificultad          บ"
								+ "\nบ                                       บ" 
								+ "\nบ        Pulsa [F1] nivel Facil         บ"
								+ "\nบ        Pulsa [F2] nivel Normal        บ" 
								+ "\nบ        Pulsa [F3] nivel Dificil       บ"
								+ "\nบ        Pulsa [F4] nivel Emilio        บ"
								+ "\nบ                                       บ"
								+ "\nบ                                       บ" 
								+ "\nบ        Pulsa Escape para salir        บ"
								+ "\nบ         en cualquier momento.         บ" 
								+ "\nบ                                       บ"
								+ "\nศอออออออออออออออออออออออออออออออออออออออผ");
		boolean repetir = true;

		while (repetir == true) {

			char dificultad = principal.leerLetra();

			
			switch (dificultad) {
			case '1':
				repetir = false;
				listaPalabras = new String[] { "SETA", "CASA", "PESA", "RAMO", "ROSA", "BAJO", "FARO", "PATO", "VACA",
						"PASA", "MESA", "PERA", "COSA", "LOSA", "MUSA", "TREN", "LOTE", "REMO" };
				break;
			case '2':
				repetir = false;
				listaPalabras = new String[] { "BOCETO", "OFICIO", "NAVAJA", "DILEMA", "TESORO", "MACACO", "PROEZA",
						"AVISPA", "CHORRO", "SERIAL", "OBISPO", "LIENZO", "GITANO", "ALERTA", "JUNGLA","ABRIGO","VACUNO","YANQUI" };
				break;
			case '3':
				repetir = false;
				listaPalabras = new String[] { "ABSTRAER", "CACHORRO", "ACEITUNA", "EDIFICIO", "BLINDAJE", "QUINTETO",
						"ARTICULO", "OBJETIVO", "PIMIENTA", "LADRILLO", "PLUTONIO", "BANCARIO", "OBJETIVO", "PACIFICO",
						"CADUCADO","VIGOROSO","XENOFOBO","METODICO" };
				break;
			case '4':
				repetir = false;
				listaPalabras = new String[] { "CONSTITUCIONALIZACION", "ELECTROENCEFALOGRAFIA","SUPERCONDUCTIVIDAD", "SOBRECALENTAMIENTO",
						"PSEUDOHERMAFRODITISMO", "PRETERINTENCIONALIDAD", "INTERNACIONALIZACION","BRONQUIOLOALVEOLAR","CASTELLANOHABLANTE",
						"INGUBERNAMENTAL","FARMACODEPENDENCIA","ULTRANACIONALISTAS","REDIRECCIONAMIENTO","DESINDUSTRIALIZACION",
						"OTORRINOLARINGOLOGIA","SEMICIRCUNFERENCIA","COMPUTACIONALMENTE","CONTRAINDICACIONES" };
				break;
			default:
				repetir = true;
				break;

			}
		}
		principal.borrarTerminal();
		return listaPalabras;
	}
}
