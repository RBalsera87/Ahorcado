package programa;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import interfaz.Principal;

/**
 * 	Clase con la secuencia de inicio que se
 *  muestra al comienzo del programa.
 */

public class Inicio {

	public static void cargarPC() throws InterruptedException, AWTException {

		Robot r = new Robot();
		
		
		
		Principal.escribeTerminal("ÉÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍ»" 
							  + "\nº MS-DAM Version 6.22 º"
							  + "\nÈÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍ¼\n");
		Thread.sleep(800);

		Principal.escribeTerminal("\nCargando controladores..." + "\n");
		Thread.sleep(2000);
		Principal.escribeTerminal("\nş KEYBOARD.SYS");
		Thread.sleep(1500);
		Principal.escribeTerminal("\nş FLOPPY.SYS");
		Thread.sleep(2000);
		Principal.escribeTerminal("\nş TERMINAL.SYS");
		Thread.sleep(2000);
		Principal.escribeTerminal("\n\nCarga de controladores completada");
		Thread.sleep(1000);
		Principal.escribeTerminal("\n\n          Iniciando el sistema\n");
		Thread.sleep(1000);
		
		for (int i=0; i<10;i++) {
			Principal.escribeTerminal("°");
			Thread.sleep(140);
		}
		
		for (int j=0; j<10;j++) {
			Principal.escribeTerminal("±");
			Thread.sleep(130);
		}
		
		for (int k=0; k<10;k++) {
			Principal.escribeTerminal("²");
			Thread.sleep(120);
		}
		
		for (int j=0; j<11;j++) {
			Principal.escribeTerminal("Û");
			Thread.sleep(100);
		}
		
		Principal.borrarTerminal();
		Principal.escribeTerminal("C:\\>");
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(300);
		Principal.escribeTerminal(":");
		Thread.sleep(150);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Principal.escribeTerminal("A:\\>");
		Thread.sleep(90);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(100);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(90);
		Principal.escribeTerminal(" ");
		Thread.sleep(50);
		r.keyPress(KeyEvent.VK_S);
		r.keyRelease(KeyEvent.VK_S);
		Thread.sleep(100);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		Thread.sleep(110);
		r.keyPress(KeyEvent.VK_F);
		r.keyRelease(KeyEvent.VK_F);
		Thread.sleep(90);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(120);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(100);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(100);
		r.keyPress(KeyEvent.VK_R);
		r.keyRelease(KeyEvent.VK_R);
		Thread.sleep(110);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		Thread.sleep(90);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		Principal.escribeTerminal("A:\\SOFTWARE>");
		Thread.sleep(800);
		r.keyPress(KeyEvent.VK_H);
		r.keyRelease(KeyEvent.VK_H);
		Thread.sleep(110);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		Thread.sleep(90);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		Thread.sleep(80);
		r.keyPress(KeyEvent.VK_K);
		r.keyRelease(KeyEvent.VK_K);
		Thread.sleep(100);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(100);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		Thread.sleep(110);
		r.keyPress(KeyEvent.VK_O);
		r.keyRelease(KeyEvent.VK_O);
		Thread.sleep(90);
		r.keyPress(KeyEvent.VK_L);
		r.keyRelease(KeyEvent.VK_L);
		Thread.sleep(120);
		Principal.escribeTerminal(".");
		Thread.sleep(120);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		Thread.sleep(100);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_X);
		Thread.sleep(90);
		r.keyPress(KeyEvent.VK_E);
		r.keyRelease(KeyEvent.VK_E);
		Thread.sleep(300);
		Principal.escribeTerminal("\nCargando password HACKTOOL v1.43");
		Thread.sleep(1000);
		Principal.escribeTerminal(".");
		Thread.sleep(900);
		Principal.escribeTerminal(".");
		Thread.sleep(900);
		Principal.escribeTerminal(".");
		Thread.sleep(1300);
		Principal.borrarTerminal();
		Principal.escribeTerminal(  "°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" + 
									"°  °°°°  °°°°°  °°°°°°°     °°°  °°°°  °°\n" + 
									"±  ±±±±  ±±±±    ±±±±±  ±±±  ±±  ±±±  ±±±\n" + 
									"±  ±±±±  ±±±  ±±  ±±±  ±±±±±±±±  ±±  ±±±±\n" + 
									"²  ²²²²  ²²  ²²²²  ²²  ²²²²²²²²  ²  ²²²²²\n" + 
									"²        ²²  ²²²²  ²²  ²²²²²²²²     ²²²²²\n" + 
									"±  ±±±±  ±±        ±±  ±±±±±±±±  ±±  ±±±±\n" + 
									"±  ±±±±  ±±  ±±±±  ±±±  ±±±  ±±  ±±±  ±±±\n" + 
									"°  °°°°  °°  °°°°  °°°°     °°°  °°°°  °°\n" + 
									"°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°\n" +
									"    |''||''| .|''''|, .|''''|, '||       \n" + 
									"       ||    ||    || ||    ||  ||       \n" + 
									"      ||    ||    || ||    ||  ||        \n" + 
									"     .||.   `|....|' `|....|' .||...|v1.4\n");

		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Principal.borrarTerminal();
		Principal.escribeTerminal("ÉÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍ»"
							  + "\nº                                       º" 
							  + "\nº    Bienvenido a password HACKTOOL     º"
							  + "\nº                                       º" 
							  + "\nº   Este software ha sido creado para   º"
							  + "\nº hackear los passwords de un terminal. º" 
							  + "\nº                                       º"
							  + "\nº    Deberas averiguar que letras son   º" 
							  + "\nº   correctas antes de que te detecten  º"
							  + "\nº                                       º"  
							  + "\nº     Tienes solo 6 intentos asi que    º"
							  + "\nº deberias meditar bien tus decisiones. º" 
							  + "\nº                                       º"
							  + "\nÈÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍÍ¼\n");
		Thread.sleep(12000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
}
