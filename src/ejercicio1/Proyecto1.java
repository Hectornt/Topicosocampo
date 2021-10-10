package ejercicio1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;

import javax.swing.JTextArea;


public class Proyecto1 {

	private JFrame frame;
	private JTextField txtNumero1;
	private JTextField txtNumero2;
	private JTextField txtIteraciones;
	private JLabel lblNumero1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JTextArea txtSerie;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Proyecto1 window = new Proyecto1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Proyecto1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtNumero1 = new JTextField();
		txtNumero1.setBounds(289, 48, 86, 20);
		frame.getContentPane().add(txtNumero1);
		txtNumero1.setColumns(10);
		
		txtNumero2 = new JTextField();
		txtNumero2.setBounds(289, 78, 86, 20);
		frame.getContentPane().add(txtNumero2);
		txtNumero2.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(289, 109, 86, 20);
		frame.getContentPane().add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		JButton btnGenerar = new JButton("Generar");
		btnGenerar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				String strNumero1 = txtNumero1.getText();
				String strNumero2 = txtNumero2.getText();
				String strIteraciones = txtIteraciones.getText();
				
				int intNum1 = Integer.parseInt(strNumero1);
				int intNum2 = Integer.parseInt(strNumero2);
				int intIteraciones = Integer.parseInt(strIteraciones);
				int intSuma = 0;
				String strCadena = "\n ";
				
				for(int x = 0; x<intIteraciones;x++) 
		     {
					intSuma = intNum1+intNum2;
					intNum1 = intNum2;
					intNum2 = intSuma;
					
					
				 strCadena = strCadena+" "+intSuma+", ";
				 
			     txtSerie.setText(strCadena);
									
		     }
			
			}
		});
		btnGenerar.setBounds(289, 157, 89, 23);
		frame.getContentPane().add(btnGenerar);
		
		lblNumero1 = new JLabel("Numero 1");
		lblNumero1.setBounds(191, 51, 88, 14);
		frame.getContentPane().add(lblNumero1);
		
		lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setBounds(191, 81, 88, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Iteraciones");
		lblNewLabel_2.setBounds(179, 112, 100, 14);
		frame.getContentPane().add(lblNewLabel_2);	
		
		txtSerie = new JTextArea();
        txtSerie.setBounds(45, 59, 120, 70);
	   frame.getContentPane().add(txtSerie);
}
}
