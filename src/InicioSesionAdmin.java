import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class InicioSesionAdmin {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InicioSesionAdmin window = new InicioSesionAdmin();
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
	public InicioSesionAdmin() {
		initialize();
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(600, 300, 491, 356);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel.setBounds(67, 123, 132, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Constraseña");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel_1.setBounds(67, 175, 132, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(235, 117, 163, 29);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblLoggeateConTu = new JLabel("CINE DEUSTO ADMIN");
		lblLoggeateConTu.setForeground(Color.ORANGE);
		lblLoggeateConTu.setBackground(Color.GRAY);
		lblLoggeateConTu.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 28));
		lblLoggeateConTu.setBounds(94, 29, 487, 51);
		frame.getContentPane().add(lblLoggeateConTu);
		
		JButton btnNewButton = new JButton("Volver");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		btnNewButton.setActionCommand("Open90");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						String cmd = e.getActionCommand();
						 if(cmd.equals("Open90"))
					        {
					            frame.dispose();
					            new InicioSesion();
					            
					        }
					}
				});
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBounds(283, 241, 115, 29);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Aceptar");
		btnNewButton_1.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setOpaque(true);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setBounds(97, 241, 115, 29);
		frame.getContentPane().add(btnNewButton_1);
		
		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField.setBounds(235, 169, 163, 29);
		frame.getContentPane().add(passwordField);
	}
	
	protected void ingresaradmin() {
		String usuario = textField.getText();
		String contrasenya = String.valueOf(passwordField.getPassword());
		
		GestionAdministrador gestionadministrador = new GestionAdministrador();
		Administrador administrador2 = new Administrador();
		administrador2.setUsername(usuario);
		administrador2.setContrasenya(contrasenya);
		
		Administrador admin = gestionadministrador.obteneradministrador(administrador2);
			
		if(admin!=null) {
			frame.dispose();
			JOptionPane.showMessageDialog(frame, "Bienvenido");
			new Gestion();
			
		}else{
			JOptionPane.showMessageDialog(frame, "Datos no válidos", "error", JOptionPane.ERROR_MESSAGE);
		}
		
	}
	
}

