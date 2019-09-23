package tateti;
import javax.swing.*; 
import java.awt.*;
import java.awt.event.*; 
public class TaTeTi extends JFrame implements ActionListener{ 
	private JLabel label1, label2, label3;
	private JMenuBar mb;
    private JMenu menu1,menu2,menu3;
    private JMenuItem mi1,mi2,mi3,mi4, mi5, mi6, mi7;
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
	String a1, a2, a3, a4, a5, a6, a7, a8, a9 = "";
	public String actual = "X";
	public int turno = 1;

	public TaTeTi() {
		setLayout(null);
		label1 = new JLabel("Ta Te Ti");
		label1.setBounds(80,-10,1050,100);
		add(label1);
		Font auxFont=label1.getFont();
		label1.setFont(new Font(auxFont.getFontName(), auxFont.getStyle(), 40));
		label2 = new JLabel("Turno");
		label2.setBounds(380,40,1050,100);
		add(label2);
		Font auxFont1 =label2.getFont();
		label2.setFont(new Font(auxFont1.getFontName(), auxFont1.getStyle(), 30));
		label3 = new JLabel("  ");
		label3.setBounds(380,90,1050,100);
		add(label3);
		Font auxFont2 =label3.getFont();
		label3.setFont(new Font(auxFont2.getFontName(), auxFont2.getStyle(), 20));
		mb=new JMenuBar();
		setJMenuBar(mb);
		menu1 = new JMenu("Opciones");
		mb.add(menu1);
		menu2 = new JMenu("Tamaño de la ventana");
		menu1.add(menu2);
		menu3 = new JMenu("Color de fondo");
		menu1.add(menu3);
		mi1 = new JMenuItem("640*480");
		menu2.add(mi1);
		mi1.addActionListener(this);
		mi2 = new JMenuItem("1024*768");
		menu2.add(mi2);
		mi2.addActionListener(this);
		mi3 = new JMenuItem("Rojo");
		menu3.add(mi3);
		mi3.addActionListener(this);
		mi4 = new JMenuItem("Verde");
		menu3.add(mi4);
		mi4.addActionListener(this);
		mi5 = new JMenuItem("Gris");
		menu3.add(mi5);
		mi5.addActionListener(this);
		mi7 = new JMenuItem("Reiniciar");
		menu1.add(mi7);
		mi7.addActionListener(this);
		mi6 = new JMenuItem("Salir");
		menu1.add(mi6);
		mi6.addActionListener(this);
		b1 = new JButton("");
		b1.setBounds(10, 80, 100, 100);
		b1.addActionListener(this);
		add(b1);
		b2 = new JButton("");
		b2.setBounds(120, 80, 100, 100);
		b2.addActionListener(this);
		add(b2);
		b3 = new JButton("");
		b3.setBounds(230, 80, 100, 100);
		b3.addActionListener(this);
		add(b3);
		b4 = new JButton("");
		b4.setBounds(10, 190, 100, 100);
		b4.addActionListener(this);
		add(b4);
		b5 = new JButton("");
		b5.setBounds(120, 190, 100, 100);
		b5.addActionListener(this);
		add(b5);
		b6 = new JButton("");
		b6.setBounds(230, 190, 100, 100);
		b6.addActionListener(this);
		add(b6);
		b7 = new JButton("");
		b7.setBounds(10, 300, 100, 100);
		b7.addActionListener(this);
		add(b7);
		b8 = new JButton("");
		b8.setBounds(120, 300, 100, 100);
		b8.addActionListener(this);
		add(b8);
		b9 = new JButton("");
		b9.setBounds(230, 300, 100, 100);
		b9.addActionListener(this);
		add(b9);
	} 
 
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==mi1) {
            setSize(640,480);
        }
        if (e.getSource()==mi2) {
            setSize(1024,768);
        }
        if (e.getSource()==mi3) {
            getContentPane().setBackground(new Color(255,0,0));
        }
        if (e.getSource()==mi4) {
            getContentPane().setBackground(new Color(0,255,0));
        }
        if (e.getSource()==mi5) {
            getContentPane().setBackground(new Color(192,192,192));
        }
        if (e.getSource()==mi6) {
        	System.exit(0);
        }
        if (e.getSource()==mi7) {
        	reiniciar();
        }
		if (e.getSource() == b1) {
			b1.setText(actual);
			a1 = actual;
			b1.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		if (e.getSource() == b2) {
			b2.setText(actual);
			a2 = actual;
			b2.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		if (e.getSource() == b3) {
			b3.setText(actual);
			a3 = actual;
			b3.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		if (e.getSource() == b4) {
			b4.setText(actual);
			a4 = actual;
			b4.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		if (e.getSource() == b5) {
			b5.setText(actual);
			a5 = actual;
			b5.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		if (e.getSource() == b6) {
			b6.setText(actual);
			a6 = actual;
			b6.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		if (e.getSource() == b7) {
			b7.setText(actual);
			a7 = actual;
			b7.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		if (e.getSource() == b8) {
			b8.setText(actual);
			a8 = actual;
			b8.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		if (e.getSource() == b9) {
			b9.setText(actual);
			a9 = actual;
			b9.setEnabled(false);
			jugar(actual,turno);
			if (actual == "X") {
				actual = "O";
			} else actual = "X";
			turno++;
		}
		
		
	}
    
	public void jugar(String actual, int turno) {
		 if (actual == "X" && turno <= 9) {
			label3.setText("Jugador 2");
			Font auxFont2 = label3.getFont();
			label3.setFont(new Font(auxFont2.getFontName(), auxFont2.getStyle(), 20));
			if (verificar()) {
				Resultado re = new Resultado("Jugador 1 es el ganador");
				re.setBounds(20, 20, 400, 200);
				re.setVisible(true);
				reiniciar();
			}
		} else if (actual == "O" && turno <= 9) {
			label3.setText("Jugador 1");
			Font auxFont2 = label3.getFont();
			label3.setFont(new Font(auxFont2.getFontName(), auxFont2.getStyle(), 20));
			if (verificar()) {
				Resultado re = new Resultado("Jugador 2 es el ganador");
				re.setBounds(20, 20, 400, 200);
				re.setVisible(true);
				reiniciar();
			}
		} else {
			Resultado re = new Resultado("Empate");
			re.setBounds(20, 20, 400, 200);
			re.setVisible(true);
			reiniciar();
		}

	}
	
	public boolean verificar() {
		if (a1 == "X" && a2 == "X" && a3 == "X" || a4 == "X" && a5 == "X" && a6 == "X"
				|| a7 == "X" && a8 == "X" && a9 == "X" || a1 == "X" && a4 == "X" && a7 == "X"
				|| a2 == "X" && a5 == "X" && a8 == "X" || a3 == "X" && a6 == "X" && a9 == "X"
				|| a1 == "X" && a5 == "X" && a9 == "X" || a3 == "X" && a5 == "X" && a7 == "X") {
			
			return true;

		} else if (a1 == "O" && a2 == "O" && a3 == "O" || a4 == "O" && a5 == "O" && a6 == "O"
				|| a7 == "O" && a8 == "O" && a9 == "O" || a1 == "O" && a4 == "O" && a7 == "O"
				|| a2 == "O" && a5 == "O" && a8 == "O" || a3 == "O" && a6 == "O" && a9 == "O"
				|| a1 == "O" && a5 == "O" && a9 == "O" || a3 == "O" && a5 == "O" && a7 == "O") {
			return true;
		} else
			return false;
	}
	
	public void reiniciar() {
		b1.setText("");
		b2.setText("");
		b3.setText("");
		b4.setText("");
		b5.setText("");
		b6.setText("");
		b7.setText("");
		b8.setText("");
		b9.setText("");
		b1.setEnabled(true);
		b2.setEnabled(true);
		b3.setEnabled(true);
		b4.setEnabled(true);
		b5.setEnabled(true);
		b6.setEnabled(true);
		b7.setEnabled(true);
		b8.setEnabled(true);
		b9.setEnabled(true);
		actual = "X";
		a1 = "";
		a2 = "";
		a3 = "";
		a4 = "";
		a5 = "";
		a6 = "";
		a7 = "";
		a8 = "";
		a9 = "";
		turno = 1;
		label3.setText("Jugador 1");
		Font auxFont2 =label3.getFont();
		label3.setFont(new Font(auxFont2.getFontName(), auxFont2.getStyle(), 20));
	}

	public static void main(String[] ar) {
		TaTeTi tateti1;
		tateti1 = new TaTeTi();
		tateti1.setBounds(0, 0, 550, 600);
		tateti1.setVisible(true);
	}
}
