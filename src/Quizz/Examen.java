package Quizz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Examen {

	private JFrame frame;
/*	private JRadioButton radRespuesta1;
	private JRadioButton radRespuesta2;
	private JRadioButton radRespuesta3;*/
	public String [] strPreguntas = {"�Cu�ndo inici� la segunda guerra mundial?","�En qu� ciudad se lanz� primero la bomba at�mica?","�Con cu�ntas vidas termin� el holocausto?","�C�mo comenz� la Segunda Guerra Mundial?","�En qu� consist�a la \"guerra rel�mpago\" o blitzkrieg \nllevada a cabo por los alemanes?"};
	public String [] strRespuesta1 = {"1 de agosto de 1941","Hiroshima","Entre 2.000.000 y 3.000.000 de personas","Comenz� con la invasi�n de Polonia por parte de Alemania", "Consist�a en la acci�n coordinada de unidades de artiller�a, blindadas, aviaci�n y comunicaciones para debilitar \nr�pidamente las defensas del enemigo"};
	public String [] strRespuesta2 = {"1 de septiembre de 1939","Nagasaki","Entre 5.900.000 y 7.100.000 personas","Comenz� con el pacto expansionista firmado por Jap�n, Italia y Alemania","Consist�a en usar armas qu�micas junto con bombardeos continuos"};
	public String [] strRespuesta3 = {" 28 de julio de 1914","Tokyo-3","Entre 15.00.000 y 18.000.000 personas","comenz� con la invasi�n de la URSS por parte de Alemania ","Consist�a en atacar los objetivos clave siempre coincidiendo con tormentas y mal tiempo para mermar m�s f�cilmente las defensas del enemigo"};
    public String [] strRespuestasDadas = new String [5];
	public String [] strRespuestasCorrectas = {"1 de septiembre de 1939","Hiroshima","Entre 5.900.000 y 7.100.000 personas", "Comenz� con la invasi�n de Polonia por parte de Alemania", "Consist�a en la acci�n coordinada de unidades de artiller�a, blindadas, aviaci�n y comunicaciones para debilitar r�pidamente las defensas del enemigo" };
    int i = 0;
	int intPuntaje = 0;
	boolean [] blnRevisado = new boolean[5];
		
public static void main(String[] args)
{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() {
				try {
					Examen window = new Examen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

    
	public Examen() 
	{
		initialize();
		
	}

	

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 581, 370);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNumeracion = new JLabel("Pregunta 1");
		lblNumeracion.setBounds(6, 11, 109, 14);
		frame.getContentPane().add(lblNumeracion);
		
		JLabel lblPregunta = new JLabel("\u00BFCu\u00E1ndo inici\u00F3 la segunda guerra mundial?");
		lblPregunta.setBounds(6, 36, 549, 34);
		frame.getContentPane().add(lblPregunta);
		
		JRadioButton radRespuesta2 = new JRadioButton("1 de septiembre de 1939");
		radRespuesta2.setBounds(6, 152, 535, 67);
		frame.getContentPane().add(radRespuesta2);
		
		JRadioButton radRespuesta1 = new JRadioButton("1 agosto de 1942");
		radRespuesta1.setBounds(6, 87, 549, 74);
		frame.getContentPane().add(radRespuesta1);
		
		JRadioButton radRespuesta3 = new JRadioButton("28 de julio de 1914");
		radRespuesta3.setBounds(6, 222, 549, 68);
		frame.getContentPane().add(radRespuesta3);
		
		ButtonGroup radRespuestas = new ButtonGroup();
		radRespuestas.add(radRespuesta2);
		radRespuestas.add(radRespuesta1);
		radRespuestas.add(radRespuesta3);
		

		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{				
				if(strPreguntas[i]==strPreguntas[0]) 
				{
					JOptionPane.showMessageDialog(null,"No se puede retroceder mas");
				}
				else 
				{
					i--; 
					lblNumeracion.setText("Pregunta "+(i+1));
					lblPregunta.setText(strPreguntas[i]);
					radRespuesta1.setText(strRespuesta1[i]);
					radRespuesta2.setText(strRespuesta2[i]);
					radRespuesta3.setText(strRespuesta3[i]);
					
				}
			}
		});
		btnAnterior.setBounds(6, 297, 89, 23);
		frame.getContentPane().add(btnAnterior);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
			
				
				if(radRespuesta1.isSelected()==true) 
				{
					strRespuestasDadas[i] = strRespuesta1[i];
					
				}
				else 
				{
					if(radRespuesta2.isSelected() == true) 
					{
						strRespuestasDadas[i] = strRespuesta2[i];
					}
					else
					{
						if(radRespuesta3.isSelected() == true) 
						{
							strRespuestasDadas[i] = strRespuesta3[i];
						}
					}
				}
					
				
				if(strPreguntas[i]==strPreguntas[4]) 
				{
					JOptionPane.showMessageDialog(null,"No se puede avanzar mas");
				}
				else 
				{
					
					
					i++;
					lblNumeracion.setText("Pregunta "+(i+1));
					lblPregunta.setText(strPreguntas[i]);
					radRespuesta1.setText(strRespuesta1[i]);
					radRespuesta2.setText(strRespuesta2[i]);
					radRespuesta3.setText(strRespuesta3[i]);
					
					
					
				}	
			}
		});
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSiguiente.setBounds(124, 297, 89, 23);
		frame.getContentPane().add(btnSiguiente);
		
		JButton btnEvaluar = new JButton("Evaluar");
		btnEvaluar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{

				if(radRespuesta1.isSelected()==true) 
				{
					strRespuestasDadas[i] = strRespuesta1[i];
					
				}
				else 
				{
					if(radRespuesta2.isSelected() == true) 
					{
						strRespuestasDadas[i] = strRespuesta2[i];
					}
					else
					{
						if(radRespuesta3.isSelected() == true) 
						{
							strRespuestasDadas[i] = strRespuesta3[i];
						}
					}
				}
				for(int j = 0;j<5;j++ ) 
				{
					if(strRespuestasDadas[j]== strRespuestasCorrectas[j]) 
					{
						intPuntaje++;
					}
				}
				JOptionPane.showMessageDialog(null,"Su puntuacion es de: "+ intPuntaje);
				
				intPuntaje = 0;
			}
			
		});
		btnEvaluar.setBounds(340, 297, 89, 23);
		frame.getContentPane().add(btnEvaluar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{ 
			  System.exit(0);
			 
			}
		});
		btnSalir.setBounds(452, 297, 89, 23);
		frame.getContentPane().add(btnSalir);
	
	}
}
