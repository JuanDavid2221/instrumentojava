package Mouse;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.Color;

public class Ocultarmouse extends JFrame implements MouseListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel etiPal4;
	private JLabel etiPal3;
	private JLabel etiPal2;
	private JLabel etiPal1;
	private JLabel etiOcultar;

	public Ocultarmouse() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 185);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		etiPal1 = new JLabel("Peppa");
		etiPal1.setBackground(new Color(0, 0, 255));
		etiPal1.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 18));
		etiPal1.setBounds(10, 11, 110, 29);
		contentPane.add(etiPal1);
		
		etiPal3 = new JLabel("Futbol ");
		etiPal3.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 18));
		etiPal3.setBounds(342, 23, 51, 29);
		contentPane.add(etiPal3);
		
		etiPal2 = new JLabel("Jugar");
		etiPal2.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 18));
		etiPal2.setBounds(314, 106, 110, 29);
		contentPane.add(etiPal2);
		
		etiPal4 = new JLabel("David");
		etiPal4.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 18));
		etiPal4.setBounds(21, 106, 82, 29);
		contentPane.add(etiPal4);
		
		etiOcultar = new JLabel("Ocultar");
		etiOcultar.setForeground(new Color(0, 0, 160));
		etiOcultar.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 24));
		etiOcultar.setBounds(176, 50, 82, 29);
		etiOcultar.addMouseListener(this);
		contentPane.add(etiOcultar);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(false);
			etiPal2.setVisible(false);
			etiPal3.setVisible(false);
			etiPal4.setVisible(false);
		}
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		if (e.getSource()==etiOcultar) {
			etiPal1.setVisible(true);
			etiPal2.setVisible(true);
			etiPal3.setVisible(true);
			etiPal4.setVisible(true);
		}
	}
}
