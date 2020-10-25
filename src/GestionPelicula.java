import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URI;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import java.io.IOException;
import javax.swing.JTextPane;

public class GestionPelicula extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField textTitulo;
	private JTextField textAnyo;
	private JTextField textDuracion;
	private JTextField textNomPoster;
	private JTextField textTrailer;



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GestionPelicula dialog = new GestionPelicula();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GestionPelicula() {
		setResizable(false);
		setForeground(Color.ORANGE);
		setBackground(Color.GRAY);
		getContentPane().setBackground(Color.GRAY);
		setBounds(320, 150, 1000, 700);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(Color.GRAY);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBorder(BorderFactory.createLineBorder(Color.ORANGE,4));
		
		
		JLabel lblNewLabel_1 = new JLabel("Título");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBorder(BorderFactory.createLineBorder(Color.ORANGE,2));
		lblNewLabel_1.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Año");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setBorder(BorderFactory.createLineBorder(Color.ORANGE,2));
		lblNewLabel_2.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		
		JLabel lblNewLabel_3 = new JLabel("Sinopsis");
		lblNewLabel_3.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel_3.setBorder(BorderFactory.createLineBorder(Color.ORANGE,2));
		lblNewLabel_3.setForeground(Color.ORANGE);
		
		JLabel lblNewLabel_4 = new JLabel("Duración");
		lblNewLabel_4.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setBorder(BorderFactory.createLineBorder(Color.ORANGE,2));
		
		JLabel lblNewLabel_5 = new JLabel("Tráiler");
		lblNewLabel_5.setForeground(Color.ORANGE);
		lblNewLabel_5.setBorder(BorderFactory.createLineBorder(Color.ORANGE,2));
		lblNewLabel_5.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		
		JButton btnNewButton = new JButton("Ver Trailer");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
                    Desktop.getDesktop().browse(new URI(textTrailer.getText()));
                } catch (URISyntaxException | IOException ex) {
                    //It looks like there's a problem
                }
            }
			
		});
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		
		textTitulo = new JTextField();
		textTitulo.setColumns(10);
		
		textAnyo = new JTextField();
		textAnyo.setColumns(10);
		
		textDuracion = new JTextField();
		textDuracion.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Género");
		lblNewLabel_6.setForeground(Color.ORANGE);
		lblNewLabel_6.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(Genero.values()));
		
		textTrailer = new JTextField();
		textTrailer.setColumns(10);
		
		JTextPane textSinopsis = new JTextPane();
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 372, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(28)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5)
								.addGroup(gl_contentPanel.createSequentialGroup()
									.addComponent(textTrailer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton))
								.addComponent(textDuracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4)
								.addComponent(lblNewLabel_3)
								.addComponent(textAnyo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2)
								.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 184, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_1)
								.addComponent(textTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(37)
							.addComponent(textSinopsis, GroupLayout.PREFERRED_SIZE, 331, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(244, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(20)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(12)
					.addComponent(lblNewLabel_6)
					.addGap(12)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textAnyo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_3)
					.addGap(18)
					.addComponent(textSinopsis, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_4)
					.addGap(12)
					.addComponent(textDuracion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_5)
					.addGap(15)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(textTrailer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31))
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 617, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.ORANGE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			
			JButton btnNewButton_1 = new JButton("Seleccionar Póster");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
					JFileChooser archivo= new JFileChooser();
					int ventana= archivo.showOpenDialog(null);
					if( ventana== JFileChooser.APPROVE_OPTION) {
						File file= archivo.getSelectedFile();
						textNomPoster.setText(String.valueOf(file));
						Image foto= getToolkit().getImage(textNomPoster.getText());
						foto= foto.getScaledInstance(363, 610, Image.SCALE_DEFAULT);
						lblNewLabel.setIcon(new ImageIcon(foto));
					}
				}
			});
			
			textNomPoster = new JTextField();
			buttonPane.add(textNomPoster);
			textNomPoster.setColumns(10);
			btnNewButton_1.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
			btnNewButton_1.setForeground(Color.ORANGE);
			btnNewButton_1.setBackground(Color.GRAY);
			btnNewButton_1.setOpaque(true);
			btnNewButton_1.setBorderPainted(false);
			buttonPane.add(btnNewButton_1);
			
		
			{
				JButton okButton = new JButton("Guardar");
				okButton.setForeground(Color.ORANGE);
				okButton.setBackground(Color.GRAY);
				okButton.setOpaque(true);
				okButton.setBorderPainted(false);
				okButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
				okButton.setActionCommand("");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
				
				
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setForeground(Color.ORANGE);
				cancelButton.setBackground(Color.GRAY);
				cancelButton.setOpaque(true);
				cancelButton.setBorderPainted(false);
				cancelButton.setFont(new Font(".AppleSystemUIFont", Font.PLAIN, 15));
				cancelButton.setActionCommand("");
				buttonPane.add(cancelButton);
			}
		}
	}
}

