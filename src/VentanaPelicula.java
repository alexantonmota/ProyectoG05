import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;

public class VentanaPelicula extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			VentanaPelicula dialog = new VentanaPelicula();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public VentanaPelicula() {
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
		
		JButton btnNewButton = new JButton("Ver ahora");
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Género");
		lblNewLabel_6.setForeground(Color.ORANGE);
		lblNewLabel_6.setFont(new Font(".AppleSystemUIFont", Font.BOLD, 15));
		
		textField_4 = new JTextField();
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		
		GroupLayout gl_contentPanel = new GroupLayout(contentPanel);
		gl_contentPanel.setHorizontalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(18)
							.addGroup(gl_contentPanel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_5)
								.addComponent(lblNewLabel_1)
								.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_4)
								.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 317, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_3)
								.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_2)
								.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6)))
						.addGroup(gl_contentPanel.createSequentialGroup()
							.addGap(80)
							.addComponent(btnNewButton)))
					.addContainerGap(172, Short.MAX_VALUE))
		);
		gl_contentPanel.setVerticalGroup(
			gl_contentPanel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPanel.createSequentialGroup()
					.addGap(14)
					.addComponent(lblNewLabel_1)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_6)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
					.addComponent(lblNewLabel_2)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_3)
					.addGap(18)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(lblNewLabel_4)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(lblNewLabel_5)
					.addGap(12)
					.addComponent(btnNewButton)
					.addGap(31))
				.addGroup(Alignment.TRAILING, gl_contentPanel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
					.addContainerGap())
		);
		contentPanel.setLayout(gl_contentPanel);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(Color.ORANGE);
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Comprar");
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
