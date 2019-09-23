package tateti;
import javax.swing.*; 
import java.awt.event.*; 
class Resultado  extends JDialog implements ActionListener {
	JLabel label1;
	JButton button1;
	Resultado(String ganador){
		setResizable(false);
		setModal(true);
		setLayout(null);
		label1 = new JLabel("Resultado: " + ganador);
		label1.setBounds(20,10,350,80);
		button1 = new JButton("Aceptar");
		button1.addActionListener(this);
		button1.setBounds(80,90,80,40);
		add(label1);
		add(button1);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource () == button1)
			dispose();
	}

}
