package programa;

import interfaz.Principal;

/**
 * 	Clase donde se define el array de palabras
 * 	correspondiente a la dificultad que el
 *  jugador haya elegido.
 */

public class Dificultad {
	
	public static String[] pedirdificultad() {
		
		String[] listaPalabras = new String[18];
		
		Principal.borrarTerminal();
		Principal.escribeTerminal(  "���������������������������������������ͻ"
								+ "\n�                                       �" 
								+ "\n�          Elige la dificultad          �"
								+ "\n�                                       �" 
								+ "\n�        Pulsa [F1] nivel Facil         �"
								+ "\n�        Pulsa [F2] nivel Normal        �" 
								+ "\n�        Pulsa [F3] nivel Dificil       �"
								+ "\n�        Pulsa [F4] nivel Extremo       �"
								+ "\n�                                       �"
								+ "\n�                                       �" 
								+ "\n�        Pulsa Escape para salir        �"
								+ "\n�         en cualquier momento.         �" 
								+ "\n�                                       �"
								+ "\n���������������������������������������ͼ");
		boolean repetir = true;

		while (repetir == true) {

			char dificultad = Principal.getLetraPulsada();

			
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
		Principal.borrarTerminal();
		return listaPalabras;
	}
}
