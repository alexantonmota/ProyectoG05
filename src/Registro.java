import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.PrintStream;
import java.util.HashMap;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Registro {

	public JFrame frame1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;
	static PrintStream log;
	HashMap<String, String> usuarios = new HashMap<String, String>();
	private static final String EMAIL_PATTER = 
		    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro window = new Registro();
					window.frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Registro() {
		super();
		initialize();
		frame1.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame1 = new JFrame();
		frame1.getContentPane().setBackground(Color.GRAY);
		frame1.setBackground(Color.GRAY);
		frame1.setBounds(600, 250, 450, 500);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username\r\n");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel.setBounds(46, 87, 115, 20);
		frame1.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("1er Apellido");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel_1.setBounds(46, 191, 115, 20);
		frame1.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("2ndo Apellido");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel_2.setBounds(46, 227, 135, 20);
		frame1.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel_3.setBounds(46, 123, 69, 20);
		frame1.getContentPane().add(lblNewLabel_3);
		
	
		
		JButton btnNewButton = new JButton("Cancelar\r\n");
		btnNewButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		
		btnNewButton.setActionCommand("Open70");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						String cmd = e.getActionCommand();

				        if(cmd.equals("Open70"))
				        {
				            frame1.dispose();
				            new InicioSesion();
				            
				        }
					}
				});
				
		btnNewButton.setBounds(254, 362, 155, 29);
		frame1.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse\r\n");
		btnNewButton_1.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorderPainted(false);
		
		
		btnNewButton_1.setBounds(46, 362, 155, 29);
		frame1.getContentPane().add(btnNewButton_1);
		
		textField = new JTextField();
		textField.setBounds(250, 85, 146, 26);
		frame1.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(250, 121, 146, 26);
		frame1.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(250, 189, 146, 26);
		frame1.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		textField_2.addKeyListener(new KeyListener(){

			public void keyTyped(KeyEvent e){
				char c= e.getKeyChar();
				if (!Character.isAlphabetic(c))

			     e.consume();

			}

			public void keyPressed(KeyEvent arg0) {
			}

			public void keyReleased(KeyEvent arg0) {
			}
			});
		
		
		textField_3 = new JTextField();
		textField_3.setBounds(250, 225, 146, 26);
		frame1.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		textField_3.addKeyListener(new KeyListener(){

			public void keyTyped(KeyEvent e){
				char c= e.getKeyChar();
				if (!Character.isAlphabetic(c))

			     e.consume();

			}

			public void keyPressed(KeyEvent arg0) {
			}

			public void keyReleased(KeyEvent arg0) {
			}
			});
		
		
		JLabel lblIntroduceTusDatos = new JLabel("Crea una cuenta nueva");
		lblIntroduceTusDatos.setForeground(Color.ORANGE);
		lblIntroduceTusDatos.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 28));
		lblIntroduceTusDatos.setBounds(46, 17, 398, 52);
		frame1.getContentPane().add(lblIntroduceTusDatos);
		
		JButton btnVueltaAlLogin = new JButton("Volver a Inicio de Sesión");
		btnVueltaAlLogin.setBackground(Color.GRAY);
		btnVueltaAlLogin.setForeground(Color.ORANGE);
		btnVueltaAlLogin.setOpaque(true);
		btnVueltaAlLogin.setBorderPainted(false);
		btnVueltaAlLogin.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		btnVueltaAlLogin.setActionCommand("Open1");
		btnVueltaAlLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cmd1 = e.getActionCommand();

		        if(cmd1.equals("Open1"))
		        {
		            frame1.dispose();
		            new InicioSesion();
		        }
			}
		});
		btnVueltaAlLogin.setBounds(112, 415, 229, 31);
		frame1.getContentPane().add(btnVueltaAlLogin);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setForeground(Color.ORANGE);
		lblNombre.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNombre.setBounds(46, 155, 87, 20);
		frame1.getContentPane().add(lblNombre);
		
		textField_4 = new JTextField();
		textField_4.setBounds(250, 151, 146, 26);
		frame1.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		textField_4.addKeyListener(new KeyListener(){

			public void keyTyped(KeyEvent e){
				char c= e.getKeyChar();
				if (!Character.isAlphabetic(c))

			     e.consume();

			}

			public void keyPressed(KeyEvent arg0) {
			}

			public void keyReleased(KeyEvent arg0) {
			}
			});
		
		JLabel lblFechaNacimiento = new JLabel("Fecha nacimiento");
		lblFechaNacimiento.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblFechaNacimiento.setForeground(Color.ORANGE);
		lblFechaNacimiento.setBounds(46, 262, 155, 20);
		frame1.getContentPane().add(lblFechaNacimiento);
		
		JLabel lblContrasea = new JLabel("Contraseña");
		lblContrasea.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblContrasea.setForeground(Color.ORANGE);
		lblContrasea.setBounds(46, 294, 103, 20);
		frame1.getContentPane().add(lblContrasea);
		
		textField_5 = new JTextField();
		textField_5.setBounds(250, 262, 146, 26);
		frame1.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(250, 292, 146, 26);
		frame1.getContentPane().add(passwordField);
		
	}
}