package interfaz;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import java.io.InputStream;
import java.awt.ComponentOrientation;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;

/**
 * 	Clase con la interfaz gr·fica.
 */

@SuppressWarnings("serial")
public class principal extends JFrame {
	
	private static char letrapulsada = ' ';
	private static JTextArea Terminal = new JTextArea();
	private static JLabel lblPantallita = new JLabel("");
	private JPanel contentPane;

	/**
	 *  Carga de la aplicaciÛn.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					principal frame = new principal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 *  CreaciÛn de la ventana principal.
	 */
	
	public principal() throws InterruptedException, FontFormatException {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 703);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		iniciaTerminal();
		
		/**
		 *  Botones para el teclado en pantalla.
		 */
		
		JButton teclaQ = new JButton("");
		teclaQ.setRequestFocusEnabled(false);		
		teclaQ.setFocusPainted(false);
		teclaQ.setActionCommand("Q");
		teclaQ.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaQ.setContentAreaFilled(false);
		teclaQ.setBorderPainted(false);
		teclaQ.setBorder(null);
		teclaQ.setBackground(Color.LIGHT_GRAY);
		teclaQ.setMinimumSize(new Dimension(26, 26));
		teclaQ.setMaximumSize(new Dimension(26, 26));
		teclaQ.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaQ.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/Q_pressed.png")));
		teclaQ.setOpaque(false);
		teclaQ.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaQ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaQ.setBounds(88, 530, 24, 28);
		teclaQ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("Q");
                letrapulsada = 'Q';
            }
        });
        getContentPane().add(teclaQ);
		contentPane.add(teclaQ);
		
		JButton teclaW = new JButton("");
		teclaW.setRequestFocusEnabled(false);
		teclaW.setFocusPainted(false);
		teclaW.setActionCommand("W");
		teclaW.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaW.setContentAreaFilled(false);
		teclaW.setBorderPainted(false);
		teclaW.setBorder(null);
		teclaW.setBackground(Color.LIGHT_GRAY);
		teclaW.setMinimumSize(new Dimension(26, 26));
		teclaW.setMaximumSize(new Dimension(26, 26));
		teclaW.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaW.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/W_pressed.png")));
		teclaW.setOpaque(false);
		teclaW.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaW.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaW.setBounds(114, 530, 24, 28);
		teclaW.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("W");
                letrapulsada = 'W';
            }
        });
        getContentPane().add(teclaW);
		contentPane.add(teclaW);
		
		JButton teclaE = new JButton("");
		teclaE.setRequestFocusEnabled(false);
		teclaE.setFocusPainted(false);
		teclaE.setActionCommand("E");
		teclaE.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaE.setContentAreaFilled(false);
		teclaE.setBorderPainted(false);
		teclaE.setBorder(null);
		teclaE.setBackground(Color.LIGHT_GRAY);
		teclaE.setMinimumSize(new Dimension(26, 26));
		teclaE.setMaximumSize(new Dimension(26, 26));
		teclaE.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaE.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/E_pressed.png")));
		teclaE.setOpaque(false);
		teclaE.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaE.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaE.setBounds(139, 530, 24, 28);
		teclaE.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("E");
                letrapulsada = 'E';
            }
        });
        getContentPane().add(teclaE);
		contentPane.add(teclaE);
		
		JButton teclaR = new JButton("");
		teclaR.setRequestFocusEnabled(false);
		teclaR.setFocusPainted(false);
		teclaR.setActionCommand("R");
		teclaR.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaR.setContentAreaFilled(false);
		teclaR.setBorderPainted(false);
		teclaR.setBorder(null);
		teclaR.setBackground(Color.LIGHT_GRAY);
		teclaR.setMinimumSize(new Dimension(26, 26));
		teclaR.setMaximumSize(new Dimension(26, 26));
		teclaR.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaR.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/R_pressed.png")));
		teclaR.setOpaque(false);
		teclaR.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaR.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaR.setBounds(165, 530, 24, 28);
		teclaR.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("R");
                letrapulsada = 'R';
            }
        });
        getContentPane().add(teclaR);
		contentPane.add(teclaR);
		
		JButton teclaT = new JButton("");
		teclaT.setRequestFocusEnabled(false);
		teclaT.setFocusPainted(false);
		teclaT.setActionCommand("T");
		teclaT.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaT.setContentAreaFilled(false);
		teclaT.setBorderPainted(false);
		teclaT.setBorder(null);
		teclaT.setBackground(Color.LIGHT_GRAY);
		teclaT.setMinimumSize(new Dimension(26, 26));
		teclaT.setMaximumSize(new Dimension(26, 26));
		teclaT.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaT.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/T_pressed.png")));
		teclaT.setOpaque(false);
		teclaT.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaT.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaT.setBounds(190, 530, 24, 28);
		teclaT.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("T");
                letrapulsada = 'T';
            }
        });
        getContentPane().add(teclaT);
		contentPane.add(teclaT);
		
		JButton teclaY = new JButton("");
		teclaY.setRequestFocusEnabled(false);
		teclaY.setFocusPainted(false);
		teclaY.setActionCommand("Y");
		teclaY.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaY.setContentAreaFilled(false);
		teclaY.setBorderPainted(false);
		teclaY.setBorder(null);
		teclaY.setBackground(Color.LIGHT_GRAY);
		teclaY.setMinimumSize(new Dimension(26, 26));
		teclaY.setMaximumSize(new Dimension(26, 26));
		teclaY.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaY.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/Y_pressed.png")));
		teclaY.setOpaque(false);
		teclaY.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaY.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaY.setBounds(216, 530, 24, 28);
		teclaY.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("Y");
                letrapulsada = 'Y';
            }
        });
        getContentPane().add(teclaY);
		contentPane.add(teclaY);
		
		JButton teclaU = new JButton("");
		teclaU.setRequestFocusEnabled(false);
		teclaU.setFocusPainted(false);
		teclaU.setActionCommand("U");
		teclaU.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaU.setContentAreaFilled(false);
		teclaU.setBorderPainted(false);
		teclaU.setBorder(null);
		teclaU.setBackground(Color.LIGHT_GRAY);
		teclaU.setMinimumSize(new Dimension(26, 26));
		teclaU.setMaximumSize(new Dimension(26, 26));
		teclaU.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaU.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/U_pressed.png")));
		teclaU.setOpaque(false);
		teclaU.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaU.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaU.setBounds(242, 530, 24, 28);
		teclaU.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("U");
                letrapulsada = 'U';
            }
        });
        getContentPane().add(teclaU);
		contentPane.add(teclaU);
		
		JButton teclaI = new JButton("");
		teclaI.setRequestFocusEnabled(false);
		teclaI.setFocusPainted(false);
		teclaI.setActionCommand("I");
		teclaI.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaI.setContentAreaFilled(false);
		teclaI.setBorderPainted(false);
		teclaI.setBorder(null);
		teclaI.setBackground(Color.LIGHT_GRAY);
		teclaI.setMinimumSize(new Dimension(26, 26));
		teclaI.setMaximumSize(new Dimension(26, 26));
		teclaI.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaI.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/I_pressed.png")));
		teclaI.setOpaque(false);
		teclaI.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaI.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaI.setBounds(267, 530, 24, 28);
		teclaI.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("I");
                letrapulsada = 'I';
            }
        });
        getContentPane().add(teclaI);
		contentPane.add(teclaI);
		
		JButton teclaO = new JButton("");
		teclaO.setRequestFocusEnabled(false);
		teclaO.setFocusPainted(false);
		teclaO.setActionCommand("O");
		teclaO.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaO.setContentAreaFilled(false);
		teclaO.setBorderPainted(false);
		teclaO.setBorder(null);
		teclaO.setBackground(Color.LIGHT_GRAY);
		teclaO.setMinimumSize(new Dimension(26, 26));
		teclaO.setMaximumSize(new Dimension(26, 26));
		teclaO.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaO.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/O_pressed.png")));
		teclaO.setOpaque(false);
		teclaO.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaO.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaO.setBounds(292, 530, 24, 28);
		teclaO.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("O");
                letrapulsada = 'O';
            }
        });
        getContentPane().add(teclaO);
		contentPane.add(teclaO);
		
		JButton teclaP = new JButton("");
		teclaP.setRequestFocusEnabled(false);
		teclaP.setFocusPainted(false);
		teclaP.setActionCommand("P");
		teclaP.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaP.setContentAreaFilled(false);
		teclaP.setBorderPainted(false);
		teclaP.setBorder(null);
		teclaP.setBackground(Color.LIGHT_GRAY);
		teclaP.setMinimumSize(new Dimension(26, 26));
		teclaP.setMaximumSize(new Dimension(26, 26));
		teclaP.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaP.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/P_pressed.png")));
		teclaP.setOpaque(false);
		teclaP.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaP.setBounds(318, 530, 24, 28);
		teclaP.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("P");
                letrapulsada = 'P';
            }
        });
        getContentPane().add(teclaP);
		contentPane.add(teclaP);
		
		JButton teclaA = new JButton("");
		teclaA.setRequestFocusEnabled(false);
		teclaA.setFocusPainted(false);
		teclaA.setActionCommand("A");
		teclaA.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaA.setContentAreaFilled(false);
		teclaA.setBorderPainted(false);
		teclaA.setBorder(null);
		teclaA.setBackground(Color.LIGHT_GRAY);
		teclaA.setMinimumSize(new Dimension(26, 26));
		teclaA.setMaximumSize(new Dimension(26, 26));
		teclaA.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaA.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/A_pressed.png")));
		teclaA.setOpaque(false);
		teclaA.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaA.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaA.setBounds(95, 554, 24, 28);
		teclaA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("A");
                letrapulsada = 'A';
            }
        });
        getContentPane().add(teclaA);
		contentPane.add(teclaA);
		
		JButton teclaS = new JButton("");
		teclaS.setRequestFocusEnabled(false);
		teclaS.setFocusPainted(false);
		teclaS.setActionCommand("S");
		teclaS.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaS.setContentAreaFilled(false);
		teclaS.setBorderPainted(false);
		teclaS.setBorder(null);
		teclaS.setBackground(Color.LIGHT_GRAY);
		teclaS.setMinimumSize(new Dimension(26, 26));
		teclaS.setMaximumSize(new Dimension(26, 26));
		teclaS.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaS.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/S_pressed.png")));
		teclaS.setOpaque(false);
		teclaS.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaS.setBounds(121, 554, 24, 28);
		teclaS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("S");
                letrapulsada = 'S';
            }
        });
        getContentPane().add(teclaS);
		contentPane.add(teclaS);
		
		JButton teclaD = new JButton("");
		teclaD.setRequestFocusEnabled(false);
		teclaD.setFocusPainted(false);
		teclaD.setActionCommand("D");
		teclaD.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaD.setContentAreaFilled(false);
		teclaD.setBorderPainted(false);
		teclaD.setBorder(null);
		teclaD.setBackground(Color.LIGHT_GRAY);
		teclaD.setMinimumSize(new Dimension(26, 26));
		teclaD.setMaximumSize(new Dimension(26, 26));
		teclaD.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaD.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/D_pressed.png")));
		teclaD.setOpaque(false);
		teclaD.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaD.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaD.setBounds(146, 554, 24, 28);
		teclaD.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("D");
                letrapulsada = 'D';
            }
        });
        getContentPane().add(teclaD);
		contentPane.add(teclaD);
		
		JButton teclaF = new JButton("");
		teclaF.setRequestFocusEnabled(false);
		teclaF.setFocusPainted(false);
		teclaF.setActionCommand("F");
		teclaF.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaF.setContentAreaFilled(false);
		teclaF.setBorderPainted(false);
		teclaF.setBorder(null);
		teclaF.setBackground(Color.LIGHT_GRAY);
		teclaF.setMinimumSize(new Dimension(26, 26));
		teclaF.setMaximumSize(new Dimension(26, 26));
		teclaF.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaF.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/F_pressed.png")));
		teclaF.setOpaque(false);
		teclaF.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaF.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaF.setBounds(172, 554, 24, 28);
		teclaF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("F");
                letrapulsada = 'F';
            }
        });
        getContentPane().add(teclaF);
		contentPane.add(teclaF);
		
		JButton teclaG = new JButton("");
		teclaG.setRequestFocusEnabled(false);
		teclaG.setFocusPainted(false);
		teclaG.setActionCommand("G");
		teclaG.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaG.setContentAreaFilled(false);
		teclaG.setBorderPainted(false);
		teclaG.setBorder(null);
		teclaG.setBackground(Color.LIGHT_GRAY);
		teclaG.setMinimumSize(new Dimension(26, 26));
		teclaG.setMaximumSize(new Dimension(26, 26));
		teclaG.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaG.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/G_pressed.png")));
		teclaG.setOpaque(false);
		teclaG.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaG.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaG.setBounds(197, 554, 24, 28);
		teclaG.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("G");
                letrapulsada = 'G';
            }
        });
        getContentPane().add(teclaG);
		contentPane.add(teclaG);
		
		JButton teclaH = new JButton("");
		teclaH.setRequestFocusEnabled(false);
		teclaH.setFocusPainted(false);
		teclaH.setActionCommand("H");
		teclaH.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaH.setContentAreaFilled(false);
		teclaH.setBorderPainted(false);
		teclaH.setBorder(null);
		teclaH.setBackground(Color.LIGHT_GRAY);
		teclaH.setMinimumSize(new Dimension(26, 26));
		teclaH.setMaximumSize(new Dimension(26, 26));
		teclaH.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaH.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/H_pressed.png")));
		teclaH.setOpaque(false);
		teclaH.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaH.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaH.setBounds(223, 554, 24, 28);
		teclaH.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("H");
                letrapulsada = 'H';
            }
        });
        getContentPane().add(teclaH);
		contentPane.add(teclaH);
		
		JButton teclaJ = new JButton("");
		teclaJ.setRequestFocusEnabled(false);
		teclaJ.setFocusPainted(false);
		teclaJ.setActionCommand("J");
		teclaJ.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaJ.setContentAreaFilled(false);
		teclaJ.setBorderPainted(false);
		teclaJ.setBorder(null);
		teclaJ.setBackground(Color.LIGHT_GRAY);
		teclaJ.setMinimumSize(new Dimension(26, 26));
		teclaJ.setMaximumSize(new Dimension(26, 26));
		teclaJ.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaJ.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/J_pressed.png")));
		teclaJ.setOpaque(false);
		teclaJ.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaJ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaJ.setBounds(249, 554, 24, 28);
		teclaJ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("J");
                letrapulsada = 'J';
            }
        });
        getContentPane().add(teclaJ);
		contentPane.add(teclaJ);
		
		JButton teclaK = new JButton("");
		teclaK.setRequestFocusEnabled(false);
		teclaK.setFocusPainted(false);
		teclaK.setActionCommand("K");
		teclaK.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaK.setContentAreaFilled(false);
		teclaK.setBorderPainted(false);
		teclaK.setBorder(null);
		teclaK.setBackground(Color.LIGHT_GRAY);
		teclaK.setMinimumSize(new Dimension(26, 26));
		teclaK.setMaximumSize(new Dimension(26, 26));
		teclaK.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaK.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/K_pressed.png")));
		teclaK.setOpaque(false);
		teclaK.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaK.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaK.setBounds(274, 554, 24, 28);
		teclaK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("K");
                letrapulsada = 'K';
            }
        });
        getContentPane().add(teclaK);
		contentPane.add(teclaK);
		
		JButton teclaL = new JButton("");
		teclaL.setRequestFocusEnabled(false);
		teclaL.setFocusPainted(false);
		teclaL.setActionCommand("L");
		teclaL.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaL.setContentAreaFilled(false);
		teclaL.setBorderPainted(false);
		teclaL.setBorder(null);
		teclaL.setBackground(Color.LIGHT_GRAY);
		teclaL.setMinimumSize(new Dimension(26, 26));
		teclaL.setMaximumSize(new Dimension(26, 26));
		teclaL.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaL.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/L_pressed.png")));
		teclaL.setOpaque(false);
		teclaL.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaL.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaL.setBounds(300, 554, 24, 28);
		teclaL.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("L");
                letrapulsada = 'L';
            }
        });
        getContentPane().add(teclaL);
		contentPane.add(teclaL);
		
		JButton tecla— = new JButton("");
		tecla—.setRequestFocusEnabled(false);
		tecla—.setFocusPainted(false);
		tecla—.setActionCommand("—");
		tecla—.setHorizontalTextPosition(SwingConstants.CENTER);
		tecla—.setContentAreaFilled(false);
		tecla—.setBorderPainted(false);
		tecla—.setBorder(null);
		tecla—.setBackground(Color.LIGHT_GRAY);
		tecla—.setMinimumSize(new Dimension(26, 26));
		tecla—.setMaximumSize(new Dimension(26, 26));
		tecla—.setFont(new Font("Tahoma", Font.PLAIN, 5));
		tecla—.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/—_pressed.png")));
		tecla—.setOpaque(false);
		tecla—.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		tecla—.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		tecla—.setBounds(325, 554, 24, 28);
		tecla—.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("~");
                letrapulsada = '—';
            }
        });
        getContentPane().add(tecla—);
		contentPane.add(tecla—);
		
		JButton teclaZ = new JButton("");
		teclaZ.setRequestFocusEnabled(false);
		teclaZ.setFocusPainted(false);
		teclaZ.setActionCommand("Z");
		teclaZ.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaZ.setContentAreaFilled(false);
		teclaZ.setBorderPainted(false);
		teclaZ.setBorder(null);
		teclaZ.setBackground(Color.LIGHT_GRAY);
		teclaZ.setMinimumSize(new Dimension(26, 26));
		teclaZ.setMaximumSize(new Dimension(26, 26));
		teclaZ.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaZ.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/Z_pressed.png")));
		teclaZ.setOpaque(false);
		teclaZ.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaZ.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaZ.setBounds(108, 579, 24, 28);
		teclaZ.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("Z");
                letrapulsada = 'Z';
            }
        });
        getContentPane().add(teclaZ);
		contentPane.add(teclaZ);
		
		JButton teclaX = new JButton("");
		teclaX.setRequestFocusEnabled(false);
		teclaX.setFocusPainted(false);
		teclaX.setActionCommand("X");
		teclaX.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaX.setContentAreaFilled(false);
		teclaX.setBorderPainted(false);
		teclaX.setBorder(null);
		teclaX.setBackground(Color.LIGHT_GRAY);
		teclaX.setMinimumSize(new Dimension(26, 26));
		teclaX.setMaximumSize(new Dimension(26, 26));
		teclaX.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaX.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/X_pressed.png")));
		teclaX.setOpaque(false);
		teclaX.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaX.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaX.setBounds(134, 579, 24, 28);
		teclaX.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("X");
                letrapulsada = 'X';
            }
        });
        getContentPane().add(teclaX);
		contentPane.add(teclaX);
		
		JButton teclaC = new JButton("");
		teclaC.setRequestFocusEnabled(false);
		teclaC.setFocusPainted(false);
		teclaC.setActionCommand("C");
		teclaC.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaC.setContentAreaFilled(false);
		teclaC.setBorderPainted(false);
		teclaC.setBorder(null);
		teclaC.setBackground(Color.LIGHT_GRAY);
		teclaC.setMinimumSize(new Dimension(26, 26));
		teclaC.setMaximumSize(new Dimension(26, 26));
		teclaC.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaC.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/C_pressed.png")));
		teclaC.setOpaque(false);
		teclaC.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaC.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaC.setBounds(160, 579, 24, 28);
		teclaC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("C");
                letrapulsada = 'C';
            }
        });
        getContentPane().add(teclaC);
		contentPane.add(teclaC);
		
		JButton teclaV = new JButton("");
		teclaV.setRequestFocusEnabled(false);
		teclaV.setFocusPainted(false);
		teclaV.setActionCommand("V");
		teclaV.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaV.setContentAreaFilled(false);
		teclaV.setBorderPainted(false);
		teclaV.setBorder(null);
		teclaV.setBackground(Color.LIGHT_GRAY);
		teclaV.setMinimumSize(new Dimension(26, 26));
		teclaV.setMaximumSize(new Dimension(26, 26));
		teclaV.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaV.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/V_pressed.png")));
		teclaV.setOpaque(false);
		teclaV.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaV.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaV.setBounds(185, 579, 24, 28);
		teclaV.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("V");
                letrapulsada = 'V';
            }
        });
        getContentPane().add(teclaV);
		contentPane.add(teclaV);
		
		JButton teclaB = new JButton("");
		teclaB.setRequestFocusEnabled(false);
		teclaB.setFocusPainted(false);
		teclaB.setActionCommand("B");
		teclaB.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaB.setContentAreaFilled(false);
		teclaB.setBorderPainted(false);
		teclaB.setBorder(null);
		teclaB.setBackground(Color.LIGHT_GRAY);
		teclaB.setMinimumSize(new Dimension(26, 26));
		teclaB.setMaximumSize(new Dimension(26, 26));
		teclaB.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaB.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/B_pressed.png")));
		teclaB.setOpaque(false);
		teclaB.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaB.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaB.setBounds(211, 579, 24, 28);
		teclaB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("B");
                letrapulsada = 'B';
            }
        });
        getContentPane().add(teclaB);
		contentPane.add(teclaB);
		
		JButton teclaN = new JButton("");
		teclaN.setRequestFocusEnabled(false);
		teclaN.setFocusPainted(false);
		teclaN.setActionCommand("N");
		teclaN.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaN.setContentAreaFilled(false);
		teclaN.setBorderPainted(false);
		teclaN.setBorder(null);
		teclaN.setBackground(Color.LIGHT_GRAY);
		teclaN.setMinimumSize(new Dimension(26, 26));
		teclaN.setMaximumSize(new Dimension(26, 26));
		teclaN.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaN.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/N_pressed.png")));
		teclaN.setOpaque(false);
		teclaN.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaN.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaN.setBounds(236, 579, 24, 28);
		teclaN.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("N");
                letrapulsada = 'N';
            }
        });
        getContentPane().add(teclaN);
		contentPane.add(teclaN);
		
		JButton teclaM = new JButton("");
		teclaM.setRequestFocusEnabled(false);
		teclaM.setFocusPainted(false);
		teclaM.setActionCommand("M");
		teclaM.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaM.setContentAreaFilled(false);
		teclaM.setBorderPainted(false);
		teclaM.setBorder(null);
		teclaM.setBackground(Color.LIGHT_GRAY);
		teclaM.setMinimumSize(new Dimension(26, 26));
		teclaM.setMaximumSize(new Dimension(26, 26));
		teclaM.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaM.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/M_pressed.png")));
		teclaM.setOpaque(false);
		teclaM.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaM.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaM.setBounds(262, 579, 24, 28);
		teclaM.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("M");
                letrapulsada = 'M';
            }
        });
        getContentPane().add(teclaM);
		contentPane.add(teclaM);
		
		JButton teclaIntro = new JButton("");
		teclaIntro.setRequestFocusEnabled(false);
		teclaIntro.setFocusPainted(false);
		teclaIntro.setHorizontalAlignment(SwingConstants.LEFT);
		teclaIntro.setActionCommand("Intro");
		teclaIntro.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaIntro.setContentAreaFilled(false);
		teclaIntro.setBorderPainted(false);
		teclaIntro.setBorder(null);
		teclaIntro.setBackground(Color.LIGHT_GRAY);
		teclaIntro.setMinimumSize(new Dimension(58, 26));
		teclaIntro.setMaximumSize(new Dimension(58, 26));
		teclaIntro.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaIntro.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/Intro_pressed.png")));
		teclaIntro.setOpaque(false);
		teclaIntro.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaIntro.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaIntro.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Terminal.append("\n");
                letrapulsada = '\n';
            }
        });
        getContentPane().add(teclaIntro);
		teclaIntro.setBounds(376, 554, 58, 28);
		contentPane.add(teclaIntro);
		
		JButton teclaF1 = new JButton("");
		teclaF1.setRequestFocusEnabled(false);
		teclaF1.setFocusPainted(false);
		teclaF1.setHorizontalAlignment(SwingConstants.LEFT);
		teclaF1.setActionCommand("F1");
		teclaF1.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaF1.setContentAreaFilled(false);
		teclaF1.setBorderPainted(false);
		teclaF1.setBorder(null);
		teclaF1.setBackground(Color.LIGHT_GRAY);
		teclaF1.setMinimumSize(new Dimension(27, 27));
		teclaF1.setMaximumSize(new Dimension(27, 27));
		teclaF1.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaF1.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/F1pressed.png"))); //cambiar a nombre imagen
		teclaF1.setOpaque(false);
		teclaF1.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaF1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaF1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                letrapulsada = '1';
            }
        });
        getContentPane().add(teclaF1);
		teclaF1.setBounds(104, 458, 27, 27);
		contentPane.add(teclaF1);
		
		JButton teclaF2 = new JButton("");
		teclaF2.setRequestFocusEnabled(false);
		teclaF2.setFocusPainted(false);
		teclaF2.setHorizontalAlignment(SwingConstants.LEFT);
		teclaF2.setActionCommand("F2");
		teclaF2.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaF2.setContentAreaFilled(false);
		teclaF2.setBorderPainted(false);
		teclaF2.setBorder(null);
		teclaF2.setBackground(Color.LIGHT_GRAY);
		teclaF2.setMinimumSize(new Dimension(26, 26));
		teclaF2.setMaximumSize(new Dimension(26, 26));
		teclaF2.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaF2.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/F2pressed.png")));
		teclaF2.setOpaque(false);
		teclaF2.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaF2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaF2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                letrapulsada = '2';
            }
        });
        getContentPane().add(teclaF2);
		teclaF2.setBounds(131, 458, 26, 26);
		contentPane.add(teclaF2);
		
		JButton teclaF3 = new JButton("");
		teclaF3.setRequestFocusEnabled(false);
		teclaF3.setFocusPainted(false);
		teclaF3.setHorizontalAlignment(SwingConstants.LEFT);
		teclaF3.setActionCommand("F3");
		teclaF3.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaF3.setContentAreaFilled(false);
		teclaF3.setBorderPainted(false);
		teclaF3.setBorder(null);
		teclaF3.setBackground(Color.LIGHT_GRAY);
		teclaF3.setMinimumSize(new Dimension(26, 26));
		teclaF3.setMaximumSize(new Dimension(26, 26));
		teclaF3.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaF3.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/F3pressed.png")));
		teclaF3.setOpaque(false);
		teclaF3.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaF3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaF3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                letrapulsada = '3';
            }
        });
        getContentPane().add(teclaF3);
		teclaF3.setBounds(157, 458, 26, 26);
		contentPane.add(teclaF3);
		
		JButton teclaF4 = new JButton("");
		teclaF4.setRequestFocusEnabled(false);
		teclaF4.setFocusPainted(false);
		teclaF4.setHorizontalAlignment(SwingConstants.LEFT);
		teclaF4.setActionCommand("F4");
		teclaF4.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaF4.setContentAreaFilled(false);
		teclaF4.setBorderPainted(false);
		teclaF4.setBorder(null);
		teclaF4.setBackground(Color.LIGHT_GRAY);
		teclaF4.setMinimumSize(new Dimension(27, 26));
		teclaF4.setMaximumSize(new Dimension(27, 26));
		teclaF4.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaF4.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/F4pressed.png")));
		teclaF4.setOpaque(false);
		teclaF4.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaF4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaF4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                letrapulsada = '4';
            }
        });
        getContentPane().add(teclaF4);
		teclaF4.setBounds(183, 458, 27, 26);
		contentPane.add(teclaF4);
		
		JButton teclaEsc = new JButton("");
		teclaEsc.setRequestFocusEnabled(false);
		teclaEsc.setFocusPainted(false);
		teclaEsc.setHorizontalAlignment(SwingConstants.LEFT);
		teclaEsc.setActionCommand("Escape");
		teclaEsc.setHorizontalTextPosition(SwingConstants.CENTER);
		teclaEsc.setContentAreaFilled(false);
		teclaEsc.setBorderPainted(false);
		teclaEsc.setBorder(null);
		teclaEsc.setBackground(Color.LIGHT_GRAY);
		teclaEsc.setMinimumSize(new Dimension(27, 26));
		teclaEsc.setMaximumSize(new Dimension(27, 26));
		teclaEsc.setFont(new Font("Tahoma", Font.PLAIN, 5));
		teclaEsc.setPressedIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaEsc.setOpaque(false);
		teclaEsc.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tecla.png")));
		teclaEsc.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		teclaEsc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	System.exit(0);
            }
        });
        getContentPane().add(teclaEsc);
		teclaEsc.setBounds(0, 0, 27, 26);
		contentPane.add(teclaEsc);
		
		/**
		 *  KeyListener para el teclado. Aqui se enlaza el teclado fÌsico con el
		 *  de la interfaz.
		 */
		
		teclaEsc.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				JButton [] botones = { teclaQ,teclaW,teclaE,teclaR,teclaT,teclaY,teclaU,teclaI,teclaO,teclaP,teclaA,teclaS,teclaD,teclaF,teclaG,teclaH,teclaJ,teclaK,teclaL,tecla—,teclaZ,teclaX,teclaC,teclaV,teclaB,teclaN,teclaM,teclaIntro } ;
				
				char [] teclitas = { 'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','—','Z','X','C','V','B','N','M','\n' };				

				if (e.getKeyCode() == KeyEvent.VK_SPACE ) {
			        e.consume();
			    }
				else if (e.getKeyCode() == KeyEvent.VK_ESCAPE ) {
					teclaEsc.doClick();
				}
				else if (e.getKeyCode() == KeyEvent.VK_F1 ) {
					teclaF1.doClick();
				}
				else if (e.getKeyCode() == KeyEvent.VK_F2 ) {
					teclaF2.doClick();
				}
				else if (e.getKeyCode() == KeyEvent.VK_F3 ) {
					teclaF3.doClick();
				}
				else if (e.getKeyCode() == KeyEvent.VK_F4 ) {
					teclaF4.doClick();
				}
					for (int j=0;j<botones.length;j++){
						
						if (Character.toUpperCase(e.getKeyChar())== teclitas[j]) {
							
							botones[j].doClick();

						}
				}
					
			}
			
		});
				
		lblPantallita.setBounds(901, 148, 110, 108);
		contentPane.add(lblPantallita);
		
		JLabel lblGato = new JLabel("gato");
		lblGato.setIcon(new ImageIcon(principal.class.getResource("/imagenes/gato.gif")));
		lblGato.setBounds(898, 290, 100, 70);
		contentPane.add(lblGato);
				
		JLabel lblFondo = new JLabel("fondo");
		lblFondo.setRequestFocusEnabled(false);
		lblFondo.setIcon(new ImageIcon(principal.class.getResource("/imagenes/fondo2.png")));
		lblFondo.setBounds(0, 0, 1080, 675);
		contentPane.add(lblFondo);
		
	}
	
	/**
	 *  Inicia la pantalla del juego. 
	 */
	
	public void iniciaTerminal(){
		
		Terminal.setAutoscrolls(false);
		Terminal.setEditable(false);		
		Terminal.setRequestFocusEnabled(false);
		Terminal.setFocusable(false);		
		Terminal.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		Terminal.setBackground(Color.BLACK);
		Terminal.setForeground(Color.GREEN);

		/**
		 *  Creacion de fuente personalizada.
		 */
	
		try {
			
		    //CreaciÛn del nuevo objeto con la fuente a importar y el tamaÒo.
			InputStream is = this.getClass().getResourceAsStream("/resources/ModerDOS.ttf");
		    Font customFont = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(16f);
		    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		    //Registra la fuente para su uso
		    ge.registerFont(customFont);
		    
			Terminal.setFont(customFont);
		} catch (IOException e) {
		    e.printStackTrace();
		} catch(FontFormatException e) {
		    e.printStackTrace();
		}
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setWheelScrollingEnabled(false);
		scrollPane.setAutoscrolls(true);
		scrollPane.setRequestFocusEnabled(true);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBorder(null);
		scrollPane.setFocusable(false);
		scrollPane.setForeground(Color.LIGHT_GRAY);
		scrollPane.setBackground(Color.BLACK);
		scrollPane.setBounds(353, 74, 369, 278);
		contentPane.add(scrollPane);
		scrollPane.add(Terminal);
		Terminal.setBounds(353, 74, 369, 278);
		scrollPane.setViewportView(Terminal);
		
	}
	
	/**
	 *  Los siguientes metodos sirven para interactuar con 
	 *  la interfaz desde el resto de clases del programa.
	 */
	
	public static void escribeTerminal(String frase) {
		
		Terminal.append(frase);
		
	}
	
	public static void borrarTerminal() {
		
		Terminal.setText("");
		
	}
	
	public static char leerLetra() {
		char pulsada = letrapulsada;
		letrapulsada = ' ';
		System.out.println(pulsada);
		return pulsada;
		
	}
	
	public static void muestraPantalla(int evento) {
		
		switch (evento) {
		
		case 6:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/vidas6.png")));
			break;
		case 5:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/vidas5.png")));
			break;
		case 4:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/vidas4.png")));
			break;
		case 3:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/vidas3.png")));
			break;
			
		case 2:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/vidas2.png")));
			break;

		case 1:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/vidas1.png")));
			break;

		case 0:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/vidas0.png")));
			break;
			
		case 96:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/acierto.png")));
			break;
			
		case 97:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/fallo.png")));
			break;
			
		case 98:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/tuganas.png")));
			break;
			
		case 99:
			lblPantallita.setIcon(new ImageIcon(principal.class.getResource("/imagenes/gameover.png")));
			break;
		}
	}
}


